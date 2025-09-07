package Exercicio5_Jogo;

public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma() {
        System.out.println("Nome da arma: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistência: " + resistencia);
        System.out.println("Descrição: " + descricao);
    }
}
