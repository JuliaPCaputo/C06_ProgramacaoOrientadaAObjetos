package Exercicio4_Zumbi;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 50;

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

        System.out.println("Transferência 1: " + zumbi2.transfereVida(zumbi1, 40));
        System.out.println("Transferência 2: " + zumbi1.transfereVida(zumbi2, 150));

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());
    }
}
