package Aula03.Exerc01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        func.nome = sc.nextLine();

        System.out.println("Digite o número da matrícula: ");
        func.matricula = sc.nextInt();

        System.out.println("Informe seu salário: ");
        func.salario = sc.nextDouble();

        func.descontoINSS();

        System.out.println("================CONTRA CHEQUE================");
        System.out.println("MATRICULA: "+ func.matricula);
        System.out.println("FUNCIONARIO "+ func.nome);
        System.out.println("SALÁRIO BRUTO R$ "+ func.salario);
        System.out.println("==============================================");
        System.out.println("Desconto INSS R$ "+ func.descontoINSS());
        System.out.println("SALÁRIO LÍQUIDO R$ "+ (func.salario - func.descontoINSS()));
        System.out.println("==============================================");
        sc.close();
    }
}
