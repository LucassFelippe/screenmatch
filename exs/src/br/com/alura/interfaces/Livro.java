package br.com.alura.interfaces;

public class Livro implements Calculavel{
    @Override
    public void calculaPrecoFinal(double valorProduto, double porcentagemDesconto){
        double resultadoPorcentagem = valorProduto * (porcentagemDesconto/100);
        double resultadoFinal = valorProduto - resultadoPorcentagem;
        System.out.println("O preco final do Livro é R$: " + resultadoFinal);
    }

}
