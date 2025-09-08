package Exercicio2_Arkanoid;

public class Bloco {
    static int numBlocos = 0;
    static int totalCriados = 0;
    static int totalDestruidos = 0;

    public Bloco() {
        numBlocos++;
        totalCriados++;
    }

    public void destruir() {
        System.out.println("Destruindo bloco.");
        numBlocos--;
        totalDestruidos++;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }

    public static int getTotalCriados() {
        return totalCriados;
    }

    public static int getTotalDestruidos() {
        return totalDestruidos;
    }
}
