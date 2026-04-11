package Aula04_Lista_Exercicios.Exerc01;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salarioBruto;

    public void setMatricula(int matricula) { this.matricula = matricula; }
    public void setNome(String nome) { this.nome = nome; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }

    public double calcularInss() {
        return this.salarioBruto * 0.15;
    }

    public double calcularSalarioLiquido() {
        return this.salarioBruto - calcularInss();
    }

    public void exibirContracheque() {
        System.out.println("\n========= CONTRACHEQUE =========");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Bruto: R$ " + this.salarioBruto);
        System.out.println("Desconto INSS (15%): R$ " + calcularInss());
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
        System.out.println("================================");
    }
}