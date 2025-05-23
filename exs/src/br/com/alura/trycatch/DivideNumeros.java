package br.com.alura.trycatch;

import java.util.Scanner;

public class DivideNumeros {
    public static void main(String[] args)   {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitura.nextInt();

        System.out.println("Digite o segundo numeor: ");
        int numero2 = leitura.nextInt();

        try{
            int divide = numero1 / numero2;
            System.out.println("Resultado: " + divide);
        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida");
            System.out.println(e.getMessage());
        }
    }
}
