package br.com.alura.interfaces;

public class ExibeValorFinal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        livro.calculaPrecoFinal(100, 10);
        produtoFisico.calculaPrecoFinal(500, 50 );

    }
}
