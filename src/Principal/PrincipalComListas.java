package Principal;

import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Series;
import br.com.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas{
    public static void main(String[] args) {
        Movie myFilme = new Movie("Poderoso Chefão", 1970);
        myFilme.avalia(10);

        Movie  outro = new Movie("John Wick", 2014);
        outro.avalia(9);

        Series serie = new Series("La Casa de Papel", 2017);

        List<Titulo> lista = new ArrayList<>();
        lista.add(myFilme);
        lista.add(outro);
        lista.add(serie);

        for(Titulo item : lista){
            System.out.println("Nome: " + item.getName());
            if (item instanceof Movie filme && filme.getClassificacao() > 2 ){
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        List<String> listaString = new ArrayList<>();

        listaString.add("Paulo");
        listaString.add("Adilson");
        listaString.add("Lucas");
        System.out.println("Lista de Strings: ");
        System.out.println(listaString);
        System.out.println("Ordenando lista...");
        Collections.sort(listaString);
        System.out.println("Lista de Strings ordenada: ");
        System.out.println(listaString);
        System.out.println("Listando [lista]");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista = lista -> ordenada: ");
        System.out.println(lista);
        System.out.println("Comparando por ano de Lançamento... ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento).reversed());
        System.out.println("Lista ordenado por ano de Lançamento: ");
        System.out.println(lista);


    }
}
