public class Celular {
//    Exercicio 15: Crie Celular com ligar() e desligar().

    private String marca;
    private String modelo;
    private Integer numero;
    private Integer nivelBateria;

    public Celular() {
    }

    public Celular(String marca, String modelo, Integer numero, Integer nivelBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.nivelBateria = nivelBateria;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(Integer nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public Boolean ligar(){
        return true;
    }

    public Boolean desligar(){
        return false;
    }
}
