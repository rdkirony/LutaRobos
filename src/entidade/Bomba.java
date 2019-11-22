package entidade;

public class Bomba {
    private int areaExplosao;
    
    public Bomba(String tipo, int dano, int areaExplosao) {
        this.areaExplosao = areaExplosao;
    }
    
    public int getSreaExplosao(){
        return this.areaExplosao;
    }

}
