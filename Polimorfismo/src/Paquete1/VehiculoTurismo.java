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
public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        //return super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        return "Matricula: " + matricula +"\nMarca: " + marca + "\nModelo: "+ modelo + "\nNumero de Puertas: " + numeroPuertas; 
    }
    
}
    
    

