public class IdadePessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    String verificaIdade(int idade){
        if(idade >= 18){
           return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
