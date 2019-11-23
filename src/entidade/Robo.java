package entidade;

public class Robo {
    private String nome;
    private String classe;
    private int vida;
    private int precisao;
    private int movimento;
    private int armadura;
    private Armas arma;

    public Robo(String nome, String classe, int vida, int precisao, int movimento, int armadura, Armas arma){
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.precisao = precisao;
        this.movimento = movimento;
        this.armadura = armadura;
        this.arma = arma;
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

    public int getPrecisao(){
        return this.precisao;
    }
    public int getMovimento(){
        return this.movimento;
    }
    public int getArmadura(){
        return this.armadura;
    }
    public Armas getArma(){
        return this.arma;
    }
    
    public void setArma(Armas arma) {
        this.arma = arma;
    }
    

}
