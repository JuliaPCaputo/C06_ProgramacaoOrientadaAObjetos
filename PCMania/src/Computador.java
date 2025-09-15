public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardware;
    private SistemaOperacional so;
    private MemoriaUSB musb;

    public Computador(String marca, float preco, HardwareBasico[] hardware, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.so = so;
        this.musb = null;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Hardware:");

        for (HardwareBasico h : hardware) {
            System.out.println(" - " + h.getNome() + " (" + h.getCapacidade() + ")");
        }

        System.out.println("Sistema Operacional: " + so.getNome() + " " + so.getTipo());
        if (musb != null) {
            System.out.println("Memória USB: " + musb.getNome() + " " + musb.getCapacidade());
        }

        System.out.println("Preço: R$" + preco);
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public float getPreco() {
        return preco;
    }
}