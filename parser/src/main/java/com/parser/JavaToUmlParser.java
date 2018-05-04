package com.parser;

import com.parser.domain.ClassEntity;
import com.parser.domain.EnumEntity;
import com.parser.domain.InterfaceEntity;
import com.parser.grammar.JavaLanguageGrammarLexer;
import com.parser.grammar.JavaLanguageGrammarParser;
import com.parser.helpers.EntityToYumlParser;
import com.parser.helpers.FileReader;
import com.parser.helpers.TreeToEntitiesConverter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;


public class JavaToUmlParser {
    private static EntityToYumlParser entityToYumlParser;

    public String loadAndParse(String path){
        FileReader fr = new FileReader();
        List<String> input = fr.getFilesString(path);
        List<EnumEntity> enums = new ArrayList<>();
        List<ClassEntity> classes = new ArrayList<>();
        List<InterfaceEntity> interfaces = new ArrayList<>();

        input.stream().map(ANTLRInputStream::new)
                .map(JavaLanguageGrammarLexer::new)
                .map(CommonTokenStream::new)
                .map(JavaLanguageGrammarParser::new)
                .map(JavaLanguageGrammarParser::compilationUnit)
                .forEach(root -> {
                    TreeToEntitiesConverter converter = new TreeToEntitiesConverter();
                    Object entity = converter.convert(root);
                    if (entity instanceof EnumEntity) {
                        enums.add((EnumEntity) entity);
                    } else if (entity instanceof InterfaceEntity) {
                        interfaces.add((InterfaceEntity) entity);
                    } else if (entity instanceof ClassEntity) {
                        classes.add((ClassEntity) entity);
                    }
                });
        entityToYumlParser = new EntityToYumlParser(enums, interfaces, classes);
        return entityToYumlParser.parse();
    }
}
