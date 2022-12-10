package alura.bytebank.herdadoConta.teste;

import alura.bytebank.herdadoConta.modelo.Conta;
import alura.bytebank.herdadoConta.modelo.ContaCorrente;
import alura.bytebank.herdadoConta.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());

    }

}

