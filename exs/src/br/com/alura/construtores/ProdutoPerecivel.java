package br.com.alura.construtores;

public class ProdutoPerecivel extends Produto{
    String dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome,preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Requeijão", 20, 2, "10/10/2026");
        System.out.println(produtoPerecivel);
    }
}
