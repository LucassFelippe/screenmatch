package br.com.alura.interfaces;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.98;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O Valor em R$: " + valorReal);
    }
}
