package Principal;

import br.com.alura.exception.ErroDeConversaoException;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String busca = "";

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do filme: ");
             busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=98f10c4b";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);


                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);

                FileWriter escrita = new FileWriter("filme.txt");
                escrita.write(gson.toJson(titulos));
                escrita.close();



            } catch (NumberFormatException e) {
                System.out.println("ocorreu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException | JsonSyntaxException e) {
                System.out.println("Ocorreu um erro de argumentação ou json.");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoException e) {
                System.out.println(e.getMessage());

            }
        }

        System.out.println("Programa finalizou corretamente.");




    }
}
