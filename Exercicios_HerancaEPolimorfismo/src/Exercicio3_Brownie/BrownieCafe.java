package Exercicio3_Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome,  double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe() {
        System.out.println("Adicionando café extra.");
        System.out.println("");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de café adicionado ao carrinho.");
        System.out.println("Preço: R$" + preco);
        System.out.println("");
        total += preco;
    }
}
