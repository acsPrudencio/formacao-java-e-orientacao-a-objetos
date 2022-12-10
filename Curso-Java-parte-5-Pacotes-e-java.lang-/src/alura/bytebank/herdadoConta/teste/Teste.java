package alura.bytebank.herdadoConta.teste;

import alura.bytebank.herdadoConta.modelo.Cliente;
import alura.bytebank.herdadoConta.modelo.ContaCorrente;
import alura.bytebank.herdadoConta.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

        Object cc = new ContaCorrente(22,33);
        Object cp = new ContaPoupanca(33,22);
        Object cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);

        println(cc);
    }

    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}
    static void println(Object referencia) {}
}

