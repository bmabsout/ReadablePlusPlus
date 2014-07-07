// Generated from /media/ssd/Dropbox/ReadablePlusPlus/rppGrammar/rpp.g4 by ANTLR 4.3
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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, Logic=14, Number=15, Spaces=16, Pointers=17, 
		ID=18, Digit=19, NonDigit=20, NewLine=21, LeftParen=22, RightParen=23, 
		LeftBrace=24, RightBrace=25, Thing=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "Logic", "Number", "Spaces", "Pointers", 
		"ID", "Digit", "NonDigit", "NewLine", "LeftParen", "RightParen", "LeftBrace", 
		"RightBrace", "Thing"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17x\n\17\3\20\3\20\3\20\7\20}\n\20\f\20\16"+
		"\20\u0080\13\20\3\21\6\21\u0083\n\21\r\21\16\21\u0084\3\22\3\22\3\23\3"+
		"\23\3\23\7\23\u008c\n\23\f\23\16\23\u008f\13\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u0098\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\3\2\7\4\2>>@@\5\2((,,``\3\2\62;\5\2C\\aac|\4\2\f\f\17\17\u00ae\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7A\3\2\2"+
		"\2\tC\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17Q\3\2\2\2\21V\3\2\2\2\23X\3\2\2"+
		"\2\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33c\3\2\2\2\35w\3\2\2\2\37y\3"+
		"\2\2\2!\u0082\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u0090\3\2\2\2)\u0092"+
		"\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2"+
		"\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\678\7f\2\289\7q\2\29\4\3\2\2\2:;\7"+
		"e\2\2;<\7n\2\2<=\7c\2\2=>\7u\2\2>?\7u\2\2?@\7\"\2\2@\6\3\2\2\2AB\7.\2"+
		"\2B\b\3\2\2\2CD\7p\2\2DE\7q\2\2EF\7f\2\2FG\7g\2\2G\n\3\2\2\2HI\7y\2\2"+
		"IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g\2\2M\f\3\2\2\2NO\7k\2\2OP\7h\2\2P\16"+
		"\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7k\2\2TU\7h\2\2U\20\3\2\2\2VW\7?\2\2W\22"+
		"\3\2\2\2XY\7=\2\2Y\24\3\2\2\2Z[\7\13\2\2[\26\3\2\2\2\\]\7\"\2\2]\30\3"+
		"\2\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\32\3\2\2\2cd\7u\2\2de\7v\2"+
		"\2ef\7c\2\2fg\7v\2\2gh\7k\2\2hi\7e\2\2i\34\3\2\2\2jk\7~\2\2kx\7~\2\2l"+
		"m\7(\2\2mx\7(\2\2no\7#\2\2ox\7?\2\2pq\7?\2\2qx\7?\2\2rx\t\2\2\2st\7>\2"+
		"\2tx\7?\2\2uv\7@\2\2vx\7?\2\2wj\3\2\2\2wl\3\2\2\2wn\3\2\2\2wp\3\2\2\2"+
		"wr\3\2\2\2ws\3\2\2\2wu\3\2\2\2x\36\3\2\2\2y~\5\'\24\2z}\5\'\24\2{}\5)"+
		"\25\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177 \3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0083\7\"\2\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\t\3\2\2\u0087$\3\2\2\2\u0088\u008d\5)\25\2\u0089\u008c\5\'\24\2"+
		"\u008a\u008c\5)\25\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e&\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\t\4\2\2\u0091(\3\2\2\2\u0092\u0093\t\5\2\2"+
		"\u0093*\3\2\2\2\u0094\u0095\7\17\2\2\u0095\u0098\7\f\2\2\u0096\u0098\t"+
		"\6\2\2\u0097\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0098,\3\2\2\2\u0099\u009a"+
		"\7*\2\2\u009a.\3\2\2\2\u009b\u009c\7+\2\2\u009c\60\3\2\2\2\u009d\u009e"+
		"\7}\2\2\u009e\62\3\2\2\2\u009f\u00a0\7\177\2\2\u00a0\64\3\2\2\2\u00a1"+
		"\u00a2\7~\2\2\u00a2\66\3\2\2\2\n\2w|~\u0084\u008b\u008d\u0097\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}