package entidade;

public abstract class ItemBase {
    private String tipo;
    private int dano;
    public ItemBase(String tipo, int dano){
        this.tipo = tipo;
        this.dano = dano;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getDano(){
        return this.dano;
    }
}
