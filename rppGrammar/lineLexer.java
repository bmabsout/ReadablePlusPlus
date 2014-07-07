// Generated from /media/ssd/Dropbox/ReadablePlusPlus/rppGrammar/line.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, Number=4, Spaces=5, Pointers=6, ID=7, Digit=8, 
		NonDigit=9, NewLine=10, LeftParen=11, RightParen=12, LeftBrace=13, RightBrace=14, 
		Thing=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "Number", "Spaces", "Pointers", "ID", "Digit", 
		"NonDigit", "NewLine", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
		"Thing"
	};


	public lineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "line.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\6\6\61\n\6\r\6\16\6\62\3"+
		"\7\3\7\3\b\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\5\13F\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\6\5\2((,,``\3\2\62;\5\2C\\aac|\4\2\f\f\17\17V\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t"+
		"\'\3\2\2\2\13\60\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2\2\21>\3\2\2\2\23@\3"+
		"\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33K\3\2\2\2\35M\3\2\2\2\37"+
		"O\3\2\2\2!\"\7\13\2\2\"\4\3\2\2\2#$\7\"\2\2$\6\3\2\2\2%&\7?\2\2&\b\3\2"+
		"\2\2\',\5\21\t\2(+\5\21\t\2)+\5\23\n\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,"+
		"*\3\2\2\2,-\3\2\2\2-\n\3\2\2\2.,\3\2\2\2/\61\7\"\2\2\60/\3\2\2\2\61\62"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\f\3\2\2\2\64\65\t\2\2\2\65\16"+
		"\3\2\2\2\66;\5\23\n\2\67:\5\21\t\28:\5\23\n\29\67\3\2\2\298\3\2\2\2:="+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\20\3\2\2\2=;\3\2\2\2>?\t\3\2\2?\22\3\2\2"+
		"\2@A\t\4\2\2A\24\3\2\2\2BC\7\17\2\2CF\7\f\2\2DF\t\5\2\2EB\3\2\2\2ED\3"+
		"\2\2\2F\26\3\2\2\2GH\7*\2\2H\30\3\2\2\2IJ\7+\2\2J\32\3\2\2\2KL\7}\2\2"+
		"L\34\3\2\2\2MN\7\177\2\2N\36\3\2\2\2OP\7~\2\2P \3\2\2\2\t\2*,\629;E\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}