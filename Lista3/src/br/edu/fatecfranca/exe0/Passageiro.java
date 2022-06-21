package br.edu.fatecfranca.exe0;
public class Passageiro {
    private String nome, cpf;

    public Passageiro() {
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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
    public void mostra(){
        System.out.println(" Nome " + this.nome + " CPF " + this.cpf);
    }
}
