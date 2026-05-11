package Aula08;

public abstract class Conta {
    protected String titular;
    protected double saldo;
    protected StatusConta status;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.status = StatusConta.ATIVA;
    }

    public void depositar(double valor) {
        if (status == StatusConta.ATIVA && valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Operação não permitida. Verifique o status ou valor.");
        }
    }

    public void sacar(double valor) {
        if (status == StatusConta.ATIVA && saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou conta inativa.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (this.status == StatusConta.ATIVA && this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência concluída com sucesso.");
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }

    public abstract void exibirTipoConta();

    @Override
    public String toString() {
        return "Titular: " + titular + " | Saldo: R$ " + saldo + " | Status: " + status;
    }
}
