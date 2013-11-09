/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.CompraDAO;
import utils.Compra;
import utils.Transacoes;

/**
 *
 * @author Igor
 */
public class ControladorCompra {

    CompraDAO compraDAO = new CompraDAO();

    public ArrayList<Compra> buscaCompraPorNomeDoCliente(String nome) {

        ArrayList<Compra> compras = compraDAO.buscaCompraPorNomeDoCliente(nome);
        return compras;
    }

    public ArrayList<Compra> buscaCompraPorCPF_CNPJ(String cpf_cnpj) {
        ArrayList<Compra> compras = compraDAO.buscaCompraPorCPFCNPJ(cpf_cnpj);
        return compras;
    }

    public ArrayList<Compra> buscaCompraPorID(int id) {
        ArrayList<Compra> compras = compraDAO.buscaCompraPorID(id);
        return compras;
    }

    public ArrayList<Compra> buscaCompraPorData(Date dataInicial, Date dataFinal) {
        ArrayList<Compra> compras = compraDAO.buscaPorData(dataInicial, dataFinal);
        return compras;
    }

    public void insereCompra(String nomeDoCliente, String cpf_cnpj, ArrayList<Transacoes> transacoes, String precoTotal, String descontoTotal, Date data) {
        compraDAO.insereCompra(nomeDoCliente, cpf_cnpj, transacoes, Double.parseDouble(precoTotal.replace(",", ".")), Double.parseDouble(descontoTotal.replace(",", ".")), data);
    }

    public ArrayList<Compra> buscaTodasAsCompras() {
        ArrayList<Compra> compras = compraDAO.buscaTodasAsCompras();
        return compras;
    }

    public ArrayList<Compra> buscaCompraPorIDExato(int idDaCompra) {
        ArrayList<Compra> compras = compraDAO.buscaCompraPorIDExato(idDaCompra);
        return compras;
    }

    public void atualizaCompra(int id, double valorFinal, double descontoFinal, Date data, String nomeDoCliente, String cnpjDoCliente) {
        compraDAO.atualizaCompra(id, valorFinal, descontoFinal, data, nomeDoCliente, cnpjDoCliente);
    }
}
