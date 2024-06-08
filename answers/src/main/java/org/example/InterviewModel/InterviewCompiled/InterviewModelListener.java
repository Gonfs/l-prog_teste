// Generated from C:/Users/gonca/IdeaProjects/answers/src/main/java/org/example/InterviewModel/InterviewModel.g4 by ANTLR 4.13.1
package org.example.InterviewModel.InterviewCompiled;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewModelParser}.
 */
public interface InterviewModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(InterviewModelParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(InterviewModelParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#multipleChoice}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoice(InterviewModelParser.MultipleChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#multipleChoice}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoice(InterviewModelParser.MultipleChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(InterviewModelParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(InterviewModelParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#trueOrFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueOrFalseQuestion(InterviewModelParser.TrueOrFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#trueOrFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueOrFalseQuestion(InterviewModelParser.TrueOrFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#valueQuestion}.
	 * @param ctx the parse tree
	 */
	void enterValueQuestion(InterviewModelParser.ValueQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#valueQuestion}.
	 * @param ctx the parse tree
	 */
	void exitValueQuestion(InterviewModelParser.ValueQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void enterDateQuestion(InterviewModelParser.DateQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void exitDateQuestion(InterviewModelParser.DateQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTimeQuestion(InterviewModelParser.TimeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTimeQuestion(InterviewModelParser.TimeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#scaleQuestion}.
	 * @param ctx the parse tree
	 */
	void enterScaleQuestion(InterviewModelParser.ScaleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#scaleQuestion}.
	 * @param ctx the parse tree
	 */
	void exitScaleQuestion(InterviewModelParser.ScaleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#choices}.
	 * @param ctx the parse tree
	 */
	void enterChoices(InterviewModelParser.ChoicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#choices}.
	 * @param ctx the parse tree
	 */
	void exitChoices(InterviewModelParser.ChoicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModelParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(InterviewModelParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModelParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(InterviewModelParser.ChoiceContext ctx);
}