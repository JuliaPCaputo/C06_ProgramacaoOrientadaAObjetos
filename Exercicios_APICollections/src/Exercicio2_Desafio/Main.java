package Exercicio2_Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <MinhaClasse> lista = new ArrayList<>();

        lista.add(new PrimeiraFilha("Texto 1", 6));
        lista.add(new PrimeiraFilha("Texto 2", 15));
        lista.add(new SegundaFilha("Texto 3", -3));
        lista.add(new SegundaFilha("Texto 4", 0));
        lista.add(new TerceiraFilha("Texto 5", 26));
        lista.add(new TerceiraFilha("Texto 6", -12));

        System.out.println("Antes da ordenação:");
        for(MinhaClasse elemento : lista) {
            System.out.println(elemento);
        }

        Collections.sort(lista);

        System.out.println("Depois da ordenação:");
        for(MinhaClasse elemento : lista) {
            System.out.println(elemento);
        }
    }
}
