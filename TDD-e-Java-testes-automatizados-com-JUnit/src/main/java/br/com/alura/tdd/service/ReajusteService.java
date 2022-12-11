package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enums.DesempenhoEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {
    public BigDecimal calculaResjusteSalarial(Funcionario funcionario, DesempenhoEnum desempenho) {
        BigDecimal salarioReajustado = BigDecimal.ZERO;
        final BigDecimal salario = funcionario.getSalario();
        salarioReajustado = salario.add(salario.multiply(desempenho.percentualReajuste()));

        return funcionario.atualizarSalario(salarioReajustado).setScale(2, RoundingMode.HALF_UP);
    }

}
