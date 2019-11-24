package entidade;

public class Virus extends ItensEspeciais {
    private int numeroRodadas;
    public Virus(String tipo, int dano, int numeroRodadas) {
        super(dano,tipo);
        this.numeroRodadas = numeroRodadas;
    }

    public int getNumeroRodadas(){
        return this.numeroRodadas;
    }
}
