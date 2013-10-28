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
                + "codigo LIKE'%" + codigo + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nome;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipo;
        String codigoProduto;
        String precoDeCusto;
        try {
            while (rs.next()) {
                codigoProduto = rs.getString("codigo");               
                nome = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipo = rs.getString("tipo");
                precoDeCusto = rs.getString("precoDeCusto");

                if (!nome.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nome != null && precoPorUnidade != null && tipo != null) {
                        produtos.add(new Produto(codigoProduto ,nome, precoPorUnidade, quantidadeEstoque, tipo, precoDeCusto));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;
    }

    
    public ArrayList<Produto> buscaProdutosPorNome(String nome) throws SQLException {
        conexao.conecta();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

                String SQL_string = "SELECT * FROM produtos WHERE "
                + "nome LIKE'%" + nome + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nomeProduto;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipo;
        String codigoProduto;
        String precoDeCusto;
        
        try {
            while (rs.next()) {
                codigoProduto = rs.getString("codigo");               
                nomeProduto = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipo = rs.getString("tipo");
                precoDeCusto = rs.getString("precoDeCusto");
                
                if (!nome.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nome != null && precoPorUnidade != null && tipo != null) {
                        produtos.add(new Produto(codigoProduto ,nomeProduto, precoPorUnidade, quantidadeEstoque, tipo,precoDeCusto));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;
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

    public ArrayList<Produto> buscaTodosOsProdutos() {
        conexao.conecta();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

                String SQL_string = "SELECT * FROM produtos";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nome;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipo;
        String codigoProduto;
        String precoDeCusto;

        try {
            while (rs.next()) {
                codigoProduto = rs.getString("codigo");               
                nome = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipo = rs.getString("tipo");
                precoDeCusto = rs.getString("precodecusto");

                if (!nome.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nome != null && precoPorUnidade != null && tipo != null) {
                        produtos.add(new Produto(codigoProduto ,nome, precoPorUnidade, quantidadeEstoque, tipo, precoDeCusto));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;
    }

    public ArrayList<Produto> buscaProdutosPorTipo(String tipo) {
                conexao.conecta();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

                String SQL_string = "SELECT * FROM produtos WHERE "
                + "tipo LIKE'%" + tipo + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nome;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipoProduto;
        String codigoProduto;
        String precoDeCusto;

        try {
            while (rs.next()) {
                codigoProduto = rs.getString("codigo");               
                nome = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipoProduto = rs.getString("tipo");
                precoDeCusto = rs.getString("precodecusto");

                if (!nome.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nome != null && precoPorUnidade != null && tipo != null) {
                        produtos.add(new Produto(codigoProduto ,nome, precoPorUnidade, quantidadeEstoque, tipoProduto, precoDeCusto));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;

    }

    public ArrayList<Produto> buscaProdutosPorPreco(String preco, int opcaoSelecionada) throws SQLException {
        conexao.conecta();
        
        
        if (preco.contains(",")) {
            preco = preco.replace(",", ".");
        }
        
        double precoProduto = Double.parseDouble(preco);
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();

                String SQL_string = "SELECT * FROM produtos";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nomeProduto;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipo;
        String codigoProduto;
        String precoDeCusto;
        
        try {
            while (rs.next()) {
                codigoProduto = rs.getString("codigo");               
                nomeProduto = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipo = rs.getString("tipo");
                precoDeCusto = rs.getString("precoDeCusto");
                
                if (precoPorUnidade.contains(","))
                    precoPorUnidade = precoPorUnidade.replace(",", ".");
                
                double precoChecar = Double.parseDouble(precoPorUnidade);
                
                if (!codigoProduto.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nomeProduto != null && precoPorUnidade != null && tipo != null) {
                        if (opcaoSelecionada==0 && precoChecar >= precoProduto)
                            produtos.add(new Produto(codigoProduto ,nomeProduto, precoPorUnidade, quantidadeEstoque, tipo,precoDeCusto));
                        else if (opcaoSelecionada==1 && precoChecar <= precoProduto)    
                            produtos.add(new Produto(codigoProduto ,nomeProduto, precoPorUnidade, quantidadeEstoque, tipo,precoDeCusto));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;
    }

    public ArrayList<Produto> buscaProdutosPorQuantidade(int quantidade, int opcaoSelecionada) {
        conexao.conecta();
        
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();

                String SQL_string = "SELECT * FROM produtos";

        ResultSet rs = conexao.executeSql(SQL_string);
       
        String nomeProduto;
        String precoPorUnidade;
        int quantidadeEstoque = -1;
        String tipo;
        String codigoProduto;
        String precoDeCusto;
        
        try {
            while (rs.next()) {
                codigoProduto = rs.getString("codigo");               
                nomeProduto = rs.getString("nome");
                precoPorUnidade = rs.getString("precoporunidade");
                quantidadeEstoque = rs.getInt("qtdestoque");
                tipo = rs.getString("tipo");
                precoDeCusto = rs.getString("precoDeCusto");
                
                if (precoPorUnidade.contains(","))
                    precoPorUnidade = precoPorUnidade.replace(",", ".");
                
                if (!codigoProduto.equals("") && !precoPorUnidade.equals("") && quantidadeEstoque!=-1 && !tipo.equals("")) {
                    if (nomeProduto != null && precoPorUnidade != null && tipo != null) {
                        if (opcaoSelecionada==0 && quantidadeEstoque >= quantidade)
                            produtos.add(new Produto(codigoProduto ,nomeProduto, precoPorUnidade, quantidadeEstoque, tipo,precoDeCusto));
                        else if (opcaoSelecionada==1 && quantidadeEstoque <= quantidade)    
                            produtos.add(new Produto(codigoProduto ,nomeProduto, precoPorUnidade, quantidadeEstoque, tipo,precoDeCusto));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return produtos;
    }

}
