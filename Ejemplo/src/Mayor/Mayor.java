/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mayor;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Mayor {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        boolean opc= true;
        
        Scanner leer=new Scanner(System.in);
        
        
        
        while(opc==true){
            System.out.println("Ingrese numero uno: ");
            a = leer.nextInt();
        
            System.out.println("Ingrese numero dos: ");
            b = leer.nextInt();
            
            if(a>b){
                System.out.println("entre "+a +" y "+b+" el mayor es: "+ a);
            }
            else{
                System.out.println("entre "+a +" y "+b+" el mayor es: "+ b);
            }
        }        
    }
    
}
