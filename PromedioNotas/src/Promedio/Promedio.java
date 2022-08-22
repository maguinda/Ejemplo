/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promedio;

/**
 *
 * @author lenovo
 */
public class Promedio {
    private String nombre;
    private String code;
    private double nota1;    
    private double nota2;

    public Promedio(String nombre, String code, double nota1, double nota2) {
        this.nombre = nombre;
        this.code = code;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    
    
    public String promedio(){
        if (this.nota2==0){
           throw new IllegalArgumentException();
       }
        double notaFinal=(getNota1()+this.nota2)/2;
        return "Nombre: "+getNombre()+" Codigo: " +getCode()+" Nota: "+notaFinal;
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
}
