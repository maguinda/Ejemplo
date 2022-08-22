/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author laulo
 */
public class elemento {
    private int cantidad_sillas;
    private int cantidad_mesas;
    private int cantidad_pc;

    public elemento() {
    }

    public elemento(int cantidad_sillas, int cantidad_mesas, int cantidad_pc) {
        this.cantidad_sillas = cantidad_sillas;
        this.cantidad_mesas = cantidad_mesas;
        this.cantidad_pc = cantidad_pc;
    }

    
    /**
     * @return the cantidad_sillas
     */
    public int getCantidad_sillas() {
        return cantidad_sillas;
    }

    /**
     * @param cantidad_sillas the cantidad_sillas to set
     */
    public void setCantidad_sillas(int cantidad_sillas) {
        this.cantidad_sillas = cantidad_sillas;
    }

    /**
     * @return the cantidad_mesas
     */
    public int getCantidad_mesas() {
        return cantidad_mesas;
    }

    /**
     * @param cantidad_mesas the cantidad_mesas to set
     */
    public void setCantidad_mesas(int cantidad_mesas) {
        this.cantidad_mesas = cantidad_mesas;
    }

    /**
     * @return the cantidad_pc
     */
    public int getCantidad_pc() {
        return cantidad_pc;
    }

    /**
     * @param cantidad_pc the cantidad_pc to set
     */
    public void setCantidad_pc(int cantidad_pc) {
        this.cantidad_pc = cantidad_pc;
    }
    
    
}
