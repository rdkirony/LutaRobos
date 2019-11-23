/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Random;

/**
 *
 * @author gabriel, matheus
 */
public class Armas extends ItemBase {
    private String nome;
    private Double disntaciaEfetiva;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDisntaciaEfetiva() {
        return disntaciaEfetiva;
    }

    public void setDisntaciaEfetiva(Double disntaciaEfetiva) {
        this.disntaciaEfetiva = disntaciaEfetiva;
    }

    public Armas(String nome, Double disntaciaEfetiva, Double dano, String tipo) {
        super(dano, tipo);
        this.nome = nome;
        this.disntaciaEfetiva = disntaciaEfetiva;
    }
   
  
}
