package br.alura.java.excecoes.bytebank.herdadoConta;


public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}

