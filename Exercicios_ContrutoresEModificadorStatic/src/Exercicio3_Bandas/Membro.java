package Exercicio3_Bandas;

public class Membro {
    private String nome;
    private String funcao;

    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}
