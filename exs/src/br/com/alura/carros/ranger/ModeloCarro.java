package br.com.alura.carros.ranger;

public class ModeloCarro extends Carro{
    private String cor;
    private String versao;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void exibirDetalhes(){
        System.out.println("Cor: " + cor);
        System.out.println("Versao: " + versao);
    }
}
