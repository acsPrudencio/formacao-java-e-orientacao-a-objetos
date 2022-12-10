package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));


        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);


        System.out.println(aulasMutaveis);
        System.out.println(javaColecoes);



    }

}
