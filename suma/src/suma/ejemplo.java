/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author lenovo
 */
public class ejemplo {
   // encontrar palabras palindromas
    boolean A(String inputString){
        int i=inputString.length()-1;
        int j=0;
        while(i!=j && j<i){
            if(inputString.charAt(j++) == inputString.charAt(i--))
                return true;
        }
        return false;
    }
    
}
