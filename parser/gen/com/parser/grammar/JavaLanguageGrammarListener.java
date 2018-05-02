// Generated from D:/Programy/intellij_projects/AntlrListenerVisitorComparison/parser/src/main/java/com/parser/grammar\JavaLanguageGrammar.g4 by ANTLR 4.7
package com.parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaLanguageGrammarParser}.
 */
public interface JavaLanguageGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaLanguageGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaLanguageGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaLanguageGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaLanguageGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaLanguageGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaLanguageGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaLanguageGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaLanguageGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaLanguageGrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaLanguageGrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaLanguageGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaLanguageGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaLanguageGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaLanguageGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaLanguageGrammarParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaLanguageGrammarParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaLanguageGrammarParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaLanguageGrammarParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaLanguageGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaLanguageGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaLanguageGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaLanguageGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaLanguageGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaLanguageGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaLanguageGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaLanguageGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaLanguageGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaLanguageGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JavaLanguageGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JavaLanguageGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaLanguageGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaLanguageGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaLanguageGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaLanguageGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JavaLanguageGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JavaLanguageGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaLanguageGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaLanguageGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaLanguageGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaLanguageGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaLanguageGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaLanguageGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaLanguageGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaLanguageGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaLanguageGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaLanguageGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaLanguageGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaLanguageGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaLanguageGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaLanguageGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaLanguageGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaLanguageGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaLanguageGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaLanguageGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaLanguageGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaLanguageGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaLanguageGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaLanguageGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaLanguageGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaLanguageGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaLanguageGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaLanguageGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaLanguageGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaLanguageGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaLanguageGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaLanguageGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaLanguageGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaLanguageGrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaLanguageGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaLanguageGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaLanguageGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaLanguageGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaLanguageGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaLanguageGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaLanguageGrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaLanguageGrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaLanguageGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaLanguageGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaLanguageGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaLanguageGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaLanguageGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaLanguageGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaLanguageGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaLanguageGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JavaLanguageGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JavaLanguageGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaLanguageGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaLanguageGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaLanguageGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaLanguageGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaLanguageGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaLanguageGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaLanguageGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaLanguageGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JavaLanguageGrammarParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JavaLanguageGrammarParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JavaLanguageGrammarParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JavaLanguageGrammarParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaLanguageGrammarParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaLanguageGrammarParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaLanguageGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaLanguageGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaLanguageGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaLanguageGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaLanguageGrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaLanguageGrammarParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaLanguageGrammarParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaLanguageGrammarParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaLanguageGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaLanguageGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JavaLanguageGrammarParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JavaLanguageGrammarParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaLanguageGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaLanguageGrammarParser.ArgumentsContext ctx);
}