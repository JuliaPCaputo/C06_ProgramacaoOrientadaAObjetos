package Exercicio3_Zumbi;

import Exercicio3_Zumbi.Zumbi;
    public class Main {
        public static void main(String[] args) {

            Zumbi zumbi1 = new Zumbi();
            Zumbi zumbi2 = new Zumbi();

            zumbi1.vida = 100;
            zumbi2.vida = 50;

            System.out.println(zumbi1.mostraVida());
            System.out.println(zumbi2.mostraVida());

            zumbi2.transfereVida(zumbi1, 40);
            zumbi1.transfereVida(zumbi2, 100);
            zumbi1.transfereVida(zumbi1, 200);

            System.out.println(zumbi1.mostraVida());
            System.out.println(zumbi2.mostraVida());

            zumbi1 = zumbi2;
            zumbi2.vida = 120;

            System.out.println(zumbi1.mostraVida());
            System.out.println(zumbi2.mostraVida());

            zumbi1.vida = 300;

            System.out.println(zumbi1.mostraVida());
            System.out.println(zumbi2.mostraVida());
        }
}