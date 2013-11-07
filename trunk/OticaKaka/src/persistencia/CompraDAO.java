/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controlador.ControladorUsuario;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Compra;
import utils.Produto;
import utils.Transacoes;

/**
 *
 * @author Igor
 */
public class CompraDAO {

    private ConexaoBD conexao;

    public CompraDAO() {
        this.conexao = ConexaoBD.getConexaoBD();
    }

    public ArrayList<Compra> buscaCompraPorNomeDoCliente(String nome) {
        conexao.conecta();
        TransacoesDAO transacoesDAO = new TransacoesDAO();
        ArrayList<Compra> compras = new ArrayList<Compra>();

        String SQL_string = "SELECT * FROM compras WHERE "
                + "nomedocliente LIKE '%" + nome + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        String nomeDoCliente;
        String precoTotal;
        String descontoTotal;
        String cpf_cnpj;
        int idDaCompra = -1;
        Date dataDaCompra;
        try {
            while (rs.next()) {
                nomeDoCliente = rs.getString("nomedocliente");
                idDaCompra = rs.getInt("Id");
                precoTotal = rs.getString("precototal");
                cpf_cnpj = rs.getString("cpfcnpj");
                descontoTotal = rs.getString("descontototal");
                dataDaCompra = rs.getDate("data");

                if (!nomeDoCliente.equals("") && !precoTotal.equals("") && idDaCompra != -1 && !cpf_cnpj.equals("") && !descontoTotal.equals("") && dataDaCompra != null) {
                    ArrayList<Transacoes> transacoesDaCompra = transacoesDAO.buscaTransacoesPorIDDaCompra(idDaCompra);
                    compras.add(new Compra(nomeDoCliente, cpf_cnpj, dataDaCompra, transacoesDaCompra, Double.parseDouble(precoTotal.replace(",", ".")), Double.parseDouble(descontoTotal.replace(",", ".")), idDaCompra));

                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return compras;
    }

    public ArrayList<Compra> buscaCompraPorCPFCNPJ(String cpf_cnpjDoCliente) {
        conexao.conecta();
        TransacoesDAO transacoesDAO = new TransacoesDAO();
        ArrayList<Compra> compras = new ArrayList<Compra>();

        String SQL_string = "SELECT * FROM compras WHERE "
                + "cpfcnpj LIKE '%" + cpf_cnpjDoCliente + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        String nomeDoCliente;
        String precoTotal;
        String descontoTotal;
        String cpf_cnpj;
        int idDaCompra = -1;
        Date dataDaCompra;
        try {
            while (rs.next()) {
                nomeDoCliente = rs.getString("nomedocliente");
                idDaCompra = rs.getInt("Id");
                precoTotal = rs.getString("precototal");
                cpf_cnpj = rs.getString("cpfcnpj");
                descontoTotal = rs.getString("descontototal");
                dataDaCompra = rs.getDate("data");

                if (!nomeDoCliente.equals("") && !precoTotal.equals("") && idDaCompra != -1 && !cpf_cnpj.equals("") && !descontoTotal.equals("") && dataDaCompra != null) {
                    ArrayList<Transacoes> transacoesDaCompra = transacoesDAO.buscaTransacoesPorIDDaCompra(idDaCompra);
                    compras.add(new Compra(nomeDoCliente, cpf_cnpj, dataDaCompra, transacoesDaCompra, Double.parseDouble(precoTotal.replace(",", ".")), Double.parseDouble(descontoTotal.replace(",", ".")), idDaCompra));

                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return compras;
    }

    public ArrayList<Compra> buscaCompraPorID(int idCompra) {
        conexao.conecta();
        TransacoesDAO transacoesDAO = new TransacoesDAO();
        ArrayList<Compra> compras = new ArrayList<Compra>();

        String SQL_string = "SELECT * FROM compras WHERE "
                + "Id LIKE '%" + idCompra + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        String nomeDoCliente;
        String precoTotal;
        String descontoTotal;
        String cpf_cnpj;
        int idDaCompra = -1;
        Date dataDaCompra;
        try {
            while (rs.next()) {
                nomeDoCliente = rs.getString("nomedocliente");
                idDaCompra = rs.getInt("Id");
                precoTotal = rs.getString("precototal");
                cpf_cnpj = rs.getString("cpfcnpj");
                descontoTotal = rs.getString("descontototal");
                dataDaCompra = rs.getDate("data");

                if (!nomeDoCliente.equals("") && !precoTotal.equals("") && idDaCompra != -1 && !cpf_cnpj.equals("") && !descontoTotal.equals("") && dataDaCompra != null) {
                    ArrayList<Transacoes> transacoesDaCompra = transacoesDAO.buscaTransacoesPorIDDaCompra(idDaCompra);
                    compras.add(new Compra(nomeDoCliente, cpf_cnpj, dataDaCompra, transacoesDaCompra, Double.parseDouble(precoTotal.replace(",", ".")), Double.parseDouble(descontoTotal.replace(",", ".")), idDaCompra));

                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return compras;
    }

    public ArrayList<Compra> buscaTodasAsCompras() {
        conexao.conecta();
        TransacoesDAO transacoesDAO = new TransacoesDAO();
        ArrayList<Compra> compras = new ArrayList<Compra>();

        String SQL_string = "SELECT * FROM compras";

        ResultSet rs = conexao.executeSql(SQL_string);

        String nomeDoCliente;
        String precoTotal;
        String descontoTotal;
        String cpf_cnpj;
        int idDaCompra = -1;
        Date dataDaCompra;
        try {
            while (rs.next()) {
                nomeDoCliente = rs.getString("nomedocliente");
                idDaCompra = rs.getInt("Id");
                precoTotal = rs.getString("precototal");
                cpf_cnpj = rs.getString("cpfcnpj");
                descontoTotal = rs.getString("descontototal");
                dataDaCompra = rs.getDate("data");

                if (!nomeDoCliente.equals("") && !precoTotal.equals("") && idDaCompra != -1 && !cpf_cnpj.equals("") && !descontoTotal.equals("") && dataDaCompra != null) {
                    ArrayList<Transacoes> transacoesDaCompra = transacoesDAO.buscaTransacoesPorIDDaCompra(idDaCompra);
                    compras.add(new Compra(nomeDoCliente, cpf_cnpj, dataDaCompra, transacoesDaCompra, Double.parseDouble(precoTotal.replace(",", ".")), Double.parseDouble(descontoTotal.replace(",", ".")), idDaCompra));

                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return compras;
    }

    public ArrayList<Compra> buscaPorData(Date dataInicial, Date dataFinal) {
        conexao.conecta();
        TransacoesDAO transacoesDAO = new TransacoesDAO();
        ArrayList<Compra> compras = new ArrayList<Compra>();

        String SQL_string = "SELECT * FROM compras";

        ResultSet rs = conexao.executeSql(SQL_string);

        String nomeDoCliente;
        String precoTotal;
        String descontoTotal;
        String cpf_cnpj;
        int idDaCompra = -1;
        Date dataDaCompra;
        try {
            while (rs.next()) {
                nomeDoCliente = rs.getString("nomedocliente");
                idDaCompra = rs.getInt("Id");
                precoTotal = rs.getString("precototal");
                cpf_cnpj = rs.getString("cpfcnpj");
                descontoTotal = rs.getString("descontototal");
                dataDaCompra = rs.getDate("data");

                if (!nomeDoCliente.equals("") && !precoTotal.equals("") && idDaCompra != -1 && !cpf_cnpj.equals("") && !descontoTotal.equals("") && dataDaCompra != null) {
                    if (dataDaCompra.compareTo(dataInicial) == 0 || dataDaCompra.compareTo(dataInicial) >= 0) {
                        if (dataDaCompra.compareTo(dataFinal) == 0 || dataDaCompra.compareTo(dataFinal) <= 0) {
                            ArrayList<Transacoes> transacoesDaCompra = transacoesDAO.buscaTransacoesPorIDDaCompra(idDaCompra);
                            compras.add(new Compra(nomeDoCliente, cpf_cnpj, dataDaCompra, transacoesDaCompra, Double.parseDouble(precoTotal.replace(",", ".")), Double.parseDouble(descontoTotal.replace(",", ".")), idDaCompra));
                        }
                    }
                }



            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return compras;
    }

    public void insereCompra(String nomeDoCliente, String cpf_cnpj, ArrayList<Transacoes> transacoes, double precoTotal, double descontoTotal, Date data) {
        conexao.conecta();

        TransacoesDAO transacaoDAO = new TransacoesDAO();

        String SQL_String = "INSERT INTO compras (nomedocliente,cpfcnpj,precototal, descontototal, data)"
                + " VALUES ('" + nomeDoCliente + "', '" + cpf_cnpj + "', '" + precoTotal + "', '" + descontoTotal + "', '" + data + "')";

        conexao.execute(SQL_String);

        ArrayList<Compra> compras = buscaTodasAsCompras();

        int lastID = compras.size() - 1;

        for (int i = 0; i < transacoes.size(); i++) {
            transacoes.get(i).setIDDaCompra(lastID);
            Transacoes transacao = transacoes.get(i);
            //insere transação
            SQL_String = "INSERT INTO transacoes (nomedocliente,cpf_cnpjcliente,nomedoproduto, codigodoproduto, qtdvendida, precoporunidade, valortotaltransacao, desconto, data, idDaCompra)"
                    + " VALUES ('" + transacao.getNomeDoCliente() + "', '" + transacao.getCpf_cnpjCliente() + "', '" + transacao.getNomeDoProduto() + "', '" + transacao.getCodigoDoProduto() + "', '" + transacao.getQuantidadeVendidade() + "', '" + transacao.getPrecoPorUnidade() + "', '" + transacao.getValorTotalDaTransacao() + "', '" + transacao.getDescontoDado() + "', '" + transacao.getData() + "', '" + transacao.getIdDaCompra() + "')";

            conexao.execute(SQL_String);
        }

        conexao.desconecta();
    }
}
