import java.util.ArrayList;
import java.util.List;

public class Aluno {
//    Exercicio 06: Crie Aluno com atributos e mé_todo calcularMedia().

    private String nome;
    private String serie;
    private List<Double> notas = new ArrayList<Double>();

    public Aluno() {
    }

    public Aluno(String nome, String serie) {
        this.nome = nome;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void addNota(double nota){
        this.notas.add(nota);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double calcularMedia(){
        Double media = 0.0;
        for(Double n : notas){
            media += n;
        }
        return media / notas.size();
    }
}
