import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//        cursos.forEach(curso -> System.out.println(curso.getNome()));

//        cursos.stream()
//                .filter( curso ->  curso.getAlunos() >= 100)
//                .forEach(curso -> System.out.println(curso.getNome()));

        cursos.stream()
                .filter( curso ->  curso.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        int totalDeAlunos = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.printf("""
                Total de alunos %s
                """,totalDeAlunos);

        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .findFirst()
                .ifPresent(c -> System.out.println(c.getNome()));
        System.out.println();

        List<Curso> cursoList = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toList());

        cursoList.stream()
                .forEach(curso -> System.out.println(curso.getNome()));

        Map<String, Integer> map = cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .collect(Collectors.toMap(
                curso -> curso.getNome(),
                curso -> curso.getAlunos()
        ));
        System.out.println(map);
    }
}
