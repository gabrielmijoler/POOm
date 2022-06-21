package br.edu.fatecfranca.exe3;

import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        
        int auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe Id"));
        int auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Informe qtde"));
        String auxDescricao = JOptionPane.showInputDialog("Informe Descrição");
        float auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe preço"));
        Produto obj1 = new Produto(auxId, auxQtde, auxDescricao, auxPreco);
        
        obj1.mostrar();
        obj1.comprar(30);
        obj1.mostrar();
        obj1.subir(1);
        obj1.mostrar();
        obj1.vender(3);
        obj1.mostrar();
        
       
    }
    
}
