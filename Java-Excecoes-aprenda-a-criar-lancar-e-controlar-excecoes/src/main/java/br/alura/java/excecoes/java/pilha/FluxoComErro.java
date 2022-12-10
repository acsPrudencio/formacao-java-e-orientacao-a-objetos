package br.alura.java.excecoes.java.pilha;

public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaExcecao erro){
            String msg = erro.getMessage();
            System.out.println("Ops, aconteceu um erro, tente novamente mais tarde - " + msg);
            erro.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");

    }
}
