package br.edu.fatecfranca.exe3;

import java.util.Date;

public class Testa {

    public static void main(String[] args) {
        Post p1 = new Post(100, "Fulano", "Guerra na Ucrânia", new Date());
        p1.darLike();
        p1.darLike();
        p1.darLike();
        Comentario c1 = new Comentario(101, 0, "Que triste", "Caio", new Date());
        c1.darLike();
        c1.darLike();
        p1.addComentario(c1);
        Comentario c2 = new Comentario(102, 0, "E o preço da GASOLA?", "Jesus", new Date());
        c2.darLike();
        c2.darLike();
        c2.darLike();
        p1.addComentario(c2);    
        System.out.println(p1.toString());
        p1.removeComentario(c1);
        System.out.println(p1.toString());
    }
    
    
}
