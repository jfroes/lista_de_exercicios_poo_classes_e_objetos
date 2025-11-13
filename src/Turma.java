import java.util.ArrayList;
import java.util.List;

public class Turma {
//    Exercicio 18: Crie Turma que contém uma lista de alunos.
    private String periodo;
    private String ano;
    private String professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma() {
    }

    public Turma(String periodo, String ano, String professor, List<Aluno> alunos) {
        this.periodo = periodo;
        this.ano = ano;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
