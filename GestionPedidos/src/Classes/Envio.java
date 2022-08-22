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
public class Envio {
    private int id;
    private String direccionFacturada;
    private boolean finalizado;
    private String fechaEnvio;
    private String compania;
    private Pago pago;

    public Envio(int id, String direccionFacturada, boolean finalizado, String fechaEnvio, String compania, Pago pago) {
        this.id = id;
        this.direccionFacturada = direccionFacturada;
        this.finalizado = finalizado;
        this.fechaEnvio = fechaEnvio;
        this.compania = compania;
        this.pago = pago;
    }
   
    public void realizarEnvio(){
        System.out.println("Realizar envío");
    }
    
    public void actualizarEnvio(){
        System.out.println("Actualizar envio");
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

    /**
     * @return the direccionFacturada
     */
    public String getDireccionFacturada() {
        return direccionFacturada;
    }

    /**
     * @param direccionFacturada the direccionFacturada to set
     */
    public void setDireccionFacturada(String direccionFacturada) {
        this.direccionFacturada = direccionFacturada;
    }

    /**
     * @return the finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    /**
     * @return the fechaEnvio
     */
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @param fechaEnvio the fechaEnvio to set
     */
    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * @return the compania
     */
    public String getCompania() {
        return compania;
    }

    /**
     * @param compania the compania to set
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    

    /**
     * @return the pago
     */
    public Pago getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
}
