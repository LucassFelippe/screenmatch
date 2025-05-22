public class Principal {
    public static void main(String[] args) {
        Pessoa myPessoa = new Pessoa();
        Calculadora myCalculadora = new Calculadora();
        Musica myMusica = new Musica();

        myMusica.nomeMusica = "Nome Musica: Mockbird";
        myMusica.artista = "Nome Artista: Eminen";
        System.out.println(myMusica.anoLancamento);
        myMusica.anoLancamento = 2020;
        myMusica.avaliacao = 8.5;
        myMusica.avaliacao = 10;
        myMusica.avaliacao = 5;



        myMusica.exibeFichaTecnica();
        myCalculadora.calculaNumero(10);
        System.out.println(myCalculadora.calculaNumero(10));
        myPessoa.exibeMensagem();
    }
}
