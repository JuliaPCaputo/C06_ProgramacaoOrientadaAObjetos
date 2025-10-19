package Exemplo;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome,  double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando doce de leite extra.");
        System.out.println("");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Exemplo.Brownie de doce de leite adicionado ao carrinho.");
        System.out.println("Preço: R$" + preco);
        System.out.println("");
        total += preco;
    }
}
