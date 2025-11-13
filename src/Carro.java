//Exercicio 03: Crie Carro com atributos marca, modelo, ano.
public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    //Exercicio 04: Implemente acelerar() e frear() na classe Carro.

//    Exercicio 16: Faça Carro com acelerar(double velocidade).

    public void acelerar(double velocidade){
        System.out.println("velocidade atual: " + velocidade);
    }

    public void frear(){
        System.out.println("freando...");
    }
}
