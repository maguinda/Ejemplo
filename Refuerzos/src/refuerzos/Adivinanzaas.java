/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzos;

import java.io.IOException;
public class Adivinanzaas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        
        char ch, respuesta='k';
    
        do{
            System.out.println("Estoy pensando una letra entre a y z");
            System.out.println("Puedes adivinarla?");
            do{
                ch=(char) System.in.read();
            }while (ch=='\n' | ch=='\r');
                if(ch==respuesta)System.out.println("Adivinaste");
                else{
                    System.out.println("*****No adivinaste*****");
                    if(ch<respuesta)System.out.println("Se encuentra por debajo de la letra a adivinar");
                    else System.out.println("Está muy por encima");
                    System.out.println("Prueba de nuevo\n");
                }
        }while(respuesta!=ch);
        
    }
    
}
