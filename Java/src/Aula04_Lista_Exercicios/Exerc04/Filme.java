package Aula04_Lista_Exercicios.Exerc04;

public class Filme {
    private String nome, genero;
    private int ano, duracao, qtdAvaliacoes;
    private double somaNotas;

    public void cadastrar(String n, String g, int a, int d) {
        this.nome = n; this.genero = g; this.ano = a; this.duracao = d;
    }

    public void avaliar(int nota) {
        this.somaNotas += nota;
        this.qtdAvaliacoes++;
    }

    public double calcularMedia() {
        return (qtdAvaliacoes == 0) ? 0 : somaNotas / qtdAvaliacoes;
    }

    public void exibirDetalhes() {
        System.out.println("\n" + nome + " [" + genero + "] - " + ano);
        System.out.println("Duração: " + duracao + " min | Média: " + calcularMedia());
    }
}