/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;

/**
 *
 * @author lenovo
 */
public class Interfaces {
    public static void main(String[] args) {
        
        clsDog dog=new clsDog("Criollo",false,"001", "Firulais", 2015, "Negro", "Sano");        
        clsCat cat=new clsCat("Angora","002", "minino", 2018, "Blanco y negro", "Enfermo");
        
        System.out.println(dog.getAnimalType());
        System.out.println(""+dog.getNumberOfBorne());
        
        System.out.println(cat.getAnimalType());
        System.out.println(""+cat.getNumberOfBorne());
    }
    
}
