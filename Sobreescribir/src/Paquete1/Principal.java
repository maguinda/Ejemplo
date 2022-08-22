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
        Persona persona=new Persona();
        Perro perro=new Perro();
        Vaca vaca=new Vaca();
        
        persona.comer();
        perro.comer();
        vaca.comer();
    }
    
}
