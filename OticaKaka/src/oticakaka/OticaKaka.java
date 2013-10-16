/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oticakaka;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ClienteDAO;
import utils.Cliente;

/**
 *
 * @author Igor
 */
public class OticaKaka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteDAO cliente =  new ClienteDAO();
        Cliente clie = null;
        try {
            clie = cliente.getClienteFromCPFCNPJ("010101");
        } catch (SQLException ex) {
            Logger.getLogger(OticaKaka.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(clie.getNome());
        
    }
}
