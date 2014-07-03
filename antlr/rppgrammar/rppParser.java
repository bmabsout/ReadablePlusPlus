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
		T__1=1, T__0=2, Class=3, ID=4, Name=5, Type=6, Spaces=7, Tab=8, Tabs=9, 
		LeftParen=10, RightParen=11, LeftBracket=12, Parens=13, RightBracket=14, 
		LeftBrace=15, RightBrace=16, NewLine=17, NewLines=18, Assign=19, Assigns=20, 
		Pointers=21, PostFix=22, PreFix=23, Unary=24, Logic=25, Equal=26, NotEqual=27, 
		Arrow=28, Dot=29, BitWise=30, Binary=31, Operators=32, StorageClass=33, 
		TypeQualifier=34, Inline=35, Digit=36;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "';'", "Class", "ID", "Name", "Type", "Spaces", "'\t'", 
		"Tabs", "'('", "')'", "'['", "Parens", "']'", "'{'", "'}'", "NewLine", 
		"NewLines", "'='", "Assigns", "Pointers", "PostFix", "PreFix", "Unary", 
		"Logic", "'=='", "'!='", "'->'", "'.'", "BitWise", "Binary", "Operators", 
		"StorageClass", "TypeQualifier", "'inline'", "Digit"
	};
	public static final int
		RULE_program = 0, RULE_functions = 1, RULE_function = 2, RULE_statement = 3, 
		RULE_line = 4, RULE_args = 5, RULE_body = 6;
	public static final String[] ruleNames = {
		"program", "functions", "function", "statement", "line", "args", "body"
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
		public TerminalNode EOF() { return getToken(rppParser.EOF, 0); }
		public TerminalNode Class() { return getToken(rppParser.Class, 0); }
		public TerminalNode NewLines() { return getToken(rppParser.NewLines, 0); }
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
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
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); match(Class);
				setState(15); match(NewLines);
				setState(16); functions();
				setState(17); match(EOF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); match(Class);
				setState(20); match(EOF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				_la = _input.LA(1);
				if (_la==NewLines) {
					{
					setState(21); match(NewLines);
					}
				}

				setState(24); functions();
				setState(25); match(EOF);
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> NewLines() { return getTokens(rppParser.NewLines); }
		public TerminalNode NewLines(int i) {
			return getToken(rppParser.NewLines, i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rppListener ) ((rppListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if (_la==Tabs) {
				{
				setState(29); function();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLines) {
					{
					{
					setState(30); match(NewLines);
					setState(31); function();
					}
					}
					setState(36);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> Tabs() { return getTokens(rppParser.Tabs); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Name() { return getToken(rppParser.Name, 0); }
		public TerminalNode Type() { return getToken(rppParser.Type, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Tabs(int i) {
			return getToken(rppParser.Tabs, i);
		}
		public TerminalNode NewLine() { return getToken(rppParser.NewLine, 0); }
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
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(Tabs);
			setState(40); match(Type);
			setState(41); match(Name);
			setState(42); match(LeftParen);
			setState(43); args();
			setState(44); match(RightParen);
			setState(52);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(45); match(LeftBrace);
				setState(46); body();
				setState(47); match(RightBrace);
				}
				break;
			case NewLine:
				{
				setState(49); match(NewLine);
				setState(50); match(Tabs);
				setState(51); body();
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

	public static class StatementContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); line();
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
		public TerminalNode StorageClass() { return getToken(rppParser.StorageClass, 0); }
		public TerminalNode Digit() { return getToken(rppParser.Digit, 0); }
		public TerminalNode Spaces() { return getToken(rppParser.Spaces, 0); }
		public TerminalNode Name() { return getToken(rppParser.Name, 0); }
		public TerminalNode TypeQualifier() { return getToken(rppParser.TypeQualifier, 0); }
		public TerminalNode Parens() { return getToken(rppParser.Parens, 0); }
		public TerminalNode Operators() { return getToken(rppParser.Operators, 0); }
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
		enterRule(_localctx, 8, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Name) | (1L << Spaces) | (1L << Parens) | (1L << Operators) | (1L << StorageClass) | (1L << TypeQualifier) | (1L << Digit))) != 0)) ) {
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode Type(int i) {
			return getToken(rppParser.Type, i);
		}
		public TerminalNode Name(int i) {
			return getToken(rppParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(rppParser.Name); }
		public List<TerminalNode> Type() { return getTokens(rppParser.Type); }
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
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(Type);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59); match(Name);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			{
			setState(64); match(T__1);
			setState(65); match(Type);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); match(Name);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
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
		public List<TerminalNode> Tabs() { return getTokens(rppParser.Tabs); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NewLine(int i) {
			return getToken(rppParser.NewLine, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Tabs(int i) {
			return getToken(rppParser.Tabs, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(rppParser.NewLine); }
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
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); statement();
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(72); match(T__0);
					}
					break;
				case NewLine:
					{
					setState(73); match(NewLine);
					setState(74); match(Tabs);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); statement();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==NewLine );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&U\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\31\n\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13"+
		"\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\6\7?\n\7\r\7\16\7@\3\7\3\7\3\7\6\7F\n\7\r"+
		"\7\16\7G\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\6\bQ\n\b\r\b\16\bR\3\b\2\2\t\2\4"+
		"\6\b\n\f\16\2\3\7\2\7\7\t\t\17\17\"$&&W\2\35\3\2\2\2\4\'\3\2\2\2\6)\3"+
		"\2\2\2\b8\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16I\3\2\2\2\20\21\7\5\2\2\21\22"+
		"\7\24\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\36\3\2\2\2\25\26\7\5\2\2\26\36"+
		"\7\2\2\3\27\31\7\24\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33"+
		"\5\4\3\2\33\34\7\2\2\3\34\36\3\2\2\2\35\20\3\2\2\2\35\25\3\2\2\2\35\30"+
		"\3\2\2\2\36\3\3\2\2\2\37$\5\6\4\2 !\7\24\2\2!#\5\6\4\2\" \3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2\2\'\37\3\2\2\2\'(\3\2\2"+
		"\2(\5\3\2\2\2)*\7\13\2\2*+\7\b\2\2+,\7\7\2\2,-\7\f\2\2-.\5\f\7\2.\66\7"+
		"\r\2\2/\60\7\21\2\2\60\61\5\16\b\2\61\62\7\22\2\2\62\67\3\2\2\2\63\64"+
		"\7\23\2\2\64\65\7\13\2\2\65\67\5\16\b\2\66/\3\2\2\2\66\63\3\2\2\2\67\7"+
		"\3\2\2\289\5\n\6\29\t\3\2\2\2:;\t\2\2\2;\13\3\2\2\2<>\7\b\2\2=?\7\7\2"+
		"\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\3\2\2CE\7\b\2"+
		"\2DF\7\7\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2IP\5\b"+
		"\5\2JN\7\4\2\2KL\7\23\2\2LN\7\13\2\2MJ\3\2\2\2MK\3\2\2\2NO\3\2\2\2OQ\5"+
		"\b\5\2PM\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\17\3\2\2\2\13\30\35$\'"+
		"\66@GMR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}