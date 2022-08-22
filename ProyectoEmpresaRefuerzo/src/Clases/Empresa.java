
package Clases;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String nombre;
    String nit;
    //De la composición aparece una lista
    List<Empleado>listaEmpleado=new ArrayList<>();

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }
    
    public void pagarSalarios(){
        //Lógica, mostar mensaje pagando salarios
        System.out.println("Pagando salarios");
    }
    public  void agregarEmpleado(Empleado nuevoEmpleado){
        listaEmpleado.add(nuevoEmpleado);      
    }
     
}
