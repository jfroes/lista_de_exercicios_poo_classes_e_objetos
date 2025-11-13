public class Funcionario {
//    Exercicio 09: Crie Funcionario com calcularSalarioLiquido().

    private String nome;
    private String setor;
    private Double salarioBruto;

    public Funcionario() {
    }

    public Funcionario(String nome, String setor, Double salarioBruto) {
        this.nome = nome;
        this.setor = setor;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double calcularSalarioLiquido(){
        Double salarioLiquido = 0.0;

        salarioLiquido = salarioBruto - salarioBruto * 0.2;

        return salarioLiquido;
    }
}
