package br.unifei.imc.produto;

import lombok.Data;

@Data
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
