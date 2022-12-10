package br.alura.java.excecoes.bytebank.herdadoConta;


public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}

