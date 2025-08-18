package Exercicio6_MarioKart;

public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    String mostraInfo() {
        System.out.println("Cilindradas: " + cilindradas);
        return "Velocidade Maxima: " + velocidadeMaxima;
    }
}
