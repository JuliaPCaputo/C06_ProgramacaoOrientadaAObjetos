package Exercicio4_Zumbi;

public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if( vida - quantia >= 0) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else {
            return false;
        }
    }
}
