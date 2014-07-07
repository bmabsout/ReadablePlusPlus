// Generated from /media/ssd/Dropbox/ReadablePlusPlus/rppGrammar/line.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, Number=4, Spaces=5, Pointers=6, ID=7, Digit=8, 
		NonDigit=9, NewLine=10, LeftParen=11, RightParen=12, LeftBrace=13, RightBrace=14, 
		Thing=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'\t'", "' '", "'='", "Number", "Spaces", "Pointers", "ID", 
		"Digit", "NonDigit", "NewLine", "'('", "')'", "'{'", "'}'", "'|'"
	};
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_functionCall = 2, RULE_functionArgs = 3, 
		RULE_functionNoArgs = 4, RULE_assigns = 5, RULE_assign = 6, RULE_declarator = 7, 
		RULE_closedItem = 8, RULE_lineAssign = 9, RULE_linemix = 10, RULE_closedExpr = 11, 
		RULE_expr = 12, RULE_lineTabs = 13, RULE_tabs = 14, RULE_type = 15, RULE_name = 16;
	public static final String[] ruleNames = {
		"program", "line", "functionCall", "functionArgs", "functionNoArgs", "assigns", 
		"assign", "declarator", "closedItem", "lineAssign", "linemix", "closedExpr", 
		"expr", "lineTabs", "tabs", "type", "name"
	};

	@Override
	public String getGrammarFileName() { return "line.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(lineParser.EOF, 0); }
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode NewLine(int i) {
			return getToken(lineParser.NewLine, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public List<TerminalNode> NewLine() { return getTokens(lineParser.NewLine); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitProgram(this);
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
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34); match(NewLine);
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(52);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40); line();
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(42); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(41); match(NewLine);
							}
							}
							setState(44); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NewLine );
						setState(46); line();
						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(54); match(NewLine);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); match(EOF);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); assigns();
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66); name();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67); match(T__1);
					setState(68); closedExpr();
					}
					} 
				}
				setState(73);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitFunctionArgs(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); name();
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(75); match(T__1);
					setState(76); closedExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterFunctionNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitFunctionNoArgs(this);
		}
	}

	public final FunctionNoArgsContext functionNoArgs() throws RecognitionException {
		FunctionNoArgsContext _localctx = new FunctionNoArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionNoArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); name();
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterAssigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitAssigns(this);
		}
	}

	public final AssignsContext assigns() throws RecognitionException {
		AssignsContext _localctx = new AssignsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); assign();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84); match(T__1);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(89); assign();
				}
				}
				setState(94);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); type();
			setState(132);
			switch (_input.LA(1)) {
			case Thing:
				{
				setState(96); match(Thing);
				setState(103);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(97); match(T__1);
						}
						}
						setState(100); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__1 );
					}
					break;
				case NewLine:
					{
					setState(102); lineTabs();
					}
					break;
				case ID:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(105); lineAssign();
					}
					break;

				case 2:
					{
					setState(106); declarator();
					setState(113);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(108); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(107); match(T__1);
							}
							}
							setState(110); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__1 );
						setState(112); linemix();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case T__1:
			case LeftBrace:
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(117); match(T__1);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123); closedItem();
				setState(130);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(124); match(T__1);
						}
						}
						setState(127); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__1 );
					setState(129); linemix();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134); lineTabs();
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(135); linemix();
						}
						break;

					case 2:
						{
						setState(136); lineAssign();
						}
						break;
					}
					}
					} 
				}
				setState(143);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144); name();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145); match(T__1);
					setState(146); name();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterClosedItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitClosedItem(this);
		}
	}

	public final ClosedItemContext closedItem() throws RecognitionException {
		ClosedItemContext _localctx = new ClosedItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_closedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(LeftBrace);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(153); match(T__1);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); declarator();
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160); match(T__1);
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(173);
			switch (_input.LA(1)) {
			case Number:
			case ID:
			case LeftParen:
				{
				setState(165); closedExpr();
				}
				break;
			case T__0:
				{
				setState(166); match(T__0);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167); match(T__1);
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(172); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(175); match(T__1);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181); match(RightBrace);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterLineAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitLineAssign(this);
		}
	}

	public final LineAssignContext lineAssign() throws RecognitionException {
		LineAssignContext _localctx = new LineAssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lineAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); declarator();
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(184); match(T__1);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190); match(T__0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(191); match(T__1);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(197); expr();
				}
				break;

			case 2:
				{
				setState(198); functionArgs();
				}
				break;

			case 3:
				{
				setState(199); match(LeftParen);
				setState(200); functionNoArgs();
				setState(201); match(RightParen);
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterLinemix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitLinemix(this);
		}
	}

	public final LinemixContext linemix() throws RecognitionException {
		LinemixContext _localctx = new LinemixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_linemix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(205); closedItem();
				}
				break;
			case ID:
				{
				setState(206); declarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(209); match(T__1);
						}
						}
						setState(212); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__1 );
					setState(216);
					switch (_input.LA(1)) {
					case LeftBrace:
						{
						setState(214); closedItem();
						}
						break;
					case ID:
						{
						setState(215); declarator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode Number() { return getToken(lineParser.Number, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ClosedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterClosedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitClosedExpr(this);
		}
	}

	public final ClosedExprContext closedExpr() throws RecognitionException {
		ClosedExprContext _localctx = new ClosedExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closedExpr);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); match(Number);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); name();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); match(LeftParen);
				setState(226); functionCall();
				setState(227); match(RightParen);
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
		public TerminalNode Number() { return getToken(lineParser.Number, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(Number);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); functionCall();
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

	public static class LineTabsContext extends ParserRuleContext {
		public TabsContext tabs() {
			return getRuleContext(TabsContext.class,0);
		}
		public TerminalNode NewLine(int i) {
			return getToken(lineParser.NewLine, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(lineParser.NewLine); }
		public LineTabsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineTabs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterLineTabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitLineTabs(this);
		}
	}

	public final LineTabsContext lineTabs() throws RecognitionException {
		LineTabsContext _localctx = new LineTabsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lineTabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236); match(NewLine);
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(241); tabs();
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
			if ( listener instanceof lineListener ) ((lineListener)listener).enterTabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitTabs(this);
		}
	}

	public final TabsContext tabs() throws RecognitionException {
		TabsContext _localctx = new TabsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243); match(T__2);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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
		public List<TerminalNode> Pointers() { return getTokens(lineParser.Pointers); }
		public TerminalNode ID() { return getToken(lineParser.ID, 0); }
		public TerminalNode Pointers(int i) {
			return getToken(lineParser.Pointers, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pointers) {
				{
				{
				setState(249); match(Pointers);
				}
				}
				setState(254);
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
		public TerminalNode ID() { return getToken(lineParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\5\2\67\n\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\6\5P\n\5\r"+
		"\5\16\5Q\3\6\3\6\3\7\3\7\6\7X\n\7\r\7\16\7Y\3\7\7\7]\n\7\f\7\16\7`\13"+
		"\7\3\b\3\b\3\b\6\be\n\b\r\b\16\bf\3\b\5\bj\n\b\3\b\3\b\3\b\6\bo\n\b\r"+
		"\b\16\bp\3\b\5\bt\n\b\5\bv\n\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\6\b"+
		"\u0080\n\b\r\b\16\b\u0081\3\b\5\b\u0085\n\b\5\b\u0087\n\b\3\b\3\b\3\b"+
		"\5\b\u008c\n\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b\3\t\3\t\3\t\7\t\u0096"+
		"\n\t\f\t\16\t\u0099\13\t\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3\n"+
		"\3\n\6\n\u00a4\n\n\r\n\16\n\u00a5\3\n\3\n\3\n\6\n\u00ab\n\n\r\n\16\n\u00ac"+
		"\3\n\5\n\u00b0\n\n\3\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\3\n\3\n\3\13"+
		"\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf\13\13\3\13\3\13\7\13\u00c3\n\13"+
		"\f\13\16\13\u00c6\13\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13"+
		"\3\f\3\f\5\f\u00d2\n\f\3\f\6\f\u00d5\n\f\r\f\16\f\u00d6\3\f\3\f\5\f\u00db"+
		"\n\f\7\f\u00dd\n\f\f\f\16\f\u00e0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e8"+
		"\n\r\3\16\3\16\3\16\5\16\u00ed\n\16\3\17\6\17\u00f0\n\17\r\17\16\17\u00f1"+
		"\3\17\3\17\3\20\6\20\u00f7\n\20\r\20\16\20\u00f8\3\21\3\21\7\21\u00fd"+
		"\n\21\f\21\16\21\u0100\13\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\2\u011d\2\'\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bL\3"+
		"\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16a\3\2\2\2\20\u0092\3\2\2\2\22\u009a\3\2"+
		"\2\2\24\u00b9\3\2\2\2\26\u00d1\3\2\2\2\30\u00e7\3\2\2\2\32\u00ec\3\2\2"+
		"\2\34\u00ef\3\2\2\2\36\u00f6\3\2\2\2 \u00fa\3\2\2\2\"\u0101\3\2\2\2$&"+
		"\7\f\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\66\3\2\2\2)\'\3\2"+
		"\2\2*\63\5\4\3\2+-\7\f\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\62\5\4\3\2\61,\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\66*\3\2\2\2\66\67\3\2\2\2\67;\3\2\2"+
		"\28:\7\f\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2"+
		"\2>?\7\2\2\3?\3\3\2\2\2@C\5\6\4\2AC\5\f\7\2B@\3\2\2\2BA\3\2\2\2C\5\3\2"+
		"\2\2DI\5\"\22\2EF\7\4\2\2FH\5\30\r\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2J\7\3\2\2\2KI\3\2\2\2LO\5\"\22\2MN\7\4\2\2NP\5\30\r\2OM\3\2\2\2"+
		"PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2ST\5\"\22\2T\13\3\2\2\2U^\5\16"+
		"\b\2VX\7\4\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\5\16"+
		"\b\2\\W\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^\3\2\2\2a\u0086"+
		"\5 \21\2bi\7\21\2\2ce\7\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gj\3\2\2\2hj\5\34\17\2id\3\2\2\2ih\3\2\2\2ij\3\2\2\2ju\3\2\2\2kv\5\24"+
		"\13\2ls\5\20\t\2mo\7\4\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3"+
		"\2\2\2rt\5\26\f\2sn\3\2\2\2st\3\2\2\2tv\3\2\2\2uk\3\2\2\2ul\3\2\2\2v\u0087"+
		"\3\2\2\2wy\7\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|"+
		"z\3\2\2\2}\u0084\5\22\n\2~\u0080\7\4\2\2\177~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\5\26\f\2\u0084\177\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"b\3\2\2\2\u0086z\3\2\2\2\u0087\u008f\3\2\2\2\u0088\u008b\5\34\17\2\u0089"+
		"\u008c\5\26\f\2\u008a\u008c\5\24\13\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\17\3\2\2\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0097\5\"\22\2\u0093\u0094\7\4\2\2\u0094\u0096\5\"\22\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\21\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009e\7\17\2\2\u009b\u009d"+
		"\7\4\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\20"+
		"\t\2\u00a2\u00a4\7\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00af\3\2\2\2\u00a7\u00b0\5\30"+
		"\r\2\u00a8\u00aa\7\5\2\2\u00a9\u00ab\7\4\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\5\32\16\2\u00af\u00a7\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0"+
		"\u00b4\3\2\2\2\u00b1\u00b3\7\4\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8\23\3\2\2\2\u00b9\u00bd\5\20"+
		"\t\2\u00ba\u00bc\7\4\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c4\7\5\2\2\u00c1\u00c3\7\4\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cd\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ce\5\32\16\2\u00c8\u00ce\5\b\5\2\u00c9"+
		"\u00ca\7\r\2\2\u00ca\u00cb\5\n\6\2\u00cb\u00cc\7\16\2\2\u00cc\u00ce\3"+
		"\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce"+
		"\25\3\2\2\2\u00cf\u00d2\5\22\n\2\u00d0\u00d2\5\20\t\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00de\3\2\2\2\u00d3\u00d5\7\4\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00db\5\22\n\2\u00d9\u00db\5\20\t\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d4\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\27\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e8\7\6\2\2\u00e2\u00e8\5\"\22"+
		"\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5\6\4\2\u00e5\u00e6\7\16\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e8\31\3\2\2\2\u00e9\u00ed\7\6\2\2\u00ea\u00ed\5\"\22\2\u00eb\u00ed"+
		"\5\6\4\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\33\3\2\2\2\u00ee\u00f0\7\f\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\5\36\20\2\u00f4\35\3\2\2\2\u00f5\u00f7\7\3\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\37\3\2\2"+
		"\2\u00fa\u00fe\7\t\2\2\u00fb\u00fd\7\b\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff!\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\t\2\2\u0102#\3\2\2\2)\'.\63\66;BIQY^fips"+
		"uz\u0081\u0084\u0086\u008b\u008f\u0097\u009e\u00a5\u00ac\u00af\u00b4\u00bd"+
		"\u00c4\u00cd\u00d1\u00d6\u00da\u00de\u00e7\u00ec\u00f1\u00f8\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}