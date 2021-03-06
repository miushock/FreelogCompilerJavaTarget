// Generated from ./target/generated_grammar/ResourcePolicy.g4 by ANTLR 4.8
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
public class ResourcePolicyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELF=8, TERMINATE=9, 
		SUBJECT_ID=10, UOID=11, ACCOUNT_NUMBER=12, SUBJECT_SERVICE_NAME=13, EVENT_SERVICE_NAME=14, 
		ANY_CONTRACT=15, WITH=16, OF=17, REQUIRE=18, USER_ID=19, FEATHER=20, BARB=21, 
		INT=22, MONEY_AMOUNT=23, TIME=24, DATE=25, PHONE_NUMBER_CN_MOBILE=26, 
		EMAIL=27, PERIOD=28, ID=29, WS=30, LPAREN=31, RPAREN=32, PLUS=33, MINUS=34, 
		TIMES=35, DIV=36, GT=37, LT=38, EQ=39, COMMA=40, POINT=41, POW=42, PI=43, 
		SCIENTIFIC_NUMBER=44, EULER=45, SUM=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SELF", "TERMINATE", 
			"SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", 
			"ANY_CONTRACT", "WITH", "OF", "REQUIRE", "USER_ID", "FEATHER", "BARB", 
			"INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", "EMAIL", 
			"LOCAL_SUBPART", "DOMAIN_SUBPART", "PERIOD", "TWO_DIGITS", "THREE_DIGITS", 
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
			null, "'contract'", "':'", "'proceed'", "'to'", "'on'", "'authorized'", 
			"'unauthorized'", "'self'", "'terminate'", null, null, null, null, null, 
			"'AnyContract'", "'with'", "'of'", "'require'", null, "'feather'", "'barb'", 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", 
			null, "'e'", "'sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SELF", "TERMINATE", 
			"SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", 
			"ANY_CONTRACT", "WITH", "OF", "REQUIRE", "USER_ID", "FEATHER", "BARB", 
			"INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", "EMAIL", 
			"PERIOD", "ID", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "SCIENTIFIC_NUMBER", 
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


	public ResourcePolicyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ResourcePolicy.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u022f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13"+
		"\u00ee\n\13\r\13\16\13\u00ef\3\f\3\f\3\f\3\r\3\r\3\r\6\r\u00f8\n\r\r\r"+
		"\16\r\u00f9\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0120\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\6\27"+
		"\u0130\n\27\r\27\16\27\u0131\3\30\3\30\6\30\u0136\n\30\r\30\16\30\u0137"+
		"\3\30\3\30\3\30\5\30\u013d\n\30\5\30\u013f\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u0146\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\7\34\u0153\n\34\f\34\16\34\u0156\13\34\3\34\3\34\3\34\3\34\7\34"+
		"\u015c\n\34\f\34\16\34\u015f\13\34\3\35\6\35\u0162\n\35\r\35\16\35\u0163"+
		"\3\36\6\36\u0167\n\36\r\36\16\36\u0168\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0176\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0181\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u018e\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0199\n\37\5\37\u019b\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\7%\u01b2\n%\f%\16%\u01b5\13%\3&\6&"+
		"\u01b8\n&\r&\16&\u01b9\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3"+
		"J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\5Q\u0216\nQ\3Q\5Q\u0219"+
		"\nQ\3R\3R\3S\3S\3S\3S\3T\6T\u0222\nT\rT\16T\u0223\3T\3T\6T\u0228\nT\r"+
		"T\16T\u0229\5T\u022c\nT\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\2;\2=\36?\2A\2C\2E\2G\2I\37K M\2O\2Q\2S"+
		"\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087!\u0089\"\u008b#\u008d$\u008f%\u0091&"+
		"\u0093\'\u0095(\u0097)\u0099*\u009b+\u009d,\u009f-\u00a1.\u00a3/\u00a5"+
		"\60\u00a7\2\u00a9\2\3\2$\f\2##&&((*/\62=??C\\aac|\u0080\u0080\6\2//\62"+
		";C\\c|\4\2//aa\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\5\2\62;CHch\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2-"+
		"-//\2\u0225\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2"+
		"\2\2\2I\3\2\2\2\2K\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2"+
		"\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2"+
		"\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\3\u00ab\3\2\2\2\5\u00b4\3\2\2\2\7\u00b6\3\2\2\2\t\u00be\3\2\2\2\13"+
		"\u00c1\3\2\2\2\r\u00c4\3\2\2\2\17\u00cf\3\2\2\2\21\u00dc\3\2\2\2\23\u00e1"+
		"\3\2\2\2\25\u00eb\3\2\2\2\27\u00f1\3\2\2\2\31\u00f4\3\2\2\2\33\u00fb\3"+
		"\2\2\2\35\u00fe\3\2\2\2\37\u0101\3\2\2\2!\u010d\3\2\2\2#\u0112\3\2\2\2"+
		"%\u0115\3\2\2\2\'\u011f\3\2\2\2)\u0121\3\2\2\2+\u0129\3\2\2\2-\u012f\3"+
		"\2\2\2/\u0133\3\2\2\2\61\u0140\3\2\2\2\63\u0147\3\2\2\2\65\u014d\3\2\2"+
		"\2\67\u014f\3\2\2\29\u0161\3\2\2\2;\u0166\3\2\2\2=\u019a\3\2\2\2?\u019c"+
		"\3\2\2\2A\u019f\3\2\2\2C\u01a2\3\2\2\2E\u01a5\3\2\2\2G\u01a9\3\2\2\2I"+
		"\u01ad\3\2\2\2K\u01b7\3\2\2\2M\u01bd\3\2\2\2O\u01bf\3\2\2\2Q\u01c1\3\2"+
		"\2\2S\u01c3\3\2\2\2U\u01c5\3\2\2\2W\u01c7\3\2\2\2Y\u01c9\3\2\2\2[\u01cb"+
		"\3\2\2\2]\u01cd\3\2\2\2_\u01cf\3\2\2\2a\u01d1\3\2\2\2c\u01d3\3\2\2\2e"+
		"\u01d5\3\2\2\2g\u01d7\3\2\2\2i\u01d9\3\2\2\2k\u01db\3\2\2\2m\u01dd\3\2"+
		"\2\2o\u01df\3\2\2\2q\u01e1\3\2\2\2s\u01e3\3\2\2\2u\u01e5\3\2\2\2w\u01e7"+
		"\3\2\2\2y\u01e9\3\2\2\2{\u01eb\3\2\2\2}\u01ed\3\2\2\2\177\u01ef\3\2\2"+
		"\2\u0081\u01f1\3\2\2\2\u0083\u01f3\3\2\2\2\u0085\u01f5\3\2\2\2\u0087\u01f7"+
		"\3\2\2\2\u0089\u01f9\3\2\2\2\u008b\u01fb\3\2\2\2\u008d\u01fd\3\2\2\2\u008f"+
		"\u01ff\3\2\2\2\u0091\u0201\3\2\2\2\u0093\u0203\3\2\2\2\u0095\u0205\3\2"+
		"\2\2\u0097\u0207\3\2\2\2\u0099\u0209\3\2\2\2\u009b\u020b\3\2\2\2\u009d"+
		"\u020d\3\2\2\2\u009f\u020f\3\2\2\2\u00a1\u0212\3\2\2\2\u00a3\u021a\3\2"+
		"\2\2\u00a5\u021c\3\2\2\2\u00a7\u0221\3\2\2\2\u00a9\u022d\3\2\2\2\u00ab"+
		"\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\4\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\6\3\2\2\2\u00b6\u00b7"+
		"\7r\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7e\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7f\2\2\u00bd\b\3\2\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7w\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca\u00cb\7k\2\2\u00cb\u00cc\7|\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7f\2\2\u00ce\16\3\2\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7j\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7|\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7f\2\2\u00db\20\3\2\2\2\u00dc\u00dd\7"+
		"u\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7h\2\2\u00e0\22"+
		"\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7c\2\2"+
		"\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\24\3\2\2\2\u00eb\u00ed\7"+
		",\2\2\u00ec\u00ee\5Q)\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7B\2\2"+
		"\u00f2\u00f3\5I%\2\u00f3\30\3\2\2\2\u00f4\u00f7\7%\2\2\u00f5\u00f8\5O"+
		"(\2\u00f6\u00f8\5M\'\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\32\3\2\2\2\u00fb"+
		"\u00fc\7`\2\2\u00fc\u00fd\5I%\2\u00fd\34\3\2\2\2\u00fe\u00ff\7\u0080\2"+
		"\2\u00ff\u0100\5I%\2\u0100\36\3\2\2\2\u0101\u0102\7C\2\2\u0102\u0103\7"+
		"p\2\2\u0103\u0104\7{\2\2\u0104\u0105\7E\2\2\u0105\u0106\7q\2\2\u0106\u0107"+
		"\7p\2\2\u0107\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7c\2\2\u010a"+
		"\u010b\7e\2\2\u010b\u010c\7v\2\2\u010c \3\2\2\2\u010d\u010e\7y\2\2\u010e"+
		"\u010f\7k\2\2\u010f\u0110\7v\2\2\u0110\u0111\7j\2\2\u0111\"\3\2\2\2\u0112"+
		"\u0113\7q\2\2\u0113\u0114\7h\2\2\u0114$\3\2\2\2\u0115\u0116\7t\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7s\2\2\u0118\u0119\7w\2\2\u0119\u011a\7k\2\2"+
		"\u011a\u011b\7t\2\2\u011b\u011c\7g\2\2\u011c&\3\2\2\2\u011d\u0120\5\65"+
		"\33\2\u011e\u0120\5\67\34\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"(\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123\7g\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7v\2\2\u0125\u0126\7j\2\2\u0126\u0127\7g\2\2\u0127\u0128\7t\2\2"+
		"\u0128*\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b\7c\2\2\u012b\u012c\7t\2"+
		"\2\u012c\u012d\7d\2\2\u012d,\3\2\2\2\u012e\u0130\5M\'\2\u012f\u012e\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		".\3\2\2\2\u0133\u0135\7&\2\2\u0134\u0136\5M\'\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013e\3\2"+
		"\2\2\u0139\u013a\7\60\2\2\u013a\u013c\5M\'\2\u013b\u013d\5M\'\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\60\3\2\2\2\u0140\u0141\5? \2\u0141\u0142"+
		"\7<\2\2\u0142\u0145\5? \2\u0143\u0144\7<\2\2\u0144\u0146\5? \2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\62\3\2\2\2\u0147\u0148\5C\"\2\u0148"+
		"\u0149\7/\2\2\u0149\u014a\5? \2\u014a\u014b\7/\2\2\u014b\u014c\5? \2\u014c"+
		"\64\3\2\2\2\u014d\u014e\5G$\2\u014e\66\3\2\2\2\u014f\u0154\59\35\2\u0150"+
		"\u0151\7\60\2\2\u0151\u0153\59\35\2\u0152\u0150\3\2\2\2\u0153\u0156\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7B\2\2\u0158\u015d\5;\36\2\u0159\u015a\7\60"+
		"\2\2\u015a\u015c\5;\36\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e8\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0162\t\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164:\3\2\2\2\u0165\u0167\t\3\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169<\3\2\2\2\u016a\u016b\7e\2\2\u016b\u016c\7{\2\2\u016c\u016d"+
		"\7e\2\2\u016d\u016e\7n\2\2\u016e\u0176\7g\2\2\u016f\u0170\7e\2\2\u0170"+
		"\u0171\7{\2\2\u0171\u0172\7e\2\2\u0172\u0173\7n\2\2\u0173\u0174\7g\2\2"+
		"\u0174\u0176\7u\2\2\u0175\u016a\3\2\2\2\u0175\u016f\3\2\2\2\u0176\u019b"+
		"\3\2\2\2\u0177\u0178\7y\2\2\u0178\u0179\7g\2\2\u0179\u017a\7g\2\2\u017a"+
		"\u0181\7m\2\2\u017b\u017c\7y\2\2\u017c\u017d\7g\2\2\u017d\u017e\7g\2\2"+
		"\u017e\u017f\7m\2\2\u017f\u0181\7u\2\2\u0180\u0177\3\2\2\2\u0180\u017b"+
		"\3\2\2\2\u0181\u019b\3\2\2\2\u0182\u0183\7o\2\2\u0183\u0184\7q\2\2\u0184"+
		"\u0185\7p\2\2\u0185\u0186\7v\2\2\u0186\u018e\7j\2\2\u0187\u0188\7o\2\2"+
		"\u0188\u0189\7q\2\2\u0189\u018a\7p\2\2\u018a\u018b\7v\2\2\u018b\u018c"+
		"\7j\2\2\u018c\u018e\7u\2\2\u018d\u0182\3\2\2\2\u018d\u0187\3\2\2\2\u018e"+
		"\u019b\3\2\2\2\u018f\u0190\7{\2\2\u0190\u0191\7g\2\2\u0191\u0192\7c\2"+
		"\2\u0192\u0199\7t\2\2\u0193\u0194\7{\2\2\u0194\u0195\7g\2\2\u0195\u0196"+
		"\7c\2\2\u0196\u0197\7t\2\2\u0197\u0199\7u\2\2\u0198\u018f\3\2\2\2\u0198"+
		"\u0193\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0175\3\2\2\2\u019a\u0180\3\2"+
		"\2\2\u019a\u018d\3\2\2\2\u019a\u0198\3\2\2\2\u019b>\3\2\2\2\u019c\u019d"+
		"\5M\'\2\u019d\u019e\5M\'\2\u019e@\3\2\2\2\u019f\u01a0\5? \2\u01a0\u01a1"+
		"\5M\'\2\u01a1B\3\2\2\2\u01a2\u01a3\5? \2\u01a3\u01a4\5? \2\u01a4D\3\2"+
		"\2\2\u01a5\u01a6\5C\"\2\u01a6\u01a7\5C\"\2\u01a7\u01a8\5M\'\2\u01a8F\3"+
		"\2\2\2\u01a9\u01aa\5C\"\2\u01aa\u01ab\5C\"\2\u01ab\u01ac\5A!\2\u01acH"+
		"\3\2\2\2\u01ad\u01b3\5O(\2\u01ae\u01b2\5O(\2\u01af\u01b2\5-\27\2\u01b0"+
		"\u01b2\t\4\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"J\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\t\5\2\2\u01b7\u01b6\3\2\2\2"+
		"\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\b&\2\2\u01bcL\3\2\2\2\u01bd\u01be\t\6\2\2\u01beN"+
		"\3\2\2\2\u01bf\u01c0\t\7\2\2\u01c0P\3\2\2\2\u01c1\u01c2\t\b\2\2\u01c2"+
		"R\3\2\2\2\u01c3\u01c4\t\t\2\2\u01c4T\3\2\2\2\u01c5\u01c6\t\n\2\2\u01c6"+
		"V\3\2\2\2\u01c7\u01c8\t\13\2\2\u01c8X\3\2\2\2\u01c9\u01ca\t\f\2\2\u01ca"+
		"Z\3\2\2\2\u01cb\u01cc\t\r\2\2\u01cc\\\3\2\2\2\u01cd\u01ce\t\16\2\2\u01ce"+
		"^\3\2\2\2\u01cf\u01d0\t\17\2\2\u01d0`\3\2\2\2\u01d1\u01d2\t\20\2\2\u01d2"+
		"b\3\2\2\2\u01d3\u01d4\t\21\2\2\u01d4d\3\2\2\2\u01d5\u01d6\t\22\2\2\u01d6"+
		"f\3\2\2\2\u01d7\u01d8\t\23\2\2\u01d8h\3\2\2\2\u01d9\u01da\t\24\2\2\u01da"+
		"j\3\2\2\2\u01db\u01dc\t\25\2\2\u01dcl\3\2\2\2\u01dd\u01de\t\26\2\2\u01de"+
		"n\3\2\2\2\u01df\u01e0\t\27\2\2\u01e0p\3\2\2\2\u01e1\u01e2\t\30\2\2\u01e2"+
		"r\3\2\2\2\u01e3\u01e4\t\31\2\2\u01e4t\3\2\2\2\u01e5\u01e6\t\32\2\2\u01e6"+
		"v\3\2\2\2\u01e7\u01e8\t\33\2\2\u01e8x\3\2\2\2\u01e9\u01ea\t\34\2\2\u01ea"+
		"z\3\2\2\2\u01eb\u01ec\t\35\2\2\u01ec|\3\2\2\2\u01ed\u01ee\t\36\2\2\u01ee"+
		"~\3\2\2\2\u01ef\u01f0\t\37\2\2\u01f0\u0080\3\2\2\2\u01f1\u01f2\t \2\2"+
		"\u01f2\u0082\3\2\2\2\u01f3\u01f4\t!\2\2\u01f4\u0084\3\2\2\2\u01f5\u01f6"+
		"\t\"\2\2\u01f6\u0086\3\2\2\2\u01f7\u01f8\7*\2\2\u01f8\u0088\3\2\2\2\u01f9"+
		"\u01fa\7+\2\2\u01fa\u008a\3\2\2\2\u01fb\u01fc\7-\2\2\u01fc\u008c\3\2\2"+
		"\2\u01fd\u01fe\7/\2\2\u01fe\u008e\3\2\2\2\u01ff\u0200\7,\2\2\u0200\u0090"+
		"\3\2\2\2\u0201\u0202\7\61\2\2\u0202\u0092\3\2\2\2\u0203\u0204\7@\2\2\u0204"+
		"\u0094\3\2\2\2\u0205\u0206\7>\2\2\u0206\u0096\3\2\2\2\u0207\u0208\7?\2"+
		"\2\u0208\u0098\3\2\2\2\u0209\u020a\7.\2\2\u020a\u009a\3\2\2\2\u020b\u020c"+
		"\7\60\2\2\u020c\u009c\3\2\2\2\u020d\u020e\7`\2\2\u020e\u009e\3\2\2\2\u020f"+
		"\u0210\7r\2\2\u0210\u0211\7k\2\2\u0211\u00a0\3\2\2\2\u0212\u0218\5\u00a7"+
		"T\2\u0213\u0215\t\r\2\2\u0214\u0216\5\u00a9U\2\u0215\u0214\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\5\u00a7T\2\u0218\u0213"+
		"\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u00a2\3\2\2\2\u021a\u021b\7g\2\2\u021b"+
		"\u00a4\3\2\2\2\u021c\u021d\7u\2\2\u021d\u021e\7w\2\2\u021e\u021f\7o\2"+
		"\2\u021f\u00a6\3\2\2\2\u0220\u0222\4\62;\2\u0221\u0220\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u022b\3\2\2\2\u0225"+
		"\u0227\7\60\2\2\u0226\u0228\4\62;\2\u0227\u0226\3\2\2\2\u0228\u0229\3"+
		"\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0225\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u00a8\3\2\2\2\u022d\u022e\t#"+
		"\2\2\u022e\u00aa\3\2\2\2\35\2\u00ef\u00f7\u00f9\u011f\u0131\u0137\u013c"+
		"\u013e\u0145\u0154\u015d\u0163\u0168\u0175\u0180\u018d\u0198\u019a\u01b1"+
		"\u01b3\u01b9\u0215\u0218\u0223\u0229\u022b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}