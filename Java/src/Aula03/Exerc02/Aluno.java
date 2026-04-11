package Aula03.Exerc02;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public double medianota() {
        double calc = (nota1 + nota2) / 2;
        return calc;
    }
}
