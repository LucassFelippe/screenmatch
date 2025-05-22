package br.com.alura.carros.ranger;

public class TesteCarro extends ModeloCarro {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.definirModelo("Fusca");
        carro.definirPrecos(10000, 15000, 20000);
        carro.exibirInfos();
        carro.setCor("Vermelho");
        carro.setVersao("LXT");
        carro.getCor();
        carro.getVersao();
        carro.exibirDetalhes();
    }
}
