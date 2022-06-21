package br.edu.fatecfranca.exe0;
// abstract => classe não pode ser instanciada, serve
// apenas de modelo para as filhas
public abstract class Funcionario {
    // públicas para as classes filhas e do mesmo pacote
    // privada para as demais classes
    protected int numero;
    protected String nome, cpf;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(int numero, String nome, String cpf, float salario) {
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "numero=" + numero + 
                ", nome=" + nome + ", cpf=" + cpf + 
                ", salario=" + salario + '}';
    }
    
    // não faz sentido implementar este método no pai, somente nos filhos
    // abstract => não implemento
    // uma classe somente pode ter um método abstrato se ela for abstrata
    public abstract float calculaSalarioFinal();
        
    
    
}
