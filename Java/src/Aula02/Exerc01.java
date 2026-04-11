package Aula02;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String escolha = "Sim";
        do {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            sc.nextLine();
            System.out.println("===================================");
            System.out.println("Seu nome é "+nome+"\nE você tem "+idade+" anos");
            System.out.println("===================================");

            System.out.println("Deseja fazer um novo cadastro?\n Sim - Novo Cadastro\n Não - Finaliza o programa ");
            escolha = sc.nextLine();

        } while (escolha.equalsIgnoreCase("Sim"));

        System.out.println("Programa finalizado!!!");
        sc.close();
    }
}