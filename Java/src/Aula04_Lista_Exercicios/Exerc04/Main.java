package Aula04_Lista_Exercicios.Exerc04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme f = new Filme();
        int op;

        do {
            System.out.println("\n1. Cadastrar Filme\n2. Detalhes\n3. Avaliar\n4. Sair");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Nome: "); String n = sc.nextLine();
                System.out.print("Gênero: "); String g = sc.nextLine();
                System.out.print("Ano: "); int a = sc.nextInt();
                System.out.print("Duração (min): "); int d = sc.nextInt();
                f.cadastrar(n, g, a, d);
            } else if (op == 2) f.exibirDetalhes();
            else if (op == 3) {
                System.out.print("Sua nota (0-10): ");
                f.avaliar(sc.nextInt());
            }
        } while (op != 4);
        sc.close();
    }
}
