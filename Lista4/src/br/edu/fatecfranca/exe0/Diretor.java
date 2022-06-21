package br.edu.fatecfranca.exe0;

public class Diretor extends Funcionario{
    
    private float carro;
    private String modelo;

    public Diretor() {
    }

    public Diretor(float carro, String modelo, int numero, String nome, String cpf, float salario) {
        super(numero, nome, cpf, salario);
        this.carro = carro;
        this.modelo = modelo;
    }

    public float getCarro() {
        return carro;
    }

    public void setCarro(float carro) {
        this.carro = carro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Diretor{" + "carro=" + carro + 
                ", modelo=" + modelo + super.toString() + 
                " Salário final " + this.calculaSalarioFinal() + '}';
    }

    @Override
    public float calculaSalarioFinal() {
        return this.salario + (this.carro * 5)/100;
    }
    
    
}
