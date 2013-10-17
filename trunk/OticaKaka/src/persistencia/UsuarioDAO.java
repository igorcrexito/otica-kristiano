/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Cliente;
import utils.Usuario;

/**
 *
 * @author Igor
 */
public class UsuarioDAO {

    private ConexaoBD conexao;

    public UsuarioDAO() {
        this.conexao = ConexaoBD.getConexaoBD();
    }

    public Usuario buscaUsuarioPorLogineSenha(String login, String senha) throws SQLException {
        conexao.conecta();

        String SQL_string = "SELECT * FROM usuario WHERE "
                + "LOGIN LIKE '%" + login + "%'" + " AND SENHA LIKE '%" + senha + "%'";

        ResultSet rs = conexao.executeSql(SQL_string);
        rs.first();

        Usuario usuario = null;
        String loginUsuario = "";
        String senhaUsuario = "";

        try {
            loginUsuario = rs.getString("login");
            senhaUsuario = rs.getString("senha");
            if (loginUsuario != null && !loginUsuario.equals("")) {
                if (senhaUsuario != null && !senhaUsuario.equals("")) {
                    usuario = new Usuario(loginUsuario, senhaUsuario);
                }
            }
            

        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return usuario;
    }
}
