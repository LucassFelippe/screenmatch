package br.com.alura.arraylistordenandodados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

       listaNumeros.add(35);
       listaNumeros.add(6);
       listaNumeros.add(100);

        Collections.sort(listaNumeros);
        System.out.println("Lista Ordenada: " + listaNumeros);



    }
}
