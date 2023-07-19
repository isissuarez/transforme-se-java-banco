/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco.domains;

/**
 *
 * @author DELL
 */
public abstract class ContaRegular extends Conta{

    public ContaRegular(double saldo, Cliente cliente, String tipo) {
        super(saldo, cliente, tipo);
    }
    
    
    
     public void depositar(double quantia) {
        this.saldo += quantia;
    }
     
  
}
