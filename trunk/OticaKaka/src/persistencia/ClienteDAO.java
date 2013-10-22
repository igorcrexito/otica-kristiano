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

   public Cliente getClienteFromCPFCNPJ (String cpf_cnpj) throws SQLException {

        conexao.conecta();
       
        String SQL_string = "SELECT * FROM clientes WHERE " +
                "CPF_CNPJ LIKE'%" + cpf_cnpj + "%'";

        ResultSet rs= conexao.executeSql(SQL_string);
        rs.first();

        String nome = rs.getString("nome");
        String endereco = rs.getString("endereco");
        String telefone = rs.getString("telefone");

        conexao.desconecta();
        return new Cliente(nome,cpf_cnpj,endereco,telefone);
        
    }

      public void insertCliente (String nome, String cpf_cnpj, String endereco, String telefone) throws SQLException {

        conexao.conecta();
       
        String SQL_String = "INSERT INTO CLIENTES (cpf_cnpj,nome,endereco,telefone)" +
                " VALUES ('" + cpf_cnpj + "', '" + nome + "', '" + endereco + "', '" + telefone+"')";

         conexao.execute(SQL_String);
        
        conexao.desconecta();
    }

   public Cliente buscaClientePorCPF_CNPJ(String cpf_cnpj) throws SQLException {
        conexao.conecta();

        String SQL_string = "SELECT * FROM clientes WHERE "
                + "cpf_cnpj LIKE '" + cpf_cnpj + "'";

        ResultSet rs = conexao.executeSql(SQL_string);
        rs.first();

        Cliente cliente = null;
        String nome;
        String cpf__cnpj;
        String telefone;
        String endereco;
        
        
        try {
            nome = rs.getString("nome");
            cpf__cnpj = rs.getString("cpf_cnpj");
            telefone = rs.getString("telefone");
            endereco = rs.getString("endereco");
            
            if (!nome.equals("") && !cpf__cnpj.equals("") && !telefone.equals("") && !endereco.equals("")) {
                if (nome!=null && cpf__cnpj!=null && telefone!= null && endereco!= null) {
                    cliente = new Cliente(nome, cpf__cnpj, endereco, telefone);
                }
            }
            

        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return cliente;
    }
   
   public Cliente buscaClientePorNome(String nome) throws SQLException {
        conexao.conecta();

        String SQL_string = "SELECT * FROM clientes WHERE "
                + "nome LIKE '%" + nome + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);
        rs.first();

        Cliente cliente = null;
        String cpf_cnpj;
        String telefone;
        String endereco;
        
        
        try {
            cpf_cnpj = rs.getString("cpf_cnpj");
            telefone = rs.getString("telefone");
            endereco = rs.getString("endereco");
            
            if (!nome.equals("") && !cpf_cnpj.equals("") && !telefone.equals("") && !endereco.equals("")) {
                if (nome!=null && cpf_cnpj!=null && telefone!= null && endereco!= null) {
                    cliente = new Cliente(nome, cpf_cnpj, endereco, telefone);
                }
            }
            

        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return cliente;
    }
   


}
