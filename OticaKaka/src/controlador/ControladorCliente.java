/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ClienteDAO;
import persistencia.UsuarioDAO;
import utils.Cliente;
import utils.Usuario;

/**
 *
 * @author Igor
 */
public class ControladorCliente {

    ClienteDAO clienteDAO = new ClienteDAO();

    public void insereCliente(String nome, String cpf_cnpj, String endereco, String telefone) {
        try {
            clienteDAO.insertCliente(nome, cpf_cnpj, endereco, telefone);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizaCliente(String nome, String cpf_cnpj, String endereco, String telefone, String cpfAntigo) {
        try {
            clienteDAO.atualizaCliente(nome, cpf_cnpj, endereco, telefone, cpfAntigo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cliente> buscaClientesPorNome(String nome) {

        ArrayList<Cliente> clientes = null;
        try {
            clientes = clienteDAO.buscaClientesPorNome(nome);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public ArrayList<Cliente> buscaClientesPorCPFCNPJ(String cpf_cnpj) {

        ArrayList<Cliente> clientes = null;
        try {
            clientes = clienteDAO.buscaClientesPorCPFCNPJ(cpf_cnpj);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public void deletaClientesPorCPFCNPJ(String cpf_cnpj) {

        try {
            clienteDAO.deletaCliente(cpf_cnpj);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cliente> buscaTodosOsClientes() {
        ArrayList<Cliente> clientes = null;
        clientes = clienteDAO.buscaTodosOsClientes();

        return clientes;
    }
}
