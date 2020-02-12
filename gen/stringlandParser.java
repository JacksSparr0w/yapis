// Generated from C:/Users/Katsuba_V/IdeaProjects/yapis/src/main/resources\stringland.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stringlandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, VAR=5, WS=6;
	public static final int
		RULE_statement = 0, RULE_concat = 1, RULE_make = 2, RULE_set = 3, RULE_show = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "concat", "make", "set", "show"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'concat'", "'make'", "'set'", "'show'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "VAR", "WS"
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
	public String getGrammarFileName() { return "stringland.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public stringlandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public MakeContext make() {
			return getRuleContext(MakeContext.class,0);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringlandVisitor ) return ((stringlandVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				set();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				show();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				make();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				concat();
				}
				break;
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

	public static class ConcatContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(stringlandParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(stringlandParser.VAR, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringlandVisitor ) return ((stringlandVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(16);
			match(VAR);
			}
			setState(17);
			match(T__0);
			{
			setState(18);
			match(VAR);
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

	public static class MakeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_make; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).enterMake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).exitMake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringlandVisitor ) return ((stringlandVisitor<? extends T>)visitor).visitMake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeContext make() throws RecognitionException {
		MakeContext _localctx = new MakeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_make);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__1);
			setState(21);
			statement();
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

	public static class SetContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(stringlandParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(stringlandParser.VAR, i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringlandVisitor ) return ((stringlandVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(VAR);
			setState(24);
			match(T__2);
			setState(25);
			match(VAR);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(stringlandParser.VAR, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringlandListener ) ((stringlandListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringlandVisitor ) return ((stringlandVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__3);
			{
			setState(28);
			match(VAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2\36"+
		"\2\20\3\2\2\2\4\22\3\2\2\2\6\26\3\2\2\2\b\31\3\2\2\2\n\35\3\2\2\2\f\21"+
		"\5\b\5\2\r\21\5\n\6\2\16\21\5\6\4\2\17\21\5\4\3\2\20\f\3\2\2\2\20\r\3"+
		"\2\2\2\20\16\3\2\2\2\20\17\3\2\2\2\21\3\3\2\2\2\22\23\7\7\2\2\23\24\7"+
		"\3\2\2\24\25\7\7\2\2\25\5\3\2\2\2\26\27\7\4\2\2\27\30\5\2\2\2\30\7\3\2"+
		"\2\2\31\32\7\7\2\2\32\33\7\5\2\2\33\34\7\7\2\2\34\t\3\2\2\2\35\36\7\6"+
		"\2\2\36\37\7\7\2\2\37\13\3\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}