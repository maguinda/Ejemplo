package Clases;

public class PrestacionDeServicios extends Empleado {

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    // Atributos
    int anioIngreso;
    // Constructor
    public PrestacionDeServicios(int anioIngreso, String cedula, String nombre, int edad, int salarioBase) {
        super(cedula, nombre, edad, salarioBase);
        this.anioIngreso = anioIngreso;
    }
    // Metodos
    
    
    
    public void recibirSalario(int cantPago){
        /*
        El método recibir salario imprimirá en pantalla el pago acorde al tipo de empleado:
- Prestación de Servicios: cantPago - 6%                  - Planta: cantPago - 12%
        */
        
        
    }
}
