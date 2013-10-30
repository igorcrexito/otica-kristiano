/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.UsuarioDAO;
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
}
