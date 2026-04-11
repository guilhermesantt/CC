package Aula04;

public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTamanhoPeso() { return tamanhoPeso; }
    public void setTamanhoPeso(String tamanhoPeso) { this.tamanhoPeso = tamanhoPeso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public boolean realizarVenda(int qtd) {
        if (qtd <= quantidadeEstoque) {
            this.quantidadeEstoque -= qtd;
            return true;
        }
        return false;
    }
}