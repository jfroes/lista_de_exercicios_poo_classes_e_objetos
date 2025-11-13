public class Produto {
//    Exercicio 05: Crie Produto com preço e mé_todo aplicarDesconto().

    private Double preco;

    public Produto(){
    }

    public Produto(Double preco){
        this.setPreco(preco);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double calcularDesconto(int desconto){
        return this.preco = this.preco - this.preco * (desconto / 100.0);
    }
}
