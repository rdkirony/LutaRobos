package entidade;

public class Virus extends ItemBase {
    private int numeroRodadas;
    public Virus( double dano, String tipo, int numeroRodadas) {
        super(dano,tipo);
        this.numeroRodadas = numeroRodadas;
    }

    public int getNumeroRodadas(){
        return this.numeroRodadas;
    }
}
