package br.edu.faculdade.receitas;

public record Receita(
        String nome,
        String categoria,
        int minutos,
        boolean vegetariana
) { }