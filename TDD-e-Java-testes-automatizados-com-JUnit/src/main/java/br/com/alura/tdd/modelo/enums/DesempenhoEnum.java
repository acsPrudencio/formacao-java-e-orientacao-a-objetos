package br.com.alura.tdd.modelo.enums;

import java.math.BigDecimal;

public enum DesempenhoEnum {
    A_DESEJAR("A Desejar"){
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal(0.03);
        }
    },
    BOM("Bom"){
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal(0.15);
        }
    },
    OTIMO("Ótimo"){
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal(0.20);
        }
    };

    DesempenhoEnum(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public abstract BigDecimal percentualReajuste();
}
