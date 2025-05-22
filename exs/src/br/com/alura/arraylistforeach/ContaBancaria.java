package br.com.alura.arraylistforeach;

import java.util.ArrayList;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(4829, 1000);
        ContaBancaria conta2 = new ContaBancaria(1375, 2000);
        ContaBancaria conta3 = new ContaBancaria(9042, 5000);
        ContaBancaria conta4 = new ContaBancaria(6581, 10000);

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        for(ContaBancaria maiorSaldo : listaContas){
            if (maiorSaldo.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = maiorSaldo;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
