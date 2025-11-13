public class Program {
    public static void main(String[] args) {
        Produto p = new Produto(100.00);

        System.out.println(p.calcularDesconto(10));
    }
}
