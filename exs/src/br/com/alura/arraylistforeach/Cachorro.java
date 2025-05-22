package br.com.alura.arraylistforeach;

public class Cachorro extends Animal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = cachorro; // upcasting implícito

        if (animal instanceof Cachorro) {
            cachorro = (Cachorro) animal; // downcasting seguro
            // Aqui você pode usar métodos específicos do Cachorro
        } else {
            System.out.println("O Objeto não é um cachorro");
        }
    }
}
