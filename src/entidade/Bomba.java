package entidade;

public class Bomba extends ItensEspeciais{
    private int areaExplosao;
    
    public Bomba(String tipo, int dano, int areaExplosao) {
        super(dano,tipo);
        this.areaExplosao = areaExplosao;
    }
    
    public int getSreaExplosao(){
        return this.areaExplosao;
    }

}
