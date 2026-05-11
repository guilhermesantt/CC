package Aula08;

public class ContaEmpresarial extends Conta implements Pagamento {
    private String cnpj;
    private String nomeEmpresa;
    private double limiteCredito;

    public ContaEmpresarial(String titular, double saldo, String cnpj, String nomeEmpresa) {
        super(titular, saldo);
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Tipo: Conta Empresarial - " + nomeEmpresa);
    }

    @Override
    public void processarPagamento(double valor, String modalidade) {
        double taxaJuros = 1.01;
        double valorFinal = valor * taxaJuros;

        if (saldo >= valorFinal) {
            saldo -= valorFinal;
            System.out.println("Pagamento Empresarial via " + modalidade + " de R$ " + valorFinal + " realizado.");
        }
    }
}
