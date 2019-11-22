package entidade;

public class Virus extends ItemBase{
    private int numeroRodadas;
    public Virus(String tipo, int dano, int numeroRodadas) {
        super(tipo, dano);
        this.numeroRodadas = numeroRodadas;
    }

    public int getNumeroRodadas(){
        return this.numeroRodadas;
    }
}
