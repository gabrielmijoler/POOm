package br.edu.fatecfranca.exe3;
import java.util.Date;
public class Comentario {
    private int codigo, likes;
    private String texto, autor;
    private Date data;

    public Comentario() {
    }
    public Comentario(int codigo, int likes, String texto, String autor, Date data) {
        this.codigo = codigo;
        this.likes = likes;
        this.texto = texto;
        this.autor = autor;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void darLike(){
        this.setLikes(this.likes + 1);
    }
    
    public void tirarLike(){
        this.setLikes(this.likes - 1);
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n Comentario{" + "codigo=" + codigo +
                ", likes=" + likes + 
                ", texto=" + texto + 
                ", autor=" + autor + 
                ", data=" + data + '}';
    }
    
    
    
}
