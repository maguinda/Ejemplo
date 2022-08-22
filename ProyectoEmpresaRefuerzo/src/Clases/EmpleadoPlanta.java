
package Clases;

public class EmpleadoPlanta extends Empleado{
    String cargo;

    public EmpleadoPlanta(String cargo, String cedula, String nombre, int edad, float salarioBase) {
        super(cedula, nombre, edad, salarioBase);
        this.cargo = cargo;
    }
    
    @Override
    public void recibirSalario(int cantPago){
        
    }
    
    
}
