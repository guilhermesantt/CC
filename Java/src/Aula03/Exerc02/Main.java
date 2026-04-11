package Aula03.Exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.println("Informe seu nome: ");
        al.nome = sc.nextLine();
        System.out.println("Informe sua primeira nota: ");
        al.nota1 = sc.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        al.nota2 = sc.nextDouble();

        if (al.medianota() >= 70) {
            System.out.println("Você está aprovado(a)!\nSua média foi "+al.medianota());
        } else if (al.medianota() > 40) {
            System.out.println("Você está na final(a)!\nSua média foi "+al.medianota());
        }else {
            System.out.println("Você foi reprovado!!!");
        }
        sc.close();
    }
}
