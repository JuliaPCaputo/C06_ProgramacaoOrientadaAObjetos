// Exercicio 1 - Space Shooter

package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        // Criando as naves
        Nave nave1 = new Nave("Nave 1", 100, "Normal");
        Nave nave2 = new Nave("Nave 2", 150, "Explosivo");

        // Criando os asteróides
        Asteroide ast1 = new Asteroide("Ast 1", "Grande");
        Asteroide ast2 = new Asteroide("Ast2", "Pequeno");

        // Nave 1 atirando
        nave1.atirar(ast1);
        nave1.atirar(ast2);

        // Nave 2 atirando
        nave2.atirar(ast1);
        nave2.atirar(ast2);
    }
}
