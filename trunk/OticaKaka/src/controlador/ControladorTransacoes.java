/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.TransacoesDAO;
import persistencia.UsuarioDAO;
import utils.Produto;
import utils.Transacoes;
import utils.Usuario;

/**
 *
 * @author Igor
 */
public class ControladorTransacoes {
    
      TransacoesDAO transacoesDAO = new TransacoesDAO();

    public ArrayList<Transacoes> buscaTodasAsTransacoes() {
        ArrayList<Transacoes> transacoes = null;
        
        transacoes = transacoesDAO.buscaTodasAsTransacoes();

        return transacoes;
    }

    public ArrayList<Transacoes> buscaTransacoesPorCPFCNPJ(String cpf_cnpj) {
        ArrayList<Transacoes> transacoes = null;
        
        transacoes = transacoesDAO.buscaTransacoesPorCPFCliente(cpf_cnpj);

        return transacoes;
    }
    
    public ArrayList<Transacoes> buscaTransacoesPorCodigoProduto(String codigo) {
        ArrayList<Transacoes> transacoes = null;
        
        transacoes = transacoesDAO.buscaTransacoesPorCodigoProduto(codigo);

        return transacoes;
    }
    
    public ArrayList<Transacoes> buscaTransacoesPorID(String id) {
        ArrayList<Transacoes> transacoes = null;
        
        int idTransacao = Integer.parseInt(id);
        transacoes = transacoesDAO.buscaTransacoesPorID(idTransacao);

        return transacoes;
    }

    public ArrayList<Transacoes> buscaTransacoesPorData(Date dataInicial, Date dataFinal) {
        ArrayList<Transacoes> transacoes = null;
        
        transacoes = transacoesDAO.buscaTransacoesPorID(dataInicial, dataFinal);

        return transacoes;
    }
    
    public void atualizaTransacoes(String id, String nomeDoCliente, String cpf_cnpjDoCliente, String nomeDoProduto, String codigoDoProduto, String quantidadeVendida, String precoPorUnidade, String valorTotalTransacao, String desconto, Date data, String codigoSelecionado) {
        precoPorUnidade = precoPorUnidade.replace(",", ".");
        valorTotalTransacao = valorTotalTransacao.replace(",", ".");
        desconto = desconto.replace(",", ".");
        int idTransacao = Integer.parseInt(id);
        quantidadeVendida = quantidadeVendida.replace(",", ".");
        
        int quantidadeTransacao = Integer.parseInt(quantidadeVendida);
        transacoesDAO.atualizaTransacao(idTransacao, nomeDoCliente, cpf_cnpjDoCliente, nomeDoProduto, codigoDoProduto, quantidadeTransacao, Double.parseDouble(precoPorUnidade), Double.parseDouble(valorTotalTransacao), Double.parseDouble(desconto), data, codigoSelecionado);
        
    }

    

    

    
}
