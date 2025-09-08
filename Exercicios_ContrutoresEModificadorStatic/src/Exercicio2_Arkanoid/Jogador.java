package Exercicio2_Arkanoid;

public class Jogador {
    private int pontos;

    public void destruirBloco(Bloco bloco) {
        bloco.destruir();
        pontos++;
    }

    public int getPontos() {
        return this.pontos;
    }
}
