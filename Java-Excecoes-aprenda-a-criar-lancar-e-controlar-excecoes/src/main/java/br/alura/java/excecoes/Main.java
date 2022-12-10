package br.alura.java.excecoes;

public class Main {
    public static void main(String[] args) {
        String str = "123";
        boolean isNumeric =  str.matches("[+-]?\\d*(\\d+)?");
        System.out.println(isNumeric);
        str = "121xy";
        isNumeric =  str.matches("[+-]?\\d*(\\.\\d+)?");
        System.out.println(isNumeric);
        str = "0x234";
        isNumeric =  str.matches("[+-]?\\d*(\\.\\d+)?");
        System.out.println(isNumeric);
    }
}