package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir() {
        System.out.println("Asteróide " + tipoAsteroide + " sendo destruído.");
    }

    public String getTipoAsteroide() {
        return this.tipoAsteroide;
    }
}