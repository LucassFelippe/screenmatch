package br.com.alura.carros.ranger;

public class Carro{
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1,double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfos(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco ano 1: " + precoAno1);
        System.out.println("Preco ano 2: " + precoAno2);
        System.out.println("Preco ano 3: " + precoAno3);
        System.out.println("Maior preço: " + calculaMaiorPreco());
        System.out.println("Menor preço: " + calculaMenorPreco());
    }


    private double calculaMaiorPreco(){
        double maior = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        return maior;
    }

    private double calculaMenorPreco(){
        double menor = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        return menor;
    }



}
