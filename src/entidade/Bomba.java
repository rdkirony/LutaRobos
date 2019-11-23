package entidade;

public class Bomba extends ItemBase{
    private int areaExplosao;
    
    public Bomba(String tipo, double dano, int areaExplosao) {
        super(dano,tipo);
        this.areaExplosao = areaExplosao;
    }
    
    public int getSreaExplosao(){
        return this.areaExplosao;
    }

}
