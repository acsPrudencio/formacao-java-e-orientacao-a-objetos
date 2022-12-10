package br.alura.java.excecoes.bytebank.herdadoConta;


public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }

}

