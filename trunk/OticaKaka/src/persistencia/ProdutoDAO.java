/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Cliente;
import utils.Produto;

/**
 *
 * @author Igor
 */
public class ProdutoDAO {
    
     private ConexaoBD conexao;

    public ProdutoDAO() {
        this.conexao = ConexaoBD.getConexaoBD();
    }

    public ArrayList<Produto> buscaProdutosPorCodigo(String codigo) throws SQLException {
        conexao.conecta();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        String SQL_string = "SELECT * FROM produtos WHERE "
                + "codigo LIKE '" + codigo + "'";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nome;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipo;

        try {
            while (rs.next()) {
                nome = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipo = rs.getString("tipo");

                if (!nome.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nome != null && precoPorUnidade != null && tipo != null) {
                        produtos.add(new Produto(codigo,nome, precoPorUnidade, quantidadeEstoque, tipo));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;
    }

    
    public ArrayList<Cliente> buscaClientesPorNome(String nome) throws SQLException {
        conexao.conecta();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        String SQL_string = "SELECT * FROM clientes WHERE "
                + "nome LIKE '%" + nome + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        String cpf_cnpj;
        String telefone;
        String endereco;

        try {
            while (rs.next()) {
                nome = rs.getString("nome");
                cpf_cnpj = rs.getString("cpf_cnpj");
                telefone = rs.getString("telefone");
                endereco = rs.getString("endereco");

                if (!nome.equals("") && !cpf_cnpj.equals("") && !telefone.equals("") && !endereco.equals("")) {
                    if (nome != null && cpf_cnpj != null && telefone != null && endereco != null) {
                        clientes.add(new Cliente(nome, cpf_cnpj, endereco, telefone));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return clientes;
    }

    public void atualizaCliente(String nome, String cpf_cnpj, String endereco, String telefone, String cpfAntigo) throws SQLException {
        conexao.conecta();

        String tabela = "clientes";
        String SQL = "UPDATE " + tabela + " SET nome = '" + nome + "', cpf_cnpj = '" + cpf_cnpj + "', endereco = '" + endereco + "', telefone = '" + telefone + "' WHERE cpf_cnpj = '" + cpfAntigo + "'";

        conexao.execute(SQL);

        conexao.desconecta();

    }
    
    public void deletaCliente(String cpf_cnpj) throws SQLException {
        conexao.conecta();

        String tabela = "clientes";
        String SQL = "DELETE FROM " + tabela + " WHERE cpf_cnpj = '" + cpf_cnpj + "'";

        conexao.execute(SQL);

        conexao.desconecta();

    }
    
}
