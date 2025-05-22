package br.com.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    public Movie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (totalMedia()/2);
    }

    @Override
    public String toString() {
       return "Filme:"  + this.getName() + "(" + this.getAnoDeLancamento() + ")";

    }
}


