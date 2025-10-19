package Exercicio2_Desafio;

public abstract class MinhaClasse implements Comparable<MinhaClasse> {
    String texto;
    int numero;

    public MinhaClasse(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
    }

    // Para ordenar em ordem decrescente
    @Override
    public int compareTo(MinhaClasse o) {
        return Integer.compare(o.numero, this.numero);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "Texto = '" + texto + "', Numero = " + numero + "}";
    }
}
