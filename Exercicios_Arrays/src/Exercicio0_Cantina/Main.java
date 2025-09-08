package Exercicio0_Cantina;

public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        int i;

        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfirra";
        salgado3.nome = "Enroladinho";

        cantina.addSalgado(salgado1); // Adiciona a instância inteira
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();
    }
}
