public class Retangulo {
//    Exercicio 13: Crie Retângulo com calcularArea().
    private Double base;
    private Double Altura;

    public Retangulo() {
    }

    public Retangulo(Double base, Double altura) {
        this.base = base;
        Altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public Double calcularArea(){
        return this.base * this.Altura;
    }
}
