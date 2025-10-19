package Exercicio3_Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie) {
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        brownie.getNome();
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
