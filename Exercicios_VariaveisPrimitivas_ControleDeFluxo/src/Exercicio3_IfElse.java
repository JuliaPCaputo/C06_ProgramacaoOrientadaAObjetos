import java.util.Scanner;

public class Exercicio3_IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double NP1 = entrada.nextDouble();
        double NP2 = entrada.nextDouble();
        double NPA = (NP1 + NP2) / 2;

        if(NPA < 30) {
            System.out.println("Reprovado");
        }
        else if(NPA >= 30 && NPA < 60) {
            double NP3 = entrada.nextDouble();
            double NFA = NPA + NP3;
            if((NFA / 2) >= 50) {
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
        }
        else {
            System.out.println("Aprovado");
        }

        entrada.close();
    }
}