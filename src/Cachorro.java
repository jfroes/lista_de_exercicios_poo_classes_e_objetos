public class Cachorro {
//    Exercicio 11: Faça Cachorro com latir().
    private String nome;
    private String raca;
    private String porte;
    private Integer peso;

    public Cachorro() {
    }

    public Cachorro(String nome, String raca, String porte, Integer peso) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String latir(){
        return "Au, au, au!";
    }
}
