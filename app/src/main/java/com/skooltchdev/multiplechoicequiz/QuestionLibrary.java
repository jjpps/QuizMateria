package com.skooltchdev.multiplechoicequiz;


public class QuestionLibrary {

    private String mQuestions [] = {
            "O número adequado que se encaixa na operação ___ - 98 = 102 é?",
            "Resolvendo a expressão 1.624 – (2.863 – 1.503) + 196, encontramos como resultado o número?",
            "O maior animal existente no planeta é a baleia-azul, podendo a chegar, quando adulta a 120 Toneladas. O número destacado na informação indica?",
            "Quais são o antecessor e o sucessor ímpares do número 9009?"

    };


    private String mChoices [][] = {
            {"41", "82", "200","206"},
            {"41", "82", "406","206"},
            {"Quantidade", "Código", "Ordem","Medida"},
            {"9.005 e 9.013", "9.007 e 9.011", "9.003 e 9.011","Medida"}
    };



    private String mCorrectAnswers[] = {"200", "406", "Medida", "9.007 e 9.011"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
