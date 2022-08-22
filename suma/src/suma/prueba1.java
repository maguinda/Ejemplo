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
public class prueba1 {
    
       int adjacentElementsProduct(int[] inputArray){
            
            int cont=0;
            
            int product=0;
            int largest= Integer.MIN_VALUE;
            
            while(cont < inputArray.length-1){
                product=inputArray[cont]*inputArray[cont+1];
                cont++;
                if(product>largest)
                    largest=product;
            }
            return largest;
            
        } 
    
}
