public class Musica {
    String nomeMusica;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println(nomeMusica);
        System.out.println(artista);
        System.out.println(anoLancamento);
    }
    void avaliaMedia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
       double media = avaliacao/numAvaliacoes;
    }


}
