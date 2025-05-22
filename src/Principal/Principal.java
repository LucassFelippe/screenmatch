package Principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendaçao;
import br.com.screenmatch.modelos.Episodios;
import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Minecraft", 2020);
        myMovie.setDuracaoEmMinutos(138);
        myMovie.setIncluidoNoPlano(true);

        myMovie.avalia(8);
        myMovie.avalia(5);
        myMovie.avalia(10);
        myMovie.avalia(7);
        myMovie.exibeFichaTecnica();
        System.out.println("Total de Avaliações: " + myMovie.getTotalDeAvaliacoes());
        System.out.println("Media: " +myMovie.totalMedia());

        Movie otherMovie = new Movie("Avatar", 2020);
        otherMovie.setDuracaoEmMinutos(200);

        var filmeDoPaulo = new Movie("DogVille", 2003);
        filmeDoPaulo.avalia(10);

        Series lost = new Series("Lost", 2000);
        lost.setTemporada(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.setDuracaoEmMinutos(5000);
        System.out.println(lost.getTemporada());
        System.out.println(lost.getName());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(otherMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Episodios primeiro = new Episodios();
        primeiro.setNumero(1);
        primeiro.setSerie(lost);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendaçao filtro = new FiltroRecomendaçao();
        filtro.filtrar(primeiro);

        ArrayList<Movie> listaDeFilmes = new ArrayList();
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(otherMovie);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println(listaDeFilmes);
        System.out.println("Nome do Filme do Paulo: " + listaDeFilmes.get(2).toString());
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());



    }
}