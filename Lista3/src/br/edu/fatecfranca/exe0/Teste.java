/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe0;

import java.util.Date;

/**
 *
 * @author Daniel.Pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Passageiro pa1 = new Passageiro("Fulano", "123-x");
        Voo vo1 = new Voo(987, "Congonhas", "Salvador");
        Reserva re1 = new Reserva(777, new Date(), pa1, vo1);
        re1.mostra();
    }
    
}
