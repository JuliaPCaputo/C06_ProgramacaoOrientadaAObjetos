package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast) {
        if(tipoTiro == "Explosivo") {
            ast.destruir();
        }
        else {
            if(ast.getTipoAsteroide() == "Pequeno") {
                ast.destruir();
            }
            else {
                System.out.println("Não é possível destruir um asteróide grande com um tiro Normal.");
            }
        }
    }
}