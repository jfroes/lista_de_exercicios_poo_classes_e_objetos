public class Pessoa {
    private String nome;
    private Integer idade;

//    Exercicio 12: Adicione construtor à classe Pessoa.
    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void falar (){
        System.out.println("Olá");
    }
}
