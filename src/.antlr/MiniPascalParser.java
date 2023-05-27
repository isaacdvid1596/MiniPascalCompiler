// Generated from /home/jisaacdavid/IdeaProjects/MiniPascalCompiler/src/MiniPascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static class ProgramContext extends ProgContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
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
	public static class IndexRangeContext extends Index_rangeContext {
		public List<TerminalNode> NUMBER() { return getTokens(MiniPascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiniPascalParser.NUMBER, i);
		}
		public TerminalNode DOTDOT() { return getToken(MiniPascalParser.DOTDOT, 0); }
		public IndexRangeContext(Index_rangeContext ctx) { copyFrom(ctx); }
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
	public static class IntegerContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public IntegerContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayContext extends TypeContext {
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public ArrayContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class CharContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public CharContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class RealContext extends TypeContext {
		public TerminalNode REAL() { return getToken(MiniPascalParser.REAL, 0); }
		public RealContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public StringContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public BooleanContext(TypeContext ctx) { copyFrom(ctx); }
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
	public static class WriteStatementContext extends Write_statementContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public WriteStatementContext(Write_statementContext ctx) { copyFrom(ctx); }
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
	public static class ParameterDeclarationContext extends Parameter_declarationContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterDeclarationContext(Parameter_declarationContext ctx) { copyFrom(ctx); }
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
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRINGLITERAL) | (1L << CHARACTER))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ) | (1L << AND) | (1L << OR))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
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
	public static class VariableNonTerminalContext extends VariableContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public Index_accessContext index_access() {
			return getRuleContext(Index_accessContext.class,0);
		}
		public VariableNonTerminalContext(VariableContext ctx) { copyFrom(ctx); }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MiniPascalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MiniPascalParser.SUB, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MiniPascalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniPascalParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\7\3Q\n"+
		"\3\f\3\16\3T\13\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\7\4b\n\4\f\4\16\4e\13\4\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t"+
		"\7\t\u0083\n\t\f\t\16\t\u0086\13\t\3\n\3\n\3\n\5\n\u008b\n\n\7\n\u008d"+
		"\n\n\f\n\16\n\u0090\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u009b\n\13\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a9\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00c8\n\22\f\22\16\22\u00cb\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\7\24\u00da\n\24"+
		"\f\24\16\24\u00dd\13\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00e5\n\25"+
		"\f\25\16\25\u00e8\13\25\5\25\u00ea\n\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\5\27\u00f3\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u00fa\n\30\f\30\16"+
		"\30\u00fd\13\30\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\31\7\31\u0106\n"+
		"\31\f\31\16\31\u0109\13\31\3\31\7\31\u010c\n\31\f\31\16\31\u010f\13\31"+
		"\3\32\3\32\3\32\5\32\u0114\n\32\3\32\7\32\u0117\n\32\f\32\16\32\u011a"+
		"\13\32\3\33\3\33\3\33\3\33\7\33\u0120\n\33\f\33\16\33\u0123\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012e\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u013c\n\35\3\36\3\36"+
		"\5\36\u0140\n\36\3\37\3\37\3\37\3\37\7\37\u0146\n\37\f\37\16\37\u0149"+
		"\13\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\5\3\2\b\r\3\2\3\4\3\2\5\7"+
		"\2\u0162\2D\3\2\2\2\4L\3\2\2\2\6]\3\2\2\2\bf\3\2\2\2\nl\3\2\2\2\fs\3\2"+
		"\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0087\3\2\2\2\24\u009a\3\2\2\2\26\u009c"+
		"\3\2\2\2\30\u00a2\3\2\2\2\32\u00aa\3\2\2\2\34\u00af\3\2\2\2\36\u00b8\3"+
		"\2\2\2 \u00bd\3\2\2\2\"\u00c2\3\2\2\2$\u00ce\3\2\2\2&\u00db\3\2\2\2(\u00e9"+
		"\3\2\2\2*\u00eb\3\2\2\2,\u00ef\3\2\2\2.\u00f6\3\2\2\2\60\u00fe\3\2\2\2"+
		"\62\u0110\3\2\2\2\64\u011b\3\2\2\2\66\u0124\3\2\2\28\u013b\3\2\2\2:\u013d"+
		"\3\2\2\2<\u0141\3\2\2\2>\u014c\3\2\2\2@\u014e\3\2\2\2B\u0150\3\2\2\2D"+
		"E\7\27\2\2EF\7\65\2\2FG\7\16\2\2GH\5\4\3\2H\3\3\2\2\2IK\5\6\4\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5$\23\2PO\3\2"+
		"\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SX\3\2\2\2TR\3\2\2\2UW\5\20\t\2VU\3"+
		"\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\30\2\2\\"+
		"\5\3\2\2\2]c\7\31\2\2^_\5\b\5\2_`\7\16\2\2`b\3\2\2\2a^\3\2\2\2be\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2d\7\3\2\2\2ec\3\2\2\2fg\7\65\2\2gh\7\21\2\2hj\5"+
		"\16\b\2ik\5\n\6\2ji\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lm\7\32\2\2mn\7\24\2\2"+
		"no\5\f\7\2op\7\25\2\2pq\7 \2\2qr\5\16\b\2r\13\3\2\2\2st\7\66\2\2tu\7\20"+
		"\2\2uv\7\66\2\2v\r\3\2\2\2w~\7\33\2\2x~\7\34\2\2y~\7\35\2\2z~\7\36\2\2"+
		"{~\7\37\2\2|~\5\n\6\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2"+
		"\2}|\3\2\2\2~\17\3\2\2\2\177\u0080\7\64\2\2\u0080\u0084\5\22\n\2\u0081"+
		"\u0083\7$\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\21\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008e"+
		"\5\24\13\2\u0088\u008a\7\16\2\2\u0089\u008b\5\24\13\2\u008a\u0089\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u009b\5\20\t\2\u0092\u009b\5\26\f\2\u0093"+
		"\u009b\5\30\r\2\u0094\u009b\5\32\16\2\u0095\u009b\5\34\17\2\u0096\u009b"+
		"\5\36\20\2\u0097\u009b\5 \21\2\u0098\u009b\5\"\22\2\u0099\u009b\5,\27"+
		"\2\u009a\u0091\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0094"+
		"\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d\5:\36"+
		"\2\u009d\u00a0\7\17\2\2\u009e\u00a1\5\60\31\2\u009f\u00a1\5,\27\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7(\2\2"+
		"\u00a3\u00a4\5\60\31\2\u00a4\u00a5\7)\2\2\u00a5\u00a8\5\24\13\2\u00a6"+
		"\u00a7\7*\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab\u00ac\5\60\31\2\u00ac"+
		"\u00ad\7,\2\2\u00ad\u00ae\5\24\13\2\u00ae\33\3\2\2\2\u00af\u00b0\7-\2"+
		"\2\u00b0\u00b1\7\65\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\5\60\31\2\u00b3"+
		"\u00b4\7.\2\2\u00b4\u00b5\5\60\31\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\5\24"+
		"\13\2\u00b7\35\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb"+
		"\7\60\2\2\u00bb\u00bc\5\60\31\2\u00bc\37\3\2\2\2\u00bd\u00be\7\61\2\2"+
		"\u00be\u00bf\7\22\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c1\7\23\2\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c9\5:\36"+
		"\2\u00c5\u00c6\7\26\2\2\u00c6\u00c8\5:\36\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\23\2\2\u00cd#\3\2\2\2\u00ce\u00cf"+
		"\7\63\2\2\u00cf\u00d0\7\65\2\2\u00d0\u00d1\7\22\2\2\u00d1\u00d2\5(\25"+
		"\2\u00d2\u00d3\7\23\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5\5\16\b\2\u00d5"+
		"\u00d6\7\16\2\2\u00d6\u00d7\5&\24\2\u00d7%\3\2\2\2\u00d8\u00da\5\6\4\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5\20\t\2"+
		"\u00df\u00e0\7\'\2\2\u00e0\'\3\2\2\2\u00e1\u00e6\5*\26\2\u00e2\u00e3\7"+
		"\26\2\2\u00e3\u00e5\5*\26\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea)\3\2\2\2\u00eb\u00ec"+
		"\7\65\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\5\16\b\2\u00ee+\3\2\2\2\u00ef"+
		"\u00f0\7\65\2\2\u00f0\u00f2\7\22\2\2\u00f1\u00f3\5.\30\2\u00f2\u00f1\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\23\2\2\u00f5"+
		"-\3\2\2\2\u00f6\u00fb\5\60\31\2\u00f7\u00f8\7\26\2\2\u00f8\u00fa\5\60"+
		"\31\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc/\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0107\5\62\32"+
		"\2\u00ff\u0103\5> \2\u0100\u0103\7%\2\2\u0101\u0103\7&\2\2\u0102\u00ff"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\5\62\32\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u010d\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010c\7\16\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\61\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0118\5\64\33\2\u0111\u0114\5@!\2\u0112\u0114\7&\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5\64\33\2\u0116"+
		"\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\63\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0121\58\35\2\u011c\u011d"+
		"\5B\"\2\u011d\u011e\58\35\2\u011e\u0120\3\2\2\2\u011f\u011c\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\65\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0124\u012d\7\65\2\2\u0125\u012e\5<\37\2\u0126"+
		"\u012e\5,\27\2\u0127\u0128\7\22\2\2\u0128\u0129\5\60\31\2\u0129\u012a"+
		"\7\23\2\2\u012a\u012e\3\2\2\2\u012b\u012c\7!\2\2\u012c\u012e\58\35\2\u012d"+
		"\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\67\3\2\2\2\u012f\u013c\5\66\34\2\u0130"+
		"\u013c\7\66\2\2\u0131\u013c\7\67\2\2\u0132\u013c\78\2\2\u0133\u0134\7"+
		"\22\2\2\u0134\u0135\5\60\31\2\u0135\u0136\7\23\2\2\u0136\u013c\3\2\2\2"+
		"\u0137\u0138\7!\2\2\u0138\u013c\58\35\2\u0139\u013c\7\"\2\2\u013a\u013c"+
		"\7#\2\2\u013b\u012f\3\2\2\2\u013b\u0130\3\2\2\2\u013b\u0131\3\2\2\2\u013b"+
		"\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013a\3\2\2\2\u013c9\3\2\2\2\u013d\u013f\7\65\2\2\u013e\u0140"+
		"\5<\37\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140;\3\2\2\2\u0141"+
		"\u0142\7\24\2\2\u0142\u0147\5\60\31\2\u0143\u0144\7\26\2\2\u0144\u0146"+
		"\5\60\31\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b"+
		"\7\25\2\2\u014b=\3\2\2\2\u014c\u014d\t\2\2\2\u014d?\3\2\2\2\u014e\u014f"+
		"\t\3\2\2\u014fA\3\2\2\2\u0150\u0151\t\4\2\2\u0151C\3\2\2\2\36LRXcj}\u0084"+
		"\u008a\u008e\u009a\u00a0\u00a8\u00c9\u00db\u00e6\u00e9\u00f2\u00fb\u0102"+
		"\u0107\u010d\u0113\u0118\u0121\u012d\u013b\u013f\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}