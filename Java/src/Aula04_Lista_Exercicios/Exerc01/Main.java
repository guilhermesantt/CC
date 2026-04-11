package Aula04_Lista_Exercicios.Exerc01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Digite a matrícula: ");
        func.setMatricula(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite o nome: ");
        func.setNome(sc.nextLine());

        System.out.print("Digite o salário bruto: ");
        func.setSalarioBruto(sc.nextDouble());

        func.exibirContracheque();
        sc.close();
    }
}