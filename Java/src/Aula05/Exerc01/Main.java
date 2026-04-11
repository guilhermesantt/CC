package Aula05.Exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro de Médicos ---");
        System.out.println("1 - Clínico Geral | 2 - Cirurgião");
        int op = sc.nextInt();
        sc.nextLine();

        if (op == 1) {
            ClinicoGeral cg = new ClinicoGeral();
            System.out.print("Nome: "); cg.setNome(sc.nextLine());
            System.out.print("CRM: "); cg.setCrm(sc.nextLine());

            System.out.println("\nMédico: " + cg.getNome() + " | CRM: " + cg.getCrm());
            cg.realizarConsulta();

        } else if (op == 2) {
            Cirurgiao c = new Cirurgiao();
            System.out.print("Nome: "); c.setNome(sc.nextLine());
            System.out.print("CRM: "); c.setCrm(sc.nextLine());
            System.out.print("Total de Cirurgias: "); c.setNumCirurgias(sc.nextInt());

            System.out.println("\nCirurgião: " + c.getNome() + " | CRM: " + c.getCrm());
            System.out.println("Cirurgias feitas: " + c.getNumCirurgias());
            c.realizarCirurgia();
        }
        sc.close();
    }
}
