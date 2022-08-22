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
public class Principal {
    
    public static void main(String[] args) {
        Vehiculo misVehiculos[]= new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("HFO9889","JAC "," M2017");
        misVehiculos[1] = new VehiculoTurismo(4,"JK345","AUDI","M2018");
        misVehiculos[2] = new VehiculoDeportivo(160,"JH456","MERCEDES","M2019");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"R323","JAC","M2020");
        
        for (Vehiculo i: misVehiculos) {
            System.out.println(i.mostrarDatos()+"\n");
            //System.out.println("");    
        }
    }
    
}
