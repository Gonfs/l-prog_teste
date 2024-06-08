// Generated from C:/Users/gonca/IdeaProjects/answers/src/main/java/org/example/InterviewModel/InterviewModel.g4 by ANTLR 4.13.1
package org.example.InterviewModel.InterviewCompiled;
 // classes to include
import java.lang.*;
import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterviewModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TEXT=9, 
		CHAR=10, NEWLINE=11, NUMBER=12, WS=13;
	public static final int
		RULE_question = 0, RULE_multipleChoice = 1, RULE_shortAnswerQuestion = 2, 
		RULE_trueOrFalseQuestion = 3, RULE_valueQuestion = 4, RULE_dateQuestion = 5, 
		RULE_timeQuestion = 6, RULE_scaleQuestion = 7, RULE_choices = 8, RULE_choice = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"question", "multipleChoice", "shortAnswerQuestion", "trueOrFalseQuestion", 
			"valueQuestion", "dateQuestion", "timeQuestion", "scaleQuestion", "choices", 
			"choice"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[Escolha multipla] Questao '", "'Resposta:'", "'[Responda de forma breve] Questao '", 
			"'[V/F] Questao '", "'[Valor Inteiro/Decimal] Questao '", "'[Data] Questao '", 
			"'[Tempo] Questao '", "'[Intervalo] Questao '", null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TEXT", "CHAR", 
			"NEWLINE", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "InterviewModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public	TreeMap<String, String> answers = new TreeMap<>();

	public InterviewModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public List<MultipleChoiceContext> multipleChoice() {
			return getRuleContexts(MultipleChoiceContext.class);
		}
		public MultipleChoiceContext multipleChoice(int i) {
			return getRuleContext(MultipleChoiceContext.class,i);
		}
		public List<ShortAnswerQuestionContext> shortAnswerQuestion() {
			return getRuleContexts(ShortAnswerQuestionContext.class);
		}
		public ShortAnswerQuestionContext shortAnswerQuestion(int i) {
			return getRuleContext(ShortAnswerQuestionContext.class,i);
		}
		public List<TrueOrFalseQuestionContext> trueOrFalseQuestion() {
			return getRuleContexts(TrueOrFalseQuestionContext.class);
		}
		public TrueOrFalseQuestionContext trueOrFalseQuestion(int i) {
			return getRuleContext(TrueOrFalseQuestionContext.class,i);
		}
		public List<ValueQuestionContext> valueQuestion() {
			return getRuleContexts(ValueQuestionContext.class);
		}
		public ValueQuestionContext valueQuestion(int i) {
			return getRuleContext(ValueQuestionContext.class,i);
		}
		public List<TimeQuestionContext> timeQuestion() {
			return getRuleContexts(TimeQuestionContext.class);
		}
		public TimeQuestionContext timeQuestion(int i) {
			return getRuleContext(TimeQuestionContext.class,i);
		}
		public List<DateQuestionContext> dateQuestion() {
			return getRuleContexts(DateQuestionContext.class);
		}
		public DateQuestionContext dateQuestion(int i) {
			return getRuleContext(DateQuestionContext.class,i);
		}
		public List<ScaleQuestionContext> scaleQuestion() {
			return getRuleContexts(ScaleQuestionContext.class);
		}
		public ScaleQuestionContext scaleQuestion(int i) {
			return getRuleContext(ScaleQuestionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(InterviewModelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(InterviewModelParser.NEWLINE, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(20);
					multipleChoice();
					}
					break;
				case T__2:
					{
					setState(21);
					shortAnswerQuestion();
					}
					break;
				case T__3:
					{
					setState(22);
					trueOrFalseQuestion();
					}
					break;
				case T__4:
					{
					setState(23);
					valueQuestion();
					}
					break;
				case T__6:
					{
					setState(24);
					timeQuestion();
					}
					break;
				case T__5:
					{
					setState(25);
					dateQuestion();
					}
					break;
				case T__7:
					{
					setState(26);
					scaleQuestion();
					}
					break;
				case NEWLINE:
					{
					setState(27);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2554L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleChoiceContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public MultipleChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterMultipleChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitMultipleChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitMultipleChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceContext multipleChoice() throws RecognitionException {
		MultipleChoiceContext _localctx = new MultipleChoiceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multipleChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((MultipleChoiceContext)_localctx).t = match(T__0);
			setState(33);
			((MultipleChoiceContext)_localctx).n = match(NUMBER);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				match(TEXT);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(39);
			match(NEWLINE);
			setState(40);
			choices();
			setState(41);
			match(T__1);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(42);
				((MultipleChoiceContext)_localctx).a = match(TEXT);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MultipleChoiceContext)_localctx).questionText = ((MultipleChoiceContext)_localctx).t.getText()+((MultipleChoiceContext)_localctx).n.getText(); ((MultipleChoiceContext)_localctx).answer =  ((MultipleChoiceContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortAnswerQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public ShortAnswerQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((ShortAnswerQuestionContext)_localctx).t = match(T__2);
			setState(51);
			((ShortAnswerQuestionContext)_localctx).n = match(NUMBER);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(TEXT);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(57);
			match(NEWLINE);
			setState(58);
			match(T__1);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(59);
				((ShortAnswerQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ShortAnswerQuestionContext)_localctx).questionText = ((ShortAnswerQuestionContext)_localctx).t.getText()+((ShortAnswerQuestionContext)_localctx).n.getText(); ((ShortAnswerQuestionContext)_localctx).answer =  ((ShortAnswerQuestionContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrueOrFalseQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public TrueOrFalseQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueOrFalseQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterTrueOrFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitTrueOrFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitTrueOrFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueOrFalseQuestionContext trueOrFalseQuestion() throws RecognitionException {
		TrueOrFalseQuestionContext _localctx = new TrueOrFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trueOrFalseQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((TrueOrFalseQuestionContext)_localctx).t = match(T__3);
			setState(68);
			((TrueOrFalseQuestionContext)_localctx).n = match(NUMBER);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				match(TEXT);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(74);
			match(NEWLINE);
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(76);
				((TrueOrFalseQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TrueOrFalseQuestionContext)_localctx).questionText = ((TrueOrFalseQuestionContext)_localctx).t.getText()+((TrueOrFalseQuestionContext)_localctx).n.getText(); ((TrueOrFalseQuestionContext)_localctx).answer =  ((TrueOrFalseQuestionContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public ValueQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterValueQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitValueQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitValueQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueQuestionContext valueQuestion() throws RecognitionException {
		ValueQuestionContext _localctx = new ValueQuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valueQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((ValueQuestionContext)_localctx).t = match(T__4);
			setState(85);
			((ValueQuestionContext)_localctx).n = match(NUMBER);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				match(TEXT);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(91);
			match(NEWLINE);
			setState(92);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(93);
				((ValueQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ValueQuestionContext)_localctx).questionText = ((ValueQuestionContext)_localctx).t.getText()+((ValueQuestionContext)_localctx).n.getText(); ((ValueQuestionContext)_localctx).answer =  ((ValueQuestionContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DateQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public DateQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterDateQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitDateQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitDateQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateQuestionContext dateQuestion() throws RecognitionException {
		DateQuestionContext _localctx = new DateQuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dateQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((DateQuestionContext)_localctx).t = match(T__5);
			setState(102);
			((DateQuestionContext)_localctx).n = match(NUMBER);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				match(TEXT);
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(108);
			match(NEWLINE);
			setState(109);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(110);
				((DateQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((DateQuestionContext)_localctx).questionText = ((DateQuestionContext)_localctx).t.getText()+((DateQuestionContext)_localctx).n.getText(); ((DateQuestionContext)_localctx).answer =  ((DateQuestionContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public TimeQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterTimeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitTimeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitTimeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeQuestionContext timeQuestion() throws RecognitionException {
		TimeQuestionContext _localctx = new TimeQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timeQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((TimeQuestionContext)_localctx).t = match(T__6);
			setState(119);
			((TimeQuestionContext)_localctx).n = match(NUMBER);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				match(TEXT);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(125);
			match(NEWLINE);
			setState(126);
			match(T__1);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(127);
				((TimeQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TimeQuestionContext)_localctx).questionText = ((TimeQuestionContext)_localctx).t.getText()+((TimeQuestionContext)_localctx).n.getText(); ((TimeQuestionContext)_localctx).answer =  ((TimeQuestionContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaleQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token a;
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public ScaleQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterScaleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitScaleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitScaleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleQuestionContext scaleQuestion() throws RecognitionException {
		ScaleQuestionContext _localctx = new ScaleQuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scaleQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((ScaleQuestionContext)_localctx).t = match(T__7);
			setState(136);
			((ScaleQuestionContext)_localctx).n = match(NUMBER);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(TEXT);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(142);
			match(NEWLINE);
			setState(143);
			match(T__1);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(144);
				((ScaleQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ScaleQuestionContext)_localctx).questionText = ((ScaleQuestionContext)_localctx).t.getText()+((ScaleQuestionContext)_localctx).n.getText(); ((ScaleQuestionContext)_localctx).answer =  ((ScaleQuestionContext)_localctx).a.getText(); answers.put(_localctx.questionText, _localctx.answer);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChoicesContext extends ParserRuleContext {
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public ChoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterChoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitChoices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitChoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				choice();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(InterviewModelParser.CHAR, 0); }
		public TerminalNode NEWLINE() { return getToken(InterviewModelParser.NEWLINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelParser.TEXT, i);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelListener ) ((InterviewModelListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelVisitor ) return ((InterviewModelVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CHAR);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(TEXT);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(163);
			match(NEWLINE);
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
		"\u0004\u0001\r\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000"+
		"\u000b\u0000\f\u0000\u001e\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"$\b\u0001\u000b\u0001\f\u0001%\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u00026\b\u0002\u000b"+
		"\u0002\f\u00027\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002"+
		"\n\u0002\f\u0002@\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003G\b\u0003\u000b\u0003\f\u0003H\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004X\b"+
		"\u0004\u000b\u0004\f\u0004Y\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005i\b\u0005\u000b\u0005\f\u0005"+
		"j\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005"+
		"s\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006z\b\u0006\u000b\u0006\f\u0006{\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0081\b\u0006\n\u0006\f\u0006\u0084\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u008b\b\u0007"+
		"\u000b\u0007\f\u0007\u008c\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0092\b\u0007\n\u0007\f\u0007\u0095\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0004\b\u009a\b\b\u000b\b\f\b\u009b\u0001\t\u0001\t\u0004\t\u00a0\b"+
		"\t\u000b\t\f\t\u00a1\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u00b3\u0000\u001c\u0001"+
		"\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000"+
		"\u0000\u0006C\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\ne\u0001"+
		"\u0000\u0000\u0000\fv\u0001\u0000\u0000\u0000\u000e\u0087\u0001\u0000"+
		"\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000"+
		"\u0000\u0000\u0014\u001d\u0003\u0002\u0001\u0000\u0015\u001d\u0003\u0004"+
		"\u0002\u0000\u0016\u001d\u0003\u0006\u0003\u0000\u0017\u001d\u0003\b\u0004"+
		"\u0000\u0018\u001d\u0003\f\u0006\u0000\u0019\u001d\u0003\n\u0005\u0000"+
		"\u001a\u001d\u0003\u000e\u0007\u0000\u001b\u001d\u0005\u000b\u0000\u0000"+
		"\u001c\u0014\u0001\u0000\u0000\u0000\u001c\u0015\u0001\u0000\u0000\u0000"+
		"\u001c\u0016\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000"+
		"\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0001\u0001\u0000\u0000\u0000"+
		" !\u0005\u0001\u0000\u0000!#\u0005\f\u0000\u0000\"$\u0005\t\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u000b"+
		"\u0000\u0000()\u0003\u0010\b\u0000)-\u0005\u0002\u0000\u0000*,\u0005\t"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0006\u0001\uffff\uffff\u00001\u0003\u0001"+
		"\u0000\u0000\u000023\u0005\u0003\u0000\u000035\u0005\f\u0000\u000046\u0005"+
		"\t\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0005\u000b\u0000\u0000:>\u0005\u0002\u0000\u0000;=\u0005\t\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AB\u0006\u0002\uffff\uffff\u0000B\u0005\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0004\u0000\u0000DF\u0005\f\u0000\u0000EG\u0005\t\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005"+
		"\u000b\u0000\u0000KO\u0005\u0002\u0000\u0000LN\u0005\t\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0006\u0003\uffff\uffff\u0000S\u0007\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0005\u0000\u0000UW\u0005\f\u0000\u0000VX\u0005\t\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u000b"+
		"\u0000\u0000\\`\u0005\u0002\u0000\u0000]_\u0005\t\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cd\u0006\u0004\uffff\uffff\u0000d\t\u0001\u0000\u0000\u0000ef\u0005"+
		"\u0006\u0000\u0000fh\u0005\f\u0000\u0000gi\u0005\t\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\u000b\u0000"+
		"\u0000mq\u0005\u0002\u0000\u0000np\u0005\t\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0006"+
		"\u0005\uffff\uffff\u0000u\u000b\u0001\u0000\u0000\u0000vw\u0005\u0007"+
		"\u0000\u0000wy\u0005\f\u0000\u0000xz\u0005\t\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u000b\u0000\u0000"+
		"~\u0082\u0005\u0002\u0000\u0000\u007f\u0081\u0005\t\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0006\u0006\uffff\uffff\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\b\u0000\u0000\u0088\u008a\u0005\f\u0000\u0000\u0089\u008b"+
		"\u0005\t\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u000b\u0000\u0000\u008f\u0093\u0005\u0002\u0000\u0000\u0090\u0092\u0005"+
		"\t\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0006\u0007\uffff\uffff\u0000\u0097\u000f\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0003\u0012\t\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0011\u0001\u0000"+
		"\u0000\u0000\u009d\u009f\u0005\n\u0000\u0000\u009e\u00a0\u0005\t\u0000"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000b\u0000"+
		"\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u0012\u001c\u001e%-7>HOY`j"+
		"q{\u0082\u008c\u0093\u009b\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}