package Exercicio2_Zumbi;

public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}