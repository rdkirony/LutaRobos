/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author gabriel
 */
public class Armas extends ItemBase{
    private String nome;
    private int distanciaEfetiva;
    
    public Armas(String tipo, int dano, String nome, int distanciaEfetiva) {
        super(tipo, dano);
        this.nome = nome;
        this.distanciaEfetiva = distanciaEfetiva;
    }
    public String getNome(){
        return this.nome;
    }
    public int getDistanciaEfetiva(){
        return this.distanciaEfetiva;
    }
}
