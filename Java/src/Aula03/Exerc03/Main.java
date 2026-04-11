package Aula03.Exerc03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int escolha;
        int n1, n2;

        do {
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();

            System.out.println("INFORME 1 - SOMAR\nINFORME 2 - SUBTRAIR\nINFORME 3 - MULTIPLICAÇÃO\nINFORME 4 - DIVISÃO");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1: System.out.println("O resultado da soma será " + calc.somar(n1, n2));
                    break;
                case 2: System.out.println("O resultado da subtração será " + calc.subtrair(n1, n2));
                    break;
                case 3: System.out.println("O resultado da multiplicação será " + calc.multiplicar(n1, n2));
                    break;
                case 4: System.out.println("O resultado da divisão será " + calc.dividir(n1, n2));
                    break;
                default: System.out.println("Número Inválido!!!");
            }
            System.out.println("Informe - 0 para reiniciar o programa\nInforme - 9 para sair do programa");
            escolha = sc.nextInt();
        }while (escolha == 0);
        System.out.println("Programa Finalizado.");
        sc.close();
    }
}
