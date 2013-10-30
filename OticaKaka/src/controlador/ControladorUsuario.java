/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.UsuarioDAO;
import utils.Produto;
import utils.Usuario;

/**
 *
 * @author Igor
 */
public class ControladorUsuario {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean realizaLogin(String login, String senha) {
        Usuario usuario = null;
        try {
            usuario = usuarioDAO.buscaUsuarioPorLogineSenha(login, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (usuario != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUserIsAdmin(String login, String senha) {
        Usuario usuario = null;
        try {
            usuario = usuarioDAO.buscaUsuarioPorLogineSenha(login, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (usuario != null) {
            if (usuario.getNivelAcesso() != 1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public void insereUsuario(String login, String senha, int nivelAcesso) {
        usuarioDAO.insereUsuario(login, senha, nivelAcesso);

    }

    public ArrayList<Usuario> buscaTodosOsUsuarios() {
         ArrayList<Usuario> usuarios = null;

        usuarios = usuarioDAO.buscaTodosOsUsuarios();


        return usuarios;
    }

    public ArrayList<Usuario> buscaUsuariosPorLogin(String login) {
         ArrayList<Usuario> usuarios = null;

        usuarios = usuarioDAO.buscaUsuariosPorLogin(login);


        return usuarios;
    }

    public void atualizaUsuario(String login, String senha, int nivelAcesso, String loginSelecionado) {
        usuarioDAO.atualizaUsuario(login, senha, nivelAcesso,loginSelecionado);
    }

    
}
