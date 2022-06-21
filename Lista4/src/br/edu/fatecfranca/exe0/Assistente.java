package br.edu.fatecfranca.exe0;
// Assistente é filho de Funcionário
// É subclasse e Funcionário é superclasse
public class Assistente extends Funcionario{
    
    private float comissao;

    public Assistente() {
    }

    public Assistente(float comissao, int numero, String nome, String cpf, float salario) {
        // referenciar e chamar o construtor da superclasse
        super(numero, nome, cpf, salario);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override // anula o toString() recebido do pai
    public String toString() {
        return "Assistente{" + "comissao=" + comissao + 
                super.toString() + 
                " Salário final " + this.calculaSalarioFinal() + '}';
    }

    @Override
    public float calculaSalarioFinal() {
        return (this.salario + this.comissao);
    }
    
    
}
