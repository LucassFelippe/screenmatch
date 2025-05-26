package br.com.alura.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        String data = "Conteudo a ser gravado 2 ";

        try (FileWriter file = new FileWriter("Arquivo.txt")){
            file.write(data);
        }catch (IOException e){
            System.out.println("erro: " + e.getMessage());
        }
    }

}
