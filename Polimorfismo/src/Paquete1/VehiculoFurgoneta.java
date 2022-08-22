/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author lenovo
 */
public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        //return super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        return "Matricula: " + matricula +"\nMarca: " + marca + "\nModelo: "+ modelo + "\nCarga: " + carga; 
    }
    
}
