package Exercicio5_Jogo;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();
        personagem.arma = arma;

        arma.resistencia = 50;
        personagem.pontos = 50;

        System.out.println("Resistência: " + personagem.usarArma());
        System.out.println("Vida: " + personagem.tomarDano());
    }
}
