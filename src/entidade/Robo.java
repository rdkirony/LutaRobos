package entidade;

public class Robo {
    private String nome;
    private String classe;
    private int vida;
    private double precisao;
    private int movimento;
    private double armadura;
    private Armas arma;
    private int numeroRobo;
   
   

    public Robo(String nome, String classe, int vida, double precisao, int movimento, double armadura){

        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.precisao = precisao;
        this.movimento = movimento;
        this.armadura = armadura;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getClasse(){
        return this.classe;
    }
    public int getVida(){
        return this.vida;
    }

    public double getPrecisao(){
        return this.precisao;
    }
    public int getMovimento(){
        return this.movimento;
    }
    public double getArmadura(){
        return this.armadura;
    }
    public Armas getArma(){
        return this.arma;
    }
    
    public void setArma(Armas arma) {
        this.arma = arma;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nClasse: " + this.classe + "\nVida: " + this.vida + "\nMovimento: " + this.movimento + "\nArmadura " + this.armadura;
    }

}
