/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author lenovo
 */
public class Administrative extends Employee{
    private String categoria;
    private int subordinate;

    public Administrative(String categoria, int subordinate, String nameEmployee, String lastNameEmployee, String dni, String email, int module, String typeEmployee, double salary) {
        super(nameEmployee, lastNameEmployee, dni, email, module, typeEmployee, salary);
        this.categoria = categoria;
        this.subordinate = subordinate;
    }
    
    public void createSubordinate(){
        System.out.println("Cuantos subornidados van a crear");
    }
    
    public void assingCategory(){
        System.out.println("Asignar categoria");
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the subordinate
     */
    public int getSubordinate() {
        return subordinate;
    }

    /**
     * @param subordinate the subordinate to set
     */
    public void setSubordinate(int subordinate) {
        this.subordinate = subordinate;
    }
        
}
