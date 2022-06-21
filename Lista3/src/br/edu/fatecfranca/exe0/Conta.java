package br.edu.fatecfranca.exe0;
public class Conta {
    // declaração das variáveis
    private String agencia, conta, nome;
    private float saldo;

    public Conta() {
    }

    public Conta(String agencia, String conta, String nome, float saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void mostra(){
        System.out.println("Agência " + this.agencia + 
                " Conta: " + this.conta + " Nome: " + this.nome +
                " Saldo: " + this.saldo);
    }
    
}
