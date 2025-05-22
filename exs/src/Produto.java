public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void aplicarDesconto(double porcentagem){
        porcentagem = porcentagem/100;
        double valorDesconto = preco * (porcentagem/100);
        preco -= valorDesconto;
    }
}
