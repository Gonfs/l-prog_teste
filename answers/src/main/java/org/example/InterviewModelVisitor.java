package org.example;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.InterviewModel.InterviewModelCorrection.InterviewModelCorrectionBaseVisitor;
import org.example.InterviewModel.InterviewModelCorrection.InterviewModelCorrectionParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class InterviewModelVisitor extends InterviewModelCorrectionBaseVisitor<Void> {


    private final Map<String, List<String>> questionAnswers = new TreeMap<>();

    public InterviewModelVisitor() {
    }

    @Override
    public Void visitQuestionAnswer(InterviewModelCorrectionParser.QuestionAnswerContext ctx) {
        List<String> answers = new ArrayList<>();
        String questionNumber = ctx.questionNumber().getText();
        for (InterviewModelCorrectionParser.AnswerCotationContext answerCtx : ctx.answerCotation()) {
            StringBuilder answer = new StringBuilder();
            for(TerminalNode text: answerCtx.TEXT()){
                answer.append(text.getText()).append(" ");
            }

            answer.append(answerCtx.COTACAO().getText());
            answers.add(answer.toString().trim());
        }
        questionAnswers.put(questionNumber, answers);
        return null;
    }

    public Map<String, List<String>> getQuestionAnswers() {
        return questionAnswers;
    }
}
