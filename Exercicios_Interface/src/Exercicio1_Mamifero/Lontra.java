package Exercicio1_Mamifero;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de lontra");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nadando.");
    }
}
