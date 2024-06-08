// Generated from C:/Users/gonca/IdeaProjects/answers/src/main/java/org/example/InterviewModel/InterviewModel.g4 by ANTLR 4.13.1
package org.example.InterviewModel.InterviewCompiled;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(InterviewModelParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#multipleChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoice(InterviewModelParser.MultipleChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(InterviewModelParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#trueOrFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueOrFalseQuestion(InterviewModelParser.TrueOrFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#valueQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueQuestion(InterviewModelParser.ValueQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#dateQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateQuestion(InterviewModelParser.DateQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#timeQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeQuestion(InterviewModelParser.TimeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#scaleQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleQuestion(InterviewModelParser.ScaleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoices(InterviewModelParser.ChoicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModelParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(InterviewModelParser.ChoiceContext ctx);
}