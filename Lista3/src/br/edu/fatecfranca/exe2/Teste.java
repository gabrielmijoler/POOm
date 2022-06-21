package br.edu.fatecfranca.exe2;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        
        Carrinho car1 = new Carrinho(1, new Date());
        ItemCarrinho item1 = new ItemCarrinho(100, 1, 60, "Java");
        ItemCarrinho item2 = new ItemCarrinho(200, 2, 40, "NodeJS");
        car1.addItem(item1);
        car1.addItem(item2);
        System.out.println(car1.toString());
        car1.removeItem(item1);
        System.out.println(car1.toString());
    }
    
}
