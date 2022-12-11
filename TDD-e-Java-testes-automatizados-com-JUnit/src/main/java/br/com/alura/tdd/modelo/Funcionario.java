package br.com.alura.tdd.modelo;

import br.com.alura.tdd.modelo.enums.DesempenhoEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public BigDecimal atualizarSalario(BigDecimal novoValor){
        return this.salario = novoValor;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario.setScale(2, RoundingMode.HALF_UP);
    }

}
