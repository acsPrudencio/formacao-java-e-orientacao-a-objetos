package br.com.alura;

import java.util.*;

public class TesteAluno {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Antonio");
        alunos.add("João");
        alunos.add("Brena");
        alunos.add("Junior");
        alunos.add("Lucas");

        System.out.println(alunos);
        System.out.println(alunos.contains("Antonio"));

        Collection<String> alunos2 = new HashSet<>();

        alunos2.add("Antonio2");
        alunos2.add("João2");
        alunos2.add("Brena2");
        alunos2.add("Junior2");
        alunos2.add("Lucas2");

        System.out.println(alunos2);
        System.out.println(alunos2.contains("Antonio2"));

        Collection<String> alunos3 = new ArrayList<>();

        alunos3.add("Antonio3");
        alunos3.add("João3");
        alunos3.add("Brena3");
        alunos3.add("Junior3");
        alunos3.add("Lucas3");

        System.out.println(alunos3);
        System.out.println(alunos3.contains("Antonio3"));

//      Recebe uma copia com os valores de alunos3
        List<String> alunos4 = new ArrayList<>(alunos3);

        System.out.println(alunos4);
        System.out.println(alunos4.get(0));
        System.out.println(alunos4.getClass());


    }
}
