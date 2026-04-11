package Aula05.Exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha: 1-Pessoa Física | 2-Pessoa Jurídica");
        int op = sc.nextInt();
        sc.nextLine();

        if (op == 1) {
            Fisica f = new Fisica();
            System.out.print("Nome: ");
            f.setNome(sc.nextLine());
            System.out.print("CPF: ");
            f.setCpf(sc.nextLine());

            System.out.println("\nDados Cadastrados:");
            System.out.println("Nome: " + f.getNome());
            System.out.println("CPF: " + f.getCpf());

        } else if (op == 2) {
            Juridica j = new Juridica();
            System.out.print("Nome da Empresa: ");
            j.setNome(sc.nextLine());
            System.out.print("CNPJ: ");
            j.setCnpj(sc.nextLine());

            System.out.println("\nDados Cadastrados:");
            System.out.println("Empresa: " + j.getNome());
            System.out.println("CNPJ: " + j.getCnpj());
        }
        sc.close();
    }
}
