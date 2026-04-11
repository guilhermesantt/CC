package Aula04_Lista_Exercicios.Exerc02;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public void setNumeroConta(String numero) { this.numeroConta = numero; }
    public void setTitular(String titular) { this.titular = titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (saldo > 0 && saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Operação negada: Saldo insuficiente ou zerado.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (saldo > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Operação negada: Saldo insuficiente.");
        }
    }
}
