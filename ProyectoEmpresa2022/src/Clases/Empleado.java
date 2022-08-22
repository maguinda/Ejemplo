package Clases;

public abstract class Empleado {
    // Atributos

    private String cedula;
    private String nombre;
    private int edad;
    private int salarioBase;

    // Constructor
    // Ctrl + espacio
    public Empleado(String cedula, String nombre, int edad, int salarioBase) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    // Métodos (Pendiente)
    public void recibirSalario(int cantPago) {

    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the salarioBase
     */
    public int getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

}
