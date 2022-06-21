/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author Daniel.Pires
 */
public class Motorizado extends Veiculo{
    
    private String combustivel;
    private float potencia;

    public Motorizado() {
    }

    public Motorizado(String combustivel, float potencia, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.combustivel = combustivel;
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motorizado{" + "combustivel=" + combustivel + 
                ", potencia=" + potencia + super.toString() +
                " Locomoção " + this.comoMeLocomovo() + '}';
    }
    
    @Override
    public String comoMeLocomovo() {
        return "Me locomovo com o motor que tenho, de " + this.potencia +
                " potências e combustivel " + this.combustivel;
    }
    
}
