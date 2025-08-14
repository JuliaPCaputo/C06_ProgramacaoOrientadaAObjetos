package Zumbi1;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.nome = "Chris";
        zumbi.vida = 100;

        zumbi2.nome = "Christopher";
        zumbi2.vida = 200;

        zumbi.seAlimentar();
        zumbi2.seAlimentar();
    }
}