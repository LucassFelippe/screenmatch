package br.com.alura.arraylistforeach;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("PS5", 3000);
        Produto produto2 = new Produto("GTA VI", 400);
        Produto produto3 = new Produto("TV 4K", 2500);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double somaPrecos = 0;

        for(Produto itens : produtos){
            somaPrecos += itens.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.println("Preco medios dos produtos da lista: " + precoMedio);


    }
}
