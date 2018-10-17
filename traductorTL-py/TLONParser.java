// Generated from TLON.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, ASSIGN=16, OPAR=17, CPAR=18, 
		OBRACE=19, CBRACE=20, OKEY=21, CKEY=22, COMMA=23, POINTS=24, TRUE=25, 
		FALSE=26, NIL=27, IF=28, ELSE=29, WHILE=30, LOG=31, FOR=32, IN=33, FUNCION=34, 
		END=35, RETORNO=36, IMPORT=37, FROM=38, ASTERISC=39, POINT=40, ID=41, 
		INT=42, FLOAT=43, STRING=44, COMMENT=45, SPACE=46, NEWLINE=47, OTHER=48;
	public static final int
		RULE_parse = 0, RULE_from_input = 1, RULE_from_file = 2, RULE_stat = 3, 
		RULE_compound_stat = 4, RULE_simple_stat = 5, RULE_assignment = 6, RULE_if_stat = 7, 
		RULE_while_stat = 8, RULE_for_stat = 9, RULE_log = 10, RULE_funcion = 11, 
		RULE_importar = 12, RULE_retornar = 13, RULE_condition_block = 14, RULE_stat_block = 15, 
		RULE_array = 16, RULE_accessarray = 17, RULE_variable = 18, RULE_parametro = 19, 
		RULE_expr = 20, RULE_atom = 21, RULE_objeto = 22, RULE_keyvalue = 23;
	public static final String[] ruleNames = {
		"parse", "from_input", "from_file", "stat", "compound_stat", "simple_stat", 
		"assignment", "if_stat", "while_stat", "for_stat", "log", "funcion", "importar", 
		"retornar", "condition_block", "stat_block", "array", "accessarray", "variable", 
		"parametro", "expr", "atom", "objeto", "keyvalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "':'", "'true'", "'false'", "'nil'", "'if'", 
		"'else'", "'while'", "'log'", "'for'", "'in'", "'funcion'", "'end'", "'retorno'", 
		"'importar'", "'desde'", "'todo'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
		"CBRACE", "OKEY", "CKEY", "COMMA", "POINTS", "TRUE", "FALSE", "NIL", "IF", 
		"ELSE", "WHILE", "LOG", "FOR", "IN", "FUNCION", "END", "RETORNO", "IMPORT", 
		"FROM", "ASTERISC", "POINT", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
		"SPACE", "NEWLINE", "OTHER"
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
	public String getGrammarFileName() { return "TLON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public From_inputContext from_input() {
			return getRuleContext(From_inputContext.class,0);
		}
		public From_fileContext from_file() {
			return getRuleContext(From_fileContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				from_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				from_file();
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

	public static class From_inputContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public From_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFrom_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFrom_input(this);
		}
	}

	public final From_inputContext from_input() throws RecognitionException {
		From_inputContext _localctx = new From_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			stat();
			setState(53);
			match(NEWLINE);
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

	public static class From_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TLONParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TLONParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TLONParser.NEWLINE, i);
		}
		public From_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFrom_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFrom_file(this);
		}
	}

	public final From_fileContext from_file() throws RecognitionException {
		From_fileContext _localctx = new From_fileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << FOR) | (1L << FUNCION) | (1L << RETORNO) | (1L << IMPORT) | (1L << FROM) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << OTHER))) != 0)) {
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OBRACE:
				case OKEY:
				case TRUE:
				case FALSE:
				case NIL:
				case IF:
				case WHILE:
				case LOG:
				case FOR:
				case FUNCION:
				case RETORNO:
				case IMPORT:
				case FROM:
				case ID:
				case INT:
				case FLOAT:
				case STRING:
				case OTHER:
					{
					setState(55);
					stat();
					}
					break;
				case NEWLINE:
					{
					setState(56);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class StatContext extends ParserRuleContext {
		public Simple_statContext simple_stat() {
			return getRuleContext(Simple_statContext.class,0);
		}
		public Compound_statContext compound_stat() {
			return getRuleContext(Compound_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
			case OKEY:
			case TRUE:
			case FALSE:
			case NIL:
			case LOG:
			case RETORNO:
			case IMPORT:
			case FROM:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				simple_stat();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case FUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				compound_stat();
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

	public static class Compound_statContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Compound_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterCompound_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitCompound_stat(this);
		}
	}

	public final Compound_statContext compound_stat() throws RecognitionException {
		Compound_statContext _localctx = new Compound_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				for_stat();
				}
				break;
			case FUNCION:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				funcion();
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

	public static class Simple_statContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public ImportarContext importar() {
			return getRuleContext(ImportarContext.class,0);
		}
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public TerminalNode OTHER() { return getToken(TLONParser.OTHER, 0); }
		public Simple_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterSimple_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitSimple_stat(this);
		}
	}

	public final Simple_statContext simple_stat() throws RecognitionException {
		Simple_statContext _localctx = new Simple_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_stat);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				log();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				importar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				retornar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				atom();
				setState(79);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				match(OTHER);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TLONParser.ASSIGN, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			variable();
			setState(85);
			match(ASSIGN);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86);
				assignment();
				}
				break;
			case 2:
				{
				setState(87);
				expr(0);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(TLONParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TLONParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(TLONParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(TLONParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			condition_block();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(ELSE);
					setState(93);
					match(IF);
					setState(94);
					condition_block();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(100);
				match(ELSE);
				setState(101);
				stat_block();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TLONParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitWhile_stat(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(WHILE);
			setState(105);
			expr(0);
			setState(106);
			stat_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TLONParser.FOR, 0); }
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode IN() { return getToken(TLONParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFor_stat(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FOR);
			setState(109);
			match(ID);
			setState(110);
			match(IN);
			setState(111);
			expr(0);
			setState(112);
			stat_block();
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(TLONParser.LOG, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LOG);
			setState(115);
			match(OPAR);
			setState(116);
			expr(0);
			setState(117);
			match(CPAR);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(TLONParser.FUNCION, 0); }
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public TerminalNode END() { return getToken(TLONParser.END, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TLONParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TLONParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FUNCION);
			setState(120);
			match(ID);
			setState(121);
			match(OPAR);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(122);
				parametro();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					parametro();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(132);
			match(CPAR);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << FOR) | (1L << FUNCION) | (1L << RETORNO) | (1L << IMPORT) | (1L << FROM) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << OTHER))) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(133);
					match(NEWLINE);
					}
					break;
				case OBRACE:
				case OKEY:
				case TRUE:
				case FALSE:
				case NIL:
				case IF:
				case WHILE:
				case LOG:
				case FOR:
				case FUNCION:
				case RETORNO:
				case IMPORT:
				case FROM:
				case ID:
				case INT:
				case FLOAT:
				case STRING:
				case OTHER:
					{
					setState(134);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(END);
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

	public static class ImportarContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TLONParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(TLONParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLONParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(TLONParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(TLONParser.POINT, i);
		}
		public TerminalNode FROM() { return getToken(TLONParser.FROM, 0); }
		public ImportarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterImportar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitImportar(this);
		}
	}

	public final ImportarContext importar() throws RecognitionException {
		ImportarContext _localctx = new ImportarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importar);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(IMPORT);
				setState(143);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(144);
					match(POINT);
					setState(145);
					match(ID);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(FROM);
				setState(152);
				match(ID);
				setState(153);
				match(IMPORT);
				setState(154);
				match(ID);
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

	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(TLONParser.RETORNO, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitRetornar(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(RETORNO);
			setState(158);
			match(OPAR);
			setState(159);
			expr(0);
			setState(160);
			match(CPAR);
			setState(161);
			match(NEWLINE);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitCondition_block(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			expr(0);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(164);
				match(NEWLINE);
				}
			}

			setState(167);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(TLONParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(TLONParser.CBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TLONParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TLONParser.NEWLINE, i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitStat_block(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat_block);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(OBRACE);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << FOR) | (1L << FUNCION) | (1L << RETORNO) | (1L << IMPORT) | (1L << FROM) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << OTHER))) != 0)) {
					{
					setState(172);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OBRACE:
					case OKEY:
					case TRUE:
					case FALSE:
					case NIL:
					case IF:
					case WHILE:
					case LOG:
					case FOR:
					case FUNCION:
					case RETORNO:
					case IMPORT:
					case FROM:
					case ID:
					case INT:
					case FLOAT:
					case STRING:
					case OTHER:
						{
						setState(170);
						stat();
						}
						break;
					case NEWLINE:
						{
						setState(171);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				stat();
				setState(179);
				match(NEWLINE);
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

	public static class ArrayContext extends ParserRuleContext {
		public ExprContext start;
		public ExprContext step;
		public ExprContext end;
		public TerminalNode OKEY() { return getToken(TLONParser.OKEY, 0); }
		public TerminalNode CKEY() { return getToken(TLONParser.CKEY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public List<TerminalNode> POINTS() { return getTokens(TLONParser.POINTS); }
		public TerminalNode POINTS(int i) {
			return getToken(TLONParser.POINTS, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(OKEY);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(184);
					expr(0);
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(185);
						match(COMMA);
						setState(186);
						expr(0);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(194);
				match(CKEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(OKEY);
				setState(196);
				((ArrayContext)_localctx).start = expr(0);
				setState(197);
				match(POINTS);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(198);
					((ArrayContext)_localctx).step = expr(0);
					setState(199);
					match(POINTS);
					}
					break;
				}
				setState(203);
				((ArrayContext)_localctx).end = expr(0);
				setState(204);
				match(CKEY);
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

	public static class AccessarrayContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OKEY() { return getToken(TLONParser.OKEY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CKEY() { return getToken(TLONParser.CKEY, 0); }
		public AccessarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessarray(this);
		}
	}

	public final AccessarrayContext accessarray() throws RecognitionException {
		AccessarrayContext _localctx = new AccessarrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_accessarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			variable();
			setState(209);
			match(OKEY);
			setState(210);
			expr(0);
			setState(211);
			match(CKEY);
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
		public List<TerminalNode> ID() { return getTokens(TLONParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLONParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(TLONParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(TLONParser.POINT, i);
		}
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public TerminalNode OKEY() { return getToken(TLONParser.OKEY, 0); }
		public TerminalNode CKEY() { return getToken(TLONParser.CKEY, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(ID);
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						match(POINT);
						setState(215);
						match(ID);
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(221);
					match(OPAR);
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
						{
						setState(222);
						expr(0);
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(223);
							match(COMMA);
							setState(224);
							expr(0);
							}
							}
							setState(229);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(232);
					match(CPAR);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ID);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(236);
					match(POINT);
					setState(237);
					match(ID);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(OKEY);
				setState(244);
				expr(0);
				setState(245);
				match(CKEY);
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TLONParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(250);
				match(ASSIGN);
				setState(251);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitParExpr(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(TLONParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitNotExpr(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(TLONParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitUnaryMinusExpr(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(TLONParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TLONParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TLONParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitMultiplicationExpr(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAtomExpr(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OR() { return getToken(TLONParser.OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitOrExpr(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(TLONParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TLONParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAdditiveExpr(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode POW() { return getToken(TLONParser.POW, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitPowExpr(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(TLONParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(TLONParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(TLONParser.LT, 0); }
		public TerminalNode GT() { return getToken(TLONParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitRelationalExpr(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(TLONParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(TLONParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitEqualityExpr(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode AND() { return getToken(TLONParser.AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAndExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255);
				match(MINUS);
				setState(256);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(NOT);
				setState(258);
				expr(9);
				}
				break;
			case OPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(OPAR);
				setState(260);
				expr(0);
				setState(261);
				match(CPAR);
				}
				break;
			case OBRACE:
			case OKEY:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(267);
						match(POW);
						setState(268);
						((PowExprContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(270);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						((MultiplicationExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						((AdditiveExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(273);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						((AdditiveExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(276);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						((RelationalExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(279);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						((EqualityExprContext)_localctx).right = expr(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(282);
						match(AND);
						setState(283);
						((AndExprContext)_localctx).right = expr(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(285);
						match(OR);
						setState(286);
						((OrExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjetoAtomContext extends AtomContext {
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ObjetoAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterObjetoAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitObjetoAtom(this);
		}
	}
	public static class AccessToarrayContext extends AtomContext {
		public AccessarrayContext accessarray() {
			return getRuleContext(AccessarrayContext.class,0);
		}
		public AccessToarrayContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessToarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessToarray(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(TLONParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TLONParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitBooleanAtom(this);
		}
	}
	public static class ArrayAtomContext extends AtomContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterArrayAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitArrayAtom(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(TLONParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitStringAtom(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(TLONParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitNilAtom(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(TLONParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TLONParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitNumberAtom(this);
		}
	}
	public static class AccessVariableContext extends AtomContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AccessVariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessVariable(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new ArrayAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				array();
				}
				break;
			case 5:
				_localctx = new ObjetoAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				objeto();
				}
				break;
			case 6:
				_localctx = new AccessToarrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				accessarray();
				}
				break;
			case 7:
				_localctx = new AccessVariableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				variable();
				}
				break;
			case 8:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				match(NIL);
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

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(TLONParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(TLONParser.CBRACE, 0); }
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitObjeto(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(OBRACE);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(303);
				keyvalue();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(304);
					match(COMMA);
					setState(305);
					keyvalue();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(313);
			match(CBRACE);
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

	public static class KeyvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode POINTS() { return getToken(TLONParser.POINTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitKeyvalue(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(POINTS);
			setState(317);
			expr(0);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0142\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\3\3\3\3\3\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3"+
		"\4\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7U\n\7\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\7\tb\n\t"+
		"\f\t\16\te\13\t\3\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0080\n\r\f\r"+
		"\16\r\u0083\13\r\5\r\u0085\n\r\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0095\n\16\f\16\16\16\u0098\13"+
		"\16\3\16\3\16\3\16\3\16\5\16\u009e\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20\u00a8\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u00af\n\21\f"+
		"\21\16\21\u00b2\13\21\3\21\3\21\3\21\3\21\5\21\u00b8\n\21\3\22\3\22\3"+
		"\22\3\22\7\22\u00be\n\22\f\22\16\22\u00c1\13\22\5\22\u00c3\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\3\22\5\22\u00d1"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00db\n\24\f\24\16"+
		"\24\u00de\13\24\3\24\3\24\3\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7\13"+
		"\24\5\24\u00e9\n\24\3\24\5\24\u00ec\n\24\3\24\3\24\3\24\7\24\u00f1\n\24"+
		"\f\24\16\24\u00f4\13\24\3\24\3\24\3\24\3\24\5\24\u00fa\n\24\3\25\3\25"+
		"\3\25\5\25\u00ff\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u010b\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0122\n\26\f\26"+
		"\16\26\u0125\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012f"+
		"\n\27\3\30\3\30\3\30\3\30\7\30\u0135\n\30\f\30\16\30\u0138\13\30\5\30"+
		"\u013a\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\2\3*\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\b\3\2\r\17\3\2\13\f\3\2\7\n\3\2"+
		"\5\6\3\2,-\3\2\33\34\2\u0160\2\64\3\2\2\2\4\66\3\2\2\2\6=\3\2\2\2\bD\3"+
		"\2\2\2\nJ\3\2\2\2\fT\3\2\2\2\16V\3\2\2\2\20\\\3\2\2\2\22j\3\2\2\2\24n"+
		"\3\2\2\2\26t\3\2\2\2\30y\3\2\2\2\32\u009d\3\2\2\2\34\u009f\3\2\2\2\36"+
		"\u00a5\3\2\2\2 \u00b7\3\2\2\2\"\u00d0\3\2\2\2$\u00d2\3\2\2\2&\u00f9\3"+
		"\2\2\2(\u00fb\3\2\2\2*\u010a\3\2\2\2,\u012e\3\2\2\2.\u0130\3\2\2\2\60"+
		"\u013d\3\2\2\2\62\65\5\4\3\2\63\65\5\6\4\2\64\62\3\2\2\2\64\63\3\2\2\2"+
		"\65\3\3\2\2\2\66\67\5\b\5\2\678\7\61\2\28\5\3\2\2\29<\5\b\5\2:<\7\61\2"+
		"\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2"+
		"\2@A\7\2\2\3A\7\3\2\2\2BE\5\f\7\2CE\5\n\6\2DB\3\2\2\2DC\3\2\2\2E\t\3\2"+
		"\2\2FK\5\20\t\2GK\5\22\n\2HK\5\24\13\2IK\5\30\r\2JF\3\2\2\2JG\3\2\2\2"+
		"JH\3\2\2\2JI\3\2\2\2K\13\3\2\2\2LU\5\16\b\2MU\5\26\f\2NU\5\32\16\2OU\5"+
		"\34\17\2PQ\5,\27\2QR\7\61\2\2RU\3\2\2\2SU\7\62\2\2TL\3\2\2\2TM\3\2\2\2"+
		"TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TS\3\2\2\2U\r\3\2\2\2VW\5&\24\2WZ\7\22\2"+
		"\2X[\5\16\b\2Y[\5*\26\2ZX\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\]\7\36\2\2]c"+
		"\5\36\20\2^_\7\37\2\2_`\7\36\2\2`b\5\36\20\2a^\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2dh\3\2\2\2ec\3\2\2\2fg\7\37\2\2gi\5 \21\2hf\3\2\2\2hi\3"+
		"\2\2\2i\21\3\2\2\2jk\7 \2\2kl\5*\26\2lm\5 \21\2m\23\3\2\2\2no\7\"\2\2"+
		"op\7+\2\2pq\7#\2\2qr\5*\26\2rs\5 \21\2s\25\3\2\2\2tu\7!\2\2uv\7\23\2\2"+
		"vw\5*\26\2wx\7\24\2\2x\27\3\2\2\2yz\7$\2\2z{\7+\2\2{\u0084\7\23\2\2|\u0081"+
		"\5(\25\2}~\7\31\2\2~\u0080\5(\25\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084|\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b"+
		"\7\24\2\2\u0087\u008a\7\61\2\2\u0088\u008a\5\b\5\2\u0089\u0087\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7%\2\2\u008f"+
		"\31\3\2\2\2\u0090\u0091\7\'\2\2\u0091\u0096\7+\2\2\u0092\u0093\7*\2\2"+
		"\u0093\u0095\7+\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7(\2\2\u009a\u009b\7+\2\2\u009b\u009c\7\'\2\2\u009c\u009e\7+\2"+
		"\2\u009d\u0090\3\2\2\2\u009d\u0099\3\2\2\2\u009e\33\3\2\2\2\u009f\u00a0"+
		"\7&\2\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5*\26\2\u00a2\u00a3\7\24\2\2"+
		"\u00a3\u00a4\7\61\2\2\u00a4\35\3\2\2\2\u00a5\u00a7\5*\26\2\u00a6\u00a8"+
		"\7\61\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00aa\5 \21\2\u00aa\37\3\2\2\2\u00ab\u00b0\7\25\2\2\u00ac\u00af"+
		"\5\b\5\2\u00ad\u00af\7\61\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2"+
		"\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b8\7\26\2\2\u00b4\u00b5\5\b\5\2"+
		"\u00b5\u00b6\7\61\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00b4"+
		"\3\2\2\2\u00b8!\3\2\2\2\u00b9\u00c2\7\27\2\2\u00ba\u00bf\5*\26\2\u00bb"+
		"\u00bc\7\31\2\2\u00bc\u00be\5*\26\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00d1\7\30\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\5*\26\2\u00c7"+
		"\u00cb\7\32\2\2\u00c8\u00c9\5*\26\2\u00c9\u00ca\7\32\2\2\u00ca\u00cc\3"+
		"\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\5*\26\2\u00ce\u00cf\7\30\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00b9\3"+
		"\2\2\2\u00d0\u00c5\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00d3\5&\24\2\u00d3\u00d4"+
		"\7\27\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\7\30\2\2\u00d6%\3\2\2\2\u00d7"+
		"\u00dc\7+\2\2\u00d8\u00d9\7*\2\2\u00d9\u00db\7+\2\2\u00da\u00d8\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00eb"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e8\7\23\2\2\u00e0\u00e5\5*\26\2"+
		"\u00e1\u00e2\7\31\2\2\u00e2\u00e4\5*\26\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\7\24\2\2\u00eb\u00df\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00fa\3\2\2\2\u00ed\u00f2\7+\2\2\u00ee\u00ef\7*\2\2\u00ef\u00f1\7+\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\27\2\2"+
		"\u00f6\u00f7\5*\26\2\u00f7\u00f8\7\30\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00d7"+
		"\3\2\2\2\u00f9\u00ed\3\2\2\2\u00fa\'\3\2\2\2\u00fb\u00fe\7+\2\2\u00fc"+
		"\u00fd\7\22\2\2\u00fd\u00ff\5*\26\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff)\3\2\2\2\u0100\u0101\b\26\1\2\u0101\u0102\7\f\2\2\u0102\u010b"+
		"\5*\26\f\u0103\u0104\7\21\2\2\u0104\u010b\5*\26\13\u0105\u0106\7\23\2"+
		"\2\u0106\u0107\5*\26\2\u0107\u0108\7\24\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u010b\5,\27\2\u010a\u0100\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010a\u0109\3\2\2\2\u010b\u0123\3\2\2\2\u010c\u010d\f\r\2\2\u010d"+
		"\u010e\7\20\2\2\u010e\u0122\5*\26\r\u010f\u0110\f\n\2\2\u0110\u0111\t"+
		"\2\2\2\u0111\u0122\5*\26\13\u0112\u0113\f\t\2\2\u0113\u0114\t\3\2\2\u0114"+
		"\u0122\5*\26\n\u0115\u0116\f\b\2\2\u0116\u0117\t\4\2\2\u0117\u0122\5*"+
		"\26\t\u0118\u0119\f\7\2\2\u0119\u011a\t\5\2\2\u011a\u0122\5*\26\b\u011b"+
		"\u011c\f\6\2\2\u011c\u011d\7\4\2\2\u011d\u0122\5*\26\7\u011e\u011f\f\5"+
		"\2\2\u011f\u0120\7\3\2\2\u0120\u0122\5*\26\6\u0121\u010c\3\2\2\2\u0121"+
		"\u010f\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u0118\3\2"+
		"\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124+\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\u0126\u012f\t\6\2\2\u0127\u012f\t\7\2\2\u0128\u012f\7.\2\2\u0129\u012f"+
		"\5\"\22\2\u012a\u012f\5.\30\2\u012b\u012f\5$\23\2\u012c\u012f\5&\24\2"+
		"\u012d\u012f\7\35\2\2\u012e\u0126\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u0128"+
		"\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f-\3\2\2\2\u0130\u0139\7\25\2\2"+
		"\u0131\u0136\5\60\31\2\u0132\u0133\7\31\2\2\u0133\u0135\5\60\31\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u0131\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\26\2\2\u013c/\3\2\2\2"+
		"\u013d\u013e\7+\2\2\u013e\u013f\7\32\2\2\u013f\u0140\5*\26\2\u0140\61"+
		"\3\2\2\2&\64;=DJTZch\u0081\u0084\u0089\u008b\u0096\u009d\u00a7\u00ae\u00b0"+
		"\u00b7\u00bf\u00c2\u00cb\u00d0\u00dc\u00e5\u00e8\u00eb\u00f2\u00f9\u00fe"+
		"\u010a\u0121\u0123\u012e\u0136\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}