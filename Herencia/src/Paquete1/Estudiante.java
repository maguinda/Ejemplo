
package Paquete1;

/**
 *
 * @author lenovo
 */
public class Estudiante extends Persona{
    
private int codigoEstudiante;
private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal,  String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad"+getEdad()+"\nCódigo del estudiante: "+codigoEstudiante+"\nNota final: "+notaFinal);
    }

}
