package br.com.alura.trycatch;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException(String message) {
        super(message);
    }
}
