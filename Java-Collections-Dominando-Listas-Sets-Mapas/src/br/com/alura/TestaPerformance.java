package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaPerformance {

    public static void main(String[] args) {
        int j = 0;
        String tipo = "ArrayList";
        do {
            Collection<Integer> numeros = new ArrayList<Integer>();
            if (tipo.equalsIgnoreCase("HashSet")){
                numeros = new HashSet<Integer>() {};
                tipo = "HashSet";
            }

        long inicio = System.currentTimeMillis();

        long insercaoInicio = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long insercaoFim = System.currentTimeMillis();

        long tempoTotalInsercao = insercaoFim - insercaoInicio;

        long buscarInicio = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long buscarFim = System.currentTimeMillis();

        long tempoTotalbuscar = buscarFim - buscarInicio;

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        StringBuilder saida = new StringBuilder();
        saida.append(tipo)
                .append(" - Tempo gasto: ")
                .append(tempoDeExecucao)
                .append("\n")
                .append("Tempo de busca: ")
                .append(tempoTotalbuscar)
                .append("\n")
                .append("Tempo de insercao: ")
                .append(tempoTotalInsercao)
                .append("\n");
        System.out.println(saida);
        tipo = "HashSet";
        j++;
        }while (j<2);
    }

}