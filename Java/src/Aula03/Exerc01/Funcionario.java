package Aula03.Exerc01;

public class Funcionario {
    String nome;
    int matricula;
    double salario;

    public double descontoINSS() {
        double calc = 15d/100 * salario;
        return calc;
    }
}

