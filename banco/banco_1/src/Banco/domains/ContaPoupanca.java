/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco.domains;

/**
 *
 * @author DELL
 */
public class ContaPoupanca extends ContaRegular {
    private int numeroMeses;
    private double taxa;
    private double rendimento;

    public ContaPoupanca(double saldo, Cliente cliente, String tipo, int numeroMeses) {
        super(saldo, cliente, tipo);
    }
      public void rendimento(double taxa){
        rendimento = this.saldo *(taxa * numeroMeses);
        this.saldo += this.saldo + rendimento;
         }
}
