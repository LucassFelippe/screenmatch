package br.com.alura.arraylistordenandodados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }


    public static void main(String[] args) {
        List<Titulo> lista = new ArrayList<>();

        Titulo nome1 = new Titulo("Lucas");
        Titulo nome2 = new Titulo("Fernanda");
        Titulo nome3 = new Titulo("Jose");
        Titulo nome4 = new Titulo("Abreu");
        Titulo nome5 = new Titulo("Carlos");
        Titulo nome6 = new Titulo("Geovanna");

        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);
        lista.add(nome4);
        lista.add(nome5);

        Collections.sort(lista);
        for(Titulo nomes : lista){
            System.out.println(nomes.getNome());
        }
    }
}
