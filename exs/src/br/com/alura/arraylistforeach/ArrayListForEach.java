package br.com.alura.arraylistforeach;

import java.util.ArrayList;

public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Lucas");
        strings.add("Fernanda");
        strings.add("José");
        strings.add("Claudia");
        for(String nome : strings){
            System.out.println("Nome: " +nome);
        }
    }
}
