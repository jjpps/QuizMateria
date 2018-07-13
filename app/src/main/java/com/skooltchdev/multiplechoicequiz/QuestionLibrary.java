package com.skooltchdev.multiplechoicequiz;


public class QuestionLibrary {

    private String mQuestions [] = {
            "O número adequado que se encaixa na operação ___ - 98 = 102 é?",
            "Resolvendo a expressão 1.624 – (2.863 – 1.503) + 196, encontramos como resultado o número?",
            "O maior animal existente no planeta é a baleia-azul, podendo a chegar, quando adulta a 120 Toneladas. O número destacado na informação indica?",
            "Quais são o antecessor e o sucessor ímpares do número 9009?"
            "Determine o valor da expressão: 50 – (6 x 8 + 2).",
            "Qual das divisões tem 0 como resultado?",
			"Qual é √2 ?",
			"Qual o resultado correto da expressão 105 : 5 + 30",
			"Uma torneira mal fechada goteja 7 vezes a cada 20 segundos. Sabendo que 1 hora = 60 minutos e 1 minuto = 60 segundos, quantas vezes esta torneira goteja em 1 hora?",
			"Processo pelo qual os seres vivos autótrofos (produtores) produzem o seu alimento?",
			"Água, ar e solo são:",
			"É uma condição na vida da terra?",
			"Ao dizer onde uma espécie pode ser encontrada e o que faz no lugar onde vive, estamos informando, respectivamente:",
			"Ecologia  é mais propriamente o estudo?",
			"No passado, os continentes?",
			"Em que estação do ano os dias são mais longos e as noites mais curtas?",
			"Entre os pontos cardeais, nas posições intermediarias existe os pontos?",
			"O meridiano que divide a Terra em dois hemisférios, denominados Leste e Oeste, chama-se?",
			"O Paralelo do equador divide a Terra em dois hemisférios chamados?",
			"O que significa Translação?",
			"O que caracteriza o período Paleolítico?",
			"A maioria dos estudos apontados para qual região como o local do surgimento dos primeros seres humanos?",
			"O que caracteriza o período Noelítico?",
			"Relatos, músicas, depoimentos são exemplos de fontes históricas?",
			"Os antepassados dos seres humanos são chamados pelos cientistas de?"
    };


    private String mChoices [][] = {
            {"41", "82", "200","206"},
            {"41", "82", "406","206"},
            {"Quantidade", "Código", "Ordem","Medida"},
            {"9.005 e 9.013", "9.007 e 9.011", "9.003 e 9.011","Medida"},
            {"2","1","5","0"},
            {"7 : 0","9 : 9","0 : 10","1 : 1"},
			{"5","4","6","7"},
			{"50","49","61","51"},
			{"1.260","1.300","1.257","1.000"},
			{"Respiração","Fotossíntese","Proliferação","Digestão"},
			{"Ecossistema","Fatores Abióticos","Fatores Bióticos","Componentes do ar"},
			{"Presença de água","Presença de gases essenciais","Luz solar","Todos os descritos"},
			{"Nicho ecológico e habitat","Ecossistema e habitat","Habitat e nicho ecológico","Habitat e ecossistema"},
			{"Do comportamento dos animais em seu meio ambiente","Dos animais e suas variações com seu meio ambiente","Da evolução natural dos seres vivos","Das relações dos seres vivos entre si e com o meio ambiente"},
			{"Permaneceram sempre imóveis","Deslocaram-se lentamente","Já estiveram unidos","As opções B e C estão corretas"},
			{"Primavera","Verão","Outono","Inverno"},
			{"Laterais","Colaterais","Geográficos","Coordenados"},
			{"Greenwich","Equador","Trópico de Câncer","Trópico de Capricórnio"},
			{"Leste e poente","Oeste e nascente","Sul e Meridiano","Norte e Sul"},
			{"Movimento em torno do seu eixo imaginário","Movimento em torno do Sol","Tem duração de 24 horas","Tem como consequência os dias e as noites"},
			{"pedra polida","Pedra lascada","Agricultura","Sedentarismo"},
			{"África","América","Brasil","Canadá"},
			{"Caça e coleta","Nômades","Pedra polida","Fogo"},
			{"Visuais","Da cultura material","Orais","Escritas"},
			{"Seres vivos","Hominídeos","Fósseis","Dinossauros"}
    };



    private String mCorrectAnswers[] = {"200", "406", "Medida", "9.007 e 9.011","0","0 : 10","4","51","1.260","Fotossíntese","Ecossistema","Todos os descritos","Habitat e nicho ecológico",
	"Das relações dos seres vivos entre si e com o meio ambiente","As opções B e C estão corretas","Verão","Colaterais","Greenwich","Norte e Sul","Movimento em torno do Sol","Pedra lascada","África","Pedra polida","Orais","Dinossauros"
	
	};




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
