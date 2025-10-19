package Exercicio1_Mamifero;

public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }
}
