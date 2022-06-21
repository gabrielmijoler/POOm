package br.edu.fatecfranca.exe0;

import java.util.Date;
import java.util.Calendar;

public class Testa {
    public static void main(String[] args) {
        
        Conta objConta1 = new Conta("3259", "102341-1", "Fulano", 1000);
        
        // definir uma data de validade
        Calendar c = Calendar.getInstance();
	c.set(Calendar.YEAR, 2024);
	c.set(Calendar.MONTH, Calendar.MARCH);
	c.set(Calendar.DAY_OF_MONTH, 15);
        
        Cartao objCartao1 = new Cartao("1212121212121212", "1234", "Visa", 
            196, c.getTime(), objConta1);
        
        objCartao1.mostra();
        objCartao1.saque(400, "1234");
        objCartao1.mostra();
        // by Fernando
               
        Cartao objCartao2 = new Cartao();
        objCartao2.setNumero("1212121212121212");
        objCartao2.setSenha("1234");
        objCartao2.setBandeira("Visa"); 
        objCartao2.setCvv(196);
        objCartao2.setValidade(c.getTime());
        objCartao2.setConta(objConta1);
        objCartao2.mostra();
        objCartao2.saque(300, "1234");
        objCartao2.mostra();
        objCartao2.saque(300, "123");
        objCartao2.mostra();
        objCartao2.saque(600, "1234");
        objCartao2.mostra();
        
        c = Calendar.getInstance();
	c.set(Calendar.YEAR, 2021);
	c.set(Calendar.MONTH, Calendar.MARCH);
	c.set(Calendar.DAY_OF_MONTH, 15);
        objCartao2.setValidade(c.getTime());
        objCartao2.saque(100, "1234");
        objCartao2.mostra();
    }
    
}
