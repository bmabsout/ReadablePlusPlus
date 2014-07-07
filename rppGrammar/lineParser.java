// Generated from C:\Users\bassel\Dropbox\ReadablePlusPlus\antlr\rppgrammar\line.g4 by ANTLR 4.3
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
		T__2=1, T__1=2, T__0=3, Spaces=4, Pointers=5, ID=6, ANSA=7, Digit=8, Nondigit=9, 
		NewLine=10, LeftParen=11, RightParen=12, LeftBrace=13, RightBrace=14, 
		Thing=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'\t'", "' '", "'='", "Spaces", "Pointers", "ID", "ANSA", 
		"Digit", "Nondigit", "NewLine", "'('", "')'", "'{'", "'}'", "'|'"
	};
	public static final int
		RULE_lineTabs = 0, RULE_tabs = 1, RULE_type = 2, RULE_name = 3, RULE_program = 4, 
		RULE_assign = 5, RULE_multipleDeclare = 6, RULE_closedItem = 7, RULE_lineDeclare = 8, 
		RULE_lineAssign = 9, RULE_linemix = 10, RULE_stuffList = 11, RULE_functionCall = 12;
	public static final String[] ruleNames = {
		"lineTabs", "tabs", "type", "name", "program", "assign", "multipleDeclare", 
		"closedItem", "lineDeclare", "lineAssign", "linemix", "stuffList", "functionCall"
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
		enterRule(_localctx, 0, RULE_lineTabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26); match(NewLine);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(31); tabs();
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
		enterRule(_localctx, 2, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33); match(T__2);
				}
				}
				setState(36); 
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
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(ID);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pointers) {
				{
				{
				setState(39); match(Pointers);
				}
				}
				setState(44);
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
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(ID);
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
		public TerminalNode EOF() { return getToken(lineParser.EOF, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TerminalNode NewLine(int i) {
			return getToken(lineParser.NewLine, i);
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
		enterRule(_localctx, 8, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(47); match(NewLine);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); assign();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(54); match(NewLine);
						}
						}
						setState(57); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					setState(59); assign();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(65); match(NewLine);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(EOF);
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
		public LineDeclareContext lineDeclare() {
			return getRuleContext(LineDeclareContext.class,0);
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
		enterRule(_localctx, 10, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73); type();
			setState(109);
			switch (_input.LA(1)) {
			case Thing:
				{
				setState(74); match(Thing);
				setState(81);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(75); match(T__1);
						}
						}
						setState(78); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__1 );
					}
					break;
				case NewLine:
					{
					setState(80); lineTabs();
					}
					break;
				case ID:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(83); lineAssign();
					}
					break;

				case 2:
					{
					setState(84); lineDeclare();
					setState(91);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(85); match(T__1);
							}
							}
							setState(88); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__1 );
						setState(90); linemix();
						}
					}

					}
					break;
				}
				}
				break;
			case T__1:
			case LeftBrace:
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(95); match(T__1);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101); closedItem();
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102); match(T__1);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(107); linemix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111); lineTabs();
					setState(114);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(112); linemix();
						}
						break;

					case 2:
						{
						setState(113); lineAssign();
						}
						break;
					}
					}
					} 
				}
				setState(120);
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

	public static class MultipleDeclareContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public MultipleDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterMultipleDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitMultipleDeclare(this);
		}
	}

	public final MultipleDeclareContext multipleDeclare() throws RecognitionException {
		MultipleDeclareContext _localctx = new MultipleDeclareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multipleDeclare);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121); name();
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(122); match(T__1);
					setState(123); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ClosedItemContext extends ParserRuleContext {
		public MultipleDeclareContext multipleDeclare() {
			return getRuleContext(MultipleDeclareContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ANSA() { return getToken(lineParser.ANSA, 0); }
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
		enterRule(_localctx, 14, RULE_closedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(LeftBrace);
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(129); match(T__1);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135); multipleDeclare();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(136); match(T__1);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142); match(T__0);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(143); match(T__1);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149); match(ANSA);
				}
				break;

			case 2:
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(151); match(T__1);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157); name();
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158); match(T__1);
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(163); match(ANSA);
				}
				break;
			}
			setState(167); match(RightBrace);
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

	public static class LineDeclareContext extends ParserRuleContext {
		public MultipleDeclareContext multipleDeclare() {
			return getRuleContext(MultipleDeclareContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LineDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterLineDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitLineDeclare(this);
		}
	}

	public final LineDeclareContext lineDeclare() throws RecognitionException {
		LineDeclareContext _localctx = new LineDeclareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lineDeclare);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); multipleDeclare();
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

	public static class LineAssignContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LineDeclareContext lineDeclare() {
			return getRuleContext(LineDeclareContext.class,0);
		}
		public TerminalNode ANSA() { return getToken(lineParser.ANSA, 0); }
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
			setState(173); lineDeclare();
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(174); match(T__1);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); match(T__0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(181); match(T__1);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			switch (_input.LA(1)) {
			case ANSA:
				{
				setState(187); match(ANSA);
				}
				break;
			case ID:
			case LeftParen:
				{
				setState(188); functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public LineDeclareContext lineDeclare(int i) {
			return getRuleContext(LineDeclareContext.class,i);
		}
		public List<LineDeclareContext> lineDeclare() {
			return getRuleContexts(LineDeclareContext.class);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(191); closedItem();
				}
				break;
			case ID:
				{
				setState(192); lineDeclare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195); match(T__1);
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(202);
				switch (_input.LA(1)) {
				case LeftBrace:
					{
					setState(200); closedItem();
					}
					break;
				case ID:
					{
					setState(201); lineDeclare();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(208);
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

	public static class StuffListContext extends ParserRuleContext {
		public TerminalNode ANSA(int i) {
			return getToken(lineParser.ANSA, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<TerminalNode> ANSA() { return getTokens(lineParser.ANSA); }
		public StuffListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stuffList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).enterStuffList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lineListener ) ((lineListener)listener).exitStuffList(this);
		}
	}

	public final StuffListContext stuffList() throws RecognitionException {
		StuffListContext _localctx = new StuffListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stuffList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			switch (_input.LA(1)) {
			case ANSA:
				{
				setState(209); match(ANSA);
				}
				break;
			case LeftParen:
				{
				setState(210); match(LeftParen);
				setState(211); functionCall();
				setState(212); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(216); match(T__1);
				setState(222);
				switch (_input.LA(1)) {
				case ANSA:
					{
					setState(217); match(ANSA);
					}
					break;
				case LeftParen:
					{
					setState(218); match(LeftParen);
					setState(219); functionCall();
					setState(220); match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(228);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public StuffListContext stuffList() {
			return getRuleContext(StuffListContext.class,0);
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
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			setState(237);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); name();
				setState(230); match(T__1);
				setState(231); stuffList();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(LeftParen);
				setState(234); name();
				setState(235); match(RightParen);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u00f2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3"+
		"\6\3%\n\3\r\3\16\3&\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\6\7\6\63"+
		"\n\6\f\6\16\6\66\13\6\3\6\3\6\6\6:\n\6\r\6\16\6;\3\6\7\6?\n\6\f\6\16\6"+
		"B\13\6\3\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\7\6\7O\n\7\r\7\16"+
		"\7P\3\7\5\7T\n\7\3\7\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\7\5\7^\n\7\5\7`\n\7"+
		"\3\7\7\7c\n\7\f\7\16\7f\13\7\3\7\3\7\6\7j\n\7\r\7\16\7k\3\7\3\7\5\7p\n"+
		"\7\3\7\3\7\3\7\5\7u\n\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\3\b\6\b\177\n"+
		"\b\r\b\16\b\u0080\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\7"+
		"\t\u008c\n\t\f\t\16\t\u008f\13\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096"+
		"\13\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13\t\3\t\3\t\6\t\u00a2"+
		"\n\t\r\t\16\t\u00a3\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\3\n\3\n\5\n\u00ae\n"+
		"\n\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\13\3\13\7\13\u00b9"+
		"\n\13\f\13\16\13\u00bc\13\13\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\5\f\u00c4"+
		"\n\f\3\f\6\f\u00c7\n\f\r\f\16\f\u00c8\3\f\3\f\5\f\u00cd\n\f\7\f\u00cf"+
		"\n\f\f\f\16\f\u00d2\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00e1\n\r\7\r\u00e3\n\r\f\r\16\r\u00e6\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f0\n\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\2\u0109\2\35\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b/"+
		"\3\2\2\2\n\64\3\2\2\2\fK\3\2\2\2\16{\3\2\2\2\20\u0082\3\2\2\2\22\u00ad"+
		"\3\2\2\2\24\u00af\3\2\2\2\26\u00c3\3\2\2\2\30\u00d8\3\2\2\2\32\u00ef\3"+
		"\2\2\2\34\36\7\f\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 !\3\2\2\2!\"\5\4\3\2\"\3\3\2\2\2#%\7\3\2\2$#\3\2\2\2%&\3\2\2\2&$"+
		"\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(,\7\b\2\2)+\7\7\2\2*)\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60\7\b\2\2\60\t\3\2\2\2\61"+
		"\63\7\f\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\66\64\3\2\2\2\67@\5\f\7\28:\7\f\2\298\3\2\2\2:;\3\2\2\2;9"+
		"\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5\f\7\2>9\3\2\2\2?B\3\2\2\2@>\3\2\2\2@"+
		"A\3\2\2\2AF\3\2\2\2B@\3\2\2\2CE\7\f\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\2\2\3J\13\3\2\2\2Ko\5\6\4\2LS\7\21"+
		"\2\2MO\7\4\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RT\5\2"+
		"\2\2SN\3\2\2\2SR\3\2\2\2ST\3\2\2\2T_\3\2\2\2U`\5\24\13\2V]\5\22\n\2WY"+
		"\7\4\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\5\26\f"+
		"\2]X\3\2\2\2]^\3\2\2\2^`\3\2\2\2_U\3\2\2\2_V\3\2\2\2`p\3\2\2\2ac\7\4\2"+
		"\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi\5\20"+
		"\t\2hj\7\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\26"+
		"\f\2np\3\2\2\2oL\3\2\2\2od\3\2\2\2px\3\2\2\2qt\5\2\2\2ru\5\26\f\2su\5"+
		"\24\13\2tr\3\2\2\2ts\3\2\2\2uw\3\2\2\2vq\3\2\2\2wz\3\2\2\2xv\3\2\2\2x"+
		"y\3\2\2\2y\r\3\2\2\2zx\3\2\2\2{~\5\b\5\2|}\7\4\2\2}\177\5\b\5\2~|\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\17\3\2"+
		"\2\2\u0082\u00a7\7\17\2\2\u0083\u0085\7\4\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008d\5\16\b\2\u008a\u008c\7\4\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\7\5\2\2\u0091"+
		"\u0093\7\4\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\t\2\2\u0098\u00a8\3\2\2\2\u0099\u009b\7\4\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\b\5\2\u00a0\u00a2\7\4"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u0086\3\2\2\2\u00a7\u009c\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\7\20\2\2\u00aa\21\3\2\2\2\u00ab\u00ae\5\b\5\2\u00ac\u00ae\5\16"+
		"\b\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00b3"+
		"\5\22\n\2\u00b0\u00b2\7\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00ba\7\5\2\2\u00b7\u00b9\7\4\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\7\t\2\2\u00be\u00c0\5\32\16\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\25\3\2\2\2\u00c1\u00c4\5\20\t"+
		"\2\u00c2\u00c4\5\22\n\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00d0\3\2\2\2\u00c5\u00c7\7\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00cd\5\20\t\2\u00cb\u00cd\5\22\n\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c6\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d0\3\2\2"+
		"\2\u00d3\u00d9\7\t\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00d6\5\32\16\2\u00d6"+
		"\u00d7\7\16\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3"+
		"\2\2\2\u00d9\u00e4\3\2\2\2\u00da\u00e0\7\4\2\2\u00db\u00e1\7\t\2\2\u00dc"+
		"\u00dd\7\r\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\7\16\2\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\31\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5\b\5\2\u00e8\u00e9"+
		"\7\4\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\7\r\2\2"+
		"\u00ec\u00ed\5\b\5\2\u00ed\u00ee\7\16\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e7"+
		"\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\33\3\2\2\2&\37&,\64;@FPSZ]_dkotx\u0080"+
		"\u0086\u008d\u0094\u009c\u00a3\u00a7\u00ad\u00b3\u00ba\u00bf\u00c3\u00c8"+
		"\u00cc\u00d0\u00d8\u00e0\u00e4\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}