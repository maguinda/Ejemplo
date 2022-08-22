/*
 * def crear_probabilidad(cadena):
    arreglo_frecuencia = [] 
    arreglo_probabilidad = []  
    contador = 0
    while cadena[contador:]:
        contador += 1
    for i in range(len(cadena)):
        if sum(arreglo_frecuencia) < contador:
            arreglo_frecuencia.append(cadena.count(cadena[i]))
    for j in range(len(arreglo_frecuencia)):
        arreglo_probabilidad.append(round(arreglo_frecuencia[j]/contador, 2)) 
        #arreglo_probabilidad.append(arreglo_frecuencia[j]/contador)
    return arreglo_probabilidad
 */
package frecuencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Frecuencia {


  
   public static void main(String[] args) {
        // TODO code application logic here
        List arreglo_frecuencia = new LinkedList();
        List<Double> arreglo_probabilidad = new LinkedList();
        List cadena2 = new LinkedList();
        
        String cadena;
        cadena = (JOptionPane.showInputDialog("Introduce texto: "));
    
        char [] Arraycadena;   
        double contador=0;
        int cont=0;

        
        contador= cadena.length();
        
        
        Arraycadena = cadena.toCharArray();
        for (int i = 0; i <Arraycadena.length;i++) {
            char temp = Arraycadena[i];
            cadena2.add(Arraycadena[i]);
            for (int  j= 0; j <Arraycadena.length;j++) {
                // Si el carácter en [i] es igual al carater de temp aumentamos el contador 
                if ( Arraycadena[j]==temp){
                    cont++;
                }   
            }            
            if (arreglo_frecuencia.size()<=contador){
                 arreglo_frecuencia.add(cont);                               
                 arreglo_probabilidad.add(cont/contador);                
               }       
        cont=0;                   
        }
         
        System.out.println("Para la cadena: "+cadena2);
        System.out.println("La frecuencia de cada cadarcter es: "+arreglo_frecuencia);
        System.out.println("La probabilidad de cada valor es:  "+arreglo_probabilidad);
        //arreglo_probabilidad.forEach(System.out::println);       
   }
}
   


