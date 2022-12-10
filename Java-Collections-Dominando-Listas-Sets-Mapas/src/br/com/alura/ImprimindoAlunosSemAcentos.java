package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        System.out.println(alunos.size());

        alunos.add("Paulo");
        alunos.forEach(System.out::println);

        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);

        System.out.println(alunos.size());
    }
}
