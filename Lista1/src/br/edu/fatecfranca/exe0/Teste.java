/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel.pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // criar objeto
        Carro obj1 = new Carro("Onix", 2019, 0, false);
        // chamar os métodos
        obj1.mostrar();
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(40);
        obj1.mostrar();
        obj1.frear(10);
        obj1.mostrar();
        obj1.desligar();
        obj1.mostrar();
    
        // treinar: crie um outro obj2 e faça conforme fizemos
        String auxModelo = JOptionPane.showInputDialog("Informe o modelo");
        int auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
        float auxVel = Float.parseFloat(JOptionPane.showInputDialog("Informe a vel"));
        int resp = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
        boolean auxMotor = (resp == JOptionPane.OK_OPTION) ;
        Carro obj2 = new Carro(auxModelo, auxAno, auxVel, auxMotor);
        // chamar os métodos
        obj2.mostrar();
        obj2.ligar();
        obj2.mostrar();
        obj2.acelerar(90);
        obj2.mostrar();
        obj2.frear(30);
        obj2.mostrar();
        obj2.desligar();
        obj2.mostrar();
        
        Carro obj3 = new Carro(); // exemplifica o uso do construtor sem parâmetro
        obj3.ano = 2016;
        obj3.modelo = "Onix";
    }
    
}
