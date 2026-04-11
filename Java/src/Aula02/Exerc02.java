package Aula02;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "Sim";
        do {
            System.out.println("INFORME SEU NOME COMPLETO: ");
            String nome = sc.nextLine();
            System.out.println("INFORME SUA MATRÍCULA: ");
            int matricula = sc.nextInt();
            System.out.println("INFORME SEU SALARIO BRUTO: ");
            double salarioBruto = sc.nextDouble();
            sc.nextLine();
            double  descontoinss = 15d/100 * salarioBruto;

            System.out.println("============CONTRA CHEQUE============");
            System.out.println("Matrícula: "+matricula);
            System.out.println("Nome Completo: "+nome);
            System.out.println("Salário Bruto: R$ "+salarioBruto);
            System.out.println("Dedução INSS: R$ "+descontoinss);
            System.out.println("=======================================");
            System.out.println("Salário Líquido: R$ "+(salarioBruto-descontoinss));
            System.out.println("=======================================");

            System.out.println("Deseja cadastrar um novo usuário?\n Sim - Desejo Cadastrar\n Não - Não Desejo Cadastrar");
            continuar = sc.nextLine();

        }while (continuar.equalsIgnoreCase("Sim"));
        System.out.println("Fim do Programa.");
        sc.close();
    }
}