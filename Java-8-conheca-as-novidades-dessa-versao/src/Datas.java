import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2022, Month.DECEMBER, 10);
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo);

        Period periodo2 = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo2.getYears());
        System.out.println(periodo2.getMonths());
        System.out.println(periodo2.getDays());

        System.out.println(hoje.minusYears(1));
        System.out.println(hoje.minusMonths(4));
        System.out.println(hoje.minusDays(2));

        System.out.println(hoje.plusYears(1));
        System.out.println(hoje.plusMonths(4));
        System.out.println(hoje.plusDays(2));

        olimpiadasRio.plusYears(4);
        System.out.println(olimpiadasRio);

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);


        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);


        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        YearMonth anoEMes = YearMonth.of(2022, Month.DECEMBER);

        LocalTime intervalo = LocalTime.of(12, 30);
        System.out.println(intervalo);

        LocalDate agora2 = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2099, Month.DECEMBER, 10);

        Period periodo3 = Period.between(agora2, dataFutura);
        System.out.println(periodo3);

    }
}