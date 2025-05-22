package br.com.alura.interfaces;

public class ProdutoFisico implements Calculavel{

    @Override
    public void calculaPrecoFinal(double valorProduto, double porcentagemDesconto){
        double resultadoPorcentagem = valorProduto * (porcentagemDesconto/100);
        double resultadoFinal = valorProduto - resultadoPorcentagem;
        System.out.println("O valor final do Produto Fisico é R$: " + resultadoFinal);
    }
}
