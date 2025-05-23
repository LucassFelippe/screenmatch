package br.com.screenmatch.modelos;

import br.com.alura.exception.ErroDeConversaoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacaoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String name, int anoDeLancamento) {
        this.name = name;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.name = meuTituloOmdb.title();

        if(meuTituloOmdb.year() > 4){
            throw  new ErroDeConversaoException("Não consegui converter o ano de lançamento porque é maior que 4");
        }
            this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getName() {
        return name;
    }

    public double getSomaDasAvaliacaoes() {
        return somaDasAvaliacaoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println(name);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
    }
    public void avalia(double nota){
        somaDasAvaliacaoes += nota;
        totalDeAvaliacoes++;
    }

    public double totalMedia(){
        return somaDasAvaliacaoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", anoDeLancamento=" + anoDeLancamento + " duração " + duracaoEmMinutos;
    }
}
