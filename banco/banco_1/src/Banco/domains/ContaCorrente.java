/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco.domains;

/**
 *
 * @author DELL
 */
public class ContaCorrente extends ContaRegular{

    public ContaCorrente(double saldo, Cliente cliente, String tipo) {
        super(saldo, cliente, tipo);
    }
    
     
       public boolean transferencia(double quantia, ContaRegular destino) {
        if (saldo < quantia) {
            return false;
        }
        if(saldo >= quantia);
        destino.depositar(quantia);
        return true;
        
    }
}
