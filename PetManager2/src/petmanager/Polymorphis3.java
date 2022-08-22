/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsDog;

/**
 *
 * @author lenovo
 */
public class Polymorphis3 {
    public static void main(String[] args) {
        clsDog dog=new clsDog("Criollo",false,"001", "Firulais", 2015, "Negro", "Sano");  
        
        dog.walkAround();
        dog.walkAround(5);
        dog.walkAround(true);
    }
    
}
