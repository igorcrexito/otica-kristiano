package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Cliente;
import utils.Usuario;

public class ClienteDAO {

    private ConexaoBD conexao;

    public ClienteDAO() {
        this.conexao = ConexaoBD.getConexaoBD();
    }

    public Cliente getClienteFromCPFCNPJ(String cpf_cnpj) throws SQLException {

        conexao.conecta();

        String SQL_string = "SELECT * FROM clientes WHERE "
                + "CPF_CNPJ LIKE'%" + cpf_cnpj + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);
        rs.first();

        String nome = rs.getString("nome");
        String endereco = rs.getString("endereco");
        String telefone = rs.getString("telefone");

        conexao.desconecta();
        return new Cliente(nome, cpf_cnpj, endereco, telefone);

    }

    public void insertCliente(String nome, String cpf_cnpj, String endereco, String telefone) throws SQLException {

        conexao.conecta();

        String SQL_String = "INSERT INTO CLIENTES (cpf_cnpj,nome,endereco,telefone)"
                + " VALUES ('" + cpf_cnpj + "', '" + nome + "', '" + endereco + "', '" + telefone + "')";

        conexao.execute(SQL_String);

        conexao.desconecta();
    }

    public ArrayList<Cliente> buscaClientesPorCPFCNPJ(String cpf_cnpj) throws SQLException {
        conexao.conecta();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        String SQL_string = "SELECT * FROM clientes WHERE "
                + "cpf_cnpj LIKE '%" + cpf_cnpj + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);

        
        String nome;
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

    public ArrayList<Cliente> buscaTodosOsClientes() {
            conexao.conecta();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        String SQL_string = "SELECT * FROM clientes";
                

        ResultSet rs = conexao.executeSql(SQL_string);

        String cpf_cnpj;
        String telefone;
        String endereco;
        String nome;
        
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
    
}
