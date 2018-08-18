// Generated from FastReactionPast.g4 by ANTLR 4.4

 	
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
public class FastReactionPastLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, GLOBALLY=11, PREV=12, YESTERDAY=13, GLOBALLYFINALLY=14, FINALLY=15, 
		NEXT=16, TEXTUALNEXT=17, NEG=18, LPAR=19, RPAR=20, EQUAL=21, MINUS=22, 
		WS=23, ID=24, CONSTANT=25, NAT=26, STAR=27, LBRACK=28, RBRACK=29, TRUE=30, 
		FALSE=31, NEWLINE=32, COMMA=33, COMMENT=34, LINE_COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "GLOBALLY", "PREV", "YESTERDAY", "GLOBALLYFINALLY", "FINALLY", 
		"NEXT", "TEXTUALNEXT", "NEG", "LPAR", "RPAR", "EQUAL", "MINUS", "WS", 
		"ID", "CONSTANT", "NAT", "STAR", "LBRACK", "RBRACK", "TRUE", "FALSE", 
		"NEWLINE", "COMMA", "COMMENT", "LINE_COMMENT"
	};

	  boolean matchedEOF=false;
	 	
	 	
	 

	public FastReactionPastLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FastReactionPast.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\6\30\u0083\n\30\r\30\16\30\u0084\3\30\3\30\3\31\3\31\7\31\u008b\n\31"+
		"\f\31\16\31\u008e\13\31\3\31\3\31\3\31\3\31\5\31\u0094\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u009b\n\31\5\31\u009d\n\31\3\32\3\32\7\32\u00a1\n"+
		"\32\f\32\16\32\u00a4\13\32\3\33\5\33\u00a7\n\33\3\33\3\33\7\33\u00ab\n"+
		"\33\f\33\16\33\u00ae\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\5!\u00c2\n!\3!\3!\3\"\3\"\3#\3#\3#\3#"+
		"\7#\u00cc\n#\f#\16#\u00cf\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00da\n$\f"+
		"$\16$\u00dd\13$\3$\3$\3\u00cd\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\7\5\2\13\f\17\17\"\""+
		"\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\u00eb\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3"+
		"I\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2\rW\3\2\2\2\17Y"+
		"\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33"+
		"i\3\2\2\2\35k\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%w\3\2\2\2\'y\3\2"+
		"\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0082\3\2\2\2\61\u0088\3\2\2\2"+
		"\63\u009e\3\2\2\2\65\u00a6\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b3"+
		"\3\2\2\2=\u00b5\3\2\2\2?\u00ba\3\2\2\2A\u00c1\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00c7\3\2\2\2G\u00d5\3\2\2\2IJ\7/\2\2JK\7@\2\2K\4\3\2\2\2LM\7#\2\2MN"+
		"\7?\2\2N\6\3\2\2\2OP\7@\2\2PQ\7?\2\2Q\b\3\2\2\2RS\7>\2\2S\n\3\2\2\2TU"+
		"\7?\2\2UV\7?\2\2V\f\3\2\2\2WX\7~\2\2X\16\3\2\2\2YZ\7@\2\2Z\20\3\2\2\2"+
		"[\\\7>\2\2\\]\7?\2\2]\22\3\2\2\2^_\7(\2\2_\24\3\2\2\2`a\7-\2\2a\26\3\2"+
		"\2\2bc\7I\2\2c\30\3\2\2\2de\7R\2\2ef\7T\2\2fg\7G\2\2gh\7X\2\2h\32\3\2"+
		"\2\2ij\7[\2\2j\34\3\2\2\2kl\7I\2\2lm\7H\2\2m\36\3\2\2\2no\7H\2\2o \3\2"+
		"\2\2pq\7z\2\2q\"\3\2\2\2rs\7p\2\2st\7g\2\2tu\7z\2\2uv\7v\2\2v$\3\2\2\2"+
		"wx\7#\2\2x&\3\2\2\2yz\7*\2\2z(\3\2\2\2{|\7+\2\2|*\3\2\2\2}~\7?\2\2~,\3"+
		"\2\2\2\177\u0080\7/\2\2\u0080.\3\2\2\2\u0081\u0083\t\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\30\2\2\u0087\60\3\2\2\2\u0088\u008c\t\3\2"+
		"\2\u0089\u008b\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u009c\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\59\35\2\u0090\u0091\5\65\33\2\u0091\u0092\5;\36\2\u0092\u0094\3"+
		"\2\2\2\u0093\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009d\3\2\2\2\u0095"+
		"\u009d\3\2\2\2\u0096\u0097\5\'\24\2\u0097\u0098\5\65\33\2\u0098\u0099"+
		"\5)\25\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\62\3\2\2\2\u009e\u00a2\4C\\\2\u009f\u00a1\t\5\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\64\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7/\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\4\62;\2\u00a9\u00ab"+
		"\4\62;\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\66\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7,\2\2"+
		"\u00b08\3\2\2\2\u00b1\u00b2\7]\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7_\2\2\u00b4"+
		"<\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9>\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf@\3\2\2\2\u00c0"+
		"\u00c2\7\17\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\7\f\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6D\3"+
		"\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9\7,\2\2\u00c9\u00cd\3\2\2\2\u00ca"+
		"\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\7,\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b#"+
		"\2\2\u00d4F\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00db"+
		"\3\2\2\2\u00d8\u00da\n\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\b$\2\2\u00dfH\3\2\2\2\16\2\u0084\u008c\u0093\u009a\u009c"+
		"\u00a2\u00a6\u00ac\u00c1\u00cd\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}