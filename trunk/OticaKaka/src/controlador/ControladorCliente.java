/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ClienteDAO;
import persistencia.UsuarioDAO;
import utils.Usuario;

/**
 *
 * @author Igor
 */
public class ControladorCliente {
    
     ClienteDAO clienteDAO = new ClienteDAO();
    
    public void insereCliente (String nome, String cpf_cnpj, String endereco, String telefone) {
        try {
            clienteDAO.insertCliente(nome, cpf_cnpj, endereco, telefone);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
