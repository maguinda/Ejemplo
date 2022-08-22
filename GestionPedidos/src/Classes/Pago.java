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
public class Pago {
    private int id;
    private String fechaPago;
    private double pago;
    private Pedido pedido;

    public Pago(int id, String fechaPago, double pago, Pedido pedido) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.pago = pago;
        this.pedido = pedido;
    }

           
    public void verificarPago(){
        System.out.println("Verificar pago");
    }

    /**
     * @return the fechaPago
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the pago
     */
    public double getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(double pago) {
        this.pago = pago;
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
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
