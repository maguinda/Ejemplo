package Calculadora;
import javax.swing.JOptionPane;
public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int division;
    int multiplicar;
    
    //Métodos:
    
    //Primer método pedir valores 
     public void leerNumeros(){
         numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primer numero: "));
         numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero: "));
     }
     
     public void sumar(){
         suma = numero1 + numero2;
     }
     public void restar(){
         resta = numero1 - numero2;
     }
     public void multiplicar(){
         multiplicar = numero1 * numero2;
     }
     public void division(){
         division= numero1/numero2;
     }
     
     public void mostarResultados(){
         System.out.println("La suma es : " + suma);
         System.out.println("la resta es: "+ resta);
         System.out.println("La multiplicación es : "+ multiplicar);
         System.out.println("La división es: "+ division);
     }
    
}
