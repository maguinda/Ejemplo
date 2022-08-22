package Vista;

import Clases.*;

public class MainConsola {
    public static void main(String[] args) {
        // Crear un objeto de la clase empresa
        Empresa empresa1 = new Empresa("MINTIC","1234-5");
        
        // Crear dos objetos de la clase empleado
        EmpleadoPlanta planta = new EmpleadoPlanta("Jefe","1234","JUAN",23,1000000);
        PrestacionDeServicios prestador = new PrestacionDeServicios(2020,"4567","PEPITO",40,2000000);
        
        // Agregar los dos empleados a la empresa
        empresa1.agregarEmpleado(planta);
        empresa1.agregarEmpleado(prestador);
        
        // Mostrar los empleados de la empresa
        System.out.println(empresa1.getNombre());
        System.out.println(empresa1.getNit());
        System.out.println(planta.getNombre());
        System.out.println(empresa1.getEmpleados());
        
    }
}
