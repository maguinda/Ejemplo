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
public class Carrito_compra {
    private String fechaCreacion;
    private LineaProducto lineaProducto;

    public Carrito_compra(String fechaCreacion, LineaProducto lineaProducto) {
        this.fechaCreacion = fechaCreacion;
        this.lineaProducto = lineaProducto;
    }

   
    
    public void bucarProducto(){
        System.out.println("Buscar Producto");
    }
    
    public void calcularTotla(){
        System.out.println("Calcular Total pedido");
    }

    /**
     * @return the fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the lineaProducto
     */
    public LineaProducto getLineaProducto() {
        return lineaProducto;
    }

    /**
     * @param lineaProducto the lineaProducto to set
     */
    public void setLineaProducto(LineaProducto lineaProducto) {
        this.lineaProducto = lineaProducto;
    }
    
    
    
}
