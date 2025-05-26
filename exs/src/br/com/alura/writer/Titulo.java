package br.com.alura.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    String nome;
    int anoLancamento;
    int episodios;

    public Titulo(String nome, int anoLancamento, int episodios) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.episodios = episodios;
    }

    public static void main(String[] args) {
        Titulo filme = new Titulo("Matrix", 2010, 10);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(filme);
        System.out.println(json);
    }
}
