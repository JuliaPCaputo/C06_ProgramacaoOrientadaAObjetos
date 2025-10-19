package Exercicio3_Brownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;
    protected static double total = 0;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println(nome + " adicionado ao carrinho.");
        System.out.println("Preço: R$" + preco);
        System.out.println("");
        total += preco;
    }

    public static void calculaValorTotalCompra() {
        System.out.println("O valor total é: R$" + total);
        System.out.println("");
    }

    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Sabor: " + getSabor());
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}
