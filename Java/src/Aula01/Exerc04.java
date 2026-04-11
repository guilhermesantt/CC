package Aula01;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 900) {
            System.out.println("Você está isento do IR!\nSeu salário líquido é R$ " + salario);
        }
        else if (salario > 900 && salario <= 1500) {
            double desconto = salario - 5d / 100 * salario;
            System.out.println("O IR descontará 5% do seu salário.\nSeu salário líquido será de R$ " + desconto);
        }
        else if (salario >= 1501 && salario <= 2500) {
            double desconto = salario - 10d / 100 * salario;
            System.out.println("O IR descontará 10% do seu salário.\nSeu salário líquido será de R$ " + desconto);
        }
        else {
            double desconto = salario - 20d / 100 * salario;
            System.out.println("O IR descontará 20% do seu salário.\nSeu salário líquido será de R$ " + desconto);
        }
        sc.close();
    }
}