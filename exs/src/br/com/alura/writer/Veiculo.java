package br.com.alura.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    private String modelo;
    private int ano;
    private String cor;

    public Veiculo(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public static void main(String[] args) {
        Veiculo newVeiculo = new Veiculo("Ferrari",2025,"Vermelho");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(newVeiculo);
        System.out.println(json);
    }
}
