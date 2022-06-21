/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author Daniel.Pires
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motorizado mot1 = new Motorizado("Flex", 1.4f, "Chevrolet", "Onix", 2019);
        System.out.println(mot1.toString());
    }
    
    
}
