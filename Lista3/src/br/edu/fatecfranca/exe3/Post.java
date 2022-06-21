package br.edu.fatecfranca.exe3;
import java.util.ArrayList;
import java.util.Date;
public class Post {
    private int codigo, likes;
    private String autor, texto;
    private Date data;
    private ArrayList<Comentario> comentarios;
    public Post() {
        this.comentarios = new ArrayList();
    }
    public Post(int codigo, int likes, String autor, String texto, Date data, ArrayList<Comentario> comentarios) {
        this.codigo = codigo;
        this.likes = likes;
        this.autor = autor;
        this.texto = texto;
        this.data = data;
        this.comentarios = comentarios;
    }
    public Post(int codigo, String autor, String texto, Date data) {
        this.codigo = codigo;
        this.autor = autor;
        this.texto = texto;
        this.data = data;
        this.comentarios = new ArrayList();
        this.likes = 0;
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
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
        System.out.println("Comentário adicionado");
    }
    public void removeComentario(Comentario comentario){
        if (this.comentarios.remove(comentario)){
            System.out.println("Comentário removido");
        }
        else {
            System.out.println("Comentário não existe");
        }
        
    }
    @Override
    public String toString() {
        return "Post{" + "codigo=" + codigo + 
                ", likes=" + likes + ", autor=" + autor + 
                ", texto=" + texto + ", data=" + data + 
                ", comentarios=" + comentarios + '}';
    }
}
