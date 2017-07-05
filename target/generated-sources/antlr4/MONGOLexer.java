// Generated from MONGOLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MONGOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, DB=2, FIND=3, INSERT=4, INSERTONE=5, INSERTMANY=6, UPDATE=7, 
		UPDATEMANY=8, UPDATEONE=9, DELETEONE=10, DELETEMANY=11, ID=12, UNDERSCORE=13, 
		DOT=14, OPEN_ROUND_BRACKET=15, CLOSE_ROUND_BRACKET=16, OPEN_SQUARE_BRACKET=17, 
		CLOSE_SQUARE_BRACKET=18, OPEN_CURLY_BRACKET=19, CLOSE_CURLY_BRACKET=20, 
		ISTO_CHAR=21, COMMAR_CHAR=22, TRUE=23, FALSE=24, NULL=25, STRING=26, NUMBER=27, 
		KEYWORDS=28, DATE=29, DATETYPE=30, CustomDate=31, MILLISEC=32, YYYY=33, 
		MM=34, DD=35, HH=36, MIN=37, SEC=38;
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
		"SPACE", "DB", "FIND", "INSERT", "INSERTONE", "INSERTMANY", "UPDATE", 
		"UPDATEMANY", "UPDATEONE", "DELETEONE", "DELETEMANY", "ID", "UNDERSCORE", 
		"DOT", "OPEN_ROUND_BRACKET", "CLOSE_ROUND_BRACKET", "OPEN_SQUARE_BRACKET", 
		"CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "ISTO_CHAR", 
		"COMMAR_CHAR", "TRUE", "FALSE", "NULL", "STRING", "NUMBER", "KEYWORDS", 
		"DATE", "DATETYPE", "CustomDate", "MILLISEC", "YYYY", "MM", "DD", "HH", 
		"MIN", "SEC", "ID_LITERAL", "ALPHA_LITERAL", "ALPHABETS", "HEX_DIGIT", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ESC", "UNICODE", 
		"HEX", "INT_NO", "EXP"
	};


	public MONGOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MONGOLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u01f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\6\2\u0097\n\2\r\2\16\2\u0098\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u011b\n\33\f\33\16\33"+
		"\u011e\13\33\3\33\3\33\3\34\5\34\u0123\n\34\3\34\3\34\3\34\6\34\u0128"+
		"\n\34\r\34\16\34\u0129\3\34\5\34\u012d\n\34\3\34\5\34\u0130\n\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0136\n\34\3\34\5\34\u0139\n\34\3\35\5\35\u013c\n"+
		"\35\3\35\3\35\7\35\u0140\n\35\f\35\16\35\u0143\13\35\3\36\3\36\3\36\5"+
		"\36\u0148\n\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0150\n\37\3\37\3\37"+
		"\3\37\5\37\u0155\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u0170\n!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\7(\u0187\n(\f(\16"+
		"(\u018a\13(\3(\6(\u018d\n(\r(\16(\u018e\3(\7(\u0192\n(\f(\16(\u0195\13"+
		"(\3)\3)\7)\u0199\n)\f)\16)\u019c\13)\3)\3)\5)\u01a0\n)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\5F\u01dd\nF\3G"+
		"\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\7I\u01ea\nI\fI\16I\u01ed\13I\5I\u01ef\n"+
		"I\3J\3J\5J\u01f3\nJ\3J\3J\4\u0188\u018e\2K\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2"+
		"S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\3\2+\5\2\13\f\17\17\"\"\4\2$$^^\3\2\62;\4\2&&aa\4\2C\\c|\7"+
		"\2&&\62;C\\aac|\6\2&&C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\3\2&&\3\2C|\5\2"+
		"\62;CHch\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\n\2$$\61\61^^ddhhppttvv\3\2\63;\4\2--//\u01eb\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\3\u0096\3\2\2\2\5\u009c\3\2\2\2\7\u009f\3\2\2\2"+
		"\t\u00a4\3\2\2\2\13\u00ab\3\2\2\2\r\u00b5\3\2\2\2\17\u00c0\3\2\2\2\21"+
		"\u00c7\3\2\2\2\23\u00d2\3\2\2\2\25\u00dc\3\2\2\2\27\u00e6\3\2\2\2\31\u00f1"+
		"\3\2\2\2\33\u00f3\3\2\2\2\35\u00f5\3\2\2\2\37\u00f7\3\2\2\2!\u00f9\3\2"+
		"\2\2#\u00fb\3\2\2\2%\u00fd\3\2\2\2\'\u00ff\3\2\2\2)\u0101\3\2\2\2+\u0103"+
		"\3\2\2\2-\u0105\3\2\2\2/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u0112\3\2\2"+
		"\2\65\u0117\3\2\2\2\67\u0138\3\2\2\29\u013b\3\2\2\2;\u0144\3\2\2\2=\u014f"+
		"\3\2\2\2?\u015b\3\2\2\2A\u016f\3\2\2\2C\u0171\3\2\2\2E\u0176\3\2\2\2G"+
		"\u0179\3\2\2\2I\u017c\3\2\2\2K\u017f\3\2\2\2M\u0182\3\2\2\2O\u0188\3\2"+
		"\2\2Q\u019f\3\2\2\2S\u01a1\3\2\2\2U\u01a3\3\2\2\2W\u01a5\3\2\2\2Y\u01a7"+
		"\3\2\2\2[\u01a9\3\2\2\2]\u01ab\3\2\2\2_\u01ad\3\2\2\2a\u01af\3\2\2\2c"+
		"\u01b1\3\2\2\2e\u01b3\3\2\2\2g\u01b5\3\2\2\2i\u01b7\3\2\2\2k\u01b9\3\2"+
		"\2\2m\u01bb\3\2\2\2o\u01bd\3\2\2\2q\u01bf\3\2\2\2s\u01c1\3\2\2\2u\u01c3"+
		"\3\2\2\2w\u01c5\3\2\2\2y\u01c7\3\2\2\2{\u01c9\3\2\2\2}\u01cb\3\2\2\2\177"+
		"\u01cd\3\2\2\2\u0081\u01cf\3\2\2\2\u0083\u01d1\3\2\2\2\u0085\u01d3\3\2"+
		"\2\2\u0087\u01d5\3\2\2\2\u0089\u01d7\3\2\2\2\u008b\u01d9\3\2\2\2\u008d"+
		"\u01de\3\2\2\2\u008f\u01e4\3\2\2\2\u0091\u01ee\3\2\2\2\u0093\u01f0\3\2"+
		"\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\2"+
		"\2\2\u009b\4\3\2\2\2\u009c\u009d\5]/\2\u009d\u009e\5Y-\2\u009e\6\3\2\2"+
		"\2\u009f\u00a0\5a\61\2\u00a0\u00a1\5g\64\2\u00a1\u00a2\5q9\2\u00a2\u00a3"+
		"\5]/\2\u00a3\b\3\2\2\2\u00a4\u00a5\5g\64\2\u00a5\u00a6\5q9\2\u00a6\u00a7"+
		"\5{>\2\u00a7\u00a8\5_\60\2\u00a8\u00a9\5y=\2\u00a9\u00aa\5}?\2\u00aa\n"+
		"\3\2\2\2\u00ab\u00ac\5g\64\2\u00ac\u00ad\5q9\2\u00ad\u00ae\5{>\2\u00ae"+
		"\u00af\5_\60\2\u00af\u00b0\5y=\2\u00b0\u00b1\5}?\2\u00b1\u00b2\5s:\2\u00b2"+
		"\u00b3\5q9\2\u00b3\u00b4\5_\60\2\u00b4\f\3\2\2\2\u00b5\u00b6\5g\64\2\u00b6"+
		"\u00b7\5q9\2\u00b7\u00b8\5{>\2\u00b8\u00b9\5_\60\2\u00b9\u00ba\5y=\2\u00ba"+
		"\u00bb\5}?\2\u00bb\u00bc\5o8\2\u00bc\u00bd\5W,\2\u00bd\u00be\5q9\2\u00be"+
		"\u00bf\5\u0087D\2\u00bf\16\3\2\2\2\u00c0\u00c1\5\177@\2\u00c1\u00c2\5"+
		"u;\2\u00c2\u00c3\5]/\2\u00c3\u00c4\5W,\2\u00c4\u00c5\5}?\2\u00c5\u00c6"+
		"\5_\60\2\u00c6\20\3\2\2\2\u00c7\u00c8\5\177@\2\u00c8\u00c9\5u;\2\u00c9"+
		"\u00ca\5]/\2\u00ca\u00cb\5W,\2\u00cb\u00cc\5}?\2\u00cc\u00cd\5_\60\2\u00cd"+
		"\u00ce\5o8\2\u00ce\u00cf\5W,\2\u00cf\u00d0\5q9\2\u00d0\u00d1\5\u0087D"+
		"\2\u00d1\22\3\2\2\2\u00d2\u00d3\5\177@\2\u00d3\u00d4\5u;\2\u00d4\u00d5"+
		"\5]/\2\u00d5\u00d6\5W,\2\u00d6\u00d7\5}?\2\u00d7\u00d8\5_\60\2\u00d8\u00d9"+
		"\5s:\2\u00d9\u00da\5q9\2\u00da\u00db\5_\60\2\u00db\24\3\2\2\2\u00dc\u00dd"+
		"\5]/\2\u00dd\u00de\5_\60\2\u00de\u00df\5m\67\2\u00df\u00e0\5_\60\2\u00e0"+
		"\u00e1\5}?\2\u00e1\u00e2\5_\60\2\u00e2\u00e3\5s:\2\u00e3\u00e4\5q9\2\u00e4"+
		"\u00e5\5_\60\2\u00e5\26\3\2\2\2\u00e6\u00e7\5]/\2\u00e7\u00e8\5_\60\2"+
		"\u00e8\u00e9\5m\67\2\u00e9\u00ea\5_\60\2\u00ea\u00eb\5}?\2\u00eb\u00ec"+
		"\5_\60\2\u00ec\u00ed\5o8\2\u00ed\u00ee\5W,\2\u00ee\u00ef\5q9\2\u00ef\u00f0"+
		"\5\u0087D\2\u00f0\30\3\2\2\2\u00f1\u00f2\5Q)\2\u00f2\32\3\2\2\2\u00f3"+
		"\u00f4\7a\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6\36\3\2\2\2\u00f7"+
		"\u00f8\7*\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7+\2\2\u00fa\"\3\2\2\2\u00fb"+
		"\u00fc\7]\2\2\u00fc$\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe&\3\2\2\2\u00ff\u0100"+
		"\7}\2\2\u0100(\3\2\2\2\u0101\u0102\7\177\2\2\u0102*\3\2\2\2\u0103\u0104"+
		"\7<\2\2\u0104,\3\2\2\2\u0105\u0106\7.\2\2\u0106.\3\2\2\2\u0107\u0108\7"+
		"v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7w\2\2\u010a\u010b\7g\2\2\u010b\60"+
		"\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7c\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7g\2\2\u0111\62\3\2\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7w\2\2\u0114\u0115\7n\2\2\u0115\u0116\7n\2\2\u0116\64\3\2\2\2\u0117"+
		"\u011c\7$\2\2\u0118\u011b\5\u008bF\2\u0119\u011b\n\3\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7$"+
		"\2\2\u0120\66\3\2\2\2\u0121\u0123\7/\2\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5\u0091I\2\u0125\u0127\7\60\2"+
		"\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\5\u0093J"+
		"\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0139\3\2\2\2\u012e\u0130"+
		"\7/\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\5\u0091I\2\u0132\u0133\5\u0093J\2\u0133\u0139\3\2\2\2\u0134\u0136"+
		"\7/\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\5\u0091I\2\u0138\u0122\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0135"+
		"\3\2\2\2\u01398\3\2\2\2\u013a\u013c\t\5\2\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\t\6\2\2\u013e\u0140\t\6"+
		"\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142:\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\5=\37\2"+
		"\u0145\u0147\7*\2\2\u0146\u0148\5? \2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7+\2\2\u014a<\3\2\2\2\u014b\u014c"+
		"\7p\2\2\u014c\u014d\7g\2\2\u014d\u014e\7y\2\2\u014e\u0150\7\"\2\2\u014f"+
		"\u014b\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0154\3\2\2\2\u0151\u0152\7K"+
		"\2\2\u0152\u0153\7U\2\2\u0153\u0155\7Q\2\2\u0154\u0151\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7F\2\2\u0157\u0158\7c\2\2\u0158"+
		"\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a>\3\2\2\2\u015b\u015c\7$\2\2\u015c"+
		"\u015d\5C\"\2\u015d\u015e\7/\2\2\u015e\u015f\5E#\2\u015f\u0160\7/\2\2"+
		"\u0160\u0161\5G$\2\u0161\u0162\5}?\2\u0162\u0163\5I%\2\u0163\u0164\7<"+
		"\2\2\u0164\u0165\5K&\2\u0165\u0166\7<\2\2\u0166\u0167\5M\'\2\u0167\u0168"+
		"\5A!\2\u0168\u0169\5\u0089E\2\u0169\u016a\7$\2\2\u016a@\3\2\2\2\u016b"+
		"\u016c\7\60\2\2\u016c\u016d\t\4\2\2\u016d\u016e\t\4\2\2\u016e\u0170\t"+
		"\4\2\2\u016f\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170B\3\2\2\2\u0171\u0172"+
		"\t\4\2\2\u0172\u0173\t\4\2\2\u0173\u0174\t\4\2\2\u0174\u0175\t\4\2\2\u0175"+
		"D\3\2\2\2\u0176\u0177\t\4\2\2\u0177\u0178\t\4\2\2\u0178F\3\2\2\2\u0179"+
		"\u017a\t\4\2\2\u017a\u017b\t\4\2\2\u017bH\3\2\2\2\u017c\u017d\t\4\2\2"+
		"\u017d\u017e\t\4\2\2\u017eJ\3\2\2\2\u017f\u0180\t\4\2\2\u0180\u0181\t"+
		"\4\2\2\u0181L\3\2\2\2\u0182\u0183\t\4\2\2\u0183\u0184\t\4\2\2\u0184N\3"+
		"\2\2\2\u0185\u0187\t\7\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018b\u018d\t\b\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0193\3\2\2\2\u0190\u0192\t\7"+
		"\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194P\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019a\t\t\2\2"+
		"\u0197\u0199\t\n\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a0\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019e\t\t\2\2\u019e\u01a0\n\13\2\2\u019f\u0196\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u01a0R\3\2\2\2\u01a1\u01a2\t\f\2\2\u01a2T\3\2\2\2\u01a3\u01a4\t"+
		"\r\2\2\u01a4V\3\2\2\2\u01a5\u01a6\t\16\2\2\u01a6X\3\2\2\2\u01a7\u01a8"+
		"\t\17\2\2\u01a8Z\3\2\2\2\u01a9\u01aa\t\20\2\2\u01aa\\\3\2\2\2\u01ab\u01ac"+
		"\t\21\2\2\u01ac^\3\2\2\2\u01ad\u01ae\t\22\2\2\u01ae`\3\2\2\2\u01af\u01b0"+
		"\t\23\2\2\u01b0b\3\2\2\2\u01b1\u01b2\t\24\2\2\u01b2d\3\2\2\2\u01b3\u01b4"+
		"\t\25\2\2\u01b4f\3\2\2\2\u01b5\u01b6\t\26\2\2\u01b6h\3\2\2\2\u01b7\u01b8"+
		"\t\27\2\2\u01b8j\3\2\2\2\u01b9\u01ba\t\30\2\2\u01bal\3\2\2\2\u01bb\u01bc"+
		"\t\31\2\2\u01bcn\3\2\2\2\u01bd\u01be\t\32\2\2\u01bep\3\2\2\2\u01bf\u01c0"+
		"\t\33\2\2\u01c0r\3\2\2\2\u01c1\u01c2\t\34\2\2\u01c2t\3\2\2\2\u01c3\u01c4"+
		"\t\35\2\2\u01c4v\3\2\2\2\u01c5\u01c6\t\36\2\2\u01c6x\3\2\2\2\u01c7\u01c8"+
		"\t\37\2\2\u01c8z\3\2\2\2\u01c9\u01ca\t \2\2\u01ca|\3\2\2\2\u01cb\u01cc"+
		"\t!\2\2\u01cc~\3\2\2\2\u01cd\u01ce\t\"\2\2\u01ce\u0080\3\2\2\2\u01cf\u01d0"+
		"\t#\2\2\u01d0\u0082\3\2\2\2\u01d1\u01d2\t$\2\2\u01d2\u0084\3\2\2\2\u01d3"+
		"\u01d4\t%\2\2\u01d4\u0086\3\2\2\2\u01d5\u01d6\t&\2\2\u01d6\u0088\3\2\2"+
		"\2\u01d7\u01d8\t\'\2\2\u01d8\u008a\3\2\2\2\u01d9\u01dc\7^\2\2\u01da\u01dd"+
		"\t(\2\2\u01db\u01dd\5\u008dG\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2"+
		"\u01dd\u008c\3\2\2\2\u01de\u01df\7w\2\2\u01df\u01e0\5\u008fH\2\u01e0\u01e1"+
		"\5\u008fH\2\u01e1\u01e2\5\u008fH\2\u01e2\u01e3\5\u008fH\2\u01e3\u008e"+
		"\3\2\2\2\u01e4\u01e5\t\r\2\2\u01e5\u0090\3\2\2\2\u01e6\u01ef\7\62\2\2"+
		"\u01e7\u01eb\t)\2\2\u01e8\u01ea\t\4\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01e6\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ef\u0092\3\2"+
		"\2\2\u01f0\u01f2\t\22\2\2\u01f1\u01f3\t*\2\2\u01f2\u01f1\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\5\u0091I\2\u01f5\u0094"+
		"\3\2\2\2\33\2\u0098\u011a\u011c\u0122\u0129\u012c\u012f\u0135\u0138\u013b"+
		"\u0141\u0147\u014f\u0154\u016f\u0188\u018e\u0193\u019a\u019f\u01dc\u01eb"+
		"\u01ee\u01f2\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}