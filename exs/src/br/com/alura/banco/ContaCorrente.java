package br.com.alura.banco;

public class ContaCorrente  extends ContaBancaria{
    private double tarifaMensal = 100;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Cobrando tarifa mensal de: " + tarifaMensal + "Cobrada. Saldo Atual: " + saldo);
    }
}
