package br.com.alura.screenmatch.calculo;

import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Series;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    /*public void inclui(Movie f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Series s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/

    // Polimorfismo ->

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
