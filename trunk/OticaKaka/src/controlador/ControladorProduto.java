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

    public ArrayList<Produto> buscaProdutosPorTipo(String tipo) {
        ArrayList<Produto> produtos = null;

        produtos = produtoDAO.buscaProdutosPorTipo(tipo);

        return produtos;
    }

    public ArrayList<Produto> buscaProdutosPorPreco(String preco, int opcaoSelecionada) {
        ArrayList<Produto> produtos = null;
        try {
            produtos = produtoDAO.buscaProdutosPorPreco(preco, opcaoSelecionada);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }

    public ArrayList<Produto> buscaProdutosPorQuantidade(int quantidade, int opcaoSelecionada) {
        ArrayList<Produto> produtos = null;
        produtos = produtoDAO.buscaProdutosPorQuantidade(quantidade, opcaoSelecionada);

        return produtos;
    }

    public void deletaProdutosPorCodigo(String codigo) {
        produtoDAO.deletaProduto(codigo);
    }

    public void insereProdutos(String codigo, String nome, String precoPorUnidade, String precoDeCusto, int qtdEstoque, int tipo) {

        try {
            produtoDAO.insertProduto(codigo, nome, precoPorUnidade, precoDeCusto, qtdEstoque, tipo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizaProduto(String codigo, String nome, String precoUnidade, int quantidadeEstoque, String tipo, String codigoAntigo) {
        produtoDAO.atualizaProduto(codigo, nome, precoUnidade, quantidadeEstoque, tipo, codigoAntigo);

    }

    public void atualizaProdutoVenda(String codigoDoProduto, int quantidadeVendidade) {
        produtoDAO.atualizaProdutoVenda(codigoDoProduto,quantidadeVendidade);
    }
}
