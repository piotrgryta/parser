package com.parser.parser.classes;

import com.parser.domain.ClassEntity;
import com.parser.domain.FieldEntity;
import com.parser.domain.MethodEntity;
import com.parser.grammar.JavaLanguageGrammarBaseListener;
import com.parser.grammar.JavaLanguageGrammarParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.List;

public class ClassBodyListener extends JavaLanguageGrammarBaseListener {
    private final ClassEntity classEntity;
    private final FieldEntity fieldEntity;
    private final MethodEntity methodEntity;
    private boolean constructor;


    public ClassBodyListener(ClassEntity classEntity, boolean constructorNext){
        this.classEntity = classEntity;
        fieldEntity = new FieldEntity();
        methodEntity = new MethodEntity();
        constructor = constructorNext;
    }

    @Override
    public void enterMemberDeclaration(JavaLanguageGrammarParser.MemberDeclarationContext ctx) {
        boolean notFieldDeclaration = ctx.fieldDeclaration() == null;
        if (!ctx.getText().isEmpty()){
            if (notFieldDeclaration)
                constructor = ctx.children.stream().anyMatch(x -> x.getText().equals("("));
        } else {
            constructor = false;
        }
        super.enterMemberDeclaration(ctx);
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx) {
        fieldEntity.addModifier(ctx.getText());
        methodEntity.addModifier(ctx.getText());
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterFieldDeclaration(JavaLanguageGrammarParser.FieldDeclarationContext ctx) {
        if (!constructor){
            fieldEntity.setType(ctx.typeType().getText());
            List<JavaLanguageGrammarParser.VariableDeclaratorContext> variables = ctx.variableDeclarators().variableDeclarator();
            variables.forEach(v -> {
                fieldEntity.setName(v.variableDeclaratorId().getText());
                if (v.variableInitializer() != null)
                    fieldEntity.setValue(v.variableInitializer().expression().literal().getText());
                else
                    fieldEntity.setValue(null);
                classEntity.addField(new FieldEntity(fieldEntity));
            });
            super.enterFieldDeclaration(ctx);
        }
    }

    @Override
    public void enterMethodDeclaration(JavaLanguageGrammarParser.MethodDeclarationContext ctx) {
        methodEntity.setReturnType(ctx.typeTypeOrVoid().getText());
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
            classEntity.addMethod(methodEntity);
        super.enterMethodDeclaration(ctx);
    }


    public ClassEntity getClassEntity(){
        return classEntity;
    }

    public boolean isConstructorNext(){
        return constructor;
    }
}
