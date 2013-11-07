/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Igor
 */
public class Compra {
    
    private String nomeDoCliente;
    private Date dataDaCompra;
    private ArrayList<Transacoes> transacoes;
    private double precoTotal;
    private double descontoTotal;
    private int id;
    private String cpf_cnpjDoCliente;

    public Compra(String nomeDoCliente, String cpf_cnpjDoCliente ,Date dataDaCompra, ArrayList<Transacoes> transacoes, double precoTotal, double descontoTotal, int id) {
        this.nomeDoCliente = nomeDoCliente;
        this.dataDaCompra = dataDaCompra;
        this.transacoes = transacoes;
        this.precoTotal = precoTotal;
        this.descontoTotal = descontoTotal;
        this.id = id;
        this.cpf_cnpjDoCliente = cpf_cnpjDoCliente;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public ArrayList<Transacoes> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(ArrayList<Transacoes> transacoes) {
        this.transacoes = transacoes;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getDescontoTotal() {
        return descontoTotal;
    }

    public void setDescontoTotal(double descontoTotal) {
        this.descontoTotal = descontoTotal;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    public String getCpf_cnpjDoCliente() {
        return cpf_cnpjDoCliente;
    }

    public void setCpf_cnpjDoCliente(String cpf_cnpjDoCliente) {
        this.cpf_cnpjDoCliente = cpf_cnpjDoCliente;
    }
    
   
}
