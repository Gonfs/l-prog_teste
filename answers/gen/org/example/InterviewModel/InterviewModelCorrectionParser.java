// Generated from C:/Users/gonca/IdeaProjects/answers/src/main/java/org/example/InterviewModel/InterviewModelCorrection.g4 by ANTLR 4.13.1
package org.example.InterviewModel;
 // classes to include
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterviewModelCorrectionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, COTACAO=14, WS=15, SPACE=16, INT=17, 
		NUMBER=18, TEXT=19, CHAR=20, NEWLINE=21, PONTO=22, INTERROGACAO=23, LETTER=24, 
		ESCOLHA=25, QUESTIONANSWER=26;
	public static final int
		RULE_cabecalhoSection = 0, RULE_question = 1, RULE_answerSection = 2, 
		RULE_cabecalho = 3, RULE_introduction = 4, RULE_multipleChoice = 5, RULE_shortAnswerQuestion = 6, 
		RULE_trueOrFalseQuestion = 7, RULE_valueQuestion = 8, RULE_dateQuestion = 9, 
		RULE_timeQuestion = 10, RULE_scaleQuestion = 11, RULE_questionBase = 12, 
		RULE_choices = 13, RULE_choice = 14, RULE_questionAnswer = 15, RULE_answerCotation = 16, 
		RULE_questionNumber = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"cabecalhoSection", "question", "answerSection", "cabecalho", "introduction", 
			"multipleChoice", "shortAnswerQuestion", "trueOrFalseQuestion", "valueQuestion", 
			"dateQuestion", "timeQuestion", "scaleQuestion", "questionBase", "choices", 
			"choice", "questionAnswer", "answerCotation", "questionNumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Questionario'", "'Solucoes'", "':'", "'Introducao'", "'[Escolha multipla] '", 
			"'Resposta:'", "'[Responda de forma breve] Questao'", "'[V/F] Questao '", 
			"'[Valor Inteiro/Decimal] Questao '", "'[Data] Questao '", "'[Tempo] Questao '", 
			"'[Intervalo] Questao '", "'Questao'", null, null, null, null, null, 
			null, null, "'\\n'", "'.'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "COTACAO", "WS", "SPACE", "INT", "NUMBER", "TEXT", "CHAR", 
			"NEWLINE", "PONTO", "INTERROGACAO", "LETTER", "ESCOLHA", "QUESTIONANSWER"
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
	public String getGrammarFileName() { return "InterviewModelCorrection.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		TreeMap<String, String> answers = new TreeMap<>();

	public InterviewModelCorrectionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CabecalhoSectionContext extends ParserRuleContext {
		public IntroductionContext introduction() {
			return getRuleContext(IntroductionContext.class,0);
		}
		public AnswerSectionContext answerSection() {
			return getRuleContext(AnswerSectionContext.class,0);
		}
		public List<CabecalhoContext> cabecalho() {
			return getRuleContexts(CabecalhoContext.class);
		}
		public CabecalhoContext cabecalho(int i) {
			return getRuleContext(CabecalhoContext.class,i);
		}
		public TerminalNode WS() { return getToken(InterviewModelCorrectionParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public CabecalhoSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalhoSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterCabecalhoSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitCabecalhoSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitCabecalhoSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoSectionContext cabecalhoSection() throws RecognitionException {
		CabecalhoSectionContext _localctx = new CabecalhoSectionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cabecalhoSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				cabecalho();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(41);
				match(WS);
				}
			}

			setState(44);
			introduction();
			setState(45);
			match(T__0);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(46);
				match(NEWLINE);
				}
				break;
			}
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				question();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2105248L) != 0) );
			setState(54);
			match(T__1);
			setState(55);
			answerSection();
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
		public List<TerminalNode> NEWLINE() { return getTokens(InterviewModelCorrectionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(InterviewModelCorrectionParser.NEWLINE, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(65);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(57);
						multipleChoice();
						}
						break;
					case T__6:
						{
						setState(58);
						shortAnswerQuestion();
						}
						break;
					case T__7:
						{
						setState(59);
						trueOrFalseQuestion();
						}
						break;
					case T__8:
						{
						setState(60);
						valueQuestion();
						}
						break;
					case T__10:
						{
						setState(61);
						timeQuestion();
						}
						break;
					case T__9:
						{
						setState(62);
						dateQuestion();
						}
						break;
					case T__11:
						{
						setState(63);
						scaleQuestion();
						}
						break;
					case NEWLINE:
						{
						setState(64);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class AnswerSectionContext extends ParserRuleContext {
		public List<QuestionAnswerContext> questionAnswer() {
			return getRuleContexts(QuestionAnswerContext.class);
		}
		public QuestionAnswerContext questionAnswer(int i) {
			return getRuleContext(QuestionAnswerContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(InterviewModelCorrectionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(InterviewModelCorrectionParser.WS, i);
		}
		public AnswerSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterAnswerSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitAnswerSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitAnswerSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerSectionContext answerSection() throws RecognitionException {
		AnswerSectionContext _localctx = new AnswerSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_answerSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(69);
					questionAnswer();
					}
					break;
				case WS:
					{
					setState(70);
					match(WS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || _la==WS );
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
	public static class CabecalhoContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public TerminalNode WS() { return getToken(InterviewModelCorrectionParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitCabecalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitCabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cabecalho);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				match(TEXT);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(80);
			match(T__2);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(81);
				match(WS);
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(TEXT);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(90);
				match(NEWLINE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntroductionContext extends ParserRuleContext {
		public List<TerminalNode> PONTO() { return getTokens(InterviewModelCorrectionParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(InterviewModelCorrectionParser.PONTO, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(InterviewModelCorrectionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(InterviewModelCorrectionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public IntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_introduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroductionContext introduction() throws RecognitionException {
		IntroductionContext _localctx = new IntroductionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_introduction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__3);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(100);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TEXT:
							{
							setState(95); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(94);
									match(TEXT);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(97); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							break;
						case PONTO:
							{
							setState(99);
							match(PONTO);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(102); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(104);
					match(NEWLINE);
					}
				}

				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==PONTO );
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
		public QuestionBaseContext questionBase() {
			return getRuleContext(QuestionBaseContext.class,0);
		}
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public MultipleChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterMultipleChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitMultipleChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitMultipleChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceContext multipleChoice() throws RecognitionException {
		MultipleChoiceContext _localctx = new MultipleChoiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__4);
			setState(112);
			questionBase();
			setState(113);
			choices();
			setState(114);
			match(T__5);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(115);
				match(TEXT);
				}
				}
				setState(120);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortAnswerQuestionContext extends ParserRuleContext {
		public String questionText;
		public String answer;
		public Token t;
		public Token n;
		public Token q;
		public Token a;
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public TerminalNode PONTO() { return getToken(InterviewModelCorrectionParser.PONTO, 0); }
		public TerminalNode INTERROGACAO() { return getToken(InterviewModelCorrectionParser.INTERROGACAO, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public List<TerminalNode> WS() { return getTokens(InterviewModelCorrectionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(InterviewModelCorrectionParser.WS, i);
		}
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public ShortAnswerQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((ShortAnswerQuestionContext)_localctx).t = match(T__6);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(122);
				match(WS);
				}
			}

			setState(125);
			((ShortAnswerQuestionContext)_localctx).n = match(NUMBER);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(126);
				match(WS);
				}
			}

			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				((ShortAnswerQuestionContext)_localctx).q = match(TEXT);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==PONTO || _la==INTERROGACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(135);
				match(WS);
				}
			}

			setState(138);
			match(T__5);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(139);
				match(WS);
				}
			}

			setState(142);
			((ShortAnswerQuestionContext)_localctx).a = match(TEXT);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(143);
				match(NEWLINE);
				}
				break;
			}

			        ((ShortAnswerQuestionContext)_localctx).questionText =  ((ShortAnswerQuestionContext)_localctx).t.getText() + " " + ((ShortAnswerQuestionContext)_localctx).n.getText() + ": ";
			        ((ShortAnswerQuestionContext)_localctx).answer =  ((ShortAnswerQuestionContext)_localctx).a.getText();
			        answers.put(_localctx.questionText, _localctx.answer);
			    
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
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public TrueOrFalseQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueOrFalseQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterTrueOrFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitTrueOrFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitTrueOrFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueOrFalseQuestionContext trueOrFalseQuestion() throws RecognitionException {
		TrueOrFalseQuestionContext _localctx = new TrueOrFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_trueOrFalseQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((TrueOrFalseQuestionContext)_localctx).t = match(T__7);
			setState(149);
			((TrueOrFalseQuestionContext)_localctx).n = match(NUMBER);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				match(TEXT);
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(155);
			match(NEWLINE);
			setState(156);
			match(T__5);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(157);
				((TrueOrFalseQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(162);
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
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public ValueQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterValueQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitValueQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitValueQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueQuestionContext valueQuestion() throws RecognitionException {
		ValueQuestionContext _localctx = new ValueQuestionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valueQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((ValueQuestionContext)_localctx).t = match(T__8);
			setState(166);
			((ValueQuestionContext)_localctx).n = match(NUMBER);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(TEXT);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(172);
			match(NEWLINE);
			setState(173);
			match(T__5);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(174);
				((ValueQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(179);
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
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public DateQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterDateQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitDateQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitDateQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateQuestionContext dateQuestion() throws RecognitionException {
		DateQuestionContext _localctx = new DateQuestionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dateQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((DateQuestionContext)_localctx).t = match(T__9);
			setState(183);
			((DateQuestionContext)_localctx).n = match(NUMBER);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				match(TEXT);
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(189);
			match(NEWLINE);
			setState(190);
			match(T__5);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(191);
				((DateQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(196);
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
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public TimeQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterTimeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitTimeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitTimeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeQuestionContext timeQuestion() throws RecognitionException {
		TimeQuestionContext _localctx = new TimeQuestionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_timeQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((TimeQuestionContext)_localctx).t = match(T__10);
			setState(200);
			((TimeQuestionContext)_localctx).n = match(NUMBER);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(TEXT);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(206);
			match(NEWLINE);
			setState(207);
			match(T__5);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(208);
				((TimeQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(213);
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
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public ScaleQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterScaleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitScaleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitScaleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleQuestionContext scaleQuestion() throws RecognitionException {
		ScaleQuestionContext _localctx = new ScaleQuestionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scaleQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((ScaleQuestionContext)_localctx).t = match(T__11);
			setState(217);
			((ScaleQuestionContext)_localctx).n = match(NUMBER);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(TEXT);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(223);
			match(NEWLINE);
			setState(224);
			match(T__5);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(225);
				((ScaleQuestionContext)_localctx).a = match(TEXT);
				}
				}
				setState(230);
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
	public static class QuestionBaseContext extends ParserRuleContext {
		public Token n;
		public Token q;
		public TerminalNode NUMBER() { return getToken(InterviewModelCorrectionParser.NUMBER, 0); }
		public TerminalNode PONTO() { return getToken(InterviewModelCorrectionParser.PONTO, 0); }
		public TerminalNode INTERROGACAO() { return getToken(InterviewModelCorrectionParser.INTERROGACAO, 0); }
		public List<TerminalNode> WS() { return getTokens(InterviewModelCorrectionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(InterviewModelCorrectionParser.WS, i);
		}
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public QuestionBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterQuestionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitQuestionBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitQuestionBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionBaseContext questionBase() throws RecognitionException {
		QuestionBaseContext _localctx = new QuestionBaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_questionBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__12);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(234);
				match(WS);
				}
			}

			setState(237);
			((QuestionBaseContext)_localctx).n = match(NUMBER);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(238);
				match(WS);
				}
			}

			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				((QuestionBaseContext)_localctx).q = match(TEXT);
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==PONTO || _la==INTERROGACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(247);
				match(NEWLINE);
				}
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
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterChoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitChoices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitChoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				choice();
				}
				}
				setState(253); 
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
		public TerminalNode CHAR() { return getToken(InterviewModelCorrectionParser.CHAR, 0); }
		public TerminalNode PONTO() { return getToken(InterviewModelCorrectionParser.PONTO, 0); }
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public TerminalNode WS() { return getToken(InterviewModelCorrectionParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(InterviewModelCorrectionParser.NEWLINE, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(CHAR);
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				match(TEXT);
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(261);
			match(PONTO);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(262);
				match(WS);
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(265);
				match(NEWLINE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionAnswerContext extends ParserRuleContext {
		public QuestionNumberContext questionNumber() {
			return getRuleContext(QuestionNumberContext.class,0);
		}
		public List<AnswerCotationContext> answerCotation() {
			return getRuleContexts(AnswerCotationContext.class);
		}
		public AnswerCotationContext answerCotation(int i) {
			return getRuleContext(AnswerCotationContext.class,i);
		}
		public QuestionAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterQuestionAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitQuestionAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitQuestionAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionAnswerContext questionAnswer() throws RecognitionException {
		QuestionAnswerContext _localctx = new QuestionAnswerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_questionAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			questionNumber();
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				answerCotation();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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
	public static class AnswerCotationContext extends ParserRuleContext {
		public TerminalNode COTACAO() { return getToken(InterviewModelCorrectionParser.COTACAO, 0); }
		public TerminalNode INT() { return getToken(InterviewModelCorrectionParser.INT, 0); }
		public List<TerminalNode> WS() { return getTokens(InterviewModelCorrectionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(InterviewModelCorrectionParser.WS, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(InterviewModelCorrectionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewModelCorrectionParser.TEXT, i);
		}
		public AnswerCotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerCotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterAnswerCotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitAnswerCotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitAnswerCotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerCotationContext answerCotation() throws RecognitionException {
		AnswerCotationContext _localctx = new AnswerCotationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_answerCotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__5);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(275);
				match(WS);
				}
			}

			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					match(TEXT);
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case INT:
				{
				setState(283);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(286);
				match(WS);
				}
			}

			setState(289);
			match(COTACAO);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(290);
				match(WS);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(InterviewModelCorrectionParser.INT, 0); }
		public List<TerminalNode> WS() { return getTokens(InterviewModelCorrectionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(InterviewModelCorrectionParser.WS, i);
		}
		public QuestionNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).enterQuestionNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModelCorrectionListener ) ((InterviewModelCorrectionListener)listener).exitQuestionNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModelCorrectionVisitor ) return ((InterviewModelCorrectionVisitor<? extends T>)visitor).visitQuestionNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionNumberContext questionNumber() throws RecognitionException {
		QuestionNumberContext _localctx = new QuestionNumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_questionNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__12);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(294);
				match(WS);
				}
			}

			setState(297);
			match(INT);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(298);
				match(WS);
				}
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
		"\u0004\u0001\u001a\u012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004"+
		"\u0000&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0003\u0000+\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000"+
		"\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001B\b\u0001\u000b\u0001\f\u0001"+
		"C\u0001\u0002\u0001\u0002\u0004\u0002H\b\u0002\u000b\u0002\f\u0002I\u0001"+
		"\u0003\u0004\u0003M\b\u0003\u000b\u0003\f\u0003N\u0001\u0003\u0001\u0003"+
		"\u0003\u0003S\b\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003\f\u0003"+
		"Y\t\u0003\u0001\u0003\u0003\u0003\\\b\u0003\u0001\u0004\u0001\u0004\u0004"+
		"\u0004`\b\u0004\u000b\u0004\f\u0004a\u0001\u0004\u0004\u0004e\b\u0004"+
		"\u000b\u0004\f\u0004f\u0001\u0004\u0003\u0004j\b\u0004\u0004\u0004l\b"+
		"\u0004\u000b\u0004\f\u0004m\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005x\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0080\b\u0006\u0001\u0006\u0004\u0006\u0083\b\u0006\u000b\u0006"+
		"\f\u0006\u0084\u0001\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0091\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u0098\b\u0007\u000b\u0007\f\u0007\u0099\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u009f\b\u0007\n\u0007\f\u0007\u00a2"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b\u00a9"+
		"\b\b\u000b\b\f\b\u00aa\u0001\b\u0001\b\u0001\b\u0005\b\u00b0\b\b\n\b\f"+
		"\b\u00b3\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004\t\u00ba\b\t"+
		"\u000b\t\f\t\u00bb\u0001\t\u0001\t\u0001\t\u0005\t\u00c1\b\t\n\t\f\t\u00c4"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n\u00cb\b\n\u000b\n"+
		"\f\n\u00cc\u0001\n\u0001\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00dc"+
		"\b\u000b\u000b\u000b\f\u000b\u00dd\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00e3\b\u000b\n\u000b\f\u000b\u00e6\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\f\u00ec\b\f\u0001\f\u0001\f\u0003\f\u00f0"+
		"\b\f\u0001\f\u0004\f\u00f3\b\f\u000b\f\f\f\u00f4\u0001\f\u0001\f\u0003"+
		"\f\u00f9\b\f\u0001\r\u0004\r\u00fc\b\r\u000b\r\f\r\u00fd\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u0102\b\u000e\u000b\u000e\f\u000e\u0103\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0108\b\u000e\u0001\u000e\u0003\u000e\u010b\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0004\u000f\u010f\b\u000f\u000b\u000f\f"+
		"\u000f\u0110\u0001\u0010\u0001\u0010\u0003\u0010\u0115\b\u0010\u0001\u0010"+
		"\u0004\u0010\u0118\b\u0010\u000b\u0010\f\u0010\u0119\u0001\u0010\u0003"+
		"\u0010\u011d\b\u0010\u0001\u0010\u0003\u0010\u0120\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0124\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0128\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012c\b\u0011\u0001"+
		"\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\u0016"+
		"\u0017\u0153\u0000%\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004G\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b]\u0001"+
		"\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00a5\u0001\u0000\u0000\u0000"+
		"\u0012\u00b6\u0001\u0000\u0000\u0000\u0014\u00c7\u0001\u0000\u0000\u0000"+
		"\u0016\u00d8\u0001\u0000\u0000\u0000\u0018\u00e9\u0001\u0000\u0000\u0000"+
		"\u001a\u00fb\u0001\u0000\u0000\u0000\u001c\u00ff\u0001\u0000\u0000\u0000"+
		"\u001e\u010c\u0001\u0000\u0000\u0000 \u0112\u0001\u0000\u0000\u0000\""+
		"\u0125\u0001\u0000\u0000\u0000$&\u0003\u0006\u0003\u0000%$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)+\u0005\u000f\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0003\b\u0004\u0000-/\u0005\u0001\u0000\u0000.0\u0005\u0015"+
		"\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001"+
		"\u0000\u0000\u000013\u0003\u0002\u0001\u000021\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000067\u0005\u0002\u0000\u000078\u0003\u0004"+
		"\u0002\u00008\u0001\u0001\u0000\u0000\u00009B\u0003\n\u0005\u0000:B\u0003"+
		"\f\u0006\u0000;B\u0003\u000e\u0007\u0000<B\u0003\u0010\b\u0000=B\u0003"+
		"\u0014\n\u0000>B\u0003\u0012\t\u0000?B\u0003\u0016\u000b\u0000@B\u0005"+
		"\u0015\u0000\u0000A9\u0001\u0000\u0000\u0000A:\u0001\u0000\u0000\u0000"+
		"A;\u0001\u0000\u0000\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000"+
		"\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EH\u0003\u001e\u000f"+
		"\u0000FH\u0005\u000f\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KM\u0005\u0013\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0005"+
		"\u0003\u0000\u0000QS\u0005\u000f\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SW\u0001\u0000\u0000\u0000TV\u0005\u0013\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z\\\u0005\u0015\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000]k\u0005\u0004"+
		"\u0000\u0000^`\u0005\u0013\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ce\u0005\u0016\u0000\u0000d_\u0001\u0000\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hj\u0005"+
		"\u0015\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\t\u0001\u0000"+
		"\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0003\u0018\f\u0000qr\u0003\u001a"+
		"\r\u0000rv\u0005\u0006\u0000\u0000su\u0005\u0013\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y{\u0005\u0007\u0000\u0000z|\u0005\u000f\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0005\u0012\u0000\u0000~\u0080\u0005\u000f\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0005\u0013\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0007\u0000\u0000\u0000\u0087\u0089\u0005\u000f"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0005\u0006"+
		"\u0000\u0000\u008b\u008d\u0005\u000f\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0005\u0013\u0000\u0000\u008f\u0091\u0005\u0015"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u0006"+
		"\uffff\uffff\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094\u0095\u0005\b"+
		"\u0000\u0000\u0095\u0097\u0005\u0012\u0000\u0000\u0096\u0098\u0005\u0013"+
		"\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0015"+
		"\u0000\u0000\u009c\u00a0\u0005\u0006\u0000\u0000\u009d\u009f\u0005\u0013"+
		"\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0006\u0007\uffff\uffff\u0000\u00a4\u000f\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00a8\u0005\u0012"+
		"\u0000\u0000\u00a7\u00a9\u0005\u0013\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000\u00ad\u00b1\u0005\u0006"+
		"\u0000\u0000\u00ae\u00b0\u0005\u0013\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006\b\uffff"+
		"\uffff\u0000\u00b5\u0011\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\n\u0000"+
		"\u0000\u00b7\u00b9\u0005\u0012\u0000\u0000\u00b8\u00ba\u0005\u0013\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0015\u0000"+
		"\u0000\u00be\u00c2\u0005\u0006\u0000\u0000\u00bf\u00c1\u0005\u0013\u0000"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0006\t\uffff\uffff\u0000\u00c6\u0013\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8\u00ca\u0005\u0012\u0000"+
		"\u0000\u00c9\u00cb\u0005\u0013\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0015\u0000\u0000\u00cf\u00d3\u0005\u0006\u0000"+
		"\u0000\u00d0\u00d2\u0005\u0013\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\n\uffff\uffff"+
		"\u0000\u00d7\u0015\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\f\u0000\u0000"+
		"\u00d9\u00db\u0005\u0012\u0000\u0000\u00da\u00dc\u0005\u0013\u0000\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0015\u0000\u0000"+
		"\u00e0\u00e4\u0005\u0006\u0000\u0000\u00e1\u00e3\u0005\u0013\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0006\u000b\uffff\uffff\u0000\u00e8\u0017\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0005\r\u0000\u0000\u00ea\u00ec\u0005\u000f\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\u0012\u0000\u0000"+
		"\u00ee\u00f0\u0005\u000f\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0005\u0013\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0007\u0000\u0000\u0000\u00f7\u00f9\u0005\u0015\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u0019\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u001c\u000e\u0000"+
		"\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u001b\u0001\u0000\u0000\u0000\u00ff\u0101\u0005\u0014\u0000\u0000"+
		"\u0100\u0102\u0005\u0013\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0005\u0016\u0000\u0000\u0106\u0108\u0005\u000f\u0000\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u010b\u0005\u0015\u0000\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u001d\u0001\u0000\u0000\u0000\u010c\u010e\u0003\"\u0011\u0000\u010d"+
		"\u010f\u0003 \u0010\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u001f\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0005\u0006\u0000\u0000\u0113\u0115\u0005\u000f\u0000\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u011c"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0005\u0013\u0000\u0000\u0117\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0005\u0011\u0000\u0000\u011c\u0117"+
		"\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\u0005\u000f\u0000\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0123\u0005\u000e\u0000\u0000\u0122\u0124"+
		"\u0005\u000f\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124!\u0001\u0000\u0000\u0000\u0125\u0127\u0005"+
		"\r\u0000\u0000\u0126\u0128\u0005\u000f\u0000\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012b\u0005\u0011\u0000\u0000\u012a\u012c\u0005\u000f"+
		"\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c#\u0001\u0000\u0000\u00002\'*/4ACGINRW[adfimv{\u007f"+
		"\u0084\u0088\u008c\u0090\u0099\u00a0\u00aa\u00b1\u00bb\u00c2\u00cc\u00d3"+
		"\u00dd\u00e4\u00eb\u00ef\u00f4\u00f8\u00fd\u0103\u0107\u010a\u0110\u0114"+
		"\u0119\u011c\u011f\u0123\u0127\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}