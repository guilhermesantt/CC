package Aula08;

public class ContaCorrente extends Conta implements Pagamento {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limiteChequeEspecial = limite;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Tipo: Conta Corrente");
    }

    @Override
    public void processarPagamento(double valor, String modalidade) {
        double taxaJuros = 1.02;
        double valorFinal = valor * taxaJuros;

        if (validarLimites(valor, modalidade) && (saldo + limiteChequeEspecial) >= valorFinal) {
            saldo -= valorFinal;
            System.out.println("Pagamento " + modalidade + " de R$ " + valorFinal + " (com juros) processado.");
        } else {
            System.out.println("Pagamento recusado: Limite excedido ou saldo insuficiente.");
        }
    }

    private boolean validarLimites(double valor, String modalidade) {
        return switch (modalidade.toUpperCase()) {
            case "PIX" -> valor <= 5000.00;
            case "CARTAO" -> valor <= 20000.00;
            case "BOLETO" -> valor > 0;
            default -> false;
        };
    }
}
