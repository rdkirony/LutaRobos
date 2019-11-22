package entidade;

public class Robo {
    private String nome;
    private String classe;
    private int vida;
    private int dano;
    private int precisao;
    private int movimento;
    private int armadura;
    
    public Robo(String nome, String classe, int vida, int dano, int precisao, int movimento, int armadura){
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.dano = dano;
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
    public int getDano(){
        return this.dano;
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
    
    
}
