public class Main {
    public static void main(String[] args) {

        Mamifero cachorro = new Cachorro("Kiara", 100);
        Mamifero lontra = new Lontra("Nina", 100);
        Mamifero boi = new Boi("Ben", 100);

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();
    }
}