/*
 *Temperatura
Con la epidemia generada por el virus COVID-19 se incrementó la importación 
de termómetros digitales, sin embargo, al verificar un lote de más 
de 10000 termómetros, se percatarón que solo toma la temperatura en grados 
Fahrenheit y se necesita poder convertirlos a grados centígrados. 
Afortunadamente nos han dado la fórmula de conversión

C=(F−32)* 5/9 

El siguiente es el programa que realiza la conversión

 */
package Secuencial2Temperatura;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Temperatura {
    float fah;
    float cent;

    public float leerNumeros(){
        fah = Integer.parseInt(JOptionPane.showInputDialog("Grados Fahrenheit a convertir: "));
        return fah;
    }
    
    public float Convertir(){
        cent=  (fah-32)*(5/9f);
        return cent;       
    }
    
    public void Mostrar(){
        System.out.println("Grados Fahrenheit: "+ fah +"\nEquivalen a: "+ cent +" Centigrados");
    }
}
