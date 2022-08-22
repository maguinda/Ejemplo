/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuencia;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class ejemplos {
   public static void main(String[] args) {
       // TODO code application logic here
        List arreglo_frecuencia = new LinkedList();
        List arreglo_probabilidad = new LinkedList();
        
        String cadena;
        List cadena2 = new LinkedList();

        cadena = (JOptionPane.showInputDialog("Introduce texto: "));
    
        char [] Arraycadena;   
        int contador=0;
        int cont=0;
        char caracter;
        
        contador= cadena.length();
        
        Arraycadena = cadena.toCharArray();
        for (int i = 0; i <Arraycadena.length;i++) {
            char temp = Arraycadena[i];
            
            for (int  j= 0; j <Arraycadena.length;j++) {
                // Si el carácter en [i] es igual al carater de temp aumentamos el contador 
                if ( Arraycadena[j]==temp){
                    cont++;             
                }            
            }            
             if (arreglo_frecuencia.size()<=contador){
                 arreglo_frecuencia.add(cont);
               for (int k = 0; k < arreglo_frecuencia.size(); k++){  
                   double a=(int) arreglo_frecuencia.get(k);
                   arreglo_probabilidad.add(a/contador);
                   System.out.println("Este es valor : "+arreglo_probabilidad);
                    } 
             }
             cont=0;      
        }           
                
        }
        }

