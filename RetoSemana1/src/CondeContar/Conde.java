/*
 """ Programa Conde contar#
    cuenta numeos consecutivamente 
    desde 1 hasta un límite dado
    Oscar Franco-Bedoya
    Mayo 10-2021 """
 */
package CondeContar;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Conde {
    int limite_conteo;  
    int numero=0;
    
    public void leerNumero(){   
        limite_conteo= Integer.parseInt(JOptionPane.showInputDialog("Digite el número hasta el cual el conde debe contar:"));
        
        if (limite_conteo<0) {
            System.out.println("Lo siento el conde solo cuenta hasta numeros mayores a cero");
            
        } else {
            
            numero= contar(limite_conteo);
            System.out.println("Ahora conte hasta "+numero+" A veces cuento hasta 1000");
        } 

    }
    public static int contar(int limite ){
        int cont = 1;
    
        while (cont < limite) {
            System.out.println(cont);
            cont +=1;           
        }        
        return cont;
    }
}
