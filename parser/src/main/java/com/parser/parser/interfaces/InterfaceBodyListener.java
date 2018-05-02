package com.parser.parser.interfaces;

import com.parser.domain.FieldEntity;
import com.parser.domain.InterfaceEntity;
import com.parser.domain.MethodEntity;
import com.parser.grammar.JavaLanguageGrammarBaseListener;
import com.parser.grammar.JavaLanguageGrammarParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;

public class InterfaceBodyListener extends JavaLanguageGrammarBaseListener {
    private final InterfaceEntity interfaceEntity;
    private final MethodEntity methodEntity;

    public InterfaceBodyListener(final InterfaceEntity interfaceEntity){
        this.interfaceEntity = interfaceEntity;
        methodEntity = new MethodEntity();
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx) {
        methodEntity.addModifier(ctx.getText());
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterInterfaceMethodDeclaration(JavaLanguageGrammarParser.InterfaceMethodDeclarationContext ctx) {
        methodEntity.setReturnType(ctx.typeTypeOrVoid().getText());
        methodEntity.setName(ctx.IDENTIFIER().getText());
        List<JavaLanguageGrammarParser.FormalParameterContext> arguments = ctx.formalParameters().formalParameterList().formalParameter();
        arguments.forEach(argTree -> {
            FieldEntity arg = new FieldEntity();
            argTree.variableModifier().stream().map(RuleContext::getText).forEach(arg::addModifier);
            arg.setType(argTree.typeType().getText());
            arg.setName(argTree.variableDeclaratorId().getText());
            methodEntity.addArgument(arg);
        });
        if (methodEntity.getName() != null)
            interfaceEntity.addMethod(methodEntity);
        super.enterInterfaceMethodDeclaration(ctx);
    }

    public InterfaceEntity getInterfaceEntity(){
        return interfaceEntity;
    }
}
