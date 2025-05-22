package br.com.alura.banco;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;

    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}
