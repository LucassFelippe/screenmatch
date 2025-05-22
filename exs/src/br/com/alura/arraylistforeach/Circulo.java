package br.com.alura.arraylistforeach;

import java.util.ArrayList;

public class Circulo implements Forma{
    double raio;
    @Override
    public double calcularArea(){
        return  Math.PI * raio * raio;

    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(quadrado);
        listaDeFormas.add(circulo);

        for (Forma forma : listaDeFormas){
            System.out.println("Area: " +forma.calcularArea());
        }

    }
}
