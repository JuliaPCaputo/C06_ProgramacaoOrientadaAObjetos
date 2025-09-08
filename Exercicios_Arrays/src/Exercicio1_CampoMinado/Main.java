package Exercicio1_CampoMinado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        // Gera um número aleatório entre 0 e 1
        int i = rand.nextInt(2);
        int j = rand.nextInt(2);

        boolean [][] campoMinado = new boolean[2][2]; // matriz 2x2
        campoMinado[i][j] = true;

        // Para ler do teclado a posição digitada
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a linha: ");
        int linha = entrada.nextInt();
        System.out.print("Digite a coluna: ");
        int coluna = entrada.nextInt();

        while(campoMinado[linha][coluna] == false){
            System.out.println("Não atingiu a mina! Tente novamente.");
            System.out.print("Digite a linha: ");
            linha = entrada.nextInt();
            System.out.print("Digite a coluna: ");
            coluna = entrada.nextInt();

            if(campoMinado[linha][coluna] == true){
                System.out.println("Você atingiu a mina!");
                break;
            }
        }
    }
}
