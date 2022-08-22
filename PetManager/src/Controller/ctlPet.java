/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import Model.*;


/**
 *
 * @author lenovo
 */
public class ctlPet {
   private modelDog modelDog;
   private modelCat modelCat;

    public ctlPet() {
        this.modelDog = new modelDog();
        this.modelCat =new modelCat();
    }
    
    
    
    public boolean createPet(clsPet pet) {
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                    this.modelCat.createPet((clsCat)pet); 
                    break;
                    
                case "Perro":
                    this.modelDog.createPet((clsDog)pet);                   
                    break;
            }           
            return true;   
        }catch(Exception e){
            return false;
            }
    }
    
    public boolean editPet(clsPet pet) {
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                    this.modelCat.editPet((clsCat)pet); 
                    break;
                    
                case "Perro":
                    this.modelDog.editPet((clsDog)pet);                  
                    break;
            }          
            return true;    
        }catch(Exception e){
            return false;
            }
    }
    public boolean deletePet(clsPet pet) {
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                    this.modelCat.deletePet((clsCat)pet);
                    break;
                    
                case "Perro":
                    this.modelDog.deletePet((clsDog)pet);                   
                    break;
            }          
            return true;   
        }catch(Exception e){
            return false;
            }
    }
    
    public clsPet searchPet(String code, String type) {
        clsPet pet=null;
        try{
            switch (type){
                
                case "Gato":
                    pet= this.modelCat.searchPet(code);
                    break;
                    
                case "Perro":
                    pet= this.modelDog.searchPet(code);                  
                    break;
            }           
            return pet;   
        }catch(Exception e){
            return null;
            }
    }
    
}
