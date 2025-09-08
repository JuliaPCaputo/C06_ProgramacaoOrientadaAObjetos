package Exercicio3_Bandas;

public class Banda {
    private String nome;
    private String genero;
    private Empresario empresario;
    private Membro[] membros;
    private Musica[] musicas;
    private int numMembros;
    private int numMusicas;

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);

        if(empresario != null){
            System.out.println("Empresário: " + empresario.getNome());
        } else {
            System.out.println("Empresário: A banda não possui um empresário.");
        }

        System.out.println("Membros: " + numMembros);
        for(int i = 0; i < numMembros; i++){
            System.out.println(" - " + membros[i].getNome());
        }

        System.out.println("Músicas: " + numMusicas);
        for(int i = 0; i < numMusicas; i++){
            System.out.println(" - " + musicas[i].getNome());
        }
    }

    public void addMusicaNova(Musica musica) {
        if(numMusicas < musicas.length) {
            musicas[numMusicas++] = musica;
        } else {
            System.out.println("A quantidade máxima de músicas foi atingida.");
        }
    }

    public void addMembroNovo(Membro membro) {
        if(numMembros < membros.length) {
            membros[numMembros++] = membro;
        } else {
            System.out.println("A quantidade máxima de membros foi atingida.");
        }
    }

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.membros = new Membro[6];
        this.musicas = new Musica[100];
        this.numMembros = 0;
        this.numMusicas = 0;
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }
}
