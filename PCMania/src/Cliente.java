public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int quantidade;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
        this.quantidade = 0;
    }

    public float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < (computadores.length - 1); i++) {
            Computador pc = computadores[i];

            if (pc != null) {
                total += pc.getPreco();
            }
        }

        return total;
    }

    public void insertComputador(Computador computador) {
        if (quantidade <= computadores.length) {
            computadores[quantidade] = computador;
            quantidade++;
        } else {
            System.out.println("Limite de computadores atingido!");
        }
    }

    public int getQuantidadeDeComputadores() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}
