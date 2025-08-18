package Exercicio6_MarioKart;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        piloto1.nome = "Mário";
        piloto2.nome = "Luigi";
        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        kart1.motor.cilindradas = "150";
        kart2.motor.cilindradas = "100";

        kart1.motor.velocidadeMaxima = 135;
        kart2.motor.velocidadeMaxima = 150;

        System.out.println(piloto1.soltaSuperPoder());
        System.out.println(piloto2.soltaSuperPoder());
        System.out.println(kart1.pular());
        System.out.println(kart2.pular());
        System.out.println(kart1.soltarTurbo());
        System.out.println(kart2.soltarTurbo());
        System.out.println(kart1.fazerDrift());
        System.out.println(kart2.fazerDrift());
        System.out.println("Piloto 1:");
        System.out.println(kart1.motor.mostraInfo());
        System.out.println("Piloto 2:");
        System.out.println(kart2.motor.mostraInfo());
    }
}
