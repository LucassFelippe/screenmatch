package br.com.alura.interfaces;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double valor){
        double resultado = (valor*1.8) + 32;
        System.out.println("C: " + resultado);
    }

    @Override
    public void fahrenheitParaCelsius(double valor) {
        double resultado = (valor - 32) /1.8;
        System.out.println("F: " + resultado);
    }
}
