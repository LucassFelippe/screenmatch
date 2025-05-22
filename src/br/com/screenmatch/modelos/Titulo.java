package br.com.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String name;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacaoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String name, int anoDeLancamento) {
        this.name = name;
        this.anoDeLancamento = anoDeLancamento;
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
}
