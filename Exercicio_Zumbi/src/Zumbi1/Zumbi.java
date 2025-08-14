package Zumbi1;

public class Zumbi {
    int vida;
    String nome;

    void seAlimentar() {
        System.out.println("Zumbi se alimentando..." + nome);
    }

    int mostrarVida() {
        return vida;
    }
}