package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.InterviewModel.InterviewModelCorrection.InterviewModelCorrectionBaseVisitor;
import org.example.InterviewModel.InterviewModelCorrection.InterviewModelCorrectionLexer;
import org.example.InterviewModel.InterviewModelCorrection.InterviewModelCorrectionParser;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class InterviewModelComplete {
    public InterviewModelComplete() {
    }

    public void getAnswerCotation() throws IOException {
        InterviewModelVisitor visitor = new InterviewModelVisitor();
        // Read the input file
        CharStream input = CharStreams.fromFileName("src/main/java/org/example/quiz.txt");

        // Create the lexer and parser
        InterviewModelCorrectionLexer lexer = new InterviewModelCorrectionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InterviewModelCorrectionParser parser = new InterviewModelCorrectionParser(tokens);

        // Parse the input
        ParseTree tree = parser.cabecalhoSection();

        visitor.visit(tree);

        Map<String, List<String>> questionAnswers = visitor.getQuestionAnswers();
        for (Map.Entry<String, List<String>> entry : questionAnswers.entrySet()) {
            System.out.println("Question " + entry.getKey() + ":");
            for (String answer : entry.getValue()) {
                System.out.println("  " + answer);
            }
        }

    }
    public void getUserAnswer() throws IOException {
        CharStream input = CharStreams.fromFileName("src/main/java/org/example/quiz.txt");

        // Create the lexer and parser
        InterviewModelCorrectionLexer lexer = new InterviewModelCorrectionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InterviewModelCorrectionParser parser = new InterviewModelCorrectionParser(tokens);
        parser.cabecalhoSection();

        for(Map.Entry<String, String> q: parser.answers.entrySet()){
            System.out.println(q.getKey() + "\n" + q.getValue());
        }
    }
}




