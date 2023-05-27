// Generated from MiniPascal.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MUL=3, DIV=4, MOD=5, EQ=6, NOTEQ=7, LT=8, GT=9, LEQ=10, 
		GEQ=11, SEMICOLON=12, ASSIGN=13, DOTDOT=14, COLON=15, LPAREN=16, RPAREN=17, 
		LBRACKET=18, RBRACKET=19, DELIMITER=20, PROGRAM=21, PROGRAM_END=22, VAR=23, 
		ARRAY=24, INTEGER=25, REAL=26, BOOLEAN=27, CHAR=28, STRING=29, OF=30, 
		NOT=31, TRUE=32, FALSE=33, END=34, AND=35, OR=36, FUNC_END=37, IF=38, 
		THEN=39, ELSE=40, WHILE=41, DO=42, FOR=43, TO=44, REPEAT=45, UNTIL=46, 
		WRITE=47, READ=48, FUNCTION=49, BEGIN=50, IDENTIFIER=51, NUMBER=52, STRINGLITERAL=53, 
		CHARACTER=54, COMMENT=55, WS=56;
	public static final int
		RULE_prog = 0, RULE_code_block = 1, RULE_var_declaration = 2, RULE_variable_declaration = 3, 
		RULE_array_specifier = 4, RULE_index_range = 5, RULE_type = 6, RULE_compound_statement = 7, 
		RULE_statement_list = 8, RULE_statement = 9, RULE_assignment_statement = 10, 
		RULE_if_statement = 11, RULE_while_statement = 12, RULE_for_statement = 13, 
		RULE_repeat_statement = 14, RULE_write_statement = 15, RULE_read_statement = 16, 
		RULE_function_declaration = 17, RULE_function_block = 18, RULE_parameter_list = 19, 
		RULE_parameter_declaration = 20, RULE_function_call = 21, RULE_argument_list = 22, 
		RULE_expression = 23, RULE_simple_expression = 24, RULE_term = 25, RULE_identifier_terminal = 26, 
		RULE_factor = 27, RULE_variable = 28, RULE_index_access = 29, RULE_relop = 30, 
		RULE_addop = 31, RULE_mulop = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code_block", "var_declaration", "variable_declaration", "array_specifier", 
			"index_range", "type", "compound_statement", "statement_list", "statement", 
			"assignment_statement", "if_statement", "while_statement", "for_statement", 
			"repeat_statement", "write_statement", "read_statement", "function_declaration", 
			"function_block", "parameter_list", "parameter_declaration", "function_call", 
			"argument_list", "expression", "simple_expression", "term", "identifier_terminal", 
			"factor", "variable", "index_access", "relop", "addop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", null, "'mod'", "'='", "'<>'", "'<'", "'>'", 
			"'<='", "'>='", "';'", "':='", "'..'", "':'", "'('", "')'", "'['", "']'", 
			"','", "'program'", "'.'", "'var'", "'array'", "'integer'", "'real'", 
			"'boolean'", "'char'", "'string'", "'of'", "'not'", "'true'", "'false'", 
			"'end'", "'and'", "'or'", "'end;'", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'for'", "'to'", "'repeat'", "'until'", "'write'", "'read'", 
			"'function'", "'begin'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUB", "MUL", "DIV", "MOD", "EQ", "NOTEQ", "LT", "GT", "LEQ", 
			"GEQ", "SEMICOLON", "ASSIGN", "DOTDOT", "COLON", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "DELIMITER", "PROGRAM", "PROGRAM_END", "VAR", 
			"ARRAY", "INTEGER", "REAL", "BOOLEAN", "CHAR", "STRING", "OF", "NOT", 
			"TRUE", "FALSE", "END", "AND", "OR", "FUNC_END", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "FOR", "TO", "REPEAT", "UNTIL", "WRITE", "READ", "FUNCTION", 
			"BEGIN", "IDENTIFIER", "NUMBER", "STRINGLITERAL", "CHARACTER", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PROGRAM);
			setState(67);
			match(IDENTIFIER);
			setState(68);
			match(SEMICOLON);
			setState(69);
			code_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Code_blockContext extends ParserRuleContext {
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	 
		public Code_blockContext() { }
		public void copyFrom(Code_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Code_BlockContext extends Code_blockContext {
		public TerminalNode PROGRAM_END() { return getToken(MiniPascalParser.PROGRAM_END, 0); }
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Compound_statementContext> compound_statement() {
			return getRuleContexts(Compound_statementContext.class);
		}
		public Compound_statementContext compound_statement(int i) {
			return getRuleContext(Compound_statementContext.class,i);
		}
		public Code_BlockContext(Code_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitCode_Block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		int _la;
		try {
			_localctx = new Code_BlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(71);
				var_declaration();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(77);
				function_declaration();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN) {
				{
				{
				setState(83);
				compound_statement();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(PROGRAM_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declarationContext extends ParserRuleContext {
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	 
		public Var_declarationContext() { }
		public void copyFrom(Var_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends Var_declarationContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public VarDeclarationContext(Var_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_declaration);
		int _la;
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(VAR);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(92);
				variable_declaration();
				setState(93);
				match(SEMICOLON);
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IDENTIFIER);
			setState(101);
			match(COLON);
			setState(102);
			type();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(103);
				array_specifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_specifierContext extends ParserRuleContext {
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
	 
		public Array_specifierContext() { }
		public void copyFrom(Array_specifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraySpecifierContext extends Array_specifierContext {
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(MiniPascalParser.LBRACKET, 0); }
		public Index_rangeContext index_range() {
			return getRuleContext(Index_rangeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MiniPascalParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArraySpecifierContext(Array_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArraySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_specifier);
		try {
			_localctx = new ArraySpecifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ARRAY);
			setState(107);
			match(LBRACKET);
			setState(108);
			index_range();
			setState(109);
			match(RBRACKET);
			setState(110);
			match(OF);
			setState(111);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Index_rangeContext extends ParserRuleContext {
		public Index_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_range; }
	 
		public Index_rangeContext() { }
		public void copyFrom(Index_rangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexRangeContext extends Index_rangeContext {
		public List<TerminalNode> NUMBER() { return getTokens(MiniPascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiniPascalParser.NUMBER, i);
		}
		public TerminalNode DOTDOT() { return getToken(MiniPascalParser.DOTDOT, 0); }
		public IndexRangeContext(Index_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIndexRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_rangeContext index_range() throws RecognitionException {
		Index_rangeContext _localctx = new Index_rangeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index_range);
		try {
			_localctx = new IndexRangeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(NUMBER);
			setState(114);
			match(DOTDOT);
			setState(115);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public IntegerContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends TypeContext {
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public ArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public CharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends TypeContext {
		public TerminalNode REAL() { return getToken(MiniPascalParser.REAL, 0); }
		public RealContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public StringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public BooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(INTEGER);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(REAL);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(STRING);
				}
				break;
			case ARRAY:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				array_specifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	 
		public Compound_statementContext() { }
		public void copyFrom(Compound_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompountStatementContext extends Compound_statementContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<TerminalNode> END() { return getTokens(MiniPascalParser.END); }
		public TerminalNode END(int i) {
			return getToken(MiniPascalParser.END, i);
		}
		public CompountStatementContext(Compound_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitCompountStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compound_statement);
		try {
			int _alt;
			_localctx = new CompountStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(BEGIN);
			setState(126);
			statement_list();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(END);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_listContext extends ParserRuleContext {
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	 
		public Statement_listContext() { }
		public void copyFrom(Statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends Statement_listContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public StatementListContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement_list);
		try {
			int _alt;
			_localctx = new StatementListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			statement();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(SEMICOLON);
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(135);
						statement();
						}
						break;
					}
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				repeat_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				write_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				read_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends Assignment_statementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentStatementContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment_statement);
		try {
			_localctx = new AssignmentStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			variable();
			setState(155);
			match(ASSIGN);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(156);
				expression();
				}
				break;
			case 2:
				{
				setState(157);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends If_statementContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public IfStatementContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			expression();
			setState(162);
			match(THEN);
			setState(163);
			statement();
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(164);
				match(ELSE);
				setState(165);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends While_statementContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			_localctx = new WhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			expression();
			setState(170);
			match(DO);
			setState(171);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	 
		public For_statementContext() { }
		public void copyFrom(For_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends For_statementContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(MiniPascalParser.TO, 0); }
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(For_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_statement);
		try {
			_localctx = new ForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(FOR);
			setState(174);
			match(IDENTIFIER);
			setState(175);
			match(ASSIGN);
			setState(176);
			expression();
			setState(177);
			match(TO);
			setState(178);
			expression();
			setState(179);
			match(DO);
			setState(180);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_statementContext extends ParserRuleContext {
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
	 
		public Repeat_statementContext() { }
		public void copyFrom(Repeat_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends Repeat_statementContext {
		public TerminalNode REPEAT() { return getToken(MiniPascalParser.REPEAT, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(MiniPascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(Repeat_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repeat_statement);
		try {
			_localctx = new RepeatStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(REPEAT);
			setState(183);
			statement_list();
			setState(184);
			match(UNTIL);
			setState(185);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Write_statementContext extends ParserRuleContext {
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
	 
		public Write_statementContext() { }
		public void copyFrom(Write_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatementContext extends Write_statementContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public WriteStatementContext(Write_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_write_statement);
		try {
			_localctx = new WriteStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WRITE);
			setState(188);
			match(LPAREN);
			setState(189);
			expression();
			setState(190);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Read_statementContext extends ParserRuleContext {
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
	 
		public Read_statementContext() { }
		public void copyFrom(Read_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatementContext extends Read_statementContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public List<TerminalNode> DELIMITER() { return getTokens(MiniPascalParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(MiniPascalParser.DELIMITER, i);
		}
		public ReadStatementContext(Read_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read_statement);
		int _la;
		try {
			_localctx = new ReadStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(READ);
			setState(193);
			match(LPAREN);
			setState(194);
			variable();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(195);
				match(DELIMITER);
				setState(196);
				variable();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends Function_declarationContext {
		public TerminalNode FUNCTION() { return getToken(MiniPascalParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public FunctionDeclarationContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_declaration);
		try {
			_localctx = new FunctionDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(FUNCTION);
			setState(205);
			match(IDENTIFIER);
			setState(206);
			match(LPAREN);
			setState(207);
			parameter_list();
			setState(208);
			match(RPAREN);
			setState(209);
			match(COLON);
			setState(210);
			type();
			setState(211);
			match(SEMICOLON);
			setState(212);
			function_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	 
		public Function_blockContext() { }
		public void copyFrom(Function_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBlockContext extends Function_blockContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode FUNC_END() { return getToken(MiniPascalParser.FUNC_END, 0); }
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public FunctionBlockContext(Function_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_block);
		int _la;
		try {
			_localctx = new FunctionBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(214);
				var_declaration();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			compound_statement();
			setState(221);
			match(FUNC_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	 
		public Parameter_listContext() { }
		public void copyFrom(Parameter_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends Parameter_listContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(MiniPascalParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(MiniPascalParser.DELIMITER, i);
		}
		public ParameterListContext(Parameter_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter_list);
		int _la;
		try {
			_localctx = new ParameterListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(223);
				parameter_declaration();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DELIMITER) {
					{
					{
					setState(224);
					match(DELIMITER);
					setState(225);
					parameter_declaration();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_declarationContext extends ParserRuleContext {
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
	 
		public Parameter_declarationContext() { }
		public void copyFrom(Parameter_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends Parameter_declarationContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterDeclarationContext(Parameter_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter_declaration);
		try {
			_localctx = new ParameterDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IDENTIFIER);
			setState(234);
			match(COLON);
			setState(235);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IDENTIFIER);
			setState(238);
			match(LPAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33777012237729792L) != 0)) {
				{
				setState(239);
				argument_list();
				}
			}

			setState(242);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	 
		public Argument_listContext() { }
		public void copyFrom(Argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends Argument_listContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(MiniPascalParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(MiniPascalParser.DELIMITER, i);
		}
		public ArgumentListContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argument_list);
		int _la;
		try {
			_localctx = new ArgumentListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			expression();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(245);
				match(DELIMITER);
				setState(246);
				expression();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ExpressionContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public List<RelopContext> relop() {
			return getRuleContexts(RelopContext.class);
		}
		public RelopContext relop(int i) {
			return getRuleContext(RelopContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MiniPascalParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MiniPascalParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(MiniPascalParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MiniPascalParser.OR, i);
		}
		public ExpresionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			int _alt;
			_localctx = new ExpresionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			simple_expression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 103079219136L) != 0)) {
				{
				{
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
				case NOTEQ:
				case LT:
				case GT:
				case LEQ:
				case GEQ:
					{
					setState(253);
					relop();
					}
					break;
				case AND:
					{
					setState(254);
					match(AND);
					}
					break;
				case OR:
					{
					setState(255);
					match(OR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				simple_expression();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					match(SEMICOLON);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	 
		public Simple_expressionContext() { }
		public void copyFrom(Simple_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends Simple_expressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MiniPascalParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MiniPascalParser.OR, i);
		}
		public SimpleExpressionContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simple_expression);
		try {
			int _alt;
			_localctx = new SimpleExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			term();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
					case SUB:
						{
						setState(271);
						addop();
						}
						break;
					case OR:
						{
						setState(272);
						match(OR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(275);
					term();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TerminoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		int _la;
		try {
			_localctx = new TerminoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			factor();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(282);
				mulop();
				setState(283);
				factor();
				}
				}
				setState(289);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_terminalContext extends ParserRuleContext {
		public Identifier_terminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_terminal; }
	 
		public Identifier_terminalContext() { }
		public void copyFrom(Identifier_terminalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTerminalContext extends Identifier_terminalContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public Index_accessContext index_access() {
			return getRuleContext(Index_accessContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public IdentifierTerminalContext(Identifier_terminalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIdentifierTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_terminalContext identifier_terminal() throws RecognitionException {
		Identifier_terminalContext _localctx = new Identifier_terminalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifier_terminal);
		try {
			_localctx = new IdentifierTerminalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IDENTIFIER);
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(291);
				index_access();
				}
				break;
			case IDENTIFIER:
				{
				setState(292);
				function_call();
				}
				break;
			case LPAREN:
				{
				setState(293);
				match(LPAREN);
				setState(294);
				expression();
				setState(295);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				{
				setState(297);
				match(NOT);
				setState(298);
				factor();
				}
				}
				break;
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case EQ:
			case NOTEQ:
			case LT:
			case GT:
			case LEQ:
			case GEQ:
			case SEMICOLON:
			case RPAREN:
			case RBRACKET:
			case DELIMITER:
			case PROGRAM_END:
			case END:
			case AND:
			case OR:
			case FUNC_END:
			case THEN:
			case ELSE:
			case DO:
			case TO:
			case UNTIL:
			case BEGIN:
				break;
			default:
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Identifier_terminalContext identifier_terminal() {
			return getRuleContext(Identifier_terminalContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MiniPascalParser.NUMBER, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(MiniPascalParser.STRINGLITERAL, 0); }
		public TerminalNode CHARACTER() { return getToken(MiniPascalParser.CHARACTER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(MiniPascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniPascalParser.FALSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				identifier_terminal();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(NUMBER);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(STRINGLITERAL);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(CHARACTER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(LPAREN);
				setState(306);
				expression();
				setState(307);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(NOT);
				setState(310);
				factor();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableNonTerminalContext extends VariableContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public Index_accessContext index_access() {
			return getRuleContext(Index_accessContext.class,0);
		}
		public VariableNonTerminalContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariableNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable);
		int _la;
		try {
			_localctx = new VariableNonTerminalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(IDENTIFIER);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(316);
				index_access();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Index_accessContext extends ParserRuleContext {
		public Index_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_access; }
	 
		public Index_accessContext() { }
		public void copyFrom(Index_accessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessContext extends Index_accessContext {
		public TerminalNode LBRACKET() { return getToken(MiniPascalParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(MiniPascalParser.RBRACKET, 0); }
		public List<TerminalNode> DELIMITER() { return getTokens(MiniPascalParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(MiniPascalParser.DELIMITER, i);
		}
		public IndexAccessContext(Index_accessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_accessContext index_access() throws RecognitionException {
		Index_accessContext _localctx = new Index_accessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_index_access);
		int _la;
		try {
			_localctx = new IndexAccessContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(LBRACKET);
			setState(320);
			expression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(321);
				match(DELIMITER);
				setState(322);
				expression();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MiniPascalParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(MiniPascalParser.NOTEQ, 0); }
		public TerminalNode LT() { return getToken(MiniPascalParser.LT, 0); }
		public TerminalNode GT() { return getToken(MiniPascalParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(MiniPascalParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(MiniPascalParser.GEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddopContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MiniPascalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MiniPascalParser.SUB, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MiniPascalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniPascalParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u00018\u0151\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001I\b\u0001\n\u0001\f\u0001"+
		"L\t\u0001\u0001\u0001\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t\u0001\u0001"+
		"\u0001\u0005\u0001U\b\u0001\n\u0001\f\u0001X\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002`\b"+
		"\u0002\n\u0002\f\u0002c\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003i\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0081\b\u0007\n\u0007\f\u0007\u0084\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0089\b\b\u0005\b\u008b\b\b\n\b\f\b\u008e\t\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0099\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009f\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00a7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c6\b\u0010\n\u0010\f\u0010"+
		"\u00c9\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0005\u0012\u00d8\b\u0012\n\u0012\f\u0012\u00db"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00e3\b\u0013\n\u0013\f\u0013\u00e6\t\u0013\u0003\u0013"+
		"\u00e8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00f1\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f8\b\u0016\n\u0016"+
		"\f\u0016\u00fb\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0101\b\u0017\u0001\u0017\u0005\u0017\u0104\b\u0017\n\u0017"+
		"\f\u0017\u0107\t\u0017\u0001\u0017\u0005\u0017\u010a\b\u0017\n\u0017\f"+
		"\u0017\u010d\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0112"+
		"\b\u0018\u0001\u0018\u0005\u0018\u0115\b\u0018\n\u0018\f\u0018\u0118\t"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u011e"+
		"\b\u0019\n\u0019\f\u0019\u0121\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u012c\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u013a\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u013e\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0144\b\u001d\n\u001d\f\u001d\u0147\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0003\u0001\u0000\u0006"+
		"\u000b\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0005\u0160\u0000B\u0001"+
		"\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004[\u0001\u0000\u0000"+
		"\u0000\u0006d\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nq\u0001"+
		"\u0000\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000"+
		"\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000"+
		"\u0000\u0014\u009a\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000"+
		"\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00ad\u0001\u0000\u0000"+
		"\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000\u0000"+
		"\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00cc\u0001\u0000\u0000\u0000"+
		"$\u00d9\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00e9"+
		"\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00f4\u0001\u0000"+
		"\u0000\u0000.\u00fc\u0001\u0000\u0000\u00000\u010e\u0001\u0000\u0000\u0000"+
		"2\u0119\u0001\u0000\u0000\u00004\u0122\u0001\u0000\u0000\u00006\u0139"+
		"\u0001\u0000\u0000\u00008\u013b\u0001\u0000\u0000\u0000:\u013f\u0001\u0000"+
		"\u0000\u0000<\u014a\u0001\u0000\u0000\u0000>\u014c\u0001\u0000\u0000\u0000"+
		"@\u014e\u0001\u0000\u0000\u0000BC\u0005\u0015\u0000\u0000CD\u00053\u0000"+
		"\u0000DE\u0005\f\u0000\u0000EF\u0003\u0002\u0001\u0000F\u0001\u0001\u0000"+
		"\u0000\u0000GI\u0003\u0004\u0002\u0000HG\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KP\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0003\"\u0011\u0000"+
		"NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QV\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000SU\u0003\u000e\u0007\u0000TS\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0016\u0000"+
		"\u0000Z\u0003\u0001\u0000\u0000\u0000[a\u0005\u0017\u0000\u0000\\]\u0003"+
		"\u0006\u0003\u0000]^\u0005\f\u0000\u0000^`\u0001\u0000\u0000\u0000_\\"+
		"\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u0005\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000de\u00053\u0000\u0000ef\u0005\u000f\u0000\u0000fh\u0003"+
		"\f\u0006\u0000gi\u0003\b\u0004\u0000hg\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000i\u0007\u0001\u0000\u0000\u0000jk\u0005\u0018\u0000"+
		"\u0000kl\u0005\u0012\u0000\u0000lm\u0003\n\u0005\u0000mn\u0005\u0013\u0000"+
		"\u0000no\u0005\u001e\u0000\u0000op\u0003\f\u0006\u0000p\t\u0001\u0000"+
		"\u0000\u0000qr\u00054\u0000\u0000rs\u0005\u000e\u0000\u0000st\u00054\u0000"+
		"\u0000t\u000b\u0001\u0000\u0000\u0000u|\u0005\u0019\u0000\u0000v|\u0005"+
		"\u001a\u0000\u0000w|\u0005\u001b\u0000\u0000x|\u0005\u001c\u0000\u0000"+
		"y|\u0005\u001d\u0000\u0000z|\u0003\b\u0004\u0000{u\u0001\u0000\u0000\u0000"+
		"{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\r\u0001\u0000"+
		"\u0000\u0000}~\u00052\u0000\u0000~\u0082\u0003\u0010\b\u0000\u007f\u0081"+
		"\u0005\"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u000f\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u008c\u0003\u0012\t\u0000\u0086\u0088\u0005\f"+
		"\u0000\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0099\u0003\u000e\u0007\u0000\u0090\u0099\u0003\u0014\n\u0000"+
		"\u0091\u0099\u0003\u0016\u000b\u0000\u0092\u0099\u0003\u0018\f\u0000\u0093"+
		"\u0099\u0003\u001a\r\u0000\u0094\u0099\u0003\u001c\u000e\u0000\u0095\u0099"+
		"\u0003\u001e\u000f\u0000\u0096\u0099\u0003 \u0010\u0000\u0097\u0099\u0003"+
		"*\u0015\u0000\u0098\u008f\u0001\u0000\u0000\u0000\u0098\u0090\u0001\u0000"+
		"\u0000\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000"+
		"\u0000\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000"+
		"\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0013\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u00038\u001c\u0000\u009b\u009e\u0005\r\u0000"+
		"\u0000\u009c\u009f\u0003.\u0017\u0000\u009d\u009f\u0003*\u0015\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005&\u0000\u0000\u00a1\u00a2"+
		"\u0003.\u0017\u0000\u00a2\u00a3\u0005\'\u0000\u0000\u00a3\u00a6\u0003"+
		"\u0012\t\u0000\u00a4\u00a5\u0005(\u0000\u0000\u00a5\u00a7\u0003\u0012"+
		"\t\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005)\u0000\u0000"+
		"\u00a9\u00aa\u0003.\u0017\u0000\u00aa\u00ab\u0005*\u0000\u0000\u00ab\u00ac"+
		"\u0003\u0012\t\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"+\u0000\u0000\u00ae\u00af\u00053\u0000\u0000\u00af\u00b0\u0005\r\u0000"+
		"\u0000\u00b0\u00b1\u0003.\u0017\u0000\u00b1\u00b2\u0005,\u0000\u0000\u00b2"+
		"\u00b3\u0003.\u0017\u0000\u00b3\u00b4\u0005*\u0000\u0000\u00b4\u00b5\u0003"+
		"\u0012\t\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005-"+
		"\u0000\u0000\u00b7\u00b8\u0003\u0010\b\u0000\u00b8\u00b9\u0005.\u0000"+
		"\u0000\u00b9\u00ba\u0003.\u0017\u0000\u00ba\u001d\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005/\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd"+
		"\u00be\u0003.\u0017\u0000\u00be\u00bf\u0005\u0011\u0000\u0000\u00bf\u001f"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u00050\u0000\u0000\u00c1\u00c2\u0005"+
		"\u0010\u0000\u0000\u00c2\u00c7\u00038\u001c\u0000\u00c3\u00c4\u0005\u0014"+
		"\u0000\u0000\u00c4\u00c6\u00038\u001c\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0011\u0000"+
		"\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00cd\u00051\u0000\u0000\u00cd"+
		"\u00ce\u00053\u0000\u0000\u00ce\u00cf\u0005\u0010\u0000\u0000\u00cf\u00d0"+
		"\u0003&\u0013\u0000\u00d0\u00d1\u0005\u0011\u0000\u0000\u00d1\u00d2\u0005"+
		"\u000f\u0000\u0000\u00d2\u00d3\u0003\f\u0006\u0000\u00d3\u00d4\u0005\f"+
		"\u0000\u0000\u00d4\u00d5\u0003$\u0012\u0000\u00d5#\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d8\u0003\u0004\u0002\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003\u000e\u0007\u0000"+
		"\u00dd\u00de\u0005%\u0000\u0000\u00de%\u0001\u0000\u0000\u0000\u00df\u00e4"+
		"\u0003(\u0014\u0000\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1\u00e3\u0003"+
		"(\u0014\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9\u00ea\u00053\u0000"+
		"\u0000\u00ea\u00eb\u0005\u000f\u0000\u0000\u00eb\u00ec\u0003\f\u0006\u0000"+
		"\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00ee\u00053\u0000\u0000\u00ee\u00f0"+
		"\u0005\u0010\u0000\u0000\u00ef\u00f1\u0003,\u0016\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005\u0011\u0000\u0000\u00f3+\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f9\u0003.\u0017\u0000\u00f5\u00f6\u0005\u0014\u0000"+
		"\u0000\u00f6\u00f8\u0003.\u0017\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa-\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u0105\u00030\u0018\u0000\u00fd\u0101"+
		"\u0003<\u001e\u0000\u00fe\u0101\u0005#\u0000\u0000\u00ff\u0101\u0005$"+
		"\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u00030\u0018\u0000\u0103\u0100\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010b\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010a\u0005\f\u0000\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c/\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u0116\u00032\u0019\u0000\u010f\u0112\u0003>\u001f\u0000\u0110\u0112\u0005"+
		"$\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u00032\u0019"+
		"\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u01171\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u011f\u00036\u001b\u0000\u011a\u011b\u0003@ \u0000\u011b\u011c"+
		"\u00036\u001b\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011a\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u01203\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u012b\u00053\u0000"+
		"\u0000\u0123\u012c\u0003:\u001d\u0000\u0124\u012c\u0003*\u0015\u0000\u0125"+
		"\u0126\u0005\u0010\u0000\u0000\u0126\u0127\u0003.\u0017\u0000\u0127\u0128"+
		"\u0005\u0011\u0000\u0000\u0128\u012c\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u001f\u0000\u0000\u012a\u012c\u00036\u001b\u0000\u012b\u0123\u0001"+
		"\u0000\u0000\u0000\u012b\u0124\u0001\u0000\u0000\u0000\u012b\u0125\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c5\u0001\u0000\u0000\u0000\u012d\u013a\u00034\u001a"+
		"\u0000\u012e\u013a\u00054\u0000\u0000\u012f\u013a\u00055\u0000\u0000\u0130"+
		"\u013a\u00056\u0000\u0000\u0131\u0132\u0005\u0010\u0000\u0000\u0132\u0133"+
		"\u0003.\u0017\u0000\u0133\u0134\u0005\u0011\u0000\u0000\u0134\u013a\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005\u001f\u0000\u0000\u0136\u013a\u0003"+
		"6\u001b\u0000\u0137\u013a\u0005 \u0000\u0000\u0138\u013a\u0005!\u0000"+
		"\u0000\u0139\u012d\u0001\u0000\u0000\u0000\u0139\u012e\u0001\u0000\u0000"+
		"\u0000\u0139\u012f\u0001\u0000\u0000\u0000\u0139\u0130\u0001\u0000\u0000"+
		"\u0000\u0139\u0131\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u013a7\u0001\u0000\u0000\u0000\u013b\u013d\u00053\u0000\u0000\u013c"+
		"\u013e\u0003:\u001d\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e9\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"\u0012\u0000\u0000\u0140\u0145\u0003.\u0017\u0000\u0141\u0142\u0005\u0014"+
		"\u0000\u0000\u0142\u0144\u0003.\u0017\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u0013\u0000"+
		"\u0000\u0149;\u0001\u0000\u0000\u0000\u014a\u014b\u0007\u0000\u0000\u0000"+
		"\u014b=\u0001\u0000\u0000\u0000\u014c\u014d\u0007\u0001\u0000\u0000\u014d"+
		"?\u0001\u0000\u0000\u0000\u014e\u014f\u0007\u0002\u0000\u0000\u014fA\u0001"+
		"\u0000\u0000\u0000\u001cJPVah{\u0082\u0088\u008c\u0098\u009e\u00a6\u00c7"+
		"\u00d9\u00e4\u00e7\u00f0\u00f9\u0100\u0105\u010b\u0111\u0116\u011f\u012b"+
		"\u0139\u013d\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}