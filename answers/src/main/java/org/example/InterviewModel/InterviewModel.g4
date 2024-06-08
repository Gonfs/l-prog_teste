grammar InterviewModel;

@parser::header { // classes to include
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.TreeMap;
}
@parser::members {
	TreeMap<String, String> answers = new TreeMap<>();
}


// Parser rules
question: (multipleChoice|shortAnswerQuestion|trueOrFalseQuestion|valueQuestion|timeQuestion|dateQuestion|scaleQuestion|NEWLINE)+;

multipleChoice returns[String questionText, String answer]: t='[Escolha multipla] Questao ' n=NUMBER (TEXT)+ NEWLINE choices 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

shortAnswerQuestion returns[String questionText, String answer]: t='[Responda de forma breve] Questao ' n=NUMBER (TEXT)+ NEWLINE 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

trueOrFalseQuestion returns[String questionText, String answer]: t='[V/F] Questao ' n=NUMBER (TEXT)+ NEWLINE 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

valueQuestion returns[String questionText, String answer]: t='[Valor Inteiro/Decimal] Questao ' n=NUMBER (TEXT)+ NEWLINE 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

dateQuestion returns[String questionText, String answer]: t='[Data] Questao ' n=NUMBER (TEXT)+ NEWLINE 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

timeQuestion returns[String questionText, String answer]: t='[Tempo] Questao ' n=NUMBER (TEXT)+ NEWLINE 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

scaleQuestion returns[String questionText, String answer]: t='[Intervalo] Questao ' n=NUMBER (TEXT)+ NEWLINE 'Resposta:' a=TEXT*{$questionText=$t.getText()+$n.getText(); $answer= $a.getText(); answers.put($questionText, $answer);};

//questionText: (TEXT)+;
choices: (choice)+;

choice: CHAR (TEXT)+ NEWLINE;


// Lexer rules
TEXT : [a-zA-Z0-9_,;?# ]+;
//QUESTIONID: 'Questao ' NUMBER '[Escolha multipla]: ';
CHAR : [a-z] '.';
NEWLINE : '\n';
NUMBER: [0-9]+ ':';
WS : [ \r]+ -> skip;
