package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enums.DesempenhoEnum;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ReajustServiceTest {

    @Test
    void RejusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){
        ReajustService reajustService = new ReajustService();
        Funcionario funcionario = new Funcionario("Antonio", LocalDate.now(), new BigDecimal(1000));
        BigDecimal resultadoReajuste = reajustService.calculaResjusteSalarial(funcionario, DesempenhoEnum.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), resultadoReajuste);
    }

    @Test
    void RejusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom(){
        ReajustService reajustService = new ReajustService();
        Funcionario funcionario = new Funcionario("Antonio", LocalDate.now(), new BigDecimal(1000));
        BigDecimal resultadoReajuste = reajustService.calculaResjusteSalarial(funcionario, DesempenhoEnum.BOM);
        assertEquals(new BigDecimal("1150.00"), resultadoReajuste);
    }

    @Test
    void RejusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo(){
        ReajustService reajustService = new ReajustService();
        Funcionario funcionario = new Funcionario("Antonio", LocalDate.now(), new BigDecimal(1000));
        BigDecimal resultadoReajuste = reajustService.calculaResjusteSalarial(funcionario, DesempenhoEnum.OTIMO);
        assertEquals(new BigDecimal("1200.00"), resultadoReajuste);
    }
}
