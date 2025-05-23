package br.com.alura.trycatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaUsuarios {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o usuario que quer buscar: ");
        String user = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + user;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new SenhaInvalidaException("Usuario não encontrado");
            }

            System.out.println("Usuario Encontrado: ");
            String json = response.body();
            System.out.println(json);

        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
