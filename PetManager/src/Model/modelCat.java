/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
import java.util.LinkedList;

/**
 *
 * @author lenovo
 */
public class modelCat {
    LinkedList<clsCat> catObjectList= new LinkedList<>();
    LinkedList<clsDog> dogObjectList= new LinkedList<>();
    
     public boolean createPet(clsCat cat) {
        try{
            
            
            return true;
    
        }catch(Exception e){
            return false;
            }
    }
    
    public boolean editPet(clsCat cat) {
        try{
            
            
            return true;
    
        }catch(Exception e){
            return false;
            }
    }
    public boolean deletePet(clsCat cat) {
        try{
            
            
            return true;
    
        }catch(Exception e){
            return false;
            }
    }
    
    public clsCat searchPet(String code) {
        clsCat cat=null;
        try{
            
            
            return cat;
    
        }catch(Exception e){
            return cat;
            }
    }
    
}
