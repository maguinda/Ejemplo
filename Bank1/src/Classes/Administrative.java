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
public class Administrative extends Employee {
    private String category;
    private int subordinate;

    public Administrative(String category, int subordinate, String nameEmployee, String lastNameEmployee, String dni, String email, int module, String typeEmployee, double salary) {
        super(nameEmployee, lastNameEmployee, dni, email, module, typeEmployee, salary);
        this.category = category;
        this.subordinate = subordinate;
    }
    
    public void createSubordinate(){
        System.out.println("Crear subordinado");
    }
    
    public void assignCategory(){
        System.out.println("Asignar categoria");
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
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
