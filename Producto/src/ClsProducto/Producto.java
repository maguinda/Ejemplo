/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsProducto;
import java.util.Date;
/**
 *
 * @author lenovo
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private String presentacion;
    private String tabalNutricional;
    private String procedencia;
    private String tipo;
    private String empaque;
    private double precio;
    private int fechaVencimiento;
    private int fechaLote;

    public Producto(String codigo, String nombre, String marca, String presentacion, String tabalNutricional, String procedencia, String tipo, String empaque, double precio, int fechaVencimiento, int fechaLote) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.presentacion = presentacion;
        this.tabalNutricional = tabalNutricional;
        this.procedencia = procedencia;
        this.tipo = tipo;
        this.empaque = empaque;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaLote = fechaLote;
    }

    public Producto() {
        
    }

    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the presentacion
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return the tabalNutricional
     */
    public String getTabalNutricional() {
        return tabalNutricional;
    }

    /**
     * @param tabalNutricional the tabalNutricional to set
     */
    public void setTabalNutricional(String tabalNutricional) {
        this.tabalNutricional = tabalNutricional;
    }

    /**
     * @return the procedencia
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * @param procedencia the procedencia to set
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the empaque
     */
    public String getEmpaque() {
        return empaque;
    }

    /**
     * @param empaque the empaque to set
     */
    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the fechaVencimiento
     */
    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the fechaLote
     */
    public int getFechaLote() {
        return fechaLote;
    }

    /**
     * @param fechaLote the fechaLote to set
     */
    public void setFechaLote(int fechaLote) {
        this.fechaLote = fechaLote;
    }
    
    public void catidadProducto(){
        
        System.out.println("Cantidad de producto");
    }
    
    public void pedidosProducto(){
        System.out.println("Pedidos producto");
    }
    
    public void ventas(){
        System.out.println("Cuanto he vendido");  
    }
}
