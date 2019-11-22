package entidade;

public class Bomba extends ItemBase{
    private int areaExplosao;
    public Bomba(String tipo, int dano, int areaExplosao) {
        super(tipo, dano);
        this.areaExplosao = areaExplosao;
    }
    
    public int getSreaExplosao(){
        return this.areaExplosao;
    }

}
