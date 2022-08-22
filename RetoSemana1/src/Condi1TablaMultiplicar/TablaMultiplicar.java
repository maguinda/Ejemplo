/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condi1TablaMultiplicar;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class TablaMultiplicar {
    int num;
    
    public int leerNumeros(){
        // num = Integer.parseInt(JOptionPane.showInputDialog("Está lloviendo?"+"\nDigite 1 Si 2 No: "));
         num = Integer.parseInt(JOptionPane.showInputDialog("Numero de tu tabal de multiplicar:"));    
         return num;
     }
    
    public void TablaMultiplicar(){
        if (num >0) {
            for (int i = 1; i < 10; i++) {
                System.out.println(num+" por "+ i + " es igual a: " +num *i);
                
            }
            
        }else{
                    System.out.println("Número invalido");
                    }
    } 
   
}
