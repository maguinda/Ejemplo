/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public class PetManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        
        clsDog dog1=new clsDog("Criollo",false,"001", "Firulais", 2015, "Negro", "Sano");
        
        clsCat cat1=new clsCat("Angora","002", "minino", 2018, "Blanco y negro", "Enfermo");
        
        Date current_date= new Date();
        
        int current_year= current_date.getYear();
        
        int ageDog1= (current_year+1900)- dog1.getBorn_year();
        int ageCat1=(current_year+1900)-cat1.getBorn_year();
        
        
        if(ageDog1>ageCat1){
            System.out.println("la mascota "+dog1.getName()+" es mayor a la mascota "+cat1.getName());
        }else if(ageCat1>ageDog1){
           System.out.println("la mascota "+cat1.getName()+" es mayor a la mascota "+dog1.getName()); 
        }else{
            System.out.println("la mascota "+dog1.getName()+" tiene la misma edad que "+cat1.getName()); 
        }
        
        dog1.eat();
        
        cat1.eat();
        cat1.move();
        cat1.sound();
        
        dog1.walkAround();
        cat1.selfCleaning();
    }
    
}
