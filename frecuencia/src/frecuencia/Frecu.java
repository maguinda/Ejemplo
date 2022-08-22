/*
 ** * 
def crear_probabilidad(cadena):
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
    return arreglo_probabilidad
 *
 */
package frecuencia;

import java.util.Arrays; 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.stream.IntStream;

/**
 *
 * @author lenovo
 */
public class Frecu {
    String texto;
    char caracter;
    int numeroDeVeces = 0;
    
    String cadena;
    List cadena2 = new LinkedList();
    
    public void leerCadena(){
    cadena = (JOptionPane.showInputDialog("Introduce texto: "));
    Iterator<String> iter = cadena2.iterator();
    
    
   // public static int Probabilidad( String cadena) {
        
        List arreglo_frecuencia = new LinkedList();
        List arreglo_probabilidad = new LinkedList();
        
        int contador=0;
       
        
        contador= cadena.length();
                
        for (int i = 0; i <cadena.length();i++) {
            
            if (arreglo_frecuencia.size()<=contador){
                
               arreglo_frecuencia.add(cadena.chars().filter(ch -> ch != ' ').count());
              // arreglo_frecuencia.add(1);
               System.out.println("Este es valor : "+arreglo_frecuencia);

                for (int j = 0; j < arreglo_frecuencia.size(); j++){  
                    double a =1;
                   // arreglo_probabilidad.add(Integer.parseInt(arreglo_frecuencia.get(j))/contador);
                   // System.out.println("Este es valor : "+arreglo_probabilidad);
                    }               
            }
         
            }
        }
    
}
