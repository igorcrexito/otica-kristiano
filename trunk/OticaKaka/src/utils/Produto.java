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
    private String precoPorUnidade;
    private String precoDeCusto;
    private int quantidadeEstoque;
    private String tipoProduto;
    
    public Produto(String codigo, String nome, String precoPorUnidade, int quantidadeEstoque, String tipoProduto, String precoDeCusto) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoPorUnidade = precoPorUnidade;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tipoProduto = tipoProduto;
        this.precoDeCusto = precoDeCusto;
    }

    public String getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(String precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
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

    public String getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public void setPrecoPorUnidade(String precoPorUnidade) {
        this.precoPorUnidade = precoPorUnidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
}
