package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Aluno {
    
    int nroAluno, idade;
    String nome;
    float p1, p2;
    
    public Aluno(){
        
    }
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public void dadosAluno(){
        JOptionPane.showMessageDialog(null, "ID: " + this.nroAluno + 
                " Idade: " + this.idade + " Nome: " + this.nome);
    }
    
    public String passou(){
        return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
    }
}
