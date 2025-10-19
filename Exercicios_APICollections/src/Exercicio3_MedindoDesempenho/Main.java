package Exercicio3_MedindoDesempenho;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num = 100000; // valores a serem inseridos nas estruturas
        long tempoFinal, tempoInicial; // tempo para que cada estrutura seja preenchida

        List<Integer> lista = new ArrayList<Integer>();
        Set<Integer> conjunto = new HashSet<Integer>();
        Map<Integer,Integer> mapa = new HashMap<Integer, Integer>();

        // INSERÇÕES

        // List
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            lista.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("--- LIST ---");
        System.out.println("Tempo para inserção: " + (tempoFinal - tempoInicial) + " ms");

        // HashSet
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            conjunto.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n--- SET ---");
        System.out.println("Tempo para inserção: " + (tempoFinal - tempoInicial) + " ms");

        // HashMap
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            mapa.put(i, i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n--- MAP ---");
        System.out.println("Tempo para inserção: " + (tempoFinal - tempoInicial) + " ms");

        // BUSCAS

        // List
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            lista.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n--- LIST ---");
        System.out.println("Tempo para busca: " + (tempoFinal - tempoInicial) + " ms");
        // A busca é O(n), ou seja, lenta quando há muitos elementos

        // HashSet
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            conjunto.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n--- SET ---");
        System.out.println("Tempo para busca: " + (tempoFinal - tempoInicial) + " ms");
        // A busca é O(n)

        // HashMap
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            mapa.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n--- MAP ---");
        System.out.println("Tempo para busca: " + (tempoFinal - tempoInicial) + " ms");
        // A busca é O(n)
    }
}
