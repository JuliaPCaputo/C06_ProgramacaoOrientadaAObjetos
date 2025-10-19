package Exercicio1_Brownie;

public class Main {
    public static void main(String[] args) {

        BrownieNutella bNutella = new BrownieNutella("Nutella", 11.75, "nutella");
        BrownieCafe bCafe = new BrownieCafe("Café", 9.50, "café");
        BrownieDoceDeLeite bDoceLeite = new BrownieDoceDeLeite("Doce de leite", 8.00, "doce de leite");

        bNutella.mostraInfo();
        bCafe.mostraInfo();
        bDoceLeite.mostraInfo();

        bNutella.adicionaNutella();
        bNutella.addCarrinhoDeCompras();

        bCafe.adicionaCafe();
        bCafe.addCarrinhoDeCompras();

        bDoceLeite.adicionaDoceDeLeite();
        bDoceLeite.addCarrinhoDeCompras();

        bNutella.addCarrinhoDeCompras();

        Brownie.calculaValorTotalCompra();
    }
}