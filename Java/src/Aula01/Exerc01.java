package Aula01;
import java.util.Scanner;
public class Exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double horaTrabalhada = sc.nextDouble();

        System.out.println("Digite a quantidas de horas semanais: ");
        int quantHoras = sc.nextInt();

        double calcSalario = horaTrabalhada * quantHoras;

        System.out.println("Você recebe R$ "+horaTrabalhada+"Por hora trabalhada\nE trabalha " +quantHoras+ " Por semana...");
        System.out.println("-----CALCULANDO-----\nSeu salário é de R$ "+ calcSalario);
        sc.close();
    }
}
