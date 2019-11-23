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
public class ItemBase {
    private Double dano;
    private String tipo;

    public ItemBase(Double dano, String tipo) {
        this.dano = dano;
        this.tipo = tipo;
    }

    public Double getDano() {
        return dano;
    }

    public void setDano(Double dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
