package Clases;

import java.util.ArrayList;
import java.util.List;



public class Empresa {
    // Atributos
    String nombre;
    String nit;
    // Composicion (LISTA EMPLEADOS) -> Atributo
    List<Empleado> empleados = new ArrayList<>();
    
    // Constructor
    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    // Métodos y Getter y Setter
    public void pagarSalarios(){
       // Mostrar un mensaje diciendo pagando salarios
       System.out.println("pagando salarios"); 
    }
    
    public void agregarEmpleado(Empleado nuevoEmpleado){
        // Agregamos un empleado a la lista
        empleados.add(nuevoEmpleado);
    }
    
    
}
