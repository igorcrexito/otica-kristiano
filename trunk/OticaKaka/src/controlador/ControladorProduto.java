/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ClienteDAO;
import persistencia.ProdutoDAO;
import utils.Cliente;
import utils.Produto;

/**
 *
 * @author Igor
 */
public class ControladorProduto {

    ProdutoDAO produtoDAO = new ProdutoDAO();

    public ArrayList<Produto> buscaClientesPorCodigo(String codigo) {

        ArrayList<Produto> produtos = null;
        try {
            produtos = produtoDAO.buscaProdutosPorCodigo(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }

    public ArrayList<Produto> buscaProdutosPorNome(String nome) {

        ArrayList<Produto> produtos = null;
        try {
            produtos = produtoDAO.buscaProdutosPorNome(nome);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }

    public ArrayList<Produto> buscaTodosOsProdutos() {

        ArrayList<Produto> produtos = null;

        produtos = produtoDAO.buscaTodosOsProdutos();


        return produtos;
    }
}
