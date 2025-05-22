package br.com.alura.interfaces;

public class ExibeResultadoTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(26);
        conversor.fahrenheitParaCelsius(78);
    }
}
