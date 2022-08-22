/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author lenovo
 */
public class Operacion {
    double e=0;
    double b=0;
    float resultado=0;
    
    public void Operar(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor del exponente: ");
        e= leer.nextInt();
        
        System.out.println("Ingrese el valor del base: ");
        b= leer.nextInt();
        
        resultado=  (float) (Math.pow(b, e));
            
        if (e >0){
            System.out.println("el resultado es: "+resultado);
        }
        if (e == 0){
            System.out.println("El resultado es: "+resultado);
        }
        if (e<0){
            System.out.println("El resultado es: "+resultado);
        }
    }
    
}
