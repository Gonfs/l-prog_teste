package org.example;
import org.antlr.v4.runtime.*;
import org.example.InterviewModel.InterviewCompiled.InterviewModelLexer;
import org.example.InterviewModel.InterviewCompiled.InterviewModelParser;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class InterviewParser {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
       /* // Read the input file
        String inputFile = "src/main/java/org/example/model.txt"; // Ensure this file exists in the project root or provide the correct path
        CharStream input = CharStreams.fromFileName(inputFile);

        // Create a lexer and parser
        InterviewModelLexer lexer = new InterviewModelLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InterviewModelParser parser = new InterviewModelParser(tokens);

        // Parse the input and retrieve the answers
        parser.question();

        // Output the answers
        for (Map.Entry<String, String> entry : parser.answers.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }*/
        InterviewModelComplete itv = new InterviewModelComplete();
        int op=0;
        boolean sair=false;
        while(!sair) {
            System.out.println("Escolha a opção");
            System.out.println("1) Soluções da entrevista");
            System.out.println("2) Respostas ao Exame");
            System.out.println("0) Sair");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    itv.getAnswerCotation();
                    break;
                case 2:
                    itv.getUserAnswer();
                    break;
                case 0:
                    sair=true;
                    break;
            }
        }
    }
}
