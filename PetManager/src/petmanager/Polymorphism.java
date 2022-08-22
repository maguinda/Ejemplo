/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
import Classes.clsDog;
import Classes.clsVeterinary;

/**
 *
 * @author lenovo
 */
public class Polymorphism {
    public static void main(String[] args) {
        //Instancia de las clases hijas
        clsDog dog=new clsDog("Criollo",false,"001", "Firulais", 2015, "Negro", "Sano");        
        clsCat cat=new clsCat("Angora","002", "minino", 2018, "Blanco y negro", "Enfermo");
        
        //instancia de veterinaria y doctor
        clsDoctor doctor= new clsDoctor("Maria Fernández", "L12345");
        clsVeterinary veterinary=new clsVeterinary("Veterinaria udc", "036 878 15 00", "Calle 65 N26-10", doctor);
    
        String careDog= veterinary.petCare(dog);
        System.out.println("El estado de salud de " + dog.getName()+" es "+careDog);
        
        String careCat= veterinary.petCare(cat);
        System.out.println("El estado de salud de " + cat.getName()+" es "+careCat);
    
    }
    
}
