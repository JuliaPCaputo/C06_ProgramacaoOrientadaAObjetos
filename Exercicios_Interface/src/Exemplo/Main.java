package Exemplo;

public class Main {
    public static void main(String[] args) {

        Comprador comprador = new Comprador("Júlia", 50);

        BrownieNutella bNutella = new BrownieNutella("Nutella", 11.75, "nutella");
        BrownieCafe bCafe = new BrownieCafe("Café", 9.50, "café");
        BrownieDoceDeLeite bDoceLeite = new BrownieDoceDeLeite("Doce de leite", 8.00, "doce de leite");

        bNutella.mostraInfo();
        bNutella.dorDeBarriga();
        bCafe.mostraInfo();
        bDoceLeite.mostraInfo();

        bNutella.adicionaNutella();
        comprador.efetuarCompra(bNutella);

        bCafe.adicionaCafe();
        comprador.efetuarCompra(bCafe);

        bDoceLeite.adicionaDoceDeLeite();
        comprador.efetuarCompra(bDoceLeite);

        comprador.efetuarCompra(bNutella);
    }
}