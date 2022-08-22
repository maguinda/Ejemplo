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
public class Pedido {
    private int id;
    private String fechaRealizacion;
    private boolean estado;
    private double total;
    private Carrito_compra carritoCompra;
    
    
    public Pedido(int id, String fechaRealizacion, boolean estado, double total) {
        this.id = id;
        this.fechaRealizacion = fechaRealizacion;
        this.estado = estado;
        this.total = total;
    }
    
 
public String agregarProducto(Cliente cliente){
        System.out.println("Atendiendo al cliente "+cliente.getId()+" Fecha de realización "+getFechaRealizacion());
        return cliente.getTelefono();
    }
    
    public void agregarProducto(){
        System.out.println("Agregar producto");
    }
    public void eliminarProducto(){
        System.out.println("Eliminar producto");
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
     * @return the fechaRealizacion
     */
    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     * @param fechaRealizacion the fechaRealizacion to set
     */
    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the carritoCompra
     */
    public Carrito_compra getCarritoCompra() {
        return carritoCompra;
    }

    /**
     * @param carritoCompra the carritoCompra to set
     */
    public void setCarritoCompra(Carrito_compra carritoCompra) {
        this.carritoCompra = carritoCompra;
    }
  
}
