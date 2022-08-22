/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author lenovo
 */
public class Plato {
    private int id;
    private String nombrePlato;
    private float precioPlato;

    public Plato(int id, String nombrePlato, float precioPlato) {
        this.id = id;
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }
    
   
    /**
     * @return the nombrePlato
     */
    public String getNombrePlato() {
        return nombrePlato;
    }

    /**
     * @param nombrePlato the nombrePlato to set
     */
    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    /**
     * @return the precioPlato
     */
    public float getPrecioPlato() {
        return precioPlato;
    }

    /**
     * @param precioPlato the precioPlato to set
     */
    public void setPrecioPlato(float precioPlato) {
        this.precioPlato = precioPlato;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
  
    
}
