import java.util.Objects;

public class Triangulo {
//    Exercicio 14: Crie Triangulo ehEquilatero().

    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo() {
    }

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public Boolean ehEquilatero(){
        if (Objects.equals(lado1, lado2) && Objects.equals(lado1, lado3) && Objects.equals(lado2, lado3)){
            return true;
        }
        return false;
    }
}
