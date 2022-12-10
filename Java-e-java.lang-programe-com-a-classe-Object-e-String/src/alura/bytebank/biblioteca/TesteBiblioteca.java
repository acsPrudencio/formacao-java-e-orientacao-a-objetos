package alura.bytebank.biblioteca;

import alura.bytebank.herdadoConta.modelo.Conta;
import alura.bytebank.herdadoConta.modelo.ContaCorrente;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.3);

        System.out.println(c.getSaldo());
    }
}
