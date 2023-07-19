/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco.domains;

/**
 *
 * @author DELL
 */
public class ContaSalario extends Conta {

    public ContaSalario(double saldo, Cliente cliente, String tipo) {
        super(saldo, cliente, tipo);
    } 

   

    public String CreditoDeSalario(double salario, int data) {
        if (data == 05) {
           
            this.saldo += salario;
            return "Salário creditado.";
        }
         else {
            return "Conta Salário. Não é possível efetuar depósito";
        }
    }
}  
