package Exercicio1_Mamifero;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Kiara", 100);
        Lontra lontra = new Lontra("Nina", 100);
        Boi boi = new Boi("Ben", 100);

        cachorro.emitirSom();
        lontra.emitirSom();
        lontra.nadar();
        boi.emitirSom();

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();
    }
}