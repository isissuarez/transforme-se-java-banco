/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco.domains;

/**
 *
 * @author DELL
 */
public abstract class Conta {

    protected String numero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipo;
    
   public static int geraNumero = 0;
   public static double saldoTotal = 0;
   public static int qtdContasAtivas = 0;

    public Conta(double saldo, Cliente cliente, String tipo) {
        this.saldo = saldo;
        this.cliente = cliente;
        this.tipo = tipo;
        
        Conta.geraNumero += 1;
        this.numero = String.valueOf(geraNumero);
        Conta.qtdContasAtivas += 1;
        Conta.saldoTotal += saldo;
    }

    public String getNumero() {
        return numero;
    }

        public double getSaldo() {
        return saldo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     public boolean sacar(double quantia) {
        if (this.saldo < quantia) {
            return false;
        }
        this.saldo -= quantia;
        return true;
    }

    @Override
    public String toString() {
        String info = "";
        info += "Tipo: " + this.tipo + "\n";
        info += "Numero: " + this.numero + "\n";
        info += "Sexo: " + this.cliente.getSexo() + "\n";
        info += "Saldo: " + this.saldo + "\n";
        info += "------------------------------------------------------\n";
        info += "Saldo total" + saldoTotal + "\n";
        info += "Total de contas ativas" + qtdContasAtivas + "\n";
        info += "------------------------------------------------------\n";
                 
        return info;
    }
}
