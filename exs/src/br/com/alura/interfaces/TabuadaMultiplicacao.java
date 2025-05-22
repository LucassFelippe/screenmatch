package br.com.alura.interfaces;

public class TabuadaMultiplicacao  implements Tabuada{

    @Override
    public void mostrarTabuada(int numero){
        for (int i = 1; i <11 ; i++) {
            int r = numero*i;
            System.out.println(numero + "x" + i + "=" + r);
        }
    }
}
