package br.edu.fatecfranca.exe1;

public class Patinete extends Veiculo{

    private float pesoMaximo;
    private boolean eletrico;
    
    public Patinete(){
        
    }

    public Patinete(float pesoMaximo, boolean eletrico, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.pesoMaximo = pesoMaximo;
        this.eletrico = eletrico;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    @Override
    public String toString() {
        return "Patinete{" + "pesoMaximo=" + pesoMaximo + 
                ", eletrico=" + eletrico + 
                super.toString() + "Locomove: " + this.comoMeLocomovo() + '}';
    }
    
    @Override
    public String comoMeLocomovo() {
        return this.eletrico ? 
                "Me locomovo com motor " : "Me locomovo com os pés do usuário " ; 
    }
    
}
