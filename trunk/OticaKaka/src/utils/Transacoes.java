/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Date;

/**
 *
 * @author Igor
 */
public class Transacoes {
    
    private int idDaTransacao;
    private String nomeDoCliente;
    private String cpf_cnpjCliente;
    private String nomeDoProduto;
    private String codigoDoProduto;
    private int quantidadeVendidade;
    private double precoPorUnidade;
    private double valorTotalDaTransacao;
    private double descontoDado;
    private Date data;

    public Transacoes(int idDaTransacao, String nomeDoCliente, String cpf_cnpjCliente, String nomeDoProduto, String codigoDoProduto, int quantidadeVendidade, double precoPorUnidade, double valorTotalDaTransacao, double descontoDado, Date data) {
        this.idDaTransacao = idDaTransacao;
        this.nomeDoCliente = nomeDoCliente;
        this.cpf_cnpjCliente = cpf_cnpjCliente;
        this.nomeDoProduto = nomeDoProduto;
        this.codigoDoProduto = codigoDoProduto;
        this.quantidadeVendidade = quantidadeVendidade;
        this.precoPorUnidade = precoPorUnidade;
        this.valorTotalDaTransacao = valorTotalDaTransacao;
        this.descontoDado = descontoDado;
        this.data = data;
    }
 
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
 
    public int getIdDaTransacao() {
        return idDaTransacao;
    }

    public void setIdDaTransacao(int idDaTransacao) {
        this.idDaTransacao = idDaTransacao;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCpf_cnpjCliente() {
        return cpf_cnpjCliente;
    }

    public void setCpf_cnpjCliente(String cpf_cnpjCliente) {
        this.cpf_cnpjCliente = cpf_cnpjCliente;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public int getQuantidadeVendidade() {
        return quantidadeVendidade;
    }

    public void setQuantidadeVendidade(int quantidadeVendidade) {
        this.quantidadeVendidade = quantidadeVendidade;
    }

    public double getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public void setPrecoPorUnidade(double precoPorUnidade) {
        this.precoPorUnidade = precoPorUnidade;
    }

    public double getValorTotalDaTransacao() {
        return valorTotalDaTransacao;
    }

    public void setValorTotalDaTransacao(double valorTotalDaTransacao) {
        this.valorTotalDaTransacao = valorTotalDaTransacao;
    }

    public double getDescontoDado() {
        return descontoDado;
    }

    public void setDescontoDado(double descontoDado) {
        this.descontoDado = descontoDado;
    }
    
    
}
