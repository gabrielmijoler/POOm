package br.edu.fatecfranca.exe0;

import java.util.Date;

public class Cartao {
    private String numero, senha, bandeira;
    private int cvv;
    private Date validade;
    // relaciona a classe Cartão com a classe Conta
    private Conta conta;// dentro do cartão existe uma conta

    public Cartao() {
    }

    public Cartao(String numero, String senha, String bandeira, 
            int cvv, Date validade, Conta conta) {
        this.numero = numero;
        this.senha = senha;
        this.bandeira = bandeira;
        this.cvv = cvv;
        this.validade = validade;
        this.conta = conta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public void mostra(){
        System.out.println("Número " + this.numero + 
                " Cvv: " + this.cvv + " Senha: " + this.senha +
        " Bandeira: " + this.bandeira + " Validade: " + this.validade);
        this.conta.mostra();
        
    }
    
    public void saque(float x, String senha){
        if (senha.equals(this.senha)){ // senha == this.getSenha()
            if (new Date().before(this.validade)){
                this.conta.setSaldo(this.conta.getSaldo() - x);
            }
            else {
                System.out.println("Cartão expirado");
            }
        }
        else {
            System.out.println("Senha inválida");
        }
    }
}
