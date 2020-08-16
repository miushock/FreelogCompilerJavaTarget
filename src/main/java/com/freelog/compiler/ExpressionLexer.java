// Generated from .\target\generated_grammar\Expression.g4 by ANTLR 4.8
package com.freelog.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELF=1, TERMINATE=2, SUBJECT_ID=3, UOID=4, ACCOUNT_NUMBER=5, SUBJECT_SERVICE_NAME=6, 
		EVENT_SERVICE_NAME=7, ANY_CONTRACT=8, WITH=9, OF=10, USER_ID=11, FEATHER=12, 
		BARB=13, INT=14, MONEY_AMOUNT=15, TIME=16, DATE=17, PHONE_NUMBER_CN_MOBILE=18, 
		EMAIL=19, PERIOD=20, ID=21, WS=22, LPAREN=23, RPAREN=24, PLUS=25, MINUS=26, 
		TIMES=27, DIV=28, GT=29, LT=30, EQ=31, COMMA=32, POINT=33, POW=34, PI=35, 
		SCIENTIFIC_NUMBER=36, EULER=37, SUM=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELF", "TERMINATE", "SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", 
			"EVENT_SERVICE_NAME", "ANY_CONTRACT", "WITH", "OF", "USER_ID", "FEATHER", 
			"BARB", "INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", 
			"EMAIL", "LOCAL_SUBPART", "DOMAIN_SUBPART", "PERIOD", "TWO_DIGITS", "THREE_DIGITS", 
			"FOUR_DIGITS", "NIGHT_DIGITS", "ELEVEN_DIGITS", "ID", "WS", "DIGIT", 
			"ALPHABET", "HEX_DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", 
			"LT", "EQ", "COMMA", "POINT", "POW", "PI", "SCIENTIFIC_NUMBER", "EULER", 
			"SUM", "NUMBER", "SIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'self'", "'terminate'", null, null, null, null, null, "'AnyContract'", 
			"'with'", "'of'", null, "'feather'", "'barb'", null, null, null, null, 
			null, null, null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", null, "'e'", "'sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELF", "TERMINATE", "SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", 
			"EVENT_SERVICE_NAME", "ANY_CONTRACT", "WITH", "OF", "USER_ID", "FEATHER", 
			"BARB", "INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", 
			"EMAIL", "PERIOD", "ID", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
			"DIV", "GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "SCIENTIFIC_NUMBER", 
			"EULER", "SUM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u01e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\u00ad\n\4\r\4\16\4\u00ae\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\6\6\u00b7\n\6\r\6\16\6\u00b8\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\6\17\u00e7\n\17\r\17\16\17\u00e8\3\20\3\20\6\20"+
		"\u00ed\n\20\r\20\16\20\u00ee\3\20\3\20\3\20\5\20\u00f4\n\20\5\20\u00f6"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00fd\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u010a\n\24\f\24\16\24\u010d\13\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0113\n\24\f\24\16\24\u0116\13\24\3\25\6\25"+
		"\u0119\n\25\r\25\16\25\u011a\3\26\6\26\u011e\n\26\r\26\16\26\u011f\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012d\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0138\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0145\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0150\n\27\5\27\u0152\n\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\7\35\u0169\n\35\f\35\16\35\u016c\13\35\3"+
		"\36\6\36\u016f\n\36\r\36\16\36\u0170\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3"+
		"I\5I\u01cd\nI\3I\5I\u01d0\nI\3J\3J\3K\3K\3K\3K\3L\6L\u01d9\nL\rL\16L\u01da"+
		"\3L\3L\6L\u01df\nL\rL\16L\u01e0\5L\u01e3\nL\3M\3M\2\2N\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\2+\2-\26/\2\61\2\63\2\65\2\67\29\27;\30=\2?\2A\2C\2E\2G\2I\2K\2"+
		"M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\31y\32"+
		"{\33}\34\177\35\u0081\36\u0083\37\u0085 \u0087!\u0089\"\u008b#\u008d$"+
		"\u008f%\u0091&\u0093\'\u0095(\u0097\2\u0099\2\3\2$\f\2##&&((*/\62=??C"+
		"\\aac|\u0080\u0080\6\2//\62;C\\c|\4\2//aa\5\2\13\f\17\17\"\"\3\2\62;\4"+
		"\2C\\c|\5\2\62;CHch\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\4\2--//\2\u01dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u009b\3\2\2\2\5\u00a0"+
		"\3\2\2\2\7\u00aa\3\2\2\2\t\u00b0\3\2\2\2\13\u00b3\3\2\2\2\r\u00ba\3\2"+
		"\2\2\17\u00bd\3\2\2\2\21\u00c0\3\2\2\2\23\u00cc\3\2\2\2\25\u00d1\3\2\2"+
		"\2\27\u00d6\3\2\2\2\31\u00d8\3\2\2\2\33\u00e0\3\2\2\2\35\u00e6\3\2\2\2"+
		"\37\u00ea\3\2\2\2!\u00f7\3\2\2\2#\u00fe\3\2\2\2%\u0104\3\2\2\2\'\u0106"+
		"\3\2\2\2)\u0118\3\2\2\2+\u011d\3\2\2\2-\u0151\3\2\2\2/\u0153\3\2\2\2\61"+
		"\u0156\3\2\2\2\63\u0159\3\2\2\2\65\u015c\3\2\2\2\67\u0160\3\2\2\29\u0164"+
		"\3\2\2\2;\u016e\3\2\2\2=\u0174\3\2\2\2?\u0176\3\2\2\2A\u0178\3\2\2\2C"+
		"\u017a\3\2\2\2E\u017c\3\2\2\2G\u017e\3\2\2\2I\u0180\3\2\2\2K\u0182\3\2"+
		"\2\2M\u0184\3\2\2\2O\u0186\3\2\2\2Q\u0188\3\2\2\2S\u018a\3\2\2\2U\u018c"+
		"\3\2\2\2W\u018e\3\2\2\2Y\u0190\3\2\2\2[\u0192\3\2\2\2]\u0194\3\2\2\2_"+
		"\u0196\3\2\2\2a\u0198\3\2\2\2c\u019a\3\2\2\2e\u019c\3\2\2\2g\u019e\3\2"+
		"\2\2i\u01a0\3\2\2\2k\u01a2\3\2\2\2m\u01a4\3\2\2\2o\u01a6\3\2\2\2q\u01a8"+
		"\3\2\2\2s\u01aa\3\2\2\2u\u01ac\3\2\2\2w\u01ae\3\2\2\2y\u01b0\3\2\2\2{"+
		"\u01b2\3\2\2\2}\u01b4\3\2\2\2\177\u01b6\3\2\2\2\u0081\u01b8\3\2\2\2\u0083"+
		"\u01ba\3\2\2\2\u0085\u01bc\3\2\2\2\u0087\u01be\3\2\2\2\u0089\u01c0\3\2"+
		"\2\2\u008b\u01c2\3\2\2\2\u008d\u01c4\3\2\2\2\u008f\u01c6\3\2\2\2\u0091"+
		"\u01c9\3\2\2\2\u0093\u01d1\3\2\2\2\u0095\u01d3\3\2\2\2\u0097\u01d8\3\2"+
		"\2\2\u0099\u01e4\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7h\2\2\u009f\4\3\2\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\6\3\2\2\2\u00aa\u00ac\7,\2\2\u00ab\u00ad\5A!\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\b\3\2\2\2\u00b0\u00b1\7B\2\2\u00b1\u00b2\59\35\2\u00b2\n\3\2\2\2\u00b3"+
		"\u00b6\7%\2\2\u00b4\u00b7\5? \2\u00b5\u00b7\5=\37\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\f\3\2\2\2\u00ba\u00bb\7`\2\2\u00bb\u00bc\59\35\2\u00bc"+
		"\16\3\2\2\2\u00bd\u00be\7\u0080\2\2\u00be\u00bf\59\35\2\u00bf\20\3\2\2"+
		"\2\u00c0\u00c1\7C\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7{\2\2\u00c3\u00c4"+
		"\7E\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7v\2\2"+
		"\u00cb\22\3\2\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7"+
		"v\2\2\u00cf\u00d0\7j\2\2\u00d0\24\3\2\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7h\2\2\u00d3\26\3\2\2\2\u00d4\u00d7\5%\23\2\u00d5\u00d7\5\'\24\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\30\3\2\2\2\u00d8\u00d9\7h\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7j\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\32\3\2\2\2\u00e0\u00e1"+
		"\7d\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7d\2\2\u00e4"+
		"\34\3\2\2\2\u00e5\u00e7\5=\37\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\36\3\2\2\2\u00ea\u00ec"+
		"\7&\2\2\u00eb\u00ed\5=\37\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f5\3\2\2\2\u00f0\u00f1\7\60"+
		"\2\2\u00f1\u00f3\5=\37\2\u00f2\u00f4\5=\37\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6 \3\2\2\2\u00f7\u00f8\5/\30\2\u00f8\u00f9\7<\2\2\u00f9\u00fc"+
		"\5/\30\2\u00fa\u00fb\7<\2\2\u00fb\u00fd\5/\30\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\"\3\2\2\2\u00fe\u00ff\5\63\32\2\u00ff\u0100\7/\2"+
		"\2\u0100\u0101\5/\30\2\u0101\u0102\7/\2\2\u0102\u0103\5/\30\2\u0103$\3"+
		"\2\2\2\u0104\u0105\5\67\34\2\u0105&\3\2\2\2\u0106\u010b\5)\25\2\u0107"+
		"\u0108\7\60\2\2\u0108\u010a\5)\25\2\u0109\u0107\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7B\2\2\u010f\u0114\5+\26\2\u0110\u0111\7\60"+
		"\2\2\u0111\u0113\5+\26\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115(\3\2\2\2\u0116\u0114\3\2\2\2"+
		"\u0117\u0119\t\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b*\3\2\2\2\u011c\u011e\t\3\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120,\3\2\2\2\u0121\u0122\7e\2\2\u0122\u0123\7{\2\2\u0123\u0124"+
		"\7e\2\2\u0124\u0125\7n\2\2\u0125\u012d\7g\2\2\u0126\u0127\7e\2\2\u0127"+
		"\u0128\7{\2\2\u0128\u0129\7e\2\2\u0129\u012a\7n\2\2\u012a\u012b\7g\2\2"+
		"\u012b\u012d\7u\2\2\u012c\u0121\3\2\2\2\u012c\u0126\3\2\2\2\u012d\u0152"+
		"\3\2\2\2\u012e\u012f\7y\2\2\u012f\u0130\7g\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0138\7m\2\2\u0132\u0133\7y\2\2\u0133\u0134\7g\2\2\u0134\u0135\7g\2\2"+
		"\u0135\u0136\7m\2\2\u0136\u0138\7u\2\2\u0137\u012e\3\2\2\2\u0137\u0132"+
		"\3\2\2\2\u0138\u0152\3\2\2\2\u0139\u013a\7o\2\2\u013a\u013b\7q\2\2\u013b"+
		"\u013c\7p\2\2\u013c\u013d\7v\2\2\u013d\u0145\7j\2\2\u013e\u013f\7o\2\2"+
		"\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7j\2\2\u0143\u0145\7u\2\2\u0144\u0139\3\2\2\2\u0144\u013e\3\2\2\2\u0145"+
		"\u0152\3\2\2\2\u0146\u0147\7{\2\2\u0147\u0148\7g\2\2\u0148\u0149\7c\2"+
		"\2\u0149\u0150\7t\2\2\u014a\u014b\7{\2\2\u014b\u014c\7g\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7t\2\2\u014e\u0150\7u\2\2\u014f\u0146\3\2\2\2\u014f"+
		"\u014a\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u012c\3\2\2\2\u0151\u0137\3\2"+
		"\2\2\u0151\u0144\3\2\2\2\u0151\u014f\3\2\2\2\u0152.\3\2\2\2\u0153\u0154"+
		"\5=\37\2\u0154\u0155\5=\37\2\u0155\60\3\2\2\2\u0156\u0157\5/\30\2\u0157"+
		"\u0158\5=\37\2\u0158\62\3\2\2\2\u0159\u015a\5/\30\2\u015a\u015b\5/\30"+
		"\2\u015b\64\3\2\2\2\u015c\u015d\5\63\32\2\u015d\u015e\5\63\32\2\u015e"+
		"\u015f\5=\37\2\u015f\66\3\2\2\2\u0160\u0161\5\63\32\2\u0161\u0162\5\63"+
		"\32\2\u0162\u0163\5\61\31\2\u01638\3\2\2\2\u0164\u016a\5? \2\u0165\u0169"+
		"\5? \2\u0166\u0169\5\35\17\2\u0167\u0169\t\4\2\2\u0168\u0165\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b:\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f"+
		"\t\5\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\36\2\2\u0173<\3\2\2\2"+
		"\u0174\u0175\t\6\2\2\u0175>\3\2\2\2\u0176\u0177\t\7\2\2\u0177@\3\2\2\2"+
		"\u0178\u0179\t\b\2\2\u0179B\3\2\2\2\u017a\u017b\t\t\2\2\u017bD\3\2\2\2"+
		"\u017c\u017d\t\n\2\2\u017dF\3\2\2\2\u017e\u017f\t\13\2\2\u017fH\3\2\2"+
		"\2\u0180\u0181\t\f\2\2\u0181J\3\2\2\2\u0182\u0183\t\r\2\2\u0183L\3\2\2"+
		"\2\u0184\u0185\t\16\2\2\u0185N\3\2\2\2\u0186\u0187\t\17\2\2\u0187P\3\2"+
		"\2\2\u0188\u0189\t\20\2\2\u0189R\3\2\2\2\u018a\u018b\t\21\2\2\u018bT\3"+
		"\2\2\2\u018c\u018d\t\22\2\2\u018dV\3\2\2\2\u018e\u018f\t\23\2\2\u018f"+
		"X\3\2\2\2\u0190\u0191\t\24\2\2\u0191Z\3\2\2\2\u0192\u0193\t\25\2\2\u0193"+
		"\\\3\2\2\2\u0194\u0195\t\26\2\2\u0195^\3\2\2\2\u0196\u0197\t\27\2\2\u0197"+
		"`\3\2\2\2\u0198\u0199\t\30\2\2\u0199b\3\2\2\2\u019a\u019b\t\31\2\2\u019b"+
		"d\3\2\2\2\u019c\u019d\t\32\2\2\u019df\3\2\2\2\u019e\u019f\t\33\2\2\u019f"+
		"h\3\2\2\2\u01a0\u01a1\t\34\2\2\u01a1j\3\2\2\2\u01a2\u01a3\t\35\2\2\u01a3"+
		"l\3\2\2\2\u01a4\u01a5\t\36\2\2\u01a5n\3\2\2\2\u01a6\u01a7\t\37\2\2\u01a7"+
		"p\3\2\2\2\u01a8\u01a9\t \2\2\u01a9r\3\2\2\2\u01aa\u01ab\t!\2\2\u01abt"+
		"\3\2\2\2\u01ac\u01ad\t\"\2\2\u01adv\3\2\2\2\u01ae\u01af\7*\2\2\u01afx"+
		"\3\2\2\2\u01b0\u01b1\7+\2\2\u01b1z\3\2\2\2\u01b2\u01b3\7-\2\2\u01b3|\3"+
		"\2\2\2\u01b4\u01b5\7/\2\2\u01b5~\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7\u0080"+
		"\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9\u0082\3\2\2\2\u01ba\u01bb\7@\2\2\u01bb"+
		"\u0084\3\2\2\2\u01bc\u01bd\7>\2\2\u01bd\u0086\3\2\2\2\u01be\u01bf\7?\2"+
		"\2\u01bf\u0088\3\2\2\2\u01c0\u01c1\7.\2\2\u01c1\u008a\3\2\2\2\u01c2\u01c3"+
		"\7\60\2\2\u01c3\u008c\3\2\2\2\u01c4\u01c5\7`\2\2\u01c5\u008e\3\2\2\2\u01c6"+
		"\u01c7\7r\2\2\u01c7\u01c8\7k\2\2\u01c8\u0090\3\2\2\2\u01c9\u01cf\5\u0097"+
		"L\2\u01ca\u01cc\t\r\2\2\u01cb\u01cd\5\u0099M\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\5\u0097L\2\u01cf\u01ca"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u0092\3\2\2\2\u01d1\u01d2\7g\2\2\u01d2"+
		"\u0094\3\2\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7w\2\2\u01d5\u01d6\7o\2"+
		"\2\u01d6\u0096\3\2\2\2\u01d7\u01d9\4\62;\2\u01d8\u01d7\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01e2\3\2\2\2\u01dc"+
		"\u01de\7\60\2\2\u01dd\u01df\4\62;\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01dc\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u0098\3\2\2\2\u01e4\u01e5\t#"+
		"\2\2\u01e5\u009a\3\2\2\2\35\2\u00ae\u00b6\u00b8\u00d6\u00e8\u00ee\u00f3"+
		"\u00f5\u00fc\u010b\u0114\u011a\u011f\u012c\u0137\u0144\u014f\u0151\u0168"+
		"\u016a\u0170\u01cc\u01cf\u01da\u01e0\u01e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}