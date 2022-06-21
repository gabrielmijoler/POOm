package br.edu.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class Cliente {

    int nroAgencia, nroConta;
    String nome;
    float saldo;
    
    public Cliente(){
        
    }
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo){
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void sacar(float x){
        this.saldo -=x;
    }
    
    public void depositar(float x){
        this.saldo +=x;
    }
    
     public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nro conta: " + this.nroConta + 
                " Nome: " + this.nome + " Saldo " + this.saldo)aaaaaaaaaaaaaaaaaaaaa; 
    }
}
