package Aula01;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double mediaDasNotas = (nota1 + nota2 + nota3) / 3;

        if (mediaDasNotas >= 70) {
            System.out.println("Aprovado, PARABÉNS!");
        }else if (mediaDasNotas > 40) {
            System.out.println("Você está na FINAL!");
        }else {
            System.out.println("Você foi reprovado, estude mais!!!");
        }
        sc.close();
    }
}
