package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
    private int codigo;
    private Date data;
    private float valor;
    // vetor de objetos-parte
    private ArrayList<ItemCarrinho> itens;

    public Carrinho() {
        // inicializa o vetor
        this.itens = new ArrayList();
    }

    public Carrinho(int codigo, Date data, float valor, ArrayList<ItemCarrinho> itens) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.itens = itens;
    }

    public Carrinho(int codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
        this.valor = 0;
        this.itens = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemCarrinho> itens) {
        this.itens = itens;
    }
    
    // adiciona novo item ao carrinho
    public void addItem(ItemCarrinho item){
        this.itens.add(item);
        System.out.println("Adicionado com sucesso");
        this.valor += item.getQtde()*item.getValor();
    }
    // remove item do carrinho
   public void removeItem(ItemCarrinho item){
      if (this.itens.remove(item)){
          System.out.println("Remoção com sucesso");
          this.valor -= item.getQtde()*item.getValor();
      }
      else {
          System.out.println("Item não existe");
      }
   }

    @Override
    public String toString() {
        return "Carrinho{" + "codigo=" + codigo + 
                ", data=" + data + 
                ", valor=" + valor + 
                ", itens=" + itens + '}';
    }
   
}
