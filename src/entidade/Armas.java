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
public class Armas {
    private String nome;
    private Double coeficienteDeDano;
    private Double dano;
    
    Random random = new Random();

    public Armas() {
    }

    public Armas(String nome, Double coeficienteDeDano, Double distancia3d) {
        this.nome = nome;
        this.coeficienteDeDano = coeficienteDeDano;
        this.dano = (coeficienteDeDano/distancia3d)*random.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCoeficienteDeDano() {
        return coeficienteDeDano;
    }

    public void setCoeficienteDeDano(Double coeficienteDeDano) {
        this.coeficienteDeDano = coeficienteDeDano;
    }

    public Double getDano() {
        return dano;
    }

    public void setDano(Double dano) {
        this.dano = dano;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
