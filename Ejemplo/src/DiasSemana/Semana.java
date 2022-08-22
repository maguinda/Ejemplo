/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiasSemana;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Semana {
    public static void main(String[] args) {
        int opc=0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7 ");
        opc= leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            
            default:
               System.out.println("Fuera del switch (y de los dias de la semana)");           
            
        }   
        
    }
    
}
