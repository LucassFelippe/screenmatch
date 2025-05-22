package br.com.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private int totalVisualizacoes;
    private Series serie;

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getClassificacao(){
       if (totalVisualizacoes == 0){
           return 4;
       }else {
           return 2;
       }
   }
}
