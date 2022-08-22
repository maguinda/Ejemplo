
package Clases;

public class PrestacionServicios extends Empleado {
    int anioIngreso;

    public PrestacionServicios(int anioIngreso, String cedula, String nombre, int edad, float salarioBase) {
        super(cedula, nombre, edad, salarioBase);
        this.anioIngreso = anioIngreso;
    }

    @Override
 public void recibirSalario(int cantPago){
        
    }    
}
