// Generated from D:/Programy/intellij_projects/AntlrListenerVisitorComparison/parser/src/main/java/com/parser/grammar\JavaLanguageGrammar.g4 by ANTLR 4.7
package com.parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaLanguageGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaLanguageGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaLanguageGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaLanguageGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaLanguageGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaLanguageGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaLanguageGrammarParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaLanguageGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaLanguageGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaLanguageGrammarParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaLanguageGrammarParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaLanguageGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaLanguageGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaLanguageGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaLanguageGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaLanguageGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JavaLanguageGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaLanguageGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaLanguageGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JavaLanguageGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaLanguageGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaLanguageGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaLanguageGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaLanguageGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaLanguageGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaLanguageGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaLanguageGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaLanguageGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaLanguageGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaLanguageGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaLanguageGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaLanguageGrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaLanguageGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaLanguageGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaLanguageGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaLanguageGrammarParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaLanguageGrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaLanguageGrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaLanguageGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaLanguageGrammarParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaLanguageGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaLanguageGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaLanguageGrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaLanguageGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JavaLanguageGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaLanguageGrammarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaLanguageGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaLanguageGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaLanguageGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JavaLanguageGrammarParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JavaLanguageGrammarParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaLanguageGrammarParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaLanguageGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaLanguageGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaLanguageGrammarParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JavaLanguageGrammarParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaLanguageGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JavaLanguageGrammarParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLanguageGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaLanguageGrammarParser.ArgumentsContext ctx);
}