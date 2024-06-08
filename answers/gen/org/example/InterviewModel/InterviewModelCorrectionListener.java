// Generated from C:/Users/gonca/IdeaProjects/answers/src/main/java/org/example/InterviewModel/InterviewModelCorrection.g4 by ANTLR 4.13.1
package org.example.InterviewModel;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewModelCorrectionParser}.
 */
public interface InterviewModelCorrectionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#cabecalhoSection}.
	 * @param ctx the parse tree
	 */
	void enterCabecalhoSection(InterviewModelCorrectionParser.CabecalhoSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#cabecalhoSection}.
	 * @param ctx the parse tree
	 */
	void exitCabecalhoSection(InterviewModelCorrectionParser.CabecalhoSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(InterviewModelCorrectionParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(InterviewModelCorrectionParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#answerSection}.
	 * @param ctx the parse tree
	 */
	void enterAnswerSection(InterviewModelCorrectionParser.AnswerSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#answerSection}.
	 * @param ctx the parse tree
	 */
	void exitAnswerSection(InterviewModelCorrectionParser.AnswerSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(InterviewModelCorrectionParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(InterviewModelCorrectionParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterIntroduction(InterviewModelCorrectionParser.IntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitIntroduction(InterviewModelCorrectionParser.IntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#multipleChoice}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoice(InterviewModelCorrectionParser.MultipleChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#multipleChoice}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoice(InterviewModelCorrectionParser.MultipleChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(InterviewModelCorrectionParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(InterviewModelCorrectionParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#trueOrFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueOrFalseQuestion(InterviewModelCorrectionParser.TrueOrFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#trueOrFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueOrFalseQuestion(InterviewModelCorrectionParser.TrueOrFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#valueQuestion}.
	 * @param ctx the parse tree
	 */
	void enterValueQuestion(InterviewModelCorrectionParser.ValueQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#valueQuestion}.
	 * @param ctx the parse tree
	 */
	void exitValueQuestion(InterviewModelCorrectionParser.ValueQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void enterDateQuestion(InterviewModelCorrectionParser.DateQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void exitDateQuestion(InterviewModelCorrectionParser.DateQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTimeQuestion(InterviewModelCorrectionParser.TimeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTimeQuestion(InterviewModelCorrectionParser.TimeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#scaleQuestion}.
	 * @param ctx the parse tree
	 */
	void enterScaleQuestion(InterviewModelCorrectionParser.ScaleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#scaleQuestion}.
	 * @param ctx the parse tree
	 */
	void exitScaleQuestion(InterviewModelCorrectionParser.ScaleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#questionBase}.
	 * @param ctx the parse tree
	 */
	void enterQuestionBase(InterviewModelCorrectionParser.QuestionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#questionBase}.
	 * @param ctx the parse tree
	 */
	void exitQuestionBase(InterviewModelCorrectionParser.QuestionBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#choices}.
	 * @param ctx the parse tree
	 */
	void enterChoices(InterviewModelCorrectionParser.ChoicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#choices}.
	 * @param ctx the parse tree
	 */
	void exitChoices(InterviewModelCorrectionParser.ChoicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(InterviewModelCorrectionParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(InterviewModelCorrectionParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#questionAnswer}.
	 * @param ctx the parse tree
	 */
	void enterQuestionAnswer(InterviewModelCorrectionParser.QuestionAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#questionAnswer}.
	 * @param ctx the parse tree
	 */
	void exitQuestionAnswer(InterviewModelCorrectionParser.QuestionAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#answerCotation}.
	 * @param ctx the parse tree
	 */
	void enterAnswerCotation(InterviewModelCorrectionParser.AnswerCotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#answerCotation}.
	 * @param ctx the parse tree
	 */
	void exitAnswerCotation(InterviewModelCorrectionParser.AnswerCotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelCorrectionParser#questionNumber}.
	 * @param ctx the parse tree
	 */
	void enterQuestionNumber(InterviewModelCorrectionParser.QuestionNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelCorrectionParser#questionNumber}.
	 * @param ctx the parse tree
	 */
	void exitQuestionNumber(InterviewModelCorrectionParser.QuestionNumberContext ctx);
}