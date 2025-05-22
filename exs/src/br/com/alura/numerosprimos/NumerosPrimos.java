package br.com.alura.numerosprimos;

public class NumerosPrimos {
    private int numero;

    public void verificarPrimalidade(int numero){
        this.numero = numero;
        if (numero <= 1){
            System.out.println("Não é primo");
        }if (numero % numero == 0){
            System.out.println("Primo");
        }

    }

    public void listarPrimos(){

    }
}
