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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Logic=12, Pointers=13, Digit=14, Nondigit=15, ID=16, 
		NewLine=17, LeftParen=18, RightParen=19, Spaces=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Logic", "Pointers", "Digit", "Nondigit", "ID", "NewLine", 
		"LeftParen", "RightParen", "Spaces"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rc\n\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21n\n\21\f\21\16\21q\13\21\3\22"+
		"\3\22\3\22\5\22v\n\22\3\23\3\23\3\24\3\24\3\25\6\25}\n\25\r\25\16\25~"+
		"\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26\3\2\7\4\2>>@@\5\2((,,``\3\2\62;\5\2"+
		"C\\aac|\4\2\f\f\17\17\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3"+
		"\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17"+
		"@\3\2\2\2\21F\3\2\2\2\23I\3\2\2\2\25N\3\2\2\2\27S\3\2\2\2\31b\3\2\2\2"+
		"\33d\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y"+
		"\3\2\2\2)|\3\2\2\2+,\7f\2\2,-\7q\2\2-\4\3\2\2\2./\7\13\2\2/\6\3\2\2\2"+
		"\60\61\7\"\2\2\61\b\3\2\2\2\62\63\7e\2\2\63\64\7n\2\2\64\65\7c\2\2\65"+
		"\66\7u\2\2\66\67\7u\2\2\678\7\"\2\28\n\3\2\2\29:\7.\2\2:\f\3\2\2\2;<\7"+
		"p\2\2<=\7q\2\2=>\7f\2\2>?\7g\2\2?\16\3\2\2\2@A\7y\2\2AB\7j\2\2BC\7k\2"+
		"\2CD\7n\2\2DE\7g\2\2E\20\3\2\2\2FG\7k\2\2GH\7h\2\2H\22\3\2\2\2IJ\7g\2"+
		"\2JK\7n\2\2KL\7k\2\2LM\7h\2\2M\24\3\2\2\2NO\7g\2\2OP\7n\2\2PQ\7u\2\2Q"+
		"R\7g\2\2R\26\3\2\2\2ST\7=\2\2T\30\3\2\2\2UV\7~\2\2Vc\7~\2\2WX\7(\2\2X"+
		"c\7(\2\2YZ\7#\2\2Zc\7?\2\2[\\\7?\2\2\\c\7?\2\2]c\t\2\2\2^_\7>\2\2_c\7"+
		"?\2\2`a\7@\2\2ac\7?\2\2bU\3\2\2\2bW\3\2\2\2bY\3\2\2\2b[\3\2\2\2b]\3\2"+
		"\2\2b^\3\2\2\2b`\3\2\2\2c\32\3\2\2\2de\t\3\2\2e\34\3\2\2\2fg\t\4\2\2g"+
		"\36\3\2\2\2hi\t\5\2\2i \3\2\2\2jo\5\37\20\2kn\5\35\17\2ln\5\37\20\2mk"+
		"\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\"\3\2\2\2qo\3\2\2\2"+
		"rs\7\17\2\2sv\7\f\2\2tv\t\6\2\2ur\3\2\2\2ut\3\2\2\2v$\3\2\2\2wx\7*\2\2"+
		"x&\3\2\2\2yz\7+\2\2z(\3\2\2\2{}\7\"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177*\3\2\2\2\b\2bmou~\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}