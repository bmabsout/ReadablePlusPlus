// Generated from /media/ssd/Dropbox/ReadablePlusPlus/antlr/rppgrammar/rpp.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rppLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, Pointers=9, 
		Type=10, Digit=11, Nondigit=12, ID=13, Anything=14, LeftParen=15, RightParen=16, 
		Spaces=17, Tab=18, Tabs=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Pointers", 
		"Type", "Digit", "Nondigit", "ID", "Anything", "LeftParen", "RightParen", 
		"Spaces", "Tab", "Tabs"
	};


	public rppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rpp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13"+
		"F\n\13\f\13\16\13I\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16R\n\16\f\16"+
		"\16\16U\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22^\n\22\r\22\16\22"+
		"_\3\23\3\23\3\24\6\24e\n\24\r\24\16\24f\2\2\25\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		"\3\2\5\5\2((,,``\3\2\62;\5\2C\\aac|l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2"+
		"\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\179\3"+
		"\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33"+
		"N\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#]\3\2\2\2%a\3\2\2\2\'d\3\2"+
		"\2\2)*\7\"\2\2*\4\3\2\2\2+,\7\f\2\2,\6\3\2\2\2-.\7.\2\2.\b\3\2\2\2/\60"+
		"\7p\2\2\60\61\7q\2\2\61\62\7f\2\2\62\63\7g\2\2\63\n\3\2\2\2\64\65\7\17"+
		"\2\2\65\f\3\2\2\2\66\67\7\17\2\2\678\7\f\2\28\16\3\2\2\29:\7e\2\2:;\7"+
		"n\2\2;<\7c\2\2<=\7u\2\2=>\7u\2\2>\20\3\2\2\2?@\7=\2\2@\22\3\2\2\2AB\t"+
		"\2\2\2B\24\3\2\2\2CG\5\33\16\2DF\5\23\n\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2H\26\3\2\2\2IG\3\2\2\2JK\t\3\2\2K\30\3\2\2\2LM\t\4\2\2M\32"+
		"\3\2\2\2NS\5\31\r\2OR\5\27\f\2PR\5\31\r\2QO\3\2\2\2QP\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\34\3\2\2\2US\3\2\2\2VW\13\2\2\2W\36\3\2\2\2XY"+
		"\7*\2\2Y \3\2\2\2Z[\7+\2\2[\"\3\2\2\2\\^\7\"\2\2]\\\3\2\2\2^_\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`$\3\2\2\2ab\7\13\2\2b&\3\2\2\2ce\5%\23\2dc\3\2\2"+
		"\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g(\3\2\2\2\b\2GQS_f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}