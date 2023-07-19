/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Banco.models.ClienteDAO;
import Banco.domains.Cliente;
import Banco.views.JFCliente;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        
        Cliente cliente = new Cliente("Luana da silva", 'F', "luanasilva@email.com", "solteiro");
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        clienteDAO.excluirCliente(cliente);
    }
}

