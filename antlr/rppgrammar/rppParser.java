// Generated from /media/ssd/Dropbox/ReadablePlusPlus/antlr/rppgrammar/rpp.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Logic=12, Pointers=13, Digit=14, Nondigit=15, ID=16, 
		NewLine=17, LeftParen=18, RightParen=19, Spaces=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'do'", "'\t'", "' '", "'class '", "','", "'node'", "'while'", 
		"'if'", "'elif'", "'else'", "';'", "Logic", "Pointers", "Digit", "Nondigit", 
		"ID", "NewLine", "'('", "')'", "Spaces"
	};
	public static final int
		RULE_program = 0, RULE_globals = 1, RULE_classGlobals = 2, RULE_global = 3, 
		RULE_constructor = 4, RULE_function = 5, RULE_args = 6, RULE_functionStuff = 7, 
		RULE_body = 8, RULE_line = 9, RULE_statement = 10, RULE_ifStatement = 11, 
		RULE_whileStatement = 12, RULE_statementHelper = 13, RULE_logicExpression = 14, 
		RULE_type = 15, RULE_name = 16, RULE_lineTabs = 17, RULE_tabs = 18;
	public static final String[] ruleNames = {
		"program", "globals", "classGlobals", "global", "constructor", "function", 
		"args", "functionStuff", "body", "line", "statement", "ifStatement", "whileStatement", 
		"statementHelper", "logicExpression", "type", "name", "lineTabs", "tabs"
	};

	@Override
	public String getGrammarFileName() { return "rpp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(rppParser.EOF, 0); }
		public TerminalNode NewLine(int i) {
			return getToken(rppParser.NewLine, i);
		}
		public ClassGlobalsContext classGlobals() {
			return getRuleContext(ClassGlobalsContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(rppParser.NewLine); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38); match(NewLine);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(44); globals();
				}
				break;
			case T__7:
				{
				setState(45); classGlobals();
				}
				break;
			case EOF:
			case NewLine:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(48); match(NewLine);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(EOF);
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

	public static class GlobalsContext extends ParserRuleContext {
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public TerminalNode NewLine(int i) {
			return getToken(rppParser.NewLine, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(rppParser.NewLine); }
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitGlobals(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globals);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); global();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(57); match(NewLine);
						}
						}
						setState(60); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					setState(62); global();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ClassGlobalsContext extends ParserRuleContext {
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ClassGlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classGlobals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterClassGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitClassGlobals(this);
		}
	}

	public final ClassGlobalsContext classGlobals() throws RecognitionException {
		ClassGlobalsContext _localctx = new ClassGlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classGlobals);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__7);
			setState(69); name();
			setState(70); lineTabs();
			setState(71); global();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72); lineTabs();
					setState(73); global();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class GlobalContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitGlobal(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); function();
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

	public static class ConstructorContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Spaces(int i) {
			return getToken(rppParser.Spaces, i);
		}
		public List<TerminalNode> Spaces() { return getTokens(rppParser.Spaces); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); name();
			setState(83); match(LeftParen);
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(84); match(Spaces);
				}
				break;
			}
			setState(88);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(87); args();
				}
			}

			setState(91);
			_la = _input.LA(1);
			if (_la==Spaces) {
				{
				setState(90); match(Spaces);
				}
			}

			setState(93); match(RightParen);
			setState(94); body();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionStuffContext functionStuff() {
			return getRuleContext(FunctionStuffContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Spaces(int i) {
			return getToken(rppParser.Spaces, i);
		}
		public List<TerminalNode> Spaces() { return getTokens(rppParser.Spaces); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public LineTabsContext lineTabs() {
			return getRuleContext(LineTabsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(96); functionStuff();
				setState(97); match(T__8);
				}
				break;
			}
			setState(101); type();
			setState(102); match(T__8);
			setState(103); name();
			setState(104); match(LeftParen);
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(105); match(Spaces);
				}
				break;
			}
			setState(109);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108); args();
				}
			}

			setState(112);
			_la = _input.LA(1);
			if (_la==Spaces) {
				{
				setState(111); match(Spaces);
				}
			}

			setState(114); match(RightParen);
			setState(117);
			switch (_input.LA(1)) {
			case NewLine:
				{
				setState(115); lineTabs();
				}
				break;
			case T__8:
				{
				setState(116); match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119); body();
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

	public static class ArgsContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); type();
			setState(122); match(T__8);
			setState(123); name();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(124); match(T__6);
				setState(126);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(125); match(T__8);
					}
				}

				setState(128); type();
				setState(129); match(T__8);
				setState(130); name();
				}
				}
				setState(136);
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

	public static class FunctionStuffContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(rppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(rppParser.ID, i);
		}
		public FunctionStuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterFunctionStuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitFunctionStuff(this);
		}
	}

	public final FunctionStuffContext functionStuff() throws RecognitionException {
		FunctionStuffContext _localctx = new FunctionStuffContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionStuff);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(ID);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138); match(T__8);
					setState(139); match(ID);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BodyContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); line();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(151);
					switch (_input.LA(1)) {
					case NewLine:
						{
						setState(146); lineTabs();
						setState(147); line();
						}
						break;
					case T__0:
						{
						setState(149); match(T__0);
						setState(150); line();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); match(T__5);
				}
				break;
			case T__10:
			case T__4:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); statement();
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); ifStatement();
				}
				break;
			case T__10:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); whileStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementHelperContext> statementHelper() {
			return getRuleContexts(StatementHelperContext.class);
		}
		public StatementHelperContext statementHelper(int i) {
			return getRuleContext(StatementHelperContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(T__3);
			setState(165); statementHelper();
			setState(166); body();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					switch (_input.LA(1)) {
					case NewLine:
						{
						setState(167); lineTabs();
						}
						break;
					case T__0:
						{
						setState(168); match(T__0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171); match(T__2);
					setState(172); statementHelper();
					setState(173); body();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(182);
				switch (_input.LA(1)) {
				case NewLine:
					{
					setState(180); lineTabs();
					}
					break;
				case T__0:
					{
					setState(181); match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184); match(T__1);
				setState(187);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(185); match(T__8);
					}
					break;
				case NewLine:
					{
					setState(186); lineTabs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189); body();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementHelperContext statementHelper() {
			return getRuleContext(StatementHelperContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(T__4);
				setState(193); statementHelper();
				setState(194); body();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); match(T__10);
				setState(199);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(197); match(T__8);
					}
					break;
				case NewLine:
					{
					setState(198); lineTabs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201); body();
				setState(204);
				switch (_input.LA(1)) {
				case NewLine:
					{
					setState(202); lineTabs();
					}
					break;
				case T__0:
					{
					setState(203); match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206); match(T__4);
				setState(207); match(T__8);
				setState(208); logicExpression();
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

	public static class StatementHelperContext extends ParserRuleContext {
		public TerminalNode Spaces(int i) {
			return getToken(rppParser.Spaces, i);
		}
		public List<TerminalNode> Spaces() { return getTokens(rppParser.Spaces); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public LineTabsContext lineTabs() {
			return getRuleContext(LineTabsContext.class,0);
		}
		public StatementHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementHelper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterStatementHelper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitStatementHelper(this);
		}
	}

	public final StatementHelperContext statementHelper() throws RecognitionException {
		StatementHelperContext _localctx = new StatementHelperContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementHelper);
		int _la;
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); match(T__8);
				setState(213); logicExpression();
				setState(214); lineTabs();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(216); match(T__8);
					}
				}

				setState(219); match(LeftParen);
				setState(220); match(Spaces);
				setState(221); logicExpression();
				setState(222); match(Spaces);
				setState(223); match(RightParen);
				setState(224); match(T__8);
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public TerminalNode Logic() { return getToken(rppParser.Logic, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitLogicExpression(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(Logic);
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
		public List<TerminalNode> Pointers() { return getTokens(rppParser.Pointers); }
		public TerminalNode ID() { return getToken(rppParser.ID, 0); }
		public TerminalNode Pointers(int i) {
			return getToken(rppParser.Pointers, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(ID);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pointers) {
				{
				{
				setState(231); match(Pointers);
				}
				}
				setState(236);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(rppParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(ID);
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

	public static class LineTabsContext extends ParserRuleContext {
		public TabsContext tabs() {
			return getRuleContext(TabsContext.class,0);
		}
		public TerminalNode NewLine(int i) {
			return getToken(rppParser.NewLine, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(rppParser.NewLine); }
		public LineTabsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineTabs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterLineTabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitLineTabs(this);
		}
	}

	public final LineTabsContext lineTabs() throws RecognitionException {
		LineTabsContext _localctx = new LineTabsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lineTabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239); match(NewLine);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(244); tabs();
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

	public static class TabsContext extends ParserRuleContext {
		public TabsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterTabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitTabs(this);
		}
	}

	public final TabsContext tabs() throws RecognitionException {
		TabsContext _localctx = new TabsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246); match(T__9);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\5\2\61\n\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4"+
		"Q\13\4\3\5\3\5\3\6\3\6\3\6\5\6X\n\6\3\6\5\6[\n\6\3\6\5\6^\n\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\5\7f\n\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\7\5\7p\n\7\3"+
		"\7\5\7s\n\7\3\7\3\7\3\7\5\7x\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0081"+
		"\n\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\t\3\t\3\t\7\t"+
		"\u008f\n\t\f\t\16\t\u0092\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f"+
		"\n\16\n\u009d\13\n\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\5\f\u00a5\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\3\r\3\r\3\r\7\r\u00b2\n\r\f\r\16\r"+
		"\u00b5\13\r\3\r\3\r\5\r\u00b9\n\r\3\r\3\r\3\r\5\r\u00be\n\r\3\r\5\r\u00c1"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\16\3\16\3\16"+
		"\5\16\u00cf\n\16\3\16\3\16\3\16\3\16\5\16\u00d5\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00dc\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e5"+
		"\n\17\3\20\3\20\3\21\3\21\7\21\u00eb\n\21\f\21\16\21\u00ee\13\21\3\22"+
		"\3\22\3\23\6\23\u00f3\n\23\r\23\16\23\u00f4\3\23\3\23\3\24\6\24\u00fa"+
		"\n\24\r\24\16\24\u00fb\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\2\u010d\2+\3\2\2\2\4:\3\2\2\2\6F\3\2\2\2\bR\3\2\2\2\nT\3\2"+
		"\2\2\fe\3\2\2\2\16{\3\2\2\2\20\u008b\3\2\2\2\22\u0093\3\2\2\2\24\u00a0"+
		"\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00d4\3\2\2\2\34\u00e4\3"+
		"\2\2\2\36\u00e6\3\2\2\2 \u00e8\3\2\2\2\"\u00ef\3\2\2\2$\u00f2\3\2\2\2"+
		"&\u00f9\3\2\2\2(*\7\23\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\60"+
		"\3\2\2\2-+\3\2\2\2.\61\5\4\3\2/\61\5\6\4\2\60.\3\2\2\2\60/\3\2\2\2\60"+
		"\61\3\2\2\2\61\65\3\2\2\2\62\64\7\23\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\2\2\39\3\3\2\2"+
		"\2:C\5\b\5\2;=\7\23\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2"+
		"\2\2@B\5\b\5\2A<\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EC\3"+
		"\2\2\2FG\7\6\2\2GH\5\"\22\2HI\5$\23\2IO\5\b\5\2JK\5$\23\2KL\5\b\5\2LN"+
		"\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3\2\2\2"+
		"RS\5\f\7\2S\t\3\2\2\2TU\5\"\22\2UW\7\24\2\2VX\7\26\2\2WV\3\2\2\2WX\3\2"+
		"\2\2XZ\3\2\2\2Y[\5\16\b\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\7\26\2\2]\\"+
		"\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\25\2\2`a\5\22\n\2a\13\3\2\2\2bc\5\20"+
		"\t\2cd\7\5\2\2df\3\2\2\2eb\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5 \21\2hi\7\5"+
		"\2\2ij\5\"\22\2jl\7\24\2\2km\7\26\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np"+
		"\5\16\b\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\7\26\2\2rq\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tw\7\25\2\2ux\5$\23\2vx\7\5\2\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2"+
		"\2yz\5\22\n\2z\r\3\2\2\2{|\5 \21\2|}\7\5\2\2}\u0088\5\"\22\2~\u0080\7"+
		"\7\2\2\177\u0081\7\5\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\5 \21\2\u0083\u0084\7\5\2\2\u0084\u0085\5\"\22\2"+
		"\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\17\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u0090\7\22\2\2\u008c\u008d\7\5\2\2\u008d\u008f\7\22\2\2\u008e\u008c\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\21\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u009b\5\24\13\2\u0094\u0095\5$\23"+
		"\2\u0095\u0096\5\24\13\2\u0096\u009a\3\2\2\2\u0097\u0098\7\r\2\2\u0098"+
		"\u009a\5\24\13\2\u0099\u0094\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\23\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\7\b\2\2\u009f\u00a1\5\26\f\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a5\5\30\r\2\u00a3"+
		"\u00a5\5\32\16\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2"+
		"\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00b3\5\22\n\2\u00a9"+
		"\u00ac\5$\23\2\u00aa\u00ac\7\r\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\5\34\17\2\u00af"+
		"\u00b0\5\22\n\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c0\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b9\5$\23\2\u00b7\u00b9\7\r\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\7\f\2\2\u00bb"+
		"\u00be\7\5\2\2\u00bc\u00be\5$\23\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\5\22\n\2\u00c0\u00b8\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\5\34\17"+
		"\2\u00c4\u00c5\5\22\n\2\u00c5\u00d5\3\2\2\2\u00c6\u00c9\7\3\2\2\u00c7"+
		"\u00ca\7\5\2\2\u00c8\u00ca\5$\23\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\5\22\n\2\u00cc\u00cf\5$\23\2\u00cd"+
		"\u00cf\7\r\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\5\36\20\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d5\33\3\2\2"+
		"\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\5$\23\2\u00d9"+
		"\u00e5\3\2\2\2\u00da\u00dc\7\5\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\7\26\2\2\u00df"+
		"\u00e0\5\36\20\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3"+
		"\7\5\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4\u00db\3\2\2\2\u00e5"+
		"\35\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\37\3\2\2\2\u00e8\u00ec\7\22\2\2"+
		"\u00e9\u00eb\7\17\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed!\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\22\2\2\u00f0#\3\2\2\2\u00f1\u00f3\7\23\2\2\u00f2\u00f1\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f7\5&\24\2\u00f7%\3\2\2\2\u00f8\u00fa\7\4\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\'\3\2\2\2$+\60\65>COWZ]elorw\u0080\u0088\u0090\u0099\u009b"+
		"\u00a0\u00a4\u00ab\u00b3\u00b8\u00bd\u00c0\u00c9\u00ce\u00d4\u00db\u00e4"+
		"\u00ec\u00f4\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}