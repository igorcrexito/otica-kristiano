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

    
}
