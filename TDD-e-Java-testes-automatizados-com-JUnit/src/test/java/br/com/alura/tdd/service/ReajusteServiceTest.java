package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enums.DesempenhoEnum;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ReajusteServiceTest {

    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("Antonio", LocalDate.now(), new BigDecimal(1000));
    }

    @AfterEach
    public void finalizar() {
        System.out.println("fim");
    }

    @BeforeAll
    public static void antesDeTodos() {
        System.out.println("ANTES DE TODOS");
    }

    @AfterAll
    public static void depoisDeTodos() {
        System.out.println("DEPOIS DE TODOS");
    }
    @Test
    void RejusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){
        reajusteService.calculaResjusteSalarial(funcionario, DesempenhoEnum.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void RejusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom(){
        reajusteService.calculaResjusteSalarial(funcionario, DesempenhoEnum.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void RejusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo(){
        reajusteService.calculaResjusteSalarial(funcionario, DesempenhoEnum.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
