
package Paquete1;

public class Persona {
    
    String nombre;
    int edad;
    
    public Persona(String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad =_edad;
    }
    
    public void mostrarDato(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+ edad);
    }
}
