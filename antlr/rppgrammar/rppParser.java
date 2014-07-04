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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, Pointers=9, 
		Type=10, Digit=11, Nondigit=12, ID=13, Anything=14, LeftParen=15, RightParen=16, 
		Spaces=17, Tab=18, Tabs=19;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'\n'", "','", "'node'", "'\r'", "'\r\n'", "'class'", 
		"';'", "Pointers", "Type", "Digit", "Nondigit", "ID", "Anything", "'('", 
		"')'", "Spaces", "'\t'", "Tabs"
	};
	public static final int
		RULE_newLine = 0, RULE_program = 1, RULE_globals = 2, RULE_classGlobals = 3, 
		RULE_global = 4, RULE_constructor = 5, RULE_function = 6, RULE_args = 7, 
		RULE_functionStuff = 8, RULE_body = 9, RULE_line = 10;
	public static final String[] ruleNames = {
		"newLine", "program", "globals", "classGlobals", "global", "constructor", 
		"function", "args", "functionStuff", "body", "line"
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
	public static class NewLineContext extends ParserRuleContext {
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitNewLine(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_newLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ProgramContext extends ParserRuleContext {
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(rppParser.EOF, 0); }
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public ClassGlobalsContext classGlobals() {
			return getRuleContext(ClassGlobalsContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0)) {
				{
				{
				setState(24); newLine();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			switch (_input.LA(1)) {
			case Type:
			case ID:
				{
				setState(30); globals();
				}
				break;
			case T__1:
				{
				setState(31); classGlobals();
				}
				break;
			case EOF:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(34); match(EOF);
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
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); global();
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37); newLine();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0) );
			setState(42); global();
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
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public List<TerminalNode> Tabs() { return getTokens(rppParser.Tabs); }
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public TerminalNode ID() { return getToken(rppParser.ID, 0); }
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public TerminalNode Tabs(int i) {
			return getToken(rppParser.Tabs, i);
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
		enterRule(_localctx, 6, RULE_classGlobals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(T__1);
			setState(45); match(T__7);
			setState(46); match(ID);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); newLine();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0) );
			setState(52); match(Tabs);
			setState(53); global();
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); newLine();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0) );
			setState(59); match(Tabs);
			setState(60); global();
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
		enterRule(_localctx, 8, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); function();
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
		public TerminalNode ID() { return getToken(rppParser.ID, 0); }
		public List<TerminalNode> Spaces() { return getTokens(rppParser.Spaces); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(ID);
			setState(65); match(LeftParen);
			setState(66); match(Spaces);
			setState(68);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(67); args();
				}
			}

			setState(70); match(Spaces);
			setState(71); match(RightParen);
			setState(72); body();
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
		public TerminalNode ID() { return getToken(rppParser.ID, 0); }
		public List<TerminalNode> Spaces() { return getTokens(rppParser.Spaces); }
		public TerminalNode Type() { return getToken(rppParser.Type, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(74); functionStuff();
				setState(75); match(T__7);
				}
			}

			setState(79); match(Type);
			setState(80); match(T__7);
			setState(81); match(ID);
			setState(82); match(LeftParen);
			setState(83); match(Spaces);
			setState(85);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(84); args();
				}
			}

			setState(87); match(Spaces);
			setState(88); match(RightParen);
			setState(89); body();
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
		public TerminalNode Type(int i) {
			return getToken(rppParser.Type, i);
		}
		public List<TerminalNode> ID() { return getTokens(rppParser.ID); }
		public List<TerminalNode> Type() { return getTokens(rppParser.Type); }
		public TerminalNode ID(int i) {
			return getToken(rppParser.ID, i);
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
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(Type);
			setState(92); match(T__7);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93); match(ID);
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(98); match(T__5);
				setState(100);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(99); match(T__7);
					}
				}

				setState(102); match(Type);
				setState(103); match(T__7);
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104); match(ID);
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				}
				setState(113);
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
		enterRule(_localctx, 16, RULE_functionStuff);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(ID);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115); match(T__7);
					setState(116); match(ID);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public List<TerminalNode> Tabs() { return getTokens(rppParser.Tabs); }
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public TerminalNode Tabs(int i) {
			return getToken(rppParser.Tabs, i);
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
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122); newLine();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0) );
			setState(127); match(Tabs);
			setState(128); line();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(139);
					switch (_input.LA(1)) {
					case T__6:
					case T__3:
					case T__2:
						{
						setState(130); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(129); newLine();
							}
							}
							setState(132); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__2))) != 0) );
						setState(134); match(Tabs);
						setState(135); line();
						}
						break;
					case T__0:
						{
						setState(137); match(T__0);
						setState(138); line();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(143);
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

	public static class LineContext extends ParserRuleContext {
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
		enterRule(_localctx, 20, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144); match(T__4);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\5\3#\n\3"+
		"\3\3\3\3\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\5\3\5\6\5\63\n\5"+
		"\r\5\16\5\64\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7G\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bP\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bX\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\ta\n\t\r\t\16\tb\3\t"+
		"\3\t\5\tg\n\t\3\t\3\t\3\t\6\tl\n\t\r\t\16\tm\7\tp\n\t\f\t\16\ts\13\t\3"+
		"\n\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\13\6\13~\n\13\r\13\16\13\177\3\13"+
		"\3\13\3\13\6\13\u0085\n\13\r\13\16\13\u0086\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u008e\n\13\f\13\16\13\u0091\13\13\3\f\6\f\u0094\n\f\r\f\16\f\u0095"+
		"\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\4\4\7\b\u009f\2\30\3\2\2"+
		"\2\4\35\3\2\2\2\6&\3\2\2\2\b.\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16O\3\2\2"+
		"\2\20]\3\2\2\2\22t\3\2\2\2\24}\3\2\2\2\26\u0093\3\2\2\2\30\31\t\2\2\2"+
		"\31\3\3\2\2\2\32\34\5\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\"\3\2\2\2\37\35\3\2\2\2 #\5\6\4\2!#\5\b\5\2\" \3\2\2"+
		"\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\5\3\2\2\2&(\5\n\6\2\')\5"+
		"\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\n\6\2-\7"+
		"\3\2\2\2./\7\t\2\2/\60\7\3\2\2\60\62\7\17\2\2\61\63\5\2\2\2\62\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\25"+
		"\2\2\679\5\n\6\28:\5\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\7\25\2\2>?\5\n\6\2?\t\3\2\2\2@A\5\16\b\2A\13\3\2\2\2BC\7\17\2"+
		"\2CD\7\21\2\2DF\7\23\2\2EG\5\20\t\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7"+
		"\23\2\2IJ\7\22\2\2JK\5\24\13\2K\r\3\2\2\2LM\5\22\n\2MN\7\3\2\2NP\3\2\2"+
		"\2OL\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\f\2\2RS\7\3\2\2ST\7\17\2\2TU\7\21"+
		"\2\2UW\7\23\2\2VX\5\20\t\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\23\2\2Z["+
		"\7\22\2\2[\\\5\24\13\2\\\17\3\2\2\2]^\7\f\2\2^`\7\3\2\2_a\7\17\2\2`_\3"+
		"\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cq\3\2\2\2df\7\5\2\2eg\7\3\2\2fe\3"+
		"\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\f\2\2ik\7\3\2\2jl\7\17\2\2kj\3\2\2\2lm"+
		"\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2od\3\2\2\2ps\3\2\2\2qo\3\2\2\2q"+
		"r\3\2\2\2r\21\3\2\2\2sq\3\2\2\2ty\7\17\2\2uv\7\3\2\2vx\7\17\2\2wu\3\2"+
		"\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\23\3\2\2\2{y\3\2\2\2|~\5\2\2\2}|\3"+
		"\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0082\7\25\2\2\u0082\u008f\5\26\f\2\u0083\u0085\5\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\25\2\2\u0089\u008a\5\26\f\2\u008a\u008e\3"+
		"\2\2\2\u008b\u008c\7\n\2\2\u008c\u008e\5\26\f\2\u008d\u0084\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\6\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\27\3\2\2\2\24\35\"*\64;FOWbfmqy\177\u0086\u008d\u008f\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}