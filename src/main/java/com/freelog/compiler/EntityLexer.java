// Generated from .\target\generated_grammar\Entity.g4 by ANTLR 4.8
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
public class EntityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELF=2, TERMINATE=3, SUBJECT_ID=4, UOID=5, ACCOUNT_NUMBER=6, SUBJECT_SERVICE_NAME=7, 
		EVENT_SERVICE_NAME=8, ANY_CONTRACT=9, WITH=10, OF=11, USER_ID=12, FEATHER=13, 
		BARB=14, INT=15, MONEY_AMOUNT=16, TIME=17, DATE=18, PHONE_NUMBER_CN_MOBILE=19, 
		EMAIL=20, PERIOD=21, ID=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "SELF", "TERMINATE", "SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", 
			"SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", "ANY_CONTRACT", "WITH", 
			"OF", "USER_ID", "FEATHER", "BARB", "INT", "MONEY_AMOUNT", "TIME", "DATE", 
			"PHONE_NUMBER_CN_MOBILE", "EMAIL", "LOCAL_SUBPART", "DOMAIN_SUBPART", 
			"PERIOD", "TWO_DIGITS", "THREE_DIGITS", "FOUR_DIGITS", "NIGHT_DIGITS", 
			"ELEVEN_DIGITS", "ID", "WS", "DIGIT", "ALPHABET", "HEX_DIGIT", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'self'", "'terminate'", null, null, null, null, null, "'AnyContract'", 
			"'with'", "'of'", null, "'feather'", "'barb'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELF", "TERMINATE", "SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", 
			"SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", "ANY_CONTRACT", "WITH", 
			"OF", "USER_ID", "FEATHER", "BARB", "INT", "MONEY_AMOUNT", "TIME", "DATE", 
			"PHONE_NUMBER_CN_MOBILE", "EMAIL", "PERIOD", "ID", "WS"
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


	public EntityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Entity.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u018e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\6\5\u008d\n\5\r\5\16\5\u008e\3\6\3\6\3\6\3\7\3\7\3\7\6\7\u0097\n\7"+
		"\r\7\16\7\u0098\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\5\r\u00b7"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\6\20\u00c7\n\20\r\20\16\20\u00c8\3\21\3\21\6\21\u00cd\n\21\r\21"+
		"\16\21\u00ce\3\21\3\21\3\21\5\21\u00d4\n\21\5\21\u00d6\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00dd\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u00ea\n\25\f\25\16\25\u00ed\13\25\3\25\3\25\3\25"+
		"\3\25\7\25\u00f3\n\25\f\25\16\25\u00f6\13\25\3\26\6\26\u00f9\n\26\r\26"+
		"\16\26\u00fa\3\27\6\27\u00fe\n\27\r\27\16\27\u00ff\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010d\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0118\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0125\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0130\n\30\5\30\u0132\n\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\7\36\u0149\n\36\f\36\16\36\u014c\13\36\3\37\6\37\u014f\n"+
		"\37\r\37\16\37\u0150\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\27"+
		"\61\2\63\2\65\2\67\29\2;\30=\31?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2"+
		"Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2\3\2#\f\2##&&((*/\62="+
		"??C\\aac|\u0080\u0080\6\2//\62;C\\c|\4\2//aa\5\2\13\f\17\17\"\"\3\2\62"+
		";\4\2C\\c|\5\2\62;CHch\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHh"+
		"h\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\2\u0181\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2/\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7\u0080\3\2\2"+
		"\2\t\u008a\3\2\2\2\13\u0090\3\2\2\2\r\u0093\3\2\2\2\17\u009a\3\2\2\2\21"+
		"\u009d\3\2\2\2\23\u00a0\3\2\2\2\25\u00ac\3\2\2\2\27\u00b1\3\2\2\2\31\u00b6"+
		"\3\2\2\2\33\u00b8\3\2\2\2\35\u00c0\3\2\2\2\37\u00c6\3\2\2\2!\u00ca\3\2"+
		"\2\2#\u00d7\3\2\2\2%\u00de\3\2\2\2\'\u00e4\3\2\2\2)\u00e6\3\2\2\2+\u00f8"+
		"\3\2\2\2-\u00fd\3\2\2\2/\u0131\3\2\2\2\61\u0133\3\2\2\2\63\u0136\3\2\2"+
		"\2\65\u0139\3\2\2\2\67\u013c\3\2\2\29\u0140\3\2\2\2;\u0144\3\2\2\2=\u014e"+
		"\3\2\2\2?\u0154\3\2\2\2A\u0156\3\2\2\2C\u0158\3\2\2\2E\u015a\3\2\2\2G"+
		"\u015c\3\2\2\2I\u015e\3\2\2\2K\u0160\3\2\2\2M\u0162\3\2\2\2O\u0164\3\2"+
		"\2\2Q\u0166\3\2\2\2S\u0168\3\2\2\2U\u016a\3\2\2\2W\u016c\3\2\2\2Y\u016e"+
		"\3\2\2\2[\u0170\3\2\2\2]\u0172\3\2\2\2_\u0174\3\2\2\2a\u0176\3\2\2\2c"+
		"\u0178\3\2\2\2e\u017a\3\2\2\2g\u017c\3\2\2\2i\u017e\3\2\2\2k\u0180\3\2"+
		"\2\2m\u0182\3\2\2\2o\u0184\3\2\2\2q\u0186\3\2\2\2s\u0188\3\2\2\2u\u018a"+
		"\3\2\2\2w\u018c\3\2\2\2yz\7\60\2\2z\4\3\2\2\2{|\7u\2\2|}\7g\2\2}~\7n\2"+
		"\2~\177\7h\2\2\177\6\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7o\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2"+
		"\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\b\3\2"+
		"\2\2\u008a\u008c\7,\2\2\u008b\u008d\5C\"\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\n\3\2\2\2\u0090"+
		"\u0091\7B\2\2\u0091\u0092\5;\36\2\u0092\f\3\2\2\2\u0093\u0096\7%\2\2\u0094"+
		"\u0097\5A!\2\u0095\u0097\5? \2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\16"+
		"\3\2\2\2\u009a\u009b\7`\2\2\u009b\u009c\5;\36\2\u009c\20\3\2\2\2\u009d"+
		"\u009e\7\u0080\2\2\u009e\u009f\5;\36\2\u009f\22\3\2\2\2\u00a0\u00a1\7"+
		"C\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7{\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7v\2\2\u00ab\24\3\2\2\2\u00ac"+
		"\u00ad\7y\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7j\2\2"+
		"\u00b0\26\3\2\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7h\2\2\u00b3\30\3\2\2"+
		"\2\u00b4\u00b7\5\'\24\2\u00b5\u00b7\5)\25\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\u00bb\7c\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7t\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7d\2\2\u00c4\36\3\2\2\2\u00c5\u00c7"+
		"\5? \2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9 \3\2\2\2\u00ca\u00cc\7&\2\2\u00cb\u00cd\5? \2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d3\5? \2\u00d2"+
		"\u00d4\5? \2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2"+
		"\2\u00d5\u00d0\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\"\3\2\2\2\u00d7\u00d8"+
		"\5\61\31\2\u00d8\u00d9\7<\2\2\u00d9\u00dc\5\61\31\2\u00da\u00db\7<\2\2"+
		"\u00db\u00dd\5\61\31\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd$"+
		"\3\2\2\2\u00de\u00df\5\65\33\2\u00df\u00e0\7/\2\2\u00e0\u00e1\5\61\31"+
		"\2\u00e1\u00e2\7/\2\2\u00e2\u00e3\5\61\31\2\u00e3&\3\2\2\2\u00e4\u00e5"+
		"\59\35\2\u00e5(\3\2\2\2\u00e6\u00eb\5+\26\2\u00e7\u00e8\7\60\2\2\u00e8"+
		"\u00ea\5+\26\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7B\2\2\u00ef\u00f4\5-\27\2\u00f0\u00f1\7\60\2\2\u00f1\u00f3\5-"+
		"\27\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5*\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\t\2\2\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb,\3\2\2\2\u00fc\u00fe\t\3\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100.\3\2\2\2"+
		"\u0101\u0102\7e\2\2\u0102\u0103\7{\2\2\u0103\u0104\7e\2\2\u0104\u0105"+
		"\7n\2\2\u0105\u010d\7g\2\2\u0106\u0107\7e\2\2\u0107\u0108\7{\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b\u010d\7u\2\2"+
		"\u010c\u0101\3\2\2\2\u010c\u0106\3\2\2\2\u010d\u0132\3\2\2\2\u010e\u010f"+
		"\7y\2\2\u010f\u0110\7g\2\2\u0110\u0111\7g\2\2\u0111\u0118\7m\2\2\u0112"+
		"\u0113\7y\2\2\u0113\u0114\7g\2\2\u0114\u0115\7g\2\2\u0115\u0116\7m\2\2"+
		"\u0116\u0118\7u\2\2\u0117\u010e\3\2\2\2\u0117\u0112\3\2\2\2\u0118\u0132"+
		"\3\2\2\2\u0119\u011a\7o\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u011d\7v\2\2\u011d\u0125\7j\2\2\u011e\u011f\7o\2\2\u011f\u0120\7q\2\2"+
		"\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123\7j\2\2\u0123\u0125"+
		"\7u\2\2\u0124\u0119\3\2\2\2\u0124\u011e\3\2\2\2\u0125\u0132\3\2\2\2\u0126"+
		"\u0127\7{\2\2\u0127\u0128\7g\2\2\u0128\u0129\7c\2\2\u0129\u0130\7t\2\2"+
		"\u012a\u012b\7{\2\2\u012b\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u0130\7u\2\2\u012f\u0126\3\2\2\2\u012f\u012a\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u010c\3\2\2\2\u0131\u0117\3\2\2\2\u0131\u0124\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\60\3\2\2\2\u0133\u0134\5? \2\u0134\u0135"+
		"\5? \2\u0135\62\3\2\2\2\u0136\u0137\5\61\31\2\u0137\u0138\5? \2\u0138"+
		"\64\3\2\2\2\u0139\u013a\5\61\31\2\u013a\u013b\5\61\31\2\u013b\66\3\2\2"+
		"\2\u013c\u013d\5\65\33\2\u013d\u013e\5\65\33\2\u013e\u013f\5? \2\u013f"+
		"8\3\2\2\2\u0140\u0141\5\65\33\2\u0141\u0142\5\65\33\2\u0142\u0143\5\63"+
		"\32\2\u0143:\3\2\2\2\u0144\u014a\5A!\2\u0145\u0149\5A!\2\u0146\u0149\5"+
		"\37\20\2\u0147\u0149\t\4\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b<\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\t\5\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\b\37\2\2\u0153>\3\2\2\2\u0154\u0155\t\6\2\2"+
		"\u0155@\3\2\2\2\u0156\u0157\t\7\2\2\u0157B\3\2\2\2\u0158\u0159\t\b\2\2"+
		"\u0159D\3\2\2\2\u015a\u015b\t\t\2\2\u015bF\3\2\2\2\u015c\u015d\t\n\2\2"+
		"\u015dH\3\2\2\2\u015e\u015f\t\13\2\2\u015fJ\3\2\2\2\u0160\u0161\t\f\2"+
		"\2\u0161L\3\2\2\2\u0162\u0163\t\r\2\2\u0163N\3\2\2\2\u0164\u0165\t\16"+
		"\2\2\u0165P\3\2\2\2\u0166\u0167\t\17\2\2\u0167R\3\2\2\2\u0168\u0169\t"+
		"\20\2\2\u0169T\3\2\2\2\u016a\u016b\t\21\2\2\u016bV\3\2\2\2\u016c\u016d"+
		"\t\22\2\2\u016dX\3\2\2\2\u016e\u016f\t\23\2\2\u016fZ\3\2\2\2\u0170\u0171"+
		"\t\24\2\2\u0171\\\3\2\2\2\u0172\u0173\t\25\2\2\u0173^\3\2\2\2\u0174\u0175"+
		"\t\26\2\2\u0175`\3\2\2\2\u0176\u0177\t\27\2\2\u0177b\3\2\2\2\u0178\u0179"+
		"\t\30\2\2\u0179d\3\2\2\2\u017a\u017b\t\31\2\2\u017bf\3\2\2\2\u017c\u017d"+
		"\t\32\2\2\u017dh\3\2\2\2\u017e\u017f\t\33\2\2\u017fj\3\2\2\2\u0180\u0181"+
		"\t\34\2\2\u0181l\3\2\2\2\u0182\u0183\t\35\2\2\u0183n\3\2\2\2\u0184\u0185"+
		"\t\36\2\2\u0185p\3\2\2\2\u0186\u0187\t\37\2\2\u0187r\3\2\2\2\u0188\u0189"+
		"\t \2\2\u0189t\3\2\2\2\u018a\u018b\t!\2\2\u018bv\3\2\2\2\u018c\u018d\t"+
		"\"\2\2\u018dx\3\2\2\2\30\2\u008e\u0096\u0098\u00b6\u00c8\u00ce\u00d3\u00d5"+
		"\u00dc\u00eb\u00f4\u00fa\u00ff\u010c\u0117\u0124\u012f\u0131\u0148\u014a"+
		"\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}