package Aula04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        // Cadastro de Dados
        System.out.println("--- CADASTRO DE PRODUTO ---");
        System.out.print("Código: "); p.setCodigo(sc.nextInt());
        sc.nextLine(); // Limpar buffer
        System.out.print("Nome: "); p.setNome(sc.nextLine());
        System.out.print("Tamanho/Peso: "); p.setTamanhoPeso(sc.nextLine());
        System.out.print("Cor: "); p.setCor(sc.nextLine());
        System.out.print("Valor Unitário: R$ "); p.setValor(sc.nextDouble());
        System.out.print("Quantidade em Estoque: "); p.setQuantidadeEstoque(sc.nextInt());

        System.out.println("\n--- REALIZAR VENDA ---");
        System.out.print("Quantidade a vender: ");
        int qtdVenda = sc.nextInt();

        if (p.realizarVenda(qtdVenda)) {
            double valorTotal = p.getValor() * qtdVenda;
            System.out.println("Valor total: R$ " + valorTotal);

            System.out.println("Forma de Pagamento:");
            System.out.println("1 - Pix, Espécie, Transferência ou Débito (5% OFF)");
            System.out.println("2 - Crédito (3x sem juros)");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                double valorComDesconto = valorTotal * 0.95;
                System.out.println("Valor com desconto: R$ " + valorComDesconto);

                System.out.print("Valor pago pelo cliente: R$ ");
                double valorPago = sc.nextDouble();

                if (valorPago > valorComDesconto) {
                    System.out.println("Troco: R$ " + (valorPago - valorComDesconto));
                }
            } else if (opcao == 2) {
                System.out.println("Pagamento em 3x de R$ " + (valorTotal / 3.0));
            }

            System.out.println("Venda realizada! Estoque atual: " + p.getQuantidadeEstoque());
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
        sc.close();
    }
}