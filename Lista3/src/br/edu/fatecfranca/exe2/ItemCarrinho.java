package br.edu.fatecfranca.exe2;
public class ItemCarrinho {
    private int codigo, qtde;
    private float valor;
    private String descricao;

    public ItemCarrinho() {
    }

    public ItemCarrinho(int codigo, int qtde, float valor, String descricao) {
        this.codigo = codigo;
        this.qtde = qtde;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" + "codigo=" + codigo + 
                ", qtde=" + qtde + 
                ", valor=" + valor + 
                ", descricao=" + descricao + '}';
    }
    
    
}
