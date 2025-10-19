package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<Double>();

        for(int i = 0; i < 5; i++){
            lista.add(new Random().nextDouble() * 100);
        }

        System.out.println("Antes da Ordenação");

        for (Double double1 : lista) {
            System.out.println(double1);
        }

        System.out.println("Depois da Ordenação");

        Collections.sort(lista, Collections.reverseOrder());

        for (Double double1 : lista) {
            System.out.println(double1);
        }
    }
}
