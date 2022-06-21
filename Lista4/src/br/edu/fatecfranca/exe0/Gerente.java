package br.edu.fatecfranca.exe0;
public class Gerente extends Funcionario {
    
    private float bonus;

    public Gerente() {
    }

    public Gerente(float bonus, int numero, String nome, String cpf, float salario) {
        super(numero, nome, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + 
                super.toString() + 
        " Salário Final " + this.calculaSalarioFinal() + '}';
    }

    @Override
    public float calculaSalarioFinal() {
        return this.salario + (this.salario*this.bonus)/100; 
    }
    
    
}
