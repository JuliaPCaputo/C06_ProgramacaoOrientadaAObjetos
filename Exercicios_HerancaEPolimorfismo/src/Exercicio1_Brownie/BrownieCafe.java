package Exercicio1_Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome,  double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe() {
        System.out.println("Adicionando café extra.");
        System.out.println("");
    }
}
