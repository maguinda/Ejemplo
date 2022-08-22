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
public class PersonaJuridica extends Cliente {
    private String razonSocial;
    private String nit;

    public PersonaJuridica(String razonSocial, String nit, int id, String direccion, String telefono, String email) {
        super(id, direccion, telefono, email);
        this.razonSocial = razonSocial;
        this.nit = nit;
    }
    
    public void crearCliente(){
        System.out.println("Crear cliente persona jurdica");
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
    
}
