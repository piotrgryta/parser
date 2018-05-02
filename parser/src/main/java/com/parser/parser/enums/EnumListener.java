package com.parser.parser.enums;

import com.parser.domain.EnumEntity;
import com.parser.grammar.JavaLanguageGrammarBaseListener;
import com.parser.grammar.JavaLanguageGrammarParser;
import com.parser.helpers.MyFilter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EnumListener extends JavaLanguageGrammarBaseListener {
    private EnumEntity entity = new EnumEntity();
    private final MyFilter filter = new MyFilter();
    private List<ParserRuleContext> bodyDeclarations = new LinkedList<>();

    @Override
    public void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx) {
        if (entity.getName() == null)
            entity.addModifier(ctx.getText());
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterEnumDeclaration(JavaLanguageGrammarParser.EnumDeclarationContext ctx) {
        entity.addModifier(ctx.ENUM().getText());
        entity.setName(ctx.IDENTIFIER().toString());
        super.enterEnumDeclaration(ctx);
    }

    @Override
    public void enterEnumConstant(JavaLanguageGrammarParser.EnumConstantContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        List<ParseTree> expressions = ctx.arguments().expressionList().children;
        List<String> literals = expressions
                .stream()
                .filter(e -> filter.isLiteral(e.getText()))
                .map(e -> e.getText())
                .collect(Collectors.toList());
        entity.addEnumConstants(key, literals);
        super.enterEnumConstant(ctx);
    }

    @Override
    public void enterEnumBodyDeclarations(JavaLanguageGrammarParser.EnumBodyDeclarationsContext ctx) {
        bodyDeclarations.addAll(ctx.classBodyDeclaration());
        super.enterEnumBodyDeclarations(ctx);
    }

    public List<ParserRuleContext> getBodyDeclarations() {
        return bodyDeclarations;
    }

    public EnumEntity getEntity(){
        if (entity.isComplete()){
            return entity;
        } else {
            return null;
        }
    }
}
