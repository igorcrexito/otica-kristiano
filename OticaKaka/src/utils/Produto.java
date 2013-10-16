/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Igor
 */
public class Produto {
    
    private String codigo;
    private String nome;
    private double precoPorUnidade;
    private int quantidadeEstoque;

    public Produto(String codigo, String nome, double precoPorUnidade, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoPorUnidade = precoPorUnidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public void setPrecoPorUnidade(double precoPorUnidade) {
        this.precoPorUnidade = precoPorUnidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
}
