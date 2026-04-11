package Aula02;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double somadasnotas = 0;
        String continuar = "S";
        System.out.println("Bem-vindo ao calculador de média do aluno!");
        do {
            System.out.println("Insira uma nota do aluno: ");
            double notadoaluno = sc.nextDouble();
                somadasnotas += notadoaluno;
                cont += 1;
                sc.nextLine();
                System.out.println("Deseja inserir outra nota? ('S' para Sim ou 'N' para Não)");
                continuar = sc.nextLine();
        }
        while (continuar.equalsIgnoreCase("S"));
        System.out.println("Média das notas: "+(somadasnotas/cont));
        sc.close();
    }
}
