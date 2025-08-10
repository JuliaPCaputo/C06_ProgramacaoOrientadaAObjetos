import java.util.Random;
import java.util.Scanner;

public class Exercicio5_Adivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numGerado;
        int numAdivinhado;

        Random rand = new Random();
        numGerado = rand.nextInt(10) + 1;

        do {
            System.out.print("Em que número estou pensando? ");
            numAdivinhado = entrada.nextInt();

            if(numAdivinhado != numGerado)
                System.out.println("Tente novamente.");

        } while (numGerado != numAdivinhado);

        System.out.println("Acertou!");

        entrada.close();
    }
}