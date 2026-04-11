package Aula04_Lista_Exercicios.Exerc03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidade);
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
