package Clases;

public class EmpleadoPlanta extends Empleado{
    // Atributos
    String cargo;
    // Constructor
    public EmpleadoPlanta(String cargo, String cedula, String nombre, int edad, int salarioBase) {
        super(cedula, nombre, edad, salarioBase);
        this.cargo = cargo;
    }
    // Metodos 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override 
    public void recibirSalario(int cantPago){
        /*
        El método recibir salario imprimirá en pantalla el pago acorde al tipo de empleado:
- Prestación de Servicios: cantPago - 6%                  - Planta: cantPago - 12%
        */
    }
}
