package Exercicio6_MarioKart;

public class Kart {
    String nome;
    Motor motor;

    String pular() {
        return nome + " pulou.";
    }

    String soltarTurbo() {
        return nome + " soltou turbo.";
    }

    String fazerDrift() {
         return nome + " fez drift.";
    }

    public Kart() {
        motor = new Motor();
    }
}
