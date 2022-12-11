package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService bonusService = new BonusService();
        assertThrows(IllegalArgumentException.class,
                () -> bonusService.calcularBonus(new Funcionario("Antonio", LocalDate.now(), new BigDecimal(20000))));

    }

    @Test
    void testeComTryCathcBonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService bonusService = new BonusService();
        try {
            bonusService.calcularBonus(new Funcionario("Antonio", LocalDate.now(), new BigDecimal(20000)));
            fail();
        }catch (Exception e){}
    }

    @Test
    void bonusDeveriaSerDezPorcentoDoSalario(){
        BonusService bonusService = new BonusService();
        BigDecimal valorDoBonus = bonusService.calcularBonus(new Funcionario("Antonio", LocalDate.now(), new BigDecimal(2500)));
        assertEquals(new BigDecimal("250.00"),valorDoBonus);
    }
    @Test
    void bonusDeveriaSerDezPorcentoParaSalarioExatamente1000(){
        BonusService bonusService = new BonusService();
        BigDecimal valorDoBonus = bonusService.calcularBonus(new Funcionario("Antonio", LocalDate.now(), new BigDecimal(10000)));
        assertEquals(new BigDecimal("1000.00"),valorDoBonus);
    }

}