package br.com.alura;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        if(Objects.nonNull(aulas)){
            tempoTotal = aulas.stream().mapToInt(Aula::getTempo).sum();
        }

        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso:"+ this.getNome()+",tempo total:"+ this.getTempoTotal()+ ", aulas: ["+ this.aulas+"] ]";
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.getNome());
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    public Aluno buscaMatriculado(int numero) {
        for (Aluno aluno : alunos) {
            if (aluno.getNumeroMatricula() == numero) {
                return aluno;
            }
        }
        throw new NoSuchElementException("Matricula " + numero
                + " não encontrada");
    }
}
