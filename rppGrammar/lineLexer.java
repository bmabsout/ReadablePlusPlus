// Generated from C:\Users\bassel\Dropbox\ReadablePlusPlus\antlr\rppgrammar\line.g4 by ANTLR 4.3
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
		T__2=1, T__1=2, T__0=3, Spaces=4, Pointers=5, ID=6, ANSA=7, Digit=8, Nondigit=9, 
		NewLine=10, LeftParen=11, RightParen=12, LeftBrace=13, RightBrace=14, 
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
		"T__2", "T__1", "T__0", "Spaces", "Pointers", "ID", "ANSA", "Digit", "Nondigit", 
		"NewLine", "LeftParen", "RightParen", "LeftBrace", "RightBrace", "Thing"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21O\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\6\5)\n\5\r\5\16\5*\3\6\3\6\3\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65"+
		"\13\7\3\b\3\b\6\b9\n\b\r\b\16\b:\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13D"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\6"+
		"\5\2((,,``\3\2\62;\5\2C\\aac|\4\2\f\f\17\17T\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t(\3\2\2\2"+
		"\13,\3\2\2\2\r.\3\2\2\2\178\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25C\3\2\2"+
		"\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2\37M\3\2\2\2!\"\7\13"+
		"\2\2\"\4\3\2\2\2#$\7\"\2\2$\6\3\2\2\2%&\7?\2\2&\b\3\2\2\2\')\7\"\2\2("+
		"\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\n\3\2\2\2,-\t\2\2\2-\f\3\2\2"+
		"\2.\63\5\23\n\2/\62\5\21\t\2\60\62\5\23\n\2\61/\3\2\2\2\61\60\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\16\3\2\2\2\65\63\3\2\2\2"+
		"\669\5\21\t\2\679\5\23\n\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;\20\3\2\2\2<=\t\3\2\2=\22\3\2\2\2>?\t\4\2\2?\24\3\2\2\2@A\7"+
		"\17\2\2AD\7\f\2\2BD\t\5\2\2C@\3\2\2\2CB\3\2\2\2D\26\3\2\2\2EF\7*\2\2F"+
		"\30\3\2\2\2GH\7+\2\2H\32\3\2\2\2IJ\7}\2\2J\34\3\2\2\2KL\7\177\2\2L\36"+
		"\3\2\2\2MN\7~\2\2N \3\2\2\2\t\2*\61\638:C\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}