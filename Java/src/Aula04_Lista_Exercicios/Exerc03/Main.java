package Aula04_Lista_Exercicios.Exerc03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();
        int op;

        do {
            System.out.println("\n1. Cadastrar\n2. Detalhes\n3. Valor Total\n4. Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.print("Nome: "); prod.setNome(sc.nextLine());
                    System.out.print("Preço: "); prod.setPreco(sc.nextDouble());
                    System.out.print("Qtd: "); prod.setQuantidade(sc.nextInt());
                    break;
                case 2: prod.exibirDetalhes(); break;
                case 3: System.out.println("Total em estoque: R$ " + prod.calcularValorTotal()); break;
            }
        } while (op != 4);
        sc.close();
    }
}