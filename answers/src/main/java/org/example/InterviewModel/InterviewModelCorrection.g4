grammar InterviewModelCorrection;

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
cabecalhoSection: cabecalho+  WS? introduction 'Questionario' NEWLINE? question 'Solucoes' answerSection;

question: (multipleChoice|shortAnswerQuestion|trueOrFalseQuestion|valueQuestion|timeQuestion|dateQuestion|scaleQuestion|NEWLINE)+;

answerSection: (questionAnswer|WS)+;

cabecalho: TEXT+ ':' WS? TEXT* NEWLINE?;

introduction: 'Introducao' ((TEXT+|PONTO)+ NEWLINE?)+;

multipleChoice returns[String questionText, String answer]: t='[Escolha multipla] ' questionBase choices 'Resposta:' a=TEXT*{
$questionText=$questionText+$t.getText();
$answer = ($a != null) ? $a.getText():"No answer provided";
answers.put($questionText, $answer);};

shortAnswerQuestion returns [String questionText, String answer]:
    t='[Responda de forma breve] Questao' WS? n=NUMBER WS? q=TEXT+ (PONTO|INTERROGACAO) WS? 'Resposta:' WS? a=TEXT* {
        $questionText = $t.getText() + " " + $n.getText() + ": ";
        $answer = ($a != null) ? $a.getText():"No answer provided";
        answers.put($questionText, $answer);
    };
trueOrFalseQuestion returns[String questionText, String answer]: t='[V/F] Questao ' n=NUMBER TEXT+ (PONTO|INTERROGACAO) WS? 'Resposta:' a=TEXT*{
$questionText=$t.getText()+$n.getText();
$answer= $answer = ($a != null) ? $a.getText():"No answer provided";
answers.put($questionText, $answer);};

valueQuestion returns[String questionText, String answer]: t='[Valor Inteiro/Decimal] Questao ' n=NUMBER TEXT+ (PONTO|INTERROGACAO) WS? 'Resposta:' a=TEXT*{
$questionText=$t.getText()+$n.getText();
$answer = ($a != null) ? $a.getText():"No answer provided"; answers.put($questionText, $answer);};

dateQuestion returns[String questionText, String answer]: t='[Data] Questao ' n=NUMBER TEXT+ (PONTO|INTERROGACAO) WS? 'Resposta:' a=TEXT*{
$questionText=$t.getText()+$n.getText();
$answer = ($a != null) ? $a.getText():"No answer provided";
answers.put($questionText, $answer);};

timeQuestion returns[String questionText, String answer]: t='[Tempo] Questao ' n=NUMBER TEXT+ (PONTO|INTERROGACAO) WS? 'Resposta:' a=TEXT*{
$questionText=$t.getText()+$n.getText();
 $answer = ($a != null) ? $a.getText():"No answer provided";
 answers.put($questionText, $answer);};

scaleQuestion returns[String questionText, String answer]: t='[Intervalo] Questao ' n=NUMBER TEXT+ (PONTO|INTERROGACAO) WS? 'Resposta:' a=TEXT*{
$questionText=$t.getText()+$n.getText();
$answer = ($a != null) ? $a.getText():"No answer provided";
answers.put($questionText, $answer);};

questionBase returns [String questionText]: t='Questao' WS? n=NUMBER WS? q=TEXT+ (PONTO|INTERROGACAO) NEWLINE?{$questionText=$t.getText()+$n.getText();};


choices: choice+;

choice: CHAR TEXT+ PONTO WS? NEWLINE?;

questionAnswer: questionNumber answerCotation+;
answerCotation: 'Resposta:' WS? (TEXT+|INT) WS? COTACAO WS?;
questionNumber: 'Questao' WS? INT WS?;
COTACAO: 'Pontos:' WS? INT;

// Lexer rules
WS: [ \t\r\n]+ -> skip;
SPACE: [ ]+ -> skip;
INT: [0-9]+;
NUMBER: [0-9]+ ':';
TEXT: [a-zA-Z0-9/,-]+;
//QUESTIONID: 'Questao' NUMBER '[Escolha multipla]: ';
CHAR : [a-z] '.';
NEWLINE : '\n';
PONTO: '.';
INTERROGACAO: '?';
LETTER: [a-z];
ESCOLHA: (LETTER ((',' LETTER)*)) '.';

QUESTIONANSWER: 'Questao ' INT;

fragment ESCOLHA_MULTIPLA: '[Escolha Multipla]';
fragment RESPOSTA_BREVE: '[Responda de forma breve]';
fragment VF: '[V/F]';
fragment VALOR: '[Valor Inteiro/Decimal]';
fragment DATA: '[Data]';
fragment TEMPO: '[Tempo]';
fragment INTERVALO: '[Intervalo]';
fragment OPCAO: '[Opcao]';
fragment NUMERO: '[Numero]';