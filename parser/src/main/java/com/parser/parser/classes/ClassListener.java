package com.parser.parser.classes;

import com.parser.domain.ClassEntity;
import com.parser.grammar.JavaLanguageGrammarBaseListener;
import com.parser.grammar.JavaLanguageGrammarParser;
import com.parser.helpers.MyFilter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;
import java.util.List;

public class ClassListener extends JavaLanguageGrammarBaseListener {
    private ClassEntity entity = new ClassEntity();
    private final MyFilter filter = new MyFilter();
    private List<ParserRuleContext> bodyDeclarations = new LinkedList<>();

    @Override
    public void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx) {
        if (entity.getName() == null)
            entity.addModifier(ctx.getText());
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterClassDeclaration(JavaLanguageGrammarParser.ClassDeclarationContext ctx) {
        if (entity.getName() == null){
            entity.setName(ctx.IDENTIFIER().getText());
            if (ctx.typeType() != null){
                entity.setExtending(ctx.typeType().getText());
            }
            if (ctx.typeList() != null)
                ctx.typeList().children.stream().filter(x -> filter.isLiteral(x.getText())).forEach(x -> entity.addImplementing(x.getText()));
        }
        super.enterClassDeclaration(ctx);
    }

    @Override
    public void enterClassBody(JavaLanguageGrammarParser.ClassBodyContext ctx) {
        bodyDeclarations.addAll(ctx.classBodyDeclaration());
        super.enterClassBody(ctx);
    }

    public List<ParserRuleContext> getBodyDeclarations(){
        return bodyDeclarations;
    }

    public ClassEntity getEntity(){
        if (entity.isComplete()){
            return entity;
        } else {
            return null;
        }
    }
}
