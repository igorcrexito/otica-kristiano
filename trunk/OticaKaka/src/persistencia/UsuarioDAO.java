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
                + "LOGIN LIKE '" + login + "'" + " AND SENHA LIKE '" + senha + "'";

        ResultSet rs = conexao.executeSql(SQL_string);
        rs.first();

        Usuario usuario = null;
        String loginUsuario = "";
        String senhaUsuario = "";
        int nivelDeAcesso = 0;

        try {
            loginUsuario = rs.getString("login");
            senhaUsuario = rs.getString("senha");
            nivelDeAcesso = rs.getInt("nivelAcesso");
            if (loginUsuario != null && !loginUsuario.equals("")) {
                if (senhaUsuario != null && !senhaUsuario.equals("")) {
                    usuario = new Usuario(loginUsuario, senhaUsuario, nivelDeAcesso);
                }
            }
            

        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return usuario;
    }

    public void insereUsuario(String login, String senha, int nivelAcesso) {
        conexao.conecta();

        String SQL_String = "INSERT INTO USUARIO (login,senha,nivelAcesso)"
                + " VALUES ('" + login + "', '" + senha + "', '" + nivelAcesso + "')";

        conexao.execute(SQL_String);

        conexao.desconecta();
    }

    public ArrayList<Usuario> buscaTodosOsUsuarios() {
        conexao.conecta();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

                String SQL_string = "SELECT * FROM usuario";

        ResultSet rs = conexao.executeSql(SQL_string);
       

        int nivelAcesso = -1;
        String login;
        String senha;

        try {
            while (rs.next()) {
                login = rs.getString("login");               
                senha = rs.getString("senha");
                nivelAcesso = rs.getInt("nivelAcesso");
                
                if (!login.equals("") && !senha.equals("") && nivelAcesso!=-1) {
                    if (login != null && senha != null) {
                        usuarios.add(new Usuario(login ,senha, nivelAcesso));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return usuarios;
    }

    public ArrayList<Usuario> buscaUsuariosPorLogin(String loginUsuario) {
        conexao.conecta();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

                String SQL_string = "SELECT * FROM usuario where login like '%" +loginUsuario+"%'";

        ResultSet rs = conexao.executeSql(SQL_string);
       

        int nivelAcesso = -1;
        String login;
        String senha;

        try {
            while (rs.next()) {
                login = rs.getString("login");               
                senha = rs.getString("senha");
                nivelAcesso = rs.getInt("nivelAcesso");
                
                if (!login.equals("") && !senha.equals("") && nivelAcesso!=-1) {
                    if (login != null && senha != null) {
                        usuarios.add(new Usuario(login ,senha, nivelAcesso));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no sistema");
        }
        conexao.desconecta();
        return usuarios;
    }

    public void atualizaUsuario(String login, String senha, int nivelAcesso, String loginSelecionado) {
        conexao.conecta();

        
        String tabela = "usuario";
        String SQL = "UPDATE " + tabela + " SET login = '" + login + "', senha = '" + senha + "', nivelAcesso = '" + nivelAcesso + "' WHERE login = '" + loginSelecionado + "'";

        conexao.execute(SQL);

        conexao.desconecta();
    }
    
    
     
}
