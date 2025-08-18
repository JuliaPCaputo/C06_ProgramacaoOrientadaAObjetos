package Exercicio5_Jogo;

public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    int usarArma() {
        return arma.resistencia -= 2;
    }

    int tomarDano() {
        return pontos -= 5;
    }
}
