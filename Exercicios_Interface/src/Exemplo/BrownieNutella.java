package Exemplo;

public class BrownieNutella extends Brownie implements DorDeBarriga {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {
        System.out.println("Adicionando nutella extra.");
        System.out.println();
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Exemplo.Brownie de nutella adicionado ao carrinho.");
        System.out.println("Preço: R$" + preco);
        System.out.println();
        total += preco;
    }

    @Override
    public void dorDeBarriga() {
        System.out.println("O Brownie de nutella dá dor de barriga!");
        System.out.println();
    }
}
