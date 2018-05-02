// Generated from D:/Programy/intellij_projects/AntlrListenerVisitorComparison/parser/src/main/java/com/parser/grammar\JavaLanguageGrammar.g4 by ANTLR 4.7
package com.parser.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLanguageGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ABSTRACT=6, BOOLEAN=7, BYTE=8, 
		CHAR=9, CLASS=10, DEFAULT=11, DOUBLE=12, ENUM=13, EXTENDS=14, FINAL=15, 
		FLOAT=16, IMPLEMENTS=17, IMPORT=18, INT=19, INTERFACE=20, LONG=21, NEW=22, 
		PACKAGE=23, PRIVATE=24, PROTECTED=25, PUBLIC=26, RETURN=27, SHORT=28, 
		STATIC=29, STRICTFP=30, SUPER=31, THIS=32, THROWS=33, TRANSIENT=34, VOID=35, 
		VOLATILE=36, DECIMAL_LITERAL=37, FLOAT_LITERAL=38, BOOL_LITERAL=39, CHAR_LITERAL=40, 
		STRING_LITERAL=41, NULL_LITERAL=42, WS=43, COMMENT=44, LINE_COMMENT=45, 
		IDENTIFIER=46, LPAREN=47, RPAREN=48, LBRACE=49, RBRACE=50, LBRACK=51, 
		RBRACK=52, SEMI=53, COMMA=54, DOT=55;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceModifier = 4, RULE_variableModifier = 5, 
		RULE_classDeclaration = 6, RULE_enumDeclaration = 7, RULE_enumConstants = 8, 
		RULE_enumConstant = 9, RULE_enumBodyDeclarations = 10, RULE_interfaceDeclaration = 11, 
		RULE_classBody = 12, RULE_interfaceBody = 13, RULE_classBodyDeclaration = 14, 
		RULE_memberDeclaration = 15, RULE_methodDeclaration = 16, RULE_methodBody = 17, 
		RULE_typeTypeOrVoid = 18, RULE_genericMethodDeclaration = 19, RULE_genericConstructorDeclaration = 20, 
		RULE_constructorDeclaration = 21, RULE_fieldDeclaration = 22, RULE_interfaceBodyDeclaration = 23, 
		RULE_interfaceMemberDeclaration = 24, RULE_interfaceMethodDeclaration = 25, 
		RULE_interfaceMethodModifier = 26, RULE_variableDeclarators = 27, RULE_variableDeclarator = 28, 
		RULE_variableDeclaratorId = 29, RULE_variableInitializer = 30, RULE_arrayInitializer = 31, 
		RULE_classOrInterfaceType = 32, RULE_qualifiedNameList = 33, RULE_formalParameters = 34, 
		RULE_formalParameterList = 35, RULE_formalParameter = 36, RULE_lastFormalParameter = 37, 
		RULE_qualifiedName = 38, RULE_literal = 39, RULE_block = 40, RULE_blockStatement = 41, 
		RULE_localVariableDeclaration = 42, RULE_localTypeDeclaration = 43, RULE_expressionList = 44, 
		RULE_methodCall = 45, RULE_expression = 46, RULE_statement = 47, RULE_creator = 48, 
		RULE_createdName = 49, RULE_innerCreator = 50, RULE_arrayCreatorRest = 51, 
		RULE_classCreatorRest = 52, RULE_typeList = 53, RULE_typeType = 54, RULE_primitiveType = 55, 
		RULE_superSuffix = 56, RULE_arguments = 57;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceModifier", "variableModifier", "classDeclaration", "enumDeclaration", 
		"enumConstants", "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "methodBody", "typeTypeOrVoid", "genericMethodDeclaration", 
		"genericConstructorDeclaration", "constructorDeclaration", "fieldDeclaration", 
		"interfaceBodyDeclaration", "interfaceMemberDeclaration", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
		"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
		"lastFormalParameter", "qualifiedName", "literal", "block", "blockStatement", 
		"localVariableDeclaration", "localTypeDeclaration", "expressionList", 
		"methodCall", "expression", "statement", "creator", "createdName", "innerCreator", 
		"arrayCreatorRest", "classCreatorRest", "typeList", "typeType", "primitiveType", 
		"superSuffix", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'='", "'...'", "'+'", "'-'", "'abstract'", "'boolean'", 
		"'byte'", "'char'", "'class'", "'default'", "'double'", "'enum'", "'extends'", 
		"'final'", "'float'", "'implements'", "'import'", "'int'", "'interface'", 
		"'long'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'this'", 
		"'throws'", "'transient'", "'void'", "'volatile'", null, null, null, null, 
		null, "'null'", null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", 
		"CLASS", "DEFAULT", "DOUBLE", "ENUM", "EXTENDS", "FINAL", "FLOAT", "IMPLEMENTS", 
		"IMPORT", "INT", "INTERFACE", "LONG", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "THIS", "THROWS", 
		"TRANSIENT", "VOID", "VOLATILE", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "WS", "COMMENT", "LINE_COMMENT", 
		"IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaLanguageGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaLanguageGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaLanguageGrammarParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(116);
				packageDeclaration();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(119);
				importDeclaration();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0)) {
				{
				{
				setState(125);
				typeDeclaration();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaLanguageGrammarParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PACKAGE);
			setState(134);
			qualifiedName();
			setState(135);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaLanguageGrammarParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaLanguageGrammarParser.STATIC, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IMPORT);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(138);
				match(STATIC);
				}
			}

			setState(141);
			qualifiedName();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(142);
				match(DOT);
				setState(143);
				match(T__0);
				}
			}

			setState(146);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
					{
					{
					setState(148);
					classOrInterfaceModifier();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(154);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(155);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(156);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaLanguageGrammarParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaLanguageGrammarParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaLanguageGrammarParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaLanguageGrammarParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaLanguageGrammarParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaLanguageGrammarParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaLanguageGrammarParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaLanguageGrammarParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaLanguageGrammarParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaLanguageGrammarParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaLanguageGrammarParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CLASS);
			setState(167);
			match(IDENTIFIER);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(168);
				match(EXTENDS);
				setState(169);
				typeType();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(172);
				match(IMPLEMENTS);
				setState(173);
				typeList();
				}
			}

			setState(176);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaLanguageGrammarParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaLanguageGrammarParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ENUM);
			setState(179);
			match(IDENTIFIER);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(180);
				match(IMPLEMENTS);
				setState(181);
				typeList();
				}
			}

			setState(184);
			match(LBRACE);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(185);
				enumConstants();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(188);
				match(COMMA);
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(191);
				enumBodyDeclarations();
				}
			}

			setState(194);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			enumConstant();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(COMMA);
					setState(198);
					enumConstant();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENTIFIER);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(205);
				arguments();
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(208);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(SEMI);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(212);
				classBodyDeclaration();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaLanguageGrammarParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaLanguageGrammarParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(INTERFACE);
			setState(219);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(220);
				match(EXTENDS);
				setState(221);
				typeList();
				}
			}

			setState(224);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LBRACE);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(227);
				classBodyDeclaration();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(LBRACE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << IDENTIFIER) | (1L << SEMI))) != 0)) {
				{
				{
				setState(236);
				interfaceBodyDeclaration();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaLanguageGrammarParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(245);
					match(STATIC);
					}
				}

				setState(248);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
					{
					{
					setState(249);
					classOrInterfaceModifier();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_memberDeclaration);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				classDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaLanguageGrammarParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			typeTypeOrVoid();
			setState(269);
			match(IDENTIFIER);
			setState(270);
			formalParameters();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(271);
				match(LBRACK);
				setState(272);
				match(RBRACK);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(278);
				match(THROWS);
				setState(279);
				qualifiedNameList();
				}
			}

			setState(282);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodBody);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaLanguageGrammarParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeTypeOrVoid);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaLanguageGrammarParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IDENTIFIER);
			setState(297);
			formalParameters();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(298);
				match(THROWS);
				setState(299);
				qualifiedNameList();
				}
			}

			setState(302);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			typeType();
			setState(305);
			variableDeclarators();
			setState(306);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case VOID:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(314);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceMemberDeclaration);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DEFAULT:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case VOID:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				interfaceMethodDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				interfaceDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				classDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				enumDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(JavaLanguageGrammarParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
				{
				{
				setState(324);
				interfaceMethodModifier();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(330);
				typeTypeOrVoid();
				}
				break;
			case 2:
				{
				setState(331);
				typeTypeOrVoid();
				}
				break;
			}
			setState(334);
			match(IDENTIFIER);
			setState(335);
			formalParameters();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(336);
				match(LBRACK);
				setState(337);
				match(RBRACK);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(343);
				match(THROWS);
				setState(344);
				qualifiedNameList();
				}
			}

			setState(347);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaLanguageGrammarParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaLanguageGrammarParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaLanguageGrammarParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaLanguageGrammarParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaLanguageGrammarParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			variableDeclarator();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352);
				match(COMMA);
				setState(353);
				variableDeclarator();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			variableDeclaratorId();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(360);
				match(T__1);
				setState(361);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(IDENTIFIER);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(365);
				match(LBRACK);
				setState(366);
				match(RBRACK);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableInitializer);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				arrayInitializer();
				}
				break;
			case NEW:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(LBRACE);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LBRACE))) != 0)) {
				{
				setState(377);
				variableInitializer();
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						match(COMMA);
						setState(379);
						variableInitializer();
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(385);
					match(COMMA);
					}
				}

				}
			}

			setState(390);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLanguageGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLanguageGrammarParser.IDENTIFIER, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(IDENTIFIER);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(393);
				match(DOT);
				setState(394);
				match(IDENTIFIER);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			qualifiedName();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				qualifiedName();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LPAREN);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(409);
				formalParameterList();
				}
			}

			setState(412);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				formalParameter();
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(COMMA);
						setState(416);
						formalParameter();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(422);
					match(COMMA);
					setState(423);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(429);
				variableModifier();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			typeType();
			setState(436);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(438);
				variableModifier();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			typeType();
			setState(445);
			match(T__2);
			setState(446);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLanguageGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLanguageGrammarParser.IDENTIFIER, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(IDENTIFIER);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(449);
					match(DOT);
					setState(450);
					match(IDENTIFIER);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaLanguageGrammarParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaLanguageGrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JavaLanguageGrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaLanguageGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaLanguageGrammarParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaLanguageGrammarParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LBRACE);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << IDENTIFIER) | (1L << SEMI))) != 0)) {
				{
				{
				setState(459);
				blockStatement();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_blockStatement);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				localVariableDeclaration();
				setState(468);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				localTypeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(474);
				variableModifier();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			typeType();
			setState(481);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
					{
					{
					setState(483);
					classOrInterfaceModifier();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(489);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(490);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			expression(0);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(497);
				match(COMMA);
				setState(498);
				expression(0);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(IDENTIFIER);
			setState(505);
			match(LPAREN);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(506);
				expressionList();
				}
			}

			setState(509);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token bop;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaLanguageGrammarParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THIS() { return getToken(JavaLanguageGrammarParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaLanguageGrammarParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(512);
				literal();
				}
				break;
			case 2:
				{
				setState(513);
				methodCall();
				}
				break;
			case 3:
				{
				setState(514);
				match(NEW);
				setState(515);
				creator();
				}
				break;
			case 4:
				{
				setState(516);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(519);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(520);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(521);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(522);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(523);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(531);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(524);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(525);
							methodCall();
							}
							break;
						case 3:
							{
							setState(526);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(527);
							match(NEW);
							setState(528);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(529);
							match(SUPER);
							setState(530);
							superSuffix();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaLanguageGrammarParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(RETURN);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(539);
				expression(0);
				}
			}

			setState(542);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_creator);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				createdName();
				setState(545);
				classCreatorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				createdName();
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(548);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(549);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLanguageGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLanguageGrammarParser.IDENTIFIER, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_createdName);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(IDENTIFIER);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(555);
					match(DOT);
					setState(556);
					match(IDENTIFIER);
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(IDENTIFIER);
			setState(566);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(LBRACK);
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(569);
				match(RBRACK);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(570);
					match(LBRACK);
					setState(571);
					match(RBRACK);
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(577);
				arrayInitializer();
				}
				break;
			case NEW:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case IDENTIFIER:
				{
				setState(578);
				expression(0);
				setState(579);
				match(RBRACK);
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(580);
						match(LBRACK);
						setState(581);
						expression(0);
						setState(582);
						match(RBRACK);
						}
						} 
					}
					setState(588);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						match(LBRACK);
						setState(590);
						match(RBRACK);
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			arguments();
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(599);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			typeType();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(603);
				match(COMMA);
				setState(604);
				typeType();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(610);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(611);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(614);
				match(LBRACK);
				setState(615);
				match(RBRACK);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaLanguageGrammarParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaLanguageGrammarParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaLanguageGrammarParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaLanguageGrammarParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaLanguageGrammarParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaLanguageGrammarParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaLanguageGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaLanguageGrammarParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaLanguageGrammarParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_superSuffix);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(DOT);
				setState(625);
				match(IDENTIFIER);
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(626);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLanguageGrammarListener ) ((JavaLanguageGrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageGrammarVisitor ) return ((JavaLanguageGrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LPAREN);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(632);
				expressionList();
				}
			}

			setState(635);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0280\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\5\2x\n\2"+
		"\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u008e\n\4\3\4\3\4\3\4\5\4\u0093\n\4\3"+
		"\4\3\4\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\5\3\5\3\5\5\5\u00a0\n\5"+
		"\3\5\5\5\u00a3\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\b\3"+
		"\b\5\b\u00b1\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00b9\n\t\3\t\3\t\5\t\u00bd"+
		"\n\t\3\t\5\t\u00c0\n\t\3\t\5\t\u00c3\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00ca"+
		"\n\n\f\n\16\n\u00cd\13\n\3\13\3\13\5\13\u00d1\n\13\3\13\5\13\u00d4\n\13"+
		"\3\f\3\f\7\f\u00d8\n\f\f\f\16\f\u00db\13\f\3\r\3\r\3\r\3\r\5\r\u00e1\n"+
		"\r\3\r\3\r\3\16\3\16\7\16\u00e7\n\16\f\16\16\16\u00ea\13\16\3\16\3\16"+
		"\3\17\3\17\7\17\u00f0\n\17\f\17\16\17\u00f3\13\17\3\17\3\17\3\20\3\20"+
		"\5\20\u00f9\n\20\3\20\3\20\7\20\u00fd\n\20\f\20\16\20\u0100\13\20\3\20"+
		"\5\20\u0103\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010d\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\7\22\u0114\n\22\f\22\16\22\u0117\13\22\3"+
		"\22\3\22\5\22\u011b\n\22\3\22\3\22\3\23\3\23\5\23\u0121\n\23\3\24\3\24"+
		"\5\24\u0125\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u012f\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\7\31\u0138\n\31\f\31\16\31\u013b"+
		"\13\31\3\31\3\31\5\31\u013f\n\31\3\32\3\32\3\32\3\32\5\32\u0145\n\32\3"+
		"\33\7\33\u0148\n\33\f\33\16\33\u014b\13\33\3\33\3\33\5\33\u014f\n\33\3"+
		"\33\3\33\3\33\3\33\7\33\u0155\n\33\f\33\16\33\u0158\13\33\3\33\3\33\5"+
		"\33\u015c\n\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u0165\n\35\f\35"+
		"\16\35\u0168\13\35\3\36\3\36\3\36\5\36\u016d\n\36\3\37\3\37\3\37\7\37"+
		"\u0172\n\37\f\37\16\37\u0175\13\37\3 \3 \5 \u0179\n \3!\3!\3!\3!\7!\u017f"+
		"\n!\f!\16!\u0182\13!\3!\5!\u0185\n!\5!\u0187\n!\3!\3!\3\"\3\"\3\"\7\""+
		"\u018e\n\"\f\"\16\"\u0191\13\"\3#\3#\3#\7#\u0196\n#\f#\16#\u0199\13#\3"+
		"$\3$\5$\u019d\n$\3$\3$\3%\3%\3%\7%\u01a4\n%\f%\16%\u01a7\13%\3%\3%\5%"+
		"\u01ab\n%\3%\5%\u01ae\n%\3&\7&\u01b1\n&\f&\16&\u01b4\13&\3&\3&\3&\3\'"+
		"\7\'\u01ba\n\'\f\'\16\'\u01bd\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u01c6\n"+
		"(\f(\16(\u01c9\13(\3)\3)\3*\3*\7*\u01cf\n*\f*\16*\u01d2\13*\3*\3*\3+\3"+
		"+\3+\3+\3+\5+\u01db\n+\3,\7,\u01de\n,\f,\16,\u01e1\13,\3,\3,\3,\3-\7-"+
		"\u01e7\n-\f-\16-\u01ea\13-\3-\3-\5-\u01ee\n-\3-\5-\u01f1\n-\3.\3.\3.\7"+
		".\u01f6\n.\f.\16.\u01f9\13.\3/\3/\3/\5/\u01fe\n/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0208\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0216\n\60\7\60\u0218\n\60\f\60\16\60\u021b"+
		"\13\60\3\61\3\61\5\61\u021f\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\5\62\u0229\n\62\5\62\u022b\n\62\3\63\3\63\3\63\7\63\u0230\n\63\f\63"+
		"\16\63\u0233\13\63\3\63\5\63\u0236\n\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\7\65\u023f\n\65\f\65\16\65\u0242\13\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\7\65\u024b\n\65\f\65\16\65\u024e\13\65\3\65\3\65\7\65\u0252"+
		"\n\65\f\65\16\65\u0255\13\65\5\65\u0257\n\65\3\66\3\66\5\66\u025b\n\66"+
		"\3\67\3\67\3\67\7\67\u0260\n\67\f\67\16\67\u0263\13\67\38\38\58\u0267"+
		"\n8\38\38\78\u026b\n8\f8\168\u026e\138\39\39\3:\3:\3:\3:\5:\u0276\n:\5"+
		":\u0278\n:\3;\3;\5;\u027c\n;\3;\3;\3;\2\3^<\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\7"+
		"\6\2\b\b\21\21\32\34\37 \6\2\b\b\r\r\34\34\37 \3\2\',\3\2\6\7\b\2\t\13"+
		"\16\16\22\22\25\25\27\27\36\36\2\u02a6\2w\3\2\2\2\4\u0087\3\2\2\2\6\u008b"+
		"\3\2\2\2\b\u00a2\3\2\2\2\n\u00a4\3\2\2\2\f\u00a6\3\2\2\2\16\u00a8\3\2"+
		"\2\2\20\u00b4\3\2\2\2\22\u00c6\3\2\2\2\24\u00ce\3\2\2\2\26\u00d5\3\2\2"+
		"\2\30\u00dc\3\2\2\2\32\u00e4\3\2\2\2\34\u00ed\3\2\2\2\36\u0102\3\2\2\2"+
		" \u010c\3\2\2\2\"\u010e\3\2\2\2$\u0120\3\2\2\2&\u0124\3\2\2\2(\u0126\3"+
		"\2\2\2*\u0128\3\2\2\2,\u012a\3\2\2\2.\u0132\3\2\2\2\60\u013e\3\2\2\2\62"+
		"\u0144\3\2\2\2\64\u0149\3\2\2\2\66\u015f\3\2\2\28\u0161\3\2\2\2:\u0169"+
		"\3\2\2\2<\u016e\3\2\2\2>\u0178\3\2\2\2@\u017a\3\2\2\2B\u018a\3\2\2\2D"+
		"\u0192\3\2\2\2F\u019a\3\2\2\2H\u01ad\3\2\2\2J\u01b2\3\2\2\2L\u01bb\3\2"+
		"\2\2N\u01c2\3\2\2\2P\u01ca\3\2\2\2R\u01cc\3\2\2\2T\u01da\3\2\2\2V\u01df"+
		"\3\2\2\2X\u01f0\3\2\2\2Z\u01f2\3\2\2\2\\\u01fa\3\2\2\2^\u0207\3\2\2\2"+
		"`\u021c\3\2\2\2b\u022a\3\2\2\2d\u0235\3\2\2\2f\u0237\3\2\2\2h\u023a\3"+
		"\2\2\2j\u0258\3\2\2\2l\u025c\3\2\2\2n\u0266\3\2\2\2p\u026f\3\2\2\2r\u0277"+
		"\3\2\2\2t\u0279\3\2\2\2vx\5\4\3\2wv\3\2\2\2wx\3\2\2\2x|\3\2\2\2y{\5\6"+
		"\4\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0082\3\2\2\2~|\3\2\2\2"+
		"\177\u0081\5\b\5\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u0089\5N(\2"+
		"\u0089\u008a\7\67\2\2\u008a\5\3\2\2\2\u008b\u008d\7\24\2\2\u008c\u008e"+
		"\7\37\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\u0092\5N(\2\u0090\u0091\79\2\2\u0091\u0093\7\3\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\67\2\2"+
		"\u0095\7\3\2\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u00a0\5\16\b\2\u009d\u00a0\5\20\t\2\u009e\u00a0\5"+
		"\30\r\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u00a3\7\67\2\2\u00a2\u0099\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a7"+
		"\7\21\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00ac\7\60\2\2\u00aa"+
		"\u00ab\7\20\2\2\u00ab\u00ad\5n8\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\7\23\2\2\u00af\u00b1\5l\67\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5\32"+
		"\16\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b8\7\60\2\2\u00b6"+
		"\u00b7\7\23\2\2\u00b7\u00b9\5l\67\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\7\63\2\2\u00bb\u00bd\5\22\n\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\78"+
		"\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00c3\5\26\f\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c5\7\64\2\2\u00c5\21\3\2\2\2\u00c6\u00cb\5\24\13\2\u00c7"+
		"\u00c8\78\2\2\u00c8\u00ca\5\24\13\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\23\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\7\60\2\2\u00cf\u00d1\5t;\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\5\32\16\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d9\7\67\2"+
		"\2\u00d6\u00d8\5\36\20\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\27\3\2\2\2\u00db\u00d9\3\2\2"+
		"\2\u00dc\u00dd\7\26\2\2\u00dd\u00e0\7\60\2\2\u00de\u00df\7\20\2\2\u00df"+
		"\u00e1\5l\67\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e3\5\34\17\2\u00e3\31\3\2\2\2\u00e4\u00e8\7\63\2\2\u00e5"+
		"\u00e7\5\36\20\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\64\2\2\u00ec\33\3\2\2\2\u00ed\u00f1\7\63\2\2\u00ee\u00f0\5\60"+
		"\31\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\64"+
		"\2\2\u00f5\35\3\2\2\2\u00f6\u0103\7\67\2\2\u00f7\u00f9\7\37\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0103\5R"+
		"*\2\u00fb\u00fd\5\n\6\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0103\5 \21\2\u0102\u00f6\3\2\2\2\u0102\u00f8\3\2\2\2\u0102"+
		"\u00fe\3\2\2\2\u0103\37\3\2\2\2\u0104\u010d\5\"\22\2\u0105\u010d\5(\25"+
		"\2\u0106\u010d\5.\30\2\u0107\u010d\5,\27\2\u0108\u010d\5*\26\2\u0109\u010d"+
		"\5\30\r\2\u010a\u010d\5\16\b\2\u010b\u010d\5\20\t\2\u010c\u0104\3\2\2"+
		"\2\u010c\u0105\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108"+
		"\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"!\3\2\2\2\u010e\u010f\5&\24\2\u010f\u0110\7\60\2\2\u0110\u0115\5F$\2\u0111"+
		"\u0112\7\65\2\2\u0112\u0114\7\66\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011b\5D#\2\u011a\u0118\3\2\2"+
		"\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5$\23\2\u011d#"+
		"\3\2\2\2\u011e\u0121\5R*\2\u011f\u0121\7\67\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121%\3\2\2\2\u0122\u0125\5n8\2\u0123\u0125\7%\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\'\3\2\2\2\u0126\u0127\5\"\22"+
		"\2\u0127)\3\2\2\2\u0128\u0129\5,\27\2\u0129+\3\2\2\2\u012a\u012b\7\60"+
		"\2\2\u012b\u012e\5F$\2\u012c\u012d\7#\2\2\u012d\u012f\5D#\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5R*\2\u0131"+
		"-\3\2\2\2\u0132\u0133\5n8\2\u0133\u0134\58\35\2\u0134\u0135\7\67\2\2\u0135"+
		"/\3\2\2\2\u0136\u0138\5\n\6\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\u013f\5\62\32\2\u013d\u013f\7\67\2\2\u013e\u0139\3\2\2"+
		"\2\u013e\u013d\3\2\2\2\u013f\61\3\2\2\2\u0140\u0145\5\64\33\2\u0141\u0145"+
		"\5\30\r\2\u0142\u0145\5\16\b\2\u0143\u0145\5\20\t\2\u0144\u0140\3\2\2"+
		"\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\63"+
		"\3\2\2\2\u0146\u0148\5\66\34\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014f\5&\24\2\u014d\u014f\5&\24\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\60\2\2\u0151\u0156\5"+
		"F$\2\u0152\u0153\7\65\2\2\u0153\u0155\7\66\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015b\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7#\2\2\u015a\u015c\5D#\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5$\23\2\u015e"+
		"\65\3\2\2\2\u015f\u0160\t\3\2\2\u0160\67\3\2\2\2\u0161\u0166\5:\36\2\u0162"+
		"\u0163\78\2\2\u0163\u0165\5:\36\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u01679\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016c\5<\37\2\u016a\u016b\7\4\2\2\u016b\u016d\5> \2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d;\3\2\2\2\u016e\u0173\7\60\2\2"+
		"\u016f\u0170\7\65\2\2\u0170\u0172\7\66\2\2\u0171\u016f\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174=\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0179\5@!\2\u0177\u0179\5^\60\2\u0178\u0176\3\2\2"+
		"\2\u0178\u0177\3\2\2\2\u0179?\3\2\2\2\u017a\u0186\7\63\2\2\u017b\u0180"+
		"\5> \2\u017c\u017d\78\2\2\u017d\u017f\5> \2\u017e\u017c\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0185\78\2\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\64\2\2\u0189A\3\2\2\2\u018a\u018f"+
		"\7\60\2\2\u018b\u018c\79\2\2\u018c\u018e\7\60\2\2\u018d\u018b\3\2\2\2"+
		"\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190C\3"+
		"\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197\5N(\2\u0193\u0194\78\2\2\u0194"+
		"\u0196\5N(\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198E\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c"+
		"\7\61\2\2\u019b\u019d\5H%\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\7\62\2\2\u019fG\3\2\2\2\u01a0\u01a5\5J&\2\u01a1"+
		"\u01a2\78\2\2\u01a2\u01a4\5J&\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2"+
		"\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01a9\78\2\2\u01a9\u01ab\5L\'\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\5L\'\2\u01ad\u01a0\3\2"+
		"\2\2\u01ad\u01ac\3\2\2\2\u01aeI\3\2\2\2\u01af\u01b1\5\f\7\2\u01b0\u01af"+
		"\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\5n8\2\u01b6\u01b7\5<\37"+
		"\2\u01b7K\3\2\2\2\u01b8\u01ba\5\f\7\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01bf\5n8\2\u01bf\u01c0\7\5\2\2\u01c0\u01c1\5<\37"+
		"\2\u01c1M\3\2\2\2\u01c2\u01c7\7\60\2\2\u01c3\u01c4\79\2\2\u01c4\u01c6"+
		"\7\60\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8O\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\t"+
		"\4\2\2\u01cbQ\3\2\2\2\u01cc\u01d0\7\63\2\2\u01cd\u01cf\5T+\2\u01ce\u01cd"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7\64\2\2\u01d4S\3\2\2\2"+
		"\u01d5\u01d6\5V,\2\u01d6\u01d7\7\67\2\2\u01d7\u01db\3\2\2\2\u01d8\u01db"+
		"\5X-\2\u01d9\u01db\5`\61\2\u01da\u01d5\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01dbU\3\2\2\2\u01dc\u01de\5\f\7\2\u01dd\u01dc\3\2\2\2"+
		"\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\5n8\2\u01e3\u01e4\58\35\2\u01e4"+
		"W\3\2\2\2\u01e5\u01e7\5\n\6\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2"+
		"\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01eb\u01ee\5\16\b\2\u01ec\u01ee\5\30\r\2\u01ed\u01eb\3\2\2\2"+
		"\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01f1\7\67\2\2\u01f0\u01e8"+
		"\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1Y\3\2\2\2\u01f2\u01f7\5^\60\2\u01f3"+
		"\u01f4\78\2\2\u01f4\u01f6\5^\60\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8[\3\2\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01fa\u01fb\7\60\2\2\u01fb\u01fd\7\61\2\2\u01fc\u01fe\5Z.\2\u01fd"+
		"\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\62"+
		"\2\2\u0200]\3\2\2\2\u0201\u0202\b\60\1\2\u0202\u0208\5P)\2\u0203\u0208"+
		"\5\\/\2\u0204\u0205\7\30\2\2\u0205\u0208\5b\62\2\u0206\u0208\7\60\2\2"+
		"\u0207\u0201\3\2\2\2\u0207\u0203\3\2\2\2\u0207\u0204\3\2\2\2\u0207\u0206"+
		"\3\2\2\2\u0208\u0219\3\2\2\2\u0209\u020a\f\4\2\2\u020a\u020b\t\5\2\2\u020b"+
		"\u0218\5^\60\5\u020c\u020d\f\7\2\2\u020d\u0215\79\2\2\u020e\u0216\7\60"+
		"\2\2\u020f\u0216\5\\/\2\u0210\u0216\7\"\2\2\u0211\u0212\7\30\2\2\u0212"+
		"\u0216\5f\64\2\u0213\u0214\7!\2\2\u0214\u0216\5r:\2\u0215\u020e\3\2\2"+
		"\2\u0215\u020f\3\2\2\2\u0215\u0210\3\2\2\2\u0215\u0211\3\2\2\2\u0215\u0213"+
		"\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0209\3\2\2\2\u0217\u020c\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a_\3\2\2\2"+
		"\u021b\u0219\3\2\2\2\u021c\u021e\7\35\2\2\u021d\u021f\5^\60\2\u021e\u021d"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\67\2\2"+
		"\u0221a\3\2\2\2\u0222\u0223\5d\63\2\u0223\u0224\5j\66\2\u0224\u022b\3"+
		"\2\2\2\u0225\u0228\5d\63\2\u0226\u0229\5h\65\2\u0227\u0229\5j\66\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0222\3\2"+
		"\2\2\u022a\u0225\3\2\2\2\u022bc\3\2\2\2\u022c\u0231\7\60\2\2\u022d\u022e"+
		"\79\2\2\u022e\u0230\7\60\2\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0236\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0234\u0236\5p9\2\u0235\u022c\3\2\2\2\u0235\u0234\3\2\2\2\u0236e"+
		"\3\2\2\2\u0237\u0238\7\60\2\2\u0238\u0239\5j\66\2\u0239g\3\2\2\2\u023a"+
		"\u0256\7\65\2\2\u023b\u0240\7\66\2\2\u023c\u023d\7\65\2\2\u023d\u023f"+
		"\7\66\2\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2"+
		"\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0257"+
		"\5@!\2\u0244\u0245\5^\60\2\u0245\u024c\7\66\2\2\u0246\u0247\7\65\2\2\u0247"+
		"\u0248\5^\60\2\u0248\u0249\7\66\2\2\u0249\u024b\3\2\2\2\u024a\u0246\3"+
		"\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0253\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7\65\2\2\u0250\u0252\7"+
		"\66\2\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u023b\3\2"+
		"\2\2\u0256\u0244\3\2\2\2\u0257i\3\2\2\2\u0258\u025a\5t;\2\u0259\u025b"+
		"\5\32\16\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025bk\3\2\2\2\u025c"+
		"\u0261\5n8\2\u025d\u025e\78\2\2\u025e\u0260\5n8\2\u025f\u025d\3\2\2\2"+
		"\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262m\3"+
		"\2\2\2\u0263\u0261\3\2\2\2\u0264\u0267\5B\"\2\u0265\u0267\5p9\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u026c\3\2\2\2\u0268\u0269\7\65"+
		"\2\2\u0269\u026b\7\66\2\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026do\3\2\2\2\u026e\u026c\3\2\2\2"+
		"\u026f\u0270\t\6\2\2\u0270q\3\2\2\2\u0271\u0278\5t;\2\u0272\u0273\79\2"+
		"\2\u0273\u0275\7\60\2\2\u0274\u0276\5t;\2\u0275\u0274\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0271\3\2\2\2\u0277\u0272\3\2\2\2\u0278"+
		"s\3\2\2\2\u0279\u027b\7\61\2\2\u027a\u027c\5Z.\2\u027b\u027a\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7\62\2\2\u027eu\3\2\2\2"+
		"Sw|\u0082\u008d\u0092\u0099\u009f\u00a2\u00ac\u00b0\u00b8\u00bc\u00bf"+
		"\u00c2\u00cb\u00d0\u00d3\u00d9\u00e0\u00e8\u00f1\u00f8\u00fe\u0102\u010c"+
		"\u0115\u011a\u0120\u0124\u012e\u0139\u013e\u0144\u0149\u014e\u0156\u015b"+
		"\u0166\u016c\u0173\u0178\u0180\u0184\u0186\u018f\u0197\u019c\u01a5\u01aa"+
		"\u01ad\u01b2\u01bb\u01c7\u01d0\u01da\u01df\u01e8\u01ed\u01f0\u01f7\u01fd"+
		"\u0207\u0215\u0217\u0219\u021e\u0228\u022a\u0231\u0235\u0240\u024c\u0253"+
		"\u0256\u025a\u0261\u0266\u026c\u0275\u0277\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}