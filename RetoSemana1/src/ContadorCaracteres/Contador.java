/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContadorCaracteres;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class Contador {
    String texto;
    char caracter;
    int numeroDeVeces = 0;
    
    
    
    public void leerCadena(){
        do {           
            texto = (JOptionPane.showInputDialog("Introduce texto: "));
        } while (texto.isEmpty());
        //System.out.print("Introduce un carÃ¡cter: ");
        //caracter = (char) System.in.read();
        caracter = (JOptionPane.showInputDialog("Introduce un carÃ¡cter: ")).charAt(0);
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
    }
    //calcular el nÃºmero de veces que se repite un carÃ¡cter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posiciÃ³n siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
    
  }
    


    
    

