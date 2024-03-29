import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Integer[] numeros = {5, 2, 8, 1, 9, 4};
        List<Integer> numerosList = Arrays.asList(numeros);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : numerosList) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }


        System.out.println("sem ordenacao");
         System.out.println(pares);
        System.out.println(impares);

        Collections.sort(pares);
        Collections.sort(impares);

        System.out.println("com ordenacao");
        System.out.println(pares);
        System.out.println(impares);

        List<Integer> listaOrdenada = new ArrayList<>();
        listaOrdenada.addAll(pares);
        listaOrdenada.addAll(impares);

        System.out.println("Lista ordenada" + listaOrdenada);
}
}

