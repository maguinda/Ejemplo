/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaMultiplicarWhile;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Tabla {
    int num;
    boolean comprobar = true;
    
    public void TablaMultiplicar(){
        
        while(comprobar == true){
           num = Integer.parseInt(JOptionPane.showInputDialog("Numero de tu tabal de multiplicar:"));
            if (num >0) {
            for (int i = 1; i <=10; i++) {
                System.out.println(num+" por "+ i + " es igual a: " +num *i);
                
            }
            
        }else{
                    System.out.println("Número invalido");
                    }
        }
        
    } 
}
