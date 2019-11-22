package entidade;

public class Virus {
    private int numeroRodadas;
    public Virus(String tipo, int dano, int numeroRodadas) {
        this.numeroRodadas = numeroRodadas;
    }

    public int getNumeroRodadas(){
        return this.numeroRodadas;
    }
}
