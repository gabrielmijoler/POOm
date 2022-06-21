package br.edu.fatecfranca.exe0;

public class Testa {

      public static void main(String[] args) {
        
          Assistente ass1 = new Assistente(1000, 123, "Fulano", "123-23", 1000);
          System.out.println(ass1.toString());
          
          Gerente ge1 = new Gerente(30, 456, "Beltrano", "654-11", 3000);
          System.out.println(ge1.toString());
          
          Diretor di1 = new Diretor(50000, "Onix", 666, "Ciclano", "99-77", 5000);
          System.out.println(di1.toString());
          
    }
    
}
