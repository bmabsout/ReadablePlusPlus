// Generated from /media/ssd/Dropbox/ReadablePlusPlus/antlr/rppgrammar/line.g4 by ANTLR 4.3
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
		T__2=1, T__1=2, T__0=3, Spaces=4, Pointers=5, ID=6, Digit=7, Nondigit=8, 
		NewLine=9, LeftParen=10, RightParen=11, LeftBrace=12, RightBrace=13, Thing=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "Spaces", "Pointers", "ID", "Digit", "Nondigit", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20G\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\3\6\3\7\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\5\n<\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\3\2\6\5\2((,,``\3\2\62;\5\2C\\aac|\4\2\f\f\17\17J\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2"+
		"\t&\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\23;\3\2"+
		"\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33C\3\2\2\2\35E\3\2\2\2\37 \7"+
		"\13\2\2 \4\3\2\2\2!\"\7\"\2\2\"\6\3\2\2\2#$\7?\2\2$\b\3\2\2\2%\'\7\"\2"+
		"\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*+\t\2\2\2+\f\3"+
		"\2\2\2,\61\5\21\t\2-\60\5\17\b\2.\60\5\21\t\2/-\3\2\2\2/.\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\16\3\2\2\2\63\61\3\2\2\2\64\65\t"+
		"\3\2\2\65\20\3\2\2\2\66\67\t\4\2\2\67\22\3\2\2\289\7\17\2\29<\7\f\2\2"+
		":<\t\5\2\2;8\3\2\2\2;:\3\2\2\2<\24\3\2\2\2=>\7*\2\2>\26\3\2\2\2?@\7+\2"+
		"\2@\30\3\2\2\2AB\7}\2\2B\32\3\2\2\2CD\7\177\2\2D\34\3\2\2\2EF\7~\2\2F"+
		"\36\3\2\2\2\7\2(/\61;\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}