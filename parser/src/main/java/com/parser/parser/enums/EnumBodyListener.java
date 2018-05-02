package com.parser.parser.enums;

import com.parser.domain.EnumEntity;
import com.parser.domain.FieldEntity;
import com.parser.domain.MethodEntity;
import com.parser.grammar.JavaLanguageGrammarBaseListener;
import com.parser.grammar.JavaLanguageGrammarParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.List;

public class EnumBodyListener extends JavaLanguageGrammarBaseListener {
    private final EnumEntity enumEntity;
    private final FieldEntity fieldEntity;
    private final MethodEntity methodEntity;

    public EnumBodyListener(EnumEntity enumEntity){
        this.enumEntity = enumEntity;
        fieldEntity = new FieldEntity();
        methodEntity = new MethodEntity();
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx) {
        fieldEntity.addModifier(ctx.getText());
        methodEntity.addModifier(ctx.getText());
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterFieldDeclaration(JavaLanguageGrammarParser.FieldDeclarationContext ctx) {
        boolean constructor = ctx.children.stream().anyMatch(x -> x.getText().contains(")"));
        if (!constructor){
            fieldEntity.setType(ctx.typeType().getText());
            List<JavaLanguageGrammarParser.VariableDeclaratorContext> variables = ctx.variableDeclarators().variableDeclarator();
            variables.forEach(v -> {
                fieldEntity.setName(v.variableDeclaratorId().getText());
                if (v.variableInitializer() != null)
                    fieldEntity.setValue(v.variableInitializer().expression().literal().getText());
                else
                    fieldEntity.setValue(null);
                enumEntity.addField(new FieldEntity(fieldEntity));
            });
            super.enterFieldDeclaration(ctx);
        }
    }

    @Override
    public void enterMethodDeclaration(JavaLanguageGrammarParser.MethodDeclarationContext ctx) {
        methodEntity.setReturnType(ctx.typeTypeOrVoid().typeType().classOrInterfaceType().getText());
        ctx.children.stream()
                .filter(pt -> pt instanceof TerminalNodeImpl)
                .findFirst()
                .ifPresent(pt -> methodEntity.setName(pt.getText()));

        List<JavaLanguageGrammarParser.FormalParameterContext> arguments = ctx.formalParameters().formalParameterList().formalParameter();
        arguments.forEach(argTree -> {
            FieldEntity arg = new FieldEntity();
            argTree.variableModifier().stream().map(RuleContext::getText).forEach(arg::addModifier);
            arg.setType(argTree.typeType().getText());
            arg.setName(argTree.variableDeclaratorId().getText());
            methodEntity.addArgument(arg);
        });
        if (methodEntity.getName() != null)
            enumEntity.addMethod(methodEntity);
        super.enterMethodDeclaration(ctx);
    }

    public EnumEntity getEnumEntity(){
        return enumEntity;
    }

}
