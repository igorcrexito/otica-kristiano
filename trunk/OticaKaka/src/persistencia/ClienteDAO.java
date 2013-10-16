package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Cliente;

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

    public void updateConteudo(String nome,ArrayList<String> conteudo) {

        String tabela = "paginas";
        String SQL = "UPDATE " + tabela + " SET campo1 = '" + conteudo.get(0) + "' ,campo2 = '" + conteudo.get(1) +"' ,campo3 = '" + conteudo.get(2) +"' ,campo4 = '" + conteudo.get(3) +" 'WHERE nome = '" + nome + "'";

        conexao.execute(SQL);
    }


}
