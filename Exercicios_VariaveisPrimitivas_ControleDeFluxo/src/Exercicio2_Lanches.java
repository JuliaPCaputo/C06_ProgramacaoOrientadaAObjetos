import java.util.Scanner;

public class Exercicio2_Lanches {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de lanche 1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche 2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche 3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        double media = (double) total/3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media dos lanches: " + media);
        entrada.close();
    }
}