/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 * @puta merda bixo
 * @author gabriel
 */
public class ItensEspeciais {
    private int dano;
    private String tipo;

    public ItensEspeciais(int dano, String tipo) {
        this.dano = dano;
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
