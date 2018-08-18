// Generated from Init.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, GLOBALLY=14, PREV=15, YESTERDAY=16, 
		GLOBALLYFINALLY=17, FINALLY=18, NEXT=19, TEXTUALNEXT=20, NEG=21, LPAR=22, 
		RPAR=23, EQUAL=24, MINUS=25, WS=26, ID=27, CONSTANT=28, NAT=29, STAR=30, 
		LBRACK=31, RBRACK=32, TRUE=33, FALSE=34, NEWLINE=35, COMMA=36, COMMENT=37, 
		LINE_COMMENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "GLOBALLY", "PREV", "YESTERDAY", "GLOBALLYFINALLY", 
		"FINALLY", "NEXT", "TEXTUALNEXT", "NEG", "LPAR", "RPAR", "EQUAL", "MINUS", 
		"WS", "ID", "CONSTANT", "NAT", "STAR", "LBRACK", "RBRACK", "TRUE", "FALSE", 
		"NEWLINE", "COMMA", "COMMENT", "LINE_COMMENT"
	};

	  boolean matchedEOF=false;
	 	
	 	
	 

	public InitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Init.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\6\33\u0094\n\33\r\33\16\33\u0095\3\33\3\33\3\34\3\34\7\34\u009c"+
		"\n\34\f\34\16\34\u009f\13\34\3\34\3\34\3\34\3\34\5\34\u00a5\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00ac\n\34\5\34\u00ae\n\34\3\35\3\35\7\35\u00b2"+
		"\n\35\f\35\16\35\u00b5\13\35\3\36\5\36\u00b8\n\36\3\36\3\36\7\36\u00bc"+
		"\n\36\f\36\16\36\u00bf\13\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3$\5$\u00d3\n$\3$\3$\3%\3%\3&\3&\3&\3&\7&\u00dd\n&"+
		"\f&\16&\u00e0\13&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00eb\n\'\f\'\16"+
		"\'\u00ee\13\'\3\'\3\'\3\u00de\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\7\5\2\13\f\17"+
		"\17\"\"\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\u00fc"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7U\3\2\2\2\t"+
		"X\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25"+
		"h\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2"+
		"!z\3\2\2\2#|\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0088"+
		"\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u008e\3\2\2\2\63\u0090\3\2\2"+
		"\2\65\u0093\3\2\2\2\67\u0099\3\2\2\29\u00af\3\2\2\2;\u00b7\3\2\2\2=\u00c0"+
		"\3\2\2\2?\u00c2\3\2\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E\u00cb\3\2\2\2G"+
		"\u00d2\3\2\2\2I\u00d6\3\2\2\2K\u00d8\3\2\2\2M\u00e6\3\2\2\2OP\7>\2\2P"+
		"Q\7/\2\2Q\4\3\2\2\2RS\7/\2\2ST\7@\2\2T\6\3\2\2\2UV\7#\2\2VW\7?\2\2W\b"+
		"\3\2\2\2XY\7@\2\2YZ\7?\2\2Z\n\3\2\2\2[\\\7>\2\2\\\f\3\2\2\2]^\7?\2\2^"+
		"_\7?\2\2_\16\3\2\2\2`a\7~\2\2a\20\3\2\2\2bc\7@\2\2c\22\3\2\2\2de\7>\2"+
		"\2ef\7?\2\2fg\7@\2\2g\24\3\2\2\2hi\7>\2\2ij\7?\2\2j\26\3\2\2\2kl\7(\2"+
		"\2l\30\3\2\2\2mn\7-\2\2n\32\3\2\2\2op\7>\2\2pq\7/\2\2qr\7@\2\2r\34\3\2"+
		"\2\2st\7I\2\2t\36\3\2\2\2uv\7R\2\2vw\7T\2\2wx\7G\2\2xy\7X\2\2y \3\2\2"+
		"\2z{\7[\2\2{\"\3\2\2\2|}\7I\2\2}~\7H\2\2~$\3\2\2\2\177\u0080\7H\2\2\u0080"+
		"&\3\2\2\2\u0081\u0082\7z\2\2\u0082(\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7z\2\2\u0086\u0087\7v\2\2\u0087*\3\2\2\2\u0088\u0089"+
		"\7#\2\2\u0089,\3\2\2\2\u008a\u008b\7*\2\2\u008b.\3\2\2\2\u008c\u008d\7"+
		"+\2\2\u008d\60\3\2\2\2\u008e\u008f\7?\2\2\u008f\62\3\2\2\2\u0090\u0091"+
		"\7/\2\2\u0091\64\3\2\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\b\33\2\2\u0098\66\3\2\2\2\u0099\u009d\t\3\2\2\u009a\u009c"+
		"\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00ad\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5?"+
		" \2\u00a1\u00a2\5;\36\2\u00a2\u00a3\5A!\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ae\3\2\2\2\u00a6\u00ae\3\2\2\2\u00a7"+
		"\u00a8\5-\27\2\u00a8\u00a9\5;\36\2\u00a9\u00aa\5/\30\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a4\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae8\3\2\2\2"+
		"\u00af\u00b3\4C\\\2\u00b0\u00b2\t\5\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4:\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b8\7/\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\4\62;\2\u00ba\u00bc\4\62;\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be<\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1>\3\2"+
		"\2\2\u00c2\u00c3\7]\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7_\2\2\u00c5B\3\2\2"+
		"\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca"+
		"\7g\2\2\u00caD\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0F\3\2\2\2\u00d1\u00d3"+
		"\7\17\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\7\f\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7.\2\2\u00d7J\3\2\2\2"+
		"\u00d8\u00d9\7\61\2\2\u00d9\u00da\7,\2\2\u00da\u00de\3\2\2\2\u00db\u00dd"+
		"\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\7,\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b&\2\2\u00e5"+
		"L\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ec\3\2\2"+
		"\2\u00e9\u00eb\n\6\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\b\'\2\2\u00f0N\3\2\2\2\16\2\u0095\u009d\u00a4\u00ab\u00ad\u00b3"+
		"\u00b7\u00bd\u00d2\u00de\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}