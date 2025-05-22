package br.com.alura.banco;

public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.depositar(1000);
        minhaConta.consultarSaldo();

        ContaCorrente minhaContaCorrente = new ContaCorrente();
        minhaContaCorrente.depositar(1000);
        minhaContaCorrente.cobrarTarifaMensal();
        minhaContaCorrente.sacar(400);
        minhaContaCorrente.consultarSaldo();

    }

    }
