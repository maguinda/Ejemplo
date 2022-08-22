/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class While {
    public static void main(String[] args) {
        // TODO code application logic here
        int cant, num = 0, pares=0, impares=0;
        System.out.print("Cuantos numeros desea ingresar: ");
        Scanner leer = new Scanner(System.in);
        cant = leer.nextInt();
      
        int sum=0;
        String cad="";
        int i=0;
       
        
        while( i < cant){
            
            i++;
            System.out.print("Ingresar numero " + i + " de " + cant + ": ");
            num = leer.nextInt();
            
            if(num%2 == 0){
              pares++;
            }else{
              impares++; 
            }
            
            cad=cad+" "+num;
           sum=sum+num;
    }
         
    System.out.println("\nCantidad de numeros pares: " + pares);
    System.out.println("Cantidad de numeros impares: " + impares);     
    System.out.println("los numeros ingresados son: "+cad);
    System.out.println("La suma es: "+sum);
    
    } 
    
}
