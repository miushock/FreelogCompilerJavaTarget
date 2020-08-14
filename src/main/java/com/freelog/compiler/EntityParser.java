// Generated from ./target/generated_grammar/Entity.g4 by ANTLR 4.8
package com.freelog.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EntityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELF=2, TERMINATE=3, SUBJECT_ID=4, UOID=5, ACCOUNT_NUMBER=6, SUBJECT_SERVICE_NAME=7, 
		EVENT_SERVICE_NAME=8, ANY_CONTRACT=9, WITH=10, OF=11, USER_ID=12, FEATHER=13, 
		BARB=14, INT=15, MONEY_AMOUNT=16, TIME=17, DATE=18, PHONE_NUMBER_CN_MOBILE=19, 
		EMAIL=20, PERIOD=21, ID=22, WS=23;
	public static final int
		RULE_entity_bracket = 0, RULE_subject_service = 1, RULE_event_service = 2, 
		RULE_subject = 3, RULE_event = 4, RULE_event_path = 5, RULE_event_name = 6, 
		RULE_policy = 7, RULE_account = 8, RULE_user_orgnization_name = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"entity_bracket", "subject_service", "event_service", "subject", "event", 
			"event_path", "event_name", "policy", "account", "user_orgnization_name"
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

	@Override
	public String getGrammarFileName() { return "Entity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EntityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Entity_bracketContext extends ParserRuleContext {
		public List<Subject_serviceContext> subject_service() {
			return getRuleContexts(Subject_serviceContext.class);
		}
		public Subject_serviceContext subject_service(int i) {
			return getRuleContext(Subject_serviceContext.class,i);
		}
		public List<Event_serviceContext> event_service() {
			return getRuleContexts(Event_serviceContext.class);
		}
		public Event_serviceContext event_service(int i) {
			return getRuleContext(Event_serviceContext.class,i);
		}
		public List<SubjectContext> subject() {
			return getRuleContexts(SubjectContext.class);
		}
		public SubjectContext subject(int i) {
			return getRuleContext(SubjectContext.class,i);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public List<PolicyContext> policy() {
			return getRuleContexts(PolicyContext.class);
		}
		public PolicyContext policy(int i) {
			return getRuleContext(PolicyContext.class,i);
		}
		public List<AccountContext> account() {
			return getRuleContexts(AccountContext.class);
		}
		public AccountContext account(int i) {
			return getRuleContext(AccountContext.class,i);
		}
		public List<User_orgnization_nameContext> user_orgnization_name() {
			return getRuleContexts(User_orgnization_nameContext.class);
		}
		public User_orgnization_nameContext user_orgnization_name(int i) {
			return getRuleContext(User_orgnization_nameContext.class,i);
		}
		public Entity_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_bracket; }
	}

	public final Entity_bracketContext entity_bracket() throws RecognitionException {
		Entity_bracketContext _localctx = new Entity_bracketContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entity_bracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UOID) | (1L << ACCOUNT_NUMBER) | (1L << SUBJECT_SERVICE_NAME) | (1L << EVENT_SERVICE_NAME))) != 0)) {
				{
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					subject_service();
					}
					break;
				case 2:
					{
					setState(21);
					event_service();
					}
					break;
				case 3:
					{
					setState(22);
					subject();
					}
					break;
				case 4:
					{
					setState(23);
					event();
					}
					break;
				case 5:
					{
					setState(24);
					policy();
					}
					break;
				case 6:
					{
					setState(25);
					account();
					}
					break;
				case 7:
					{
					setState(26);
					user_orgnization_name();
					}
					break;
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subject_serviceContext extends ParserRuleContext {
		public TerminalNode SUBJECT_SERVICE_NAME() { return getToken(EntityParser.SUBJECT_SERVICE_NAME, 0); }
		public Subject_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_service; }
	}

	public final Subject_serviceContext subject_service() throws RecognitionException {
		Subject_serviceContext _localctx = new Subject_serviceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subject_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(SUBJECT_SERVICE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_serviceContext extends ParserRuleContext {
		public TerminalNode EVENT_SERVICE_NAME() { return getToken(EntityParser.EVENT_SERVICE_NAME, 0); }
		public Event_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_service; }
	}

	public final Event_serviceContext event_service() throws RecognitionException {
		Event_serviceContext _localctx = new Event_serviceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_event_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(EVENT_SERVICE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public Subject_serviceContext subject_service() {
			return getRuleContext(Subject_serviceContext.class,0);
		}
		public User_orgnization_nameContext user_orgnization_name() {
			return getRuleContext(User_orgnization_nameContext.class,0);
		}
		public TerminalNode SUBJECT_ID() { return getToken(EntityParser.SUBJECT_ID, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			subject_service();
			setState(37);
			match(T__0);
			setState(38);
			user_orgnization_name();
			setState(39);
			match(T__0);
			setState(40);
			match(SUBJECT_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public Event_serviceContext event_service() {
			return getRuleContext(Event_serviceContext.class,0);
		}
		public Event_nameContext event_name() {
			return getRuleContext(Event_nameContext.class,0);
		}
		public Event_pathContext event_path() {
			return getRuleContext(Event_pathContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			event_service();
			setState(43);
			match(T__0);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(44);
				event_path();
				setState(45);
				match(T__0);
				}
				break;
			}
			setState(49);
			event_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_pathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EntityParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EntityParser.ID, i);
		}
		public Event_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_path; }
	}

	public final Event_pathContext event_path() throws RecognitionException {
		Event_pathContext _localctx = new Event_pathContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_event_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(51);
					match(ID);
					setState(52);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(57);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EntityParser.ID, 0); }
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PolicyContext extends ParserRuleContext {
		public Subject_serviceContext subject_service() {
			return getRuleContext(Subject_serviceContext.class,0);
		}
		public User_orgnization_nameContext user_orgnization_name() {
			return getRuleContext(User_orgnization_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(EntityParser.ID, 0); }
		public PolicyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy; }
	}

	public final PolicyContext policy() throws RecognitionException {
		PolicyContext _localctx = new PolicyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_policy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			subject_service();
			setState(62);
			match(T__0);
			setState(63);
			user_orgnization_name();
			setState(64);
			match(T__0);
			setState(65);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccountContext extends ParserRuleContext {
		public TerminalNode ACCOUNT_NUMBER() { return getToken(EntityParser.ACCOUNT_NUMBER, 0); }
		public AccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account; }
	}

	public final AccountContext account() throws RecognitionException {
		AccountContext _localctx = new AccountContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_account);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ACCOUNT_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_orgnization_nameContext extends ParserRuleContext {
		public TerminalNode UOID() { return getToken(EntityParser.UOID, 0); }
		public User_orgnization_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_orgnization_name; }
	}

	public final User_orgnization_nameContext user_orgnization_name() throws RecognitionException {
		User_orgnization_nameContext _localctx = new User_orgnization_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_user_orgnization_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(UOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3\6\3\7\3\7"+
		"\6\78\n\7\r\7\16\79\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2H\2\37\3\2\2\2\4\"\3"+
		"\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n,\3\2\2\2\f\67\3\2\2\2\16=\3\2\2\2\20?\3"+
		"\2\2\2\22E\3\2\2\2\24G\3\2\2\2\26\36\5\4\3\2\27\36\5\6\4\2\30\36\5\b\5"+
		"\2\31\36\5\n\6\2\32\36\5\20\t\2\33\36\5\22\n\2\34\36\5\24\13\2\35\26\3"+
		"\2\2\2\35\27\3\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\35\32\3\2\2\2\35\33\3"+
		"\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2"+
		"!\37\3\2\2\2\"#\7\t\2\2#\5\3\2\2\2$%\7\n\2\2%\7\3\2\2\2&\'\5\4\3\2\'("+
		"\7\3\2\2()\5\24\13\2)*\7\3\2\2*+\7\6\2\2+\t\3\2\2\2,-\5\6\4\2-\61\7\3"+
		"\2\2./\5\f\7\2/\60\7\3\2\2\60\62\3\2\2\2\61.\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\5\16\b\2\64\13\3\2\2\2\65\66\7\30\2\2\668\7\3\2\2\67"+
		"\65\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\30\2\2<\r\3"+
		"\2\2\2=>\7\30\2\2>\17\3\2\2\2?@\5\4\3\2@A\7\3\2\2AB\5\24\13\2BC\7\3\2"+
		"\2CD\7\30\2\2D\21\3\2\2\2EF\7\b\2\2F\23\3\2\2\2GH\7\7\2\2H\25\3\2\2\2"+
		"\6\35\37\619";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}