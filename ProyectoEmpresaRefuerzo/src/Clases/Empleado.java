
package Clases;

public abstract class Empleado {
    //Código de la clase empleado 
    //Atributos = tipo de dato y atributo
    String cedula;
    String nombre;
    int edad;
    float salarioBase;
    
    //constructor, sale ctrl + espacio
    public Empleado(String cedula, String nombre, int edad, float salarioBase) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    } 
      //métodos
    public void recibirSalario(int cantPago){
        
    }
    
    
}
