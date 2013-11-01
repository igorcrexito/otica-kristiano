/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import utils.Produto;
import utils.Transacoes;

/**
 *
 * @author Igor
 */
public class TransacoesDAO {

    private ConexaoBD conexao;

    public TransacoesDAO() {
        this.conexao = ConexaoBD.getConexaoBD();
    }

    public ArrayList<Transacoes> buscaTodasAsTransacoes() {
        conexao.conecta();
        ArrayList<Transacoes> transacoes = new ArrayList<Transacoes>();

        String SQL_string = "SELECT * FROM transacoes";

        ResultSet rs = conexao.executeSql(SQL_string);

        int id;
        String nomeDoCliente;
        String cpf_cnpjCliente;
        String nomeDoProduto;
        String codigoDoProduto;
        int quantidadeVendida;
        String precoPorUnidade;
        String valorTransacao;
        String desconto;
        Date data;

        try {
            while (rs.next()) {
                id = rs.getInt("id");
                nomeDoCliente = rs.getString("nomedocliente");
                cpf_cnpjCliente = rs.getString("cpf_cnpjcliente");
                nomeDoProduto = rs.getString("nomedoproduto");
                codigoDoProduto = rs.getString("codigodoproduto");
                quantidadeVendida = rs.getInt("qtdvendida");
                precoPorUnidade = rs.getString("precoporunidade").replace(",", ".");
                valorTransacao = rs.getString("valortotaltransacao");
                desconto = rs.getString("desconto");
                data = rs.getDate("data");

                try {
                    transacoes.add(new Transacoes(id, nomeDoCliente, cpf_cnpjCliente, nomeDoProduto, codigoDoProduto, quantidadeVendida, Double.parseDouble(precoPorUnidade), Double.parseDouble(valorTransacao), Double.parseDouble(desconto), data));
                } catch (Exception ex) {
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return transacoes;

    }

    public ArrayList<Transacoes> buscaTransacoesPorCPFCliente(String cpf_cnpj) {
        conexao.conecta();
        ArrayList<Transacoes> transacoes = new ArrayList<Transacoes>();

        String SQL_string = "SELECT * FROM transacoes WHERE "
                + "cpf_cnpjcliente LIKE '%" + cpf_cnpj + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        int id;
        String nomeDoCliente;
        String cpf_cnpjCliente;
        String nomeDoProduto;
        String codigoDoProduto;
        int quantidadeVendida;
        String precoPorUnidade;
        String valorTransacao;
        String desconto;
        Date data;

        try {
            while (rs.next()) {
                id = rs.getInt("id");
                nomeDoCliente = rs.getString("nomedocliente");
                cpf_cnpjCliente = rs.getString("cpf_cnpjcliente");
                nomeDoProduto = rs.getString("nomedoproduto");
                codigoDoProduto = rs.getString("codigodoproduto");
                quantidadeVendida = rs.getInt("qtdvendida");
                precoPorUnidade = rs.getString("precoporunidade").replace(",", ".");
                valorTransacao = rs.getString("valortotaltransacao");
                desconto = rs.getString("desconto");
                data = rs.getDate("data");

                try {
                    transacoes.add(new Transacoes(id, nomeDoCliente, cpf_cnpjCliente, nomeDoProduto, codigoDoProduto, quantidadeVendida, Double.parseDouble(precoPorUnidade), Double.parseDouble(valorTransacao), Double.parseDouble(desconto), data));
                } catch (Exception ex) {
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return transacoes;

    }

    public ArrayList<Transacoes> buscaTransacoesPorCodigoProduto(String codigo) {
        conexao.conecta();
        ArrayList<Transacoes> transacoes = new ArrayList<Transacoes>();

        String SQL_string = "SELECT * FROM transacoes WHERE "
                + "codigodoproduto LIKE '%" + codigo + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        int id;
        String nomeDoCliente;
        String cpf_cnpjCliente;
        String nomeDoProduto;
        String codigoDoProduto;
        int quantidadeVendida;
        String precoPorUnidade;
        String valorTransacao;
        String desconto;
        Date data;

        try {
            while (rs.next()) {
                id = rs.getInt("id");
                nomeDoCliente = rs.getString("nomedocliente");
                cpf_cnpjCliente = rs.getString("cpf_cnpjcliente");
                nomeDoProduto = rs.getString("nomedoproduto");
                codigoDoProduto = rs.getString("codigodoproduto");
                quantidadeVendida = rs.getInt("qtdvendida");
                precoPorUnidade = rs.getString("precoporunidade").replace(",", ".");
                valorTransacao = rs.getString("valortotaltransacao");
                desconto = rs.getString("desconto");
                data = rs.getDate("data");

                try {
                    transacoes.add(new Transacoes(id, nomeDoCliente, cpf_cnpjCliente, nomeDoProduto, codigoDoProduto, quantidadeVendida, Double.parseDouble(precoPorUnidade), Double.parseDouble(valorTransacao), Double.parseDouble(desconto), data));
                } catch (Exception ex) {
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return transacoes;
    }

    public ArrayList<Transacoes> buscaTransacoesPorID(int idTransacao) {
        conexao.conecta();
        ArrayList<Transacoes> transacoes = new ArrayList<Transacoes>();

        String SQL_string = "SELECT * FROM transacoes WHERE "
                + "Id LIKE '%" + idTransacao + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        int id;
        String nomeDoCliente;
        String cpf_cnpjCliente;
        String nomeDoProduto;
        String codigoDoProduto;
        int quantidadeVendida;
        String precoPorUnidade;
        String valorTransacao;
        String desconto;
        Date data;

        try {
            while (rs.next()) {
                id = rs.getInt("id");
                nomeDoCliente = rs.getString("nomedocliente");
                cpf_cnpjCliente = rs.getString("cpf_cnpjcliente");
                nomeDoProduto = rs.getString("nomedoproduto");
                codigoDoProduto = rs.getString("codigodoproduto");
                quantidadeVendida = rs.getInt("qtdvendida");
                precoPorUnidade = rs.getString("precoporunidade").replace(",", ".");
                valorTransacao = rs.getString("valortotaltransacao");
                desconto = rs.getString("desconto");
                data = rs.getDate("data");

                try {
                    transacoes.add(new Transacoes(id, nomeDoCliente, cpf_cnpjCliente, nomeDoProduto, codigoDoProduto, quantidadeVendida, Double.parseDouble(precoPorUnidade), Double.parseDouble(valorTransacao), Double.parseDouble(desconto), data));
                } catch (Exception ex) {
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return transacoes;
    }

    public ArrayList<Transacoes> buscaTransacoesPorID(Date dataInicial, Date dataFinal) {
        conexao.conecta();
        ArrayList<Transacoes> transacoes = new ArrayList<Transacoes>();

        String SQL_string = "SELECT * FROM transacoes";

        ResultSet rs = conexao.executeSql(SQL_string);

        int id;
        String nomeDoCliente;
        String cpf_cnpjCliente;
        String nomeDoProduto;
        String codigoDoProduto;
        int quantidadeVendida;
        String precoPorUnidade;
        String valorTransacao;
        String desconto;
        Date data;

        try {
            while (rs.next()) {
                id = rs.getInt("id");
                nomeDoCliente = rs.getString("nomedocliente");
                cpf_cnpjCliente = rs.getString("cpf_cnpjcliente");
                nomeDoProduto = rs.getString("nomedoproduto");
                codigoDoProduto = rs.getString("codigodoproduto");
                quantidadeVendida = rs.getInt("qtdvendida");
                precoPorUnidade = rs.getString("precoporunidade").replace(",", ".");
                valorTransacao = rs.getString("valortotaltransacao");
                desconto = rs.getString("desconto");
                data = rs.getDate("data");

                try {
                    if (data.compareTo(dataInicial) == 0 || data.compareTo(dataInicial) >= 0) {
                        if (data.compareTo(dataFinal) == 0 || data.compareTo(dataFinal) <= 0) {
                            transacoes.add(new Transacoes(id, nomeDoCliente, cpf_cnpjCliente, nomeDoProduto, codigoDoProduto, quantidadeVendida, Double.parseDouble(precoPorUnidade), Double.parseDouble(valorTransacao), Double.parseDouble(desconto), data));
                        }
                    }
                } catch (Exception ex) {
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return transacoes;
    }
}
