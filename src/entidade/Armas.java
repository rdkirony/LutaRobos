/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author gabriel, matheus
 */
public class Armas extends ItensEspeciais {
    private String nome;
    private int disntaciaEfetiva;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDisntaciaEfetiva() {
        return disntaciaEfetiva;
    }

    public void setDisntaciaEfetiva(int disntaciaEfetiva) {
        this.disntaciaEfetiva = disntaciaEfetiva;
    }

    public Armas(String tipo, String nome, int dano, int disntaciaEfetiva) {
        super(dano, tipo);
        this.nome = nome;
        this.disntaciaEfetiva = disntaciaEfetiva;
    }
   
  
}
