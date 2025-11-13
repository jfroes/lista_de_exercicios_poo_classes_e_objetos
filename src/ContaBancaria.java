public class ContaBancaria {
//    Exercicio 07: Crie ContaBancaria com depósito e saque.

    private Double saldo;
    private Integer numero;
    private Integer agencia;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer numero, Integer agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public void deposito(Double valor){
        saldo += valor;
    }

    public void saque(Double valor){
        saldo -= valor;
    }
}
