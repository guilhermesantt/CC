package Aula08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Bem-vindo ao Sistema Bancário ---");

        System.out.print("Digite o nome do titular: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = teclado.nextDouble();

        ContaCorrente minhaCC = new ContaCorrente(nome, saldoInicial, 1000.00);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1. Ver Saldo e Dados");
            System.out.println("2. Depositar");
            System.out.println("3. Realizar Pagamento (PIX/Cartão/Boleto)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println(minhaCC.toString());
                    minhaCC.exibirTipoConta();
                    break;

                case 2:
                    System.out.print("Valor do depósito: ");
                    double vDeposito = teclado.nextDouble();
                    minhaCC.depositar(vDeposito);
                    break;

                case 3:
                    System.out.print("Valor do pagamento: ");
                    double vPagamento = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("Modalidade (PIX, CARTAO ou BOLETO): ");
                    String modo = teclado.nextLine();

                    minhaCC.processarPagamento(vPagamento, modo);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        teclado.close();
    }
}
