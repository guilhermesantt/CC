package Aula04_Lista_Exercicios.Exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Número da Conta: ");
        conta.setNumeroConta(sc.next());
        System.out.print("Titular: ");
        conta.setTitular(sc.next());

        int opcao;
        do {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1. Consultar Saldo\n2. Depositar\n3. Sacar\n4. Sair");
            opcao = sc.nextInt();

            if (opcao == 1) System.out.println("Saldo: R$ " + conta.getSaldo());
            else if (opcao == 2) {
                System.out.print("Valor: ");
                conta.depositar(sc.nextDouble());
            }
            else if (opcao == 3) {
                System.out.print("Valor: ");
                conta.sacar(sc.nextDouble());
            }
        } while (opcao != 4);
        sc.close();
    }
}
