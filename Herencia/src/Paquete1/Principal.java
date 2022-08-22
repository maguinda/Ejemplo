
package Paquete1;

/**
 *
 * @author lenovo
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(123,3.5f,"Andres","Ruiz",23);
        Estudiante estudiante2 = new Estudiante(345,4.5f,"Marcos","Ruiz",23);
        
        estudiante.mostarDatos();
        System.out.println("");
        estudiante2.mostarDatos();
    }
    
}
