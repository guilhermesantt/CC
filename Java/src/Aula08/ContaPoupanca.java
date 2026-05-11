package Aula08;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Tipo: Conta Poupança");
    }

    public void aplicarRendimento() {
        this.saldo += this.saldo * (taxaRendimento / 100);
    }
}
