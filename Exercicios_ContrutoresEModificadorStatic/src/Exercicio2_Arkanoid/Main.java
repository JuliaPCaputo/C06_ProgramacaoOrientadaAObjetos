package Exercicio2_Arkanoid;

public class Main {
    public static void main(String[] args) {
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();

        System.out.println("Há " + Bloco.getNumBlocos() + " bloco(s) no jogo.");

        Jogador jogador = new Jogador();
        jogador.destruirBloco(bloco1);

        System.out.println("Há " + Bloco.getNumBlocos() + " bloco(s) no jogo.");
        System.out.println("O jogador tem " + jogador.getPontos() + " ponto(s).");

        jogador.destruirBloco(bloco2);
        jogador.destruirBloco(bloco3);

        System.out.println("Há " + Bloco.getNumBlocos() + " bloco(s) no jogo.");
        System.out.println("Foram criados " + Bloco.getTotalCriados() + " blocos.");
        System.out.println("Foram destruídos " + Bloco.getTotalDestruidos() + " blocos.");
        System.out.println("O jogador tem " + jogador.getPontos() + " ponto(s).");
        Conversor.converter(jogador.getPontos());
    }
}
