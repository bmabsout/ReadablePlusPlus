// Generated from /media/ssd/Dropbox/ReadablePlusPlus/rppGrammar/rpp.g4 by ANTLR 4.3
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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, Logic=14, Number=15, Spaces=16, Pointers=17, 
		ID=18, Digit=19, NonDigit=20, NewLine=21, LeftParen=22, RightParen=23, 
		LeftBrace=24, RightBrace=25, Thing=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'do'", "'class '", "','", "'node'", "'while'", "'if'", "'elif'", 
		"'='", "';'", "'\t'", "' '", "'else'", "'static'", "Logic", "Number", 
		"Spaces", "Pointers", "ID", "Digit", "NonDigit", "NewLine", "'('", "')'", 
		"'{'", "'}'", "'|'"
	};
	public static final int
		RULE_program = 0, RULE_globals = 1, RULE_classGlobals = 2, RULE_global = 3, 
		RULE_constructor = 4, RULE_function = 5, RULE_args = 6, RULE_functionStuff = 7, 
		RULE_body = 8, RULE_line = 9, RULE_member = 10, RULE_staticMember = 11, 
		RULE_functionCall = 12, RULE_functionArgs = 13, RULE_functionNoArgs = 14, 
		RULE_assigns = 15, RULE_assign = 16, RULE_declarator = 17, RULE_closedItem = 18, 
		RULE_lineAssign = 19, RULE_linemix = 20, RULE_closedExpr = 21, RULE_expr = 22, 
		RULE_statement = 23, RULE_ifStatement = 24, RULE_whileStatement = 25, 
		RULE_statementHelper = 26, RULE_logicExpression = 27, RULE_lineTabs = 28, 
		RULE_tabs = 29, RULE_type = 30, RULE_name = 31;
	public static final String[] ruleNames = {
		"program", "globals", "classGlobals", "global", "constructor", "function", 
		"args", "functionStuff", "body", "line", "member", "staticMember", "functionCall", 
		"functionArgs", "functionNoArgs", "assigns", "assign", "declarator", "closedItem", 
		"lineAssign", "linemix", "closedExpr", "expr", "statement", "ifStatement", 
		"whileStatement", "statementHelper", "logicExpression", "lineTabs", "tabs", 
		"type", "name"
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
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64); match(NewLine);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(72);
			switch (_input.LA(1)) {
			case T__0:
			case ID:
				{
				setState(70); globals();
				}
				break;
			case T__11:
				{
				setState(71); classGlobals();
				}
				break;
			case EOF:
			case NewLine:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(74); match(NewLine);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80); match(EOF);
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
			setState(82); global();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(83); match(NewLine);
						}
						}
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					setState(88); global();
					}
					} 
				}
				setState(93);
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
			setState(94); match(T__11);
			setState(95); name();
			setState(96); lineTabs();
			setState(97); global();
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98); lineTabs();
					setState(99); global();
					}
					} 
				}
				setState(105);
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
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
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
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); function();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); member();
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
			setState(110); name();
			setState(111); match(LeftParen);
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(112); match(Spaces);
				}
				break;
			}
			setState(116);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(115); args();
				}
			}

			setState(119);
			_la = _input.LA(1);
			if (_la==Spaces) {
				{
				setState(118); match(Spaces);
				}
			}

			setState(121); match(RightParen);
			setState(122); body();
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
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(124); functionStuff();
				setState(125); match(T__2);
				}
				break;
			}
			setState(129); type();
			setState(130); match(T__2);
			setState(131); name();
			setState(132); match(LeftParen);
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(133); match(Spaces);
				}
				break;
			}
			setState(137);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(136); args();
				}
			}

			setState(140);
			_la = _input.LA(1);
			if (_la==Spaces) {
				{
				setState(139); match(Spaces);
				}
			}

			setState(142); match(RightParen);
			setState(145);
			switch (_input.LA(1)) {
			case NewLine:
				{
				setState(143); lineTabs();
				}
				break;
			case T__2:
				{
				setState(144); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147); body();
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
			setState(149); type();
			setState(150); match(T__2);
			setState(151); name();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(152); match(T__10);
				setState(154);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(153); match(T__2);
					}
				}

				setState(156); type();
				setState(157); match(T__2);
				setState(158); name();
				}
				}
				setState(164);
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
			setState(165); match(ID);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166); match(T__2);
					setState(167); match(ID);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(173); line();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(179);
					switch (_input.LA(1)) {
					case NewLine:
						{
						setState(174); lineTabs();
						setState(175); line();
						}
						break;
					case T__4:
						{
						setState(177); match(T__4);
						setState(178); line();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
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
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(T__9);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); assigns();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187); functionCall();
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

	public static class MemberContext extends ParserRuleContext {
		public StaticMemberContext staticMember() {
			return getRuleContext(StaticMemberContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_member);
		int _la;
		try {
			int _alt;
			setState(216);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); type();
				setState(191); match(Thing);
				setState(198);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(192); match(T__2);
						}
						}
						setState(195); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					}
					break;
				case NewLine:
					{
					setState(197); lineTabs();
					}
					break;
				case ID:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); declarator();
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						switch (_input.LA(1)) {
						case T__2:
							{
							setState(202); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(201); match(T__2);
								}
								}
								setState(204); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==T__2 );
							}
							break;
						case NewLine:
							{
							setState(206); lineTabs();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(209); declarator();
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); staticMember();
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

	public static class StaticMemberContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public StaticMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterStaticMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitStaticMember(this);
		}
	}

	public final StaticMemberContext staticMember() throws RecognitionException {
		StaticMemberContext _localctx = new StaticMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_staticMember);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(T__0);
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(225);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(220); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(219); match(T__2);
							}
							}
							setState(222); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__2 );
						}
						break;
					case NewLine:
						{
						setState(224); lineTabs();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(227); assign();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ClosedExprContext closedExpr(int i) {
			return getRuleContext(ClosedExprContext.class,i);
		}
		public List<ClosedExprContext> closedExpr() {
			return getRuleContexts(ClosedExprContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232); name();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233); match(T__2);
					setState(234); closedExpr();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class FunctionArgsContext extends ParserRuleContext {
		public ClosedExprContext closedExpr(int i) {
			return getRuleContext(ClosedExprContext.class,i);
		}
		public List<ClosedExprContext> closedExpr() {
			return getRuleContexts(ClosedExprContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitFunctionArgs(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240); name();
			setState(243); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(241); match(T__2);
					setState(242); closedExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionNoArgsContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionNoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNoArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterFunctionNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitFunctionNoArgs(this);
		}
	}

	public final FunctionNoArgsContext functionNoArgs() throws RecognitionException {
		FunctionNoArgsContext _localctx = new FunctionNoArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionNoArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); name();
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

	public static class AssignsContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public AssignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterAssigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitAssigns(this);
		}
	}

	public final AssignsContext assigns() throws RecognitionException {
		AssignsContext _localctx = new AssignsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); assign();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250); match(T__2);
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(255); assign();
				}
				}
				setState(260);
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

	public static class AssignContext extends ParserRuleContext {
		public ClosedItemContext closedItem() {
			return getRuleContext(ClosedItemContext.class,0);
		}
		public LinemixContext linemix(int i) {
			return getRuleContext(LinemixContext.class,i);
		}
		public List<LinemixContext> linemix() {
			return getRuleContexts(LinemixContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<LineAssignContext> lineAssign() {
			return getRuleContexts(LineAssignContext.class);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public List<LineTabsContext> lineTabs() {
			return getRuleContexts(LineTabsContext.class);
		}
		public LineAssignContext lineAssign(int i) {
			return getRuleContext(LineAssignContext.class,i);
		}
		public LineTabsContext lineTabs(int i) {
			return getRuleContext(LineTabsContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261); type();
			setState(298);
			switch (_input.LA(1)) {
			case Thing:
				{
				setState(262); match(Thing);
				setState(269);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(263); match(T__2);
						}
						}
						setState(266); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					}
					break;
				case NewLine:
					{
					setState(268); lineTabs();
					}
					break;
				case ID:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(271); lineAssign();
					}
					break;

				case 2:
					{
					setState(272); declarator();
					setState(279);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(274); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(273); match(T__2);
							}
							}
							setState(276); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__2 );
						setState(278); linemix();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case T__2:
			case LeftBrace:
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(283); match(T__2);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289); closedItem();
				setState(296);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(290); match(T__2);
						}
						}
						setState(293); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					setState(295); linemix();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300); lineTabs();
					setState(303);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(301); linemix();
						}
						break;

					case 2:
						{
						setState(302); lineAssign();
						}
						break;
					}
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310); name();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311); match(T__2);
					setState(312); name();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class ClosedItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ClosedExprContext closedExpr() {
			return getRuleContext(ClosedExprContext.class,0);
		}
		public ClosedItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterClosedItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitClosedItem(this);
		}
	}

	public final ClosedItemContext closedItem() throws RecognitionException {
		ClosedItemContext _localctx = new ClosedItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_closedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(LeftBrace);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(319); match(T__2);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325); declarator();
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326); match(T__2);
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(339);
			switch (_input.LA(1)) {
			case Number:
			case ID:
			case LeftParen:
				{
				setState(331); closedExpr();
				}
				break;
			case T__5:
				{
				setState(332); match(T__5);
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(333); match(T__2);
					}
					}
					setState(336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(338); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(341); match(T__2);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347); match(RightBrace);
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

	public static class LineAssignContext extends ParserRuleContext {
		public FunctionNoArgsContext functionNoArgs() {
			return getRuleContext(FunctionNoArgsContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public LineAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterLineAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitLineAssign(this);
		}
	}

	public final LineAssignContext lineAssign() throws RecognitionException {
		LineAssignContext _localctx = new LineAssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lineAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); declarator();
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(350); match(T__2);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356); match(T__5);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(357); match(T__2);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(363); expr();
				}
				break;

			case 2:
				{
				setState(364); functionArgs();
				}
				break;

			case 3:
				{
				setState(365); match(LeftParen);
				setState(366); functionNoArgs();
				setState(367); match(RightParen);
				}
				break;
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

	public static class LinemixContext extends ParserRuleContext {
		public ClosedItemContext closedItem(int i) {
			return getRuleContext(ClosedItemContext.class,i);
		}
		public List<ClosedItemContext> closedItem() {
			return getRuleContexts(ClosedItemContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public LinemixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linemix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterLinemix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitLinemix(this);
		}
	}

	public final LinemixContext linemix() throws RecognitionException {
		LinemixContext _localctx = new LinemixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_linemix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(371); closedItem();
				}
				break;
			case ID:
				{
				setState(372); declarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(375); match(T__2);
						}
						}
						setState(378); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					setState(382);
					switch (_input.LA(1)) {
					case LeftBrace:
						{
						setState(380); closedItem();
						}
						break;
					case ID:
						{
						setState(381); declarator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class ClosedExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Number() { return getToken(rppParser.Number, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ClosedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterClosedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitClosedExpr(this);
		}
	}

	public final ClosedExprContext closedExpr() throws RecognitionException {
		ClosedExprContext _localctx = new ClosedExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_closedExpr);
		try {
			setState(395);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(389); match(Number);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); name();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(391); match(LeftParen);
				setState(392); functionCall();
				setState(393); match(RightParen);
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

	public static class ExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Number() { return getToken(rppParser.Number, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		try {
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397); match(Number);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399); functionCall();
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); ifStatement();
				}
				break;
			case T__12:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); whileStatement();
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
		enterRule(_localctx, 48, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(T__7);
			setState(407); statementHelper();
			setState(408); body();
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					switch (_input.LA(1)) {
					case NewLine:
						{
						setState(409); lineTabs();
						}
						break;
					case T__4:
						{
						setState(410); match(T__4);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(413); match(T__6);
					setState(414); statementHelper();
					setState(415); body();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(424);
				switch (_input.LA(1)) {
				case NewLine:
					{
					setState(422); lineTabs();
					}
					break;
				case T__4:
					{
					setState(423); match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(426); match(T__1);
				setState(429);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(427); match(T__2);
					}
					break;
				case NewLine:
					{
					setState(428); lineTabs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(431); body();
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
		enterRule(_localctx, 50, RULE_whileStatement);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(434); match(T__8);
				setState(435); statementHelper();
				setState(436); body();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(438); match(T__12);
				setState(441);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(439); match(T__2);
					}
					break;
				case NewLine:
					{
					setState(440); lineTabs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443); body();
				setState(446);
				switch (_input.LA(1)) {
				case NewLine:
					{
					setState(444); lineTabs();
					}
					break;
				case T__4:
					{
					setState(445); match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(448); match(T__8);
				setState(449); match(T__2);
				setState(450); logicExpression();
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
		enterRule(_localctx, 52, RULE_statementHelper);
		int _la;
		try {
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); match(T__2);
				setState(455); logicExpression();
				setState(456); lineTabs();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(458); match(T__2);
					}
				}

				setState(461); match(LeftParen);
				setState(462); match(Spaces);
				setState(463); logicExpression();
				setState(464); match(Spaces);
				setState(465); match(RightParen);
				setState(466); match(T__2);
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
		enterRule(_localctx, 54, RULE_logicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(Logic);
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
		enterRule(_localctx, 56, RULE_lineTabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472); match(NewLine);
				}
				}
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(477); tabs();
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
		enterRule(_localctx, 58, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(479); match(T__3);
				}
				}
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); match(ID);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pointers) {
				{
				{
				setState(485); match(Pointers);
				}
				}
				setState(490);
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
		enterRule(_localctx, 62, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u01f0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\5\2K\n\2\3\2\7\2N\n\2\f\2\16\2"+
		"Q\13\2\3\2\3\2\3\3\3\3\6\3W\n\3\r\3\16\3X\3\3\7\3\\\n\3\f\3\16\3_\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\5\3\5\5\5o\n\5"+
		"\3\6\3\6\3\6\5\6t\n\6\3\6\5\6w\n\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\5\7\u0082\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\5\7\u008c\n\7\3"+
		"\7\5\7\u008f\n\7\3\7\3\7\3\7\5\7\u0094\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u009d\n\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\t\3"+
		"\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b6"+
		"\n\n\f\n\16\n\u00b9\13\n\3\13\3\13\3\13\3\13\5\13\u00bf\n\13\3\f\3\f\3"+
		"\f\6\f\u00c4\n\f\r\f\16\f\u00c5\3\f\5\f\u00c9\n\f\3\f\3\f\6\f\u00cd\n"+
		"\f\r\f\16\f\u00ce\3\f\5\f\u00d2\n\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13"+
		"\f\3\f\5\f\u00db\n\f\3\r\3\r\6\r\u00df\n\r\r\r\16\r\u00e0\3\r\5\r\u00e4"+
		"\n\r\3\r\6\r\u00e7\n\r\r\r\16\r\u00e8\3\16\3\16\3\16\7\16\u00ee\n\16\f"+
		"\16\16\16\u00f1\13\16\3\17\3\17\3\17\6\17\u00f6\n\17\r\17\16\17\u00f7"+
		"\3\20\3\20\3\21\3\21\6\21\u00fe\n\21\r\21\16\21\u00ff\3\21\7\21\u0103"+
		"\n\21\f\21\16\21\u0106\13\21\3\22\3\22\3\22\6\22\u010b\n\22\r\22\16\22"+
		"\u010c\3\22\5\22\u0110\n\22\3\22\3\22\3\22\6\22\u0115\n\22\r\22\16\22"+
		"\u0116\3\22\5\22\u011a\n\22\5\22\u011c\n\22\3\22\7\22\u011f\n\22\f\22"+
		"\16\22\u0122\13\22\3\22\3\22\6\22\u0126\n\22\r\22\16\22\u0127\3\22\5\22"+
		"\u012b\n\22\5\22\u012d\n\22\3\22\3\22\3\22\5\22\u0132\n\22\7\22\u0134"+
		"\n\22\f\22\16\22\u0137\13\22\3\23\3\23\3\23\7\23\u013c\n\23\f\23\16\23"+
		"\u013f\13\23\3\24\3\24\7\24\u0143\n\24\f\24\16\24\u0146\13\24\3\24\3\24"+
		"\6\24\u014a\n\24\r\24\16\24\u014b\3\24\3\24\3\24\6\24\u0151\n\24\r\24"+
		"\16\24\u0152\3\24\5\24\u0156\n\24\3\24\7\24\u0159\n\24\f\24\16\24\u015c"+
		"\13\24\3\24\3\24\3\25\3\25\7\25\u0162\n\25\f\25\16\25\u0165\13\25\3\25"+
		"\3\25\7\25\u0169\n\25\f\25\16\25\u016c\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0174\n\25\3\26\3\26\5\26\u0178\n\26\3\26\6\26\u017b\n\26\r"+
		"\26\16\26\u017c\3\26\3\26\5\26\u0181\n\26\7\26\u0183\n\26\f\26\16\26\u0186"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u018e\n\27\3\30\3\30\3\30\5"+
		"\30\u0193\n\30\3\31\3\31\5\31\u0197\n\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u019e\n\32\3\32\3\32\3\32\3\32\7\32\u01a4\n\32\f\32\16\32\u01a7\13\32"+
		"\3\32\3\32\5\32\u01ab\n\32\3\32\3\32\3\32\5\32\u01b0\n\32\3\32\5\32\u01b3"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01bc\n\33\3\33\3\33\3\33"+
		"\5\33\u01c1\n\33\3\33\3\33\3\33\3\33\5\33\u01c7\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u01ce\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01d7"+
		"\n\34\3\35\3\35\3\36\6\36\u01dc\n\36\r\36\16\36\u01dd\3\36\3\36\3\37\6"+
		"\37\u01e3\n\37\r\37\16\37\u01e4\3 \3 \7 \u01e9\n \f \16 \u01ec\13 \3!"+
		"\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@\2\2\u0221\2E\3\2\2\2\4T\3\2\2\2\6`\3\2\2\2\bn\3\2\2\2\np\3\2"+
		"\2\2\f\u0081\3\2\2\2\16\u0097\3\2\2\2\20\u00a7\3\2\2\2\22\u00af\3\2\2"+
		"\2\24\u00be\3\2\2\2\26\u00da\3\2\2\2\30\u00dc\3\2\2\2\32\u00ea\3\2\2\2"+
		"\34\u00f2\3\2\2\2\36\u00f9\3\2\2\2 \u00fb\3\2\2\2\"\u0107\3\2\2\2$\u0138"+
		"\3\2\2\2&\u0140\3\2\2\2(\u015f\3\2\2\2*\u0177\3\2\2\2,\u018d\3\2\2\2."+
		"\u0192\3\2\2\2\60\u0196\3\2\2\2\62\u0198\3\2\2\2\64\u01c6\3\2\2\2\66\u01d6"+
		"\3\2\2\28\u01d8\3\2\2\2:\u01db\3\2\2\2<\u01e2\3\2\2\2>\u01e6\3\2\2\2@"+
		"\u01ed\3\2\2\2BD\7\27\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3"+
		"\2\2\2GE\3\2\2\2HK\5\4\3\2IK\5\6\4\2JH\3\2\2\2JI\3\2\2\2JK\3\2\2\2KO\3"+
		"\2\2\2LN\7\27\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO"+
		"\3\2\2\2RS\7\2\2\3S\3\3\2\2\2T]\5\b\5\2UW\7\27\2\2VU\3\2\2\2WX\3\2\2\2"+
		"XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\5\b\5\2[V\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^\5\3\2\2\2_]\3\2\2\2`a\7\4\2\2ab\5@!\2bc\5:\36\2ci\5\b\5"+
		"\2de\5:\36\2ef\5\b\5\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j\7\3\2\2\2ki\3\2\2\2lo\5\f\7\2mo\5\26\f\2nl\3\2\2\2nm\3\2\2\2o\t\3"+
		"\2\2\2pq\5@!\2qs\7\30\2\2rt\7\22\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5"+
		"\16\b\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\7\22\2\2yx\3\2\2\2yz\3\2\2\2z"+
		"{\3\2\2\2{|\7\31\2\2|}\5\22\n\2}\13\3\2\2\2~\177\5\20\t\2\177\u0080\7"+
		"\r\2\2\u0080\u0082\3\2\2\2\u0081~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\5> \2\u0084\u0085\7\r\2\2\u0085\u0086\5@!\2\u0086"+
		"\u0088\7\30\2\2\u0087\u0089\7\22\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c\5\16\b\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\7\22\2\2\u008e\u008d\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\7\31\2\2\u0091"+
		"\u0094\5:\36\2\u0092\u0094\7\r\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\22\n\2\u0096\r\3\2\2\2\u0097\u0098"+
		"\5> \2\u0098\u0099\7\r\2\2\u0099\u00a4\5@!\2\u009a\u009c\7\5\2\2\u009b"+
		"\u009d\7\r\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\5> \2\u009f\u00a0\7\r\2\2\u00a0\u00a1\5@!\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u009a\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ac\7\24\2"+
		"\2\u00a8\u00a9\7\r\2\2\u00a9\u00ab\7\24\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\21\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00af\u00b7\5\24\13\2\u00b0\u00b1\5:\36\2\u00b1"+
		"\u00b2\5\24\13\2\u00b2\u00b6\3\2\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b6"+
		"\5\24\13\2\u00b5\u00b0\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\23\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bf\7\6\2\2\u00bb\u00bf\5\60\31\2\u00bc\u00bf\5 \21\2"+
		"\u00bd\u00bf\5\32\16\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\5> \2\u00c1"+
		"\u00c8\7\34\2\2\u00c2\u00c4\7\r\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c9\5:\36\2\u00c8\u00c3\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d6\5$\23\2\u00cb\u00cd\7\r\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\5:\36\2\u00d1\u00cc\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\5$\23\2\u00d4\u00d1\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00db\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5\30\r\2\u00da\u00c0\3"+
		"\2\2\2\u00da\u00d9\3\2\2\2\u00db\27\3\2\2\2\u00dc\u00e6\7\17\2\2\u00dd"+
		"\u00df\7\r\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\5:\36\2\u00e3"+
		"\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5\""+
		"\22\2\u00e6\u00e3\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\31\3\2\2\2\u00ea\u00ef\5@!\2\u00eb\u00ec\7\r\2\2"+
		"\u00ec\u00ee\5,\27\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f5\5@!\2\u00f3\u00f4\7\r\2\2\u00f4\u00f6\5,\27\2\u00f5\u00f3\3\2\2"+
		"\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\35"+
		"\3\2\2\2\u00f9\u00fa\5@!\2\u00fa\37\3\2\2\2\u00fb\u0104\5\"\22\2\u00fc"+
		"\u00fe\7\r\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\5\"\22\2\u0102"+
		"\u00fd\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105!\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u012c\5> \2\u0108\u010f"+
		"\7\34\2\2\u0109\u010b\7\r\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u0110"+
		"\5:\36\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u011b\3\2\2\2\u0111\u011c\5(\25\2\u0112\u0119\5$\23\2\u0113\u0115\7\r"+
		"\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\5*\26\2\u0119\u0114\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0111\3\2\2\2\u011b"+
		"\u0112\3\2\2\2\u011c\u012d\3\2\2\2\u011d\u011f\7\r\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u012a\5&\24\2\u0124\u0126\7\r"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\5*\26\2\u012a\u0125\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0108\3\2\2\2\u012c"+
		"\u0120\3\2\2\2\u012d\u0135\3\2\2\2\u012e\u0131\5:\36\2\u012f\u0132\5*"+
		"\26\2\u0130\u0132\5(\25\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u012e\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136#\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013d"+
		"\5@!\2\u0139\u013a\7\r\2\2\u013a\u013c\5@!\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e%\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0144\7\32\2\2\u0141\u0143\7\r\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\5$\23\2\u0148\u014a\7\r"+
		"\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u0155\3\2\2\2\u014d\u0156\5,\27\2\u014e\u0150\7\n"+
		"\2\2\u014f\u0151\7\r\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\5."+
		"\30\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0156\u015a\3\2\2\2\u0157"+
		"\u0159\7\r\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015e\7\33\2\2\u015e\'\3\2\2\2\u015f\u0163\5$\23\2\u0160\u0162\7\r\2"+
		"\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\7\n\2\2\u0167"+
		"\u0169\7\r\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u0173\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0174\5.\30\2\u016e\u0174\5\34\17\2\u016f\u0170\7\30\2\2\u0170\u0171"+
		"\5\36\20\2\u0171\u0172\7\31\2\2\u0172\u0174\3\2\2\2\u0173\u016d\3\2\2"+
		"\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0174)\3\2\2\2\u0175\u0178"+
		"\5&\24\2\u0176\u0178\5$\23\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0184\3\2\2\2\u0179\u017b\7\r\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u0181\5&\24\2\u017f\u0181\5$\23\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u017a\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185+\3\2\2\2\u0186\u0184\3\2\2\2"+
		"\u0187\u018e\7\21\2\2\u0188\u018e\5@!\2\u0189\u018a\7\30\2\2\u018a\u018b"+
		"\5\32\16\2\u018b\u018c\7\31\2\2\u018c\u018e\3\2\2\2\u018d\u0187\3\2\2"+
		"\2\u018d\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018e-\3\2\2\2\u018f\u0193"+
		"\7\21\2\2\u0190\u0193\5@!\2\u0191\u0193\5\32\16\2\u0192\u018f\3\2\2\2"+
		"\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193/\3\2\2\2\u0194\u0197\5"+
		"\62\32\2\u0195\u0197\5\64\33\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2"+
		"\u0197\61\3\2\2\2\u0198\u0199\7\b\2\2\u0199\u019a\5\66\34\2\u019a\u01a5"+
		"\5\22\n\2\u019b\u019e\5:\36\2\u019c\u019e\7\13\2\2\u019d\u019b\3\2\2\2"+
		"\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\t\2\2\u01a0\u01a1"+
		"\5\66\34\2\u01a1\u01a2\5\22\n\2\u01a2\u01a4\3\2\2\2\u01a3\u019d\3\2\2"+
		"\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b2"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\5:\36\2\u01a9\u01ab\7\13\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af"+
		"\7\16\2\2\u01ad\u01b0\7\r\2\2\u01ae\u01b0\5:\36\2\u01af\u01ad\3\2\2\2"+
		"\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\5\22\n\2\u01b2\u01aa"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\63\3\2\2\2\u01b4\u01b5\7\7\2\2\u01b5"+
		"\u01b6\5\66\34\2\u01b6\u01b7\5\22\n\2\u01b7\u01c7\3\2\2\2\u01b8\u01bb"+
		"\7\3\2\2\u01b9\u01bc\7\r\2\2\u01ba\u01bc\5:\36\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\5\22\n\2\u01be\u01c1\5"+
		":\36\2\u01bf\u01c1\7\13\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\7\7\2\2\u01c3\u01c4\7\r\2\2\u01c4\u01c5\58"+
		"\35\2\u01c5\u01c7\3\2\2\2\u01c6\u01b4\3\2\2\2\u01c6\u01b8\3\2\2\2\u01c7"+
		"\65\3\2\2\2\u01c8\u01c9\7\r\2\2\u01c9\u01ca\58\35\2\u01ca\u01cb\5:\36"+
		"\2\u01cb\u01d7\3\2\2\2\u01cc\u01ce\7\r\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7\30\2\2\u01d0\u01d1\7\22\2\2"+
		"\u01d1\u01d2\58\35\2\u01d2\u01d3\7\22\2\2\u01d3\u01d4\7\31\2\2\u01d4\u01d5"+
		"\7\r\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01c8\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d7"+
		"\67\3\2\2\2\u01d8\u01d9\7\20\2\2\u01d99\3\2\2\2\u01da\u01dc\7\27\2\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\5<\37\2\u01e0;\3\2\2\2\u01e1\u01e3"+
		"\7\f\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5=\3\2\2\2\u01e6\u01ea\7\24\2\2\u01e7\u01e9\7\23\2"+
		"\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb?\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\24\2\2\u01ee"+
		"A\3\2\2\2LEJOX]insvy\u0081\u0088\u008b\u008e\u0093\u009c\u00a4\u00ac\u00b5"+
		"\u00b7\u00be\u00c5\u00c8\u00ce\u00d1\u00d6\u00da\u00e0\u00e3\u00e8\u00ef"+
		"\u00f7\u00ff\u0104\u010c\u010f\u0116\u0119\u011b\u0120\u0127\u012a\u012c"+
		"\u0131\u0135\u013d\u0144\u014b\u0152\u0155\u015a\u0163\u016a\u0173\u0177"+
		"\u017c\u0180\u0184\u018d\u0192\u0196\u019d\u01a5\u01aa\u01af\u01b2\u01bb"+
		"\u01c0\u01c6\u01cd\u01d6\u01dd\u01e4\u01ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}