// Generated from C:/Users/gonca/IdeaProjects/answers/src/main/java/org/example/InterviewModel/InterviewModelCorrection.g4 by ANTLR 4.13.1
package org.example.InterviewModel.InterviewModelCorrection;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewModelCorrectionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewModelCorrectionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#cabecalhoSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalhoSection(InterviewModelCorrectionParser.CabecalhoSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(InterviewModelCorrectionParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#answerSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerSection(InterviewModelCorrectionParser.AnswerSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalho(InterviewModelCorrectionParser.CabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroduction(InterviewModelCorrectionParser.IntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#multipleChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoice(InterviewModelCorrectionParser.MultipleChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(InterviewModelCorrectionParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#trueOrFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueOrFalseQuestion(InterviewModelCorrectionParser.TrueOrFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#valueQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueQuestion(InterviewModelCorrectionParser.ValueQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#dateQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateQuestion(InterviewModelCorrectionParser.DateQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#timeQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeQuestion(InterviewModelCorrectionParser.TimeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#scaleQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleQuestion(InterviewModelCorrectionParser.ScaleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#questionBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionBase(InterviewModelCorrectionParser.QuestionBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoices(InterviewModelCorrectionParser.ChoicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(InterviewModelCorrectionParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#questionAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionAnswer(InterviewModelCorrectionParser.QuestionAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#answerCotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerCotation(InterviewModelCorrectionParser.AnswerCotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelCorrectionParser#questionNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionNumber(InterviewModelCorrectionParser.QuestionNumberContext ctx);
}