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
public class Employee {
    private String nameEmployee;
    private String lastNameEmployee;
    private String dni;
    private String email;
    private int module;
    private String typeEmployee;
    private double salary;
    private BankAccount bankAccoun;

    public Employee(String nameEmployee, String lastNameEmployee, String dni, String email, int module, String typeEmployee, double salary) {
        this.nameEmployee = nameEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.dni = dni;
        this.email = email;
        this.module = module;
        this.typeEmployee = typeEmployee;
        this.salary = salary;
    }
    
    
    public void createAccount(){
        System.out.println("Crear cuenta");
    }
    
    public void deleteAccount(){
        System.out.println("Eliminar cuenta");
    }

    /**
     * @return the nameEmployee
     */
    public String getNameEmployee() {
        return nameEmployee;
    }

    /**
     * @param nameEmployee the nameEmployee to set
     */
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    /**
     * @return the lastNameEmployee
     */
    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    /**
     * @param lastNameEmployee the lastNameEmployee to set
     */
    public void setLastNameEmployee(String lastNameEmployee) {
        this.lastNameEmployee = lastNameEmployee;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the module
     */
    public int getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(int module) {
        this.module = module;
    }

    /**
     * @return the typeEmployee
     */
    public String getTypeEmployee() {
        return typeEmployee;
    }

    /**
     * @param typeEmployee the typeEmployee to set
     */
    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the bankAccoun
     */
    public BankAccount getBankAccoun() {
        return bankAccoun;
    }

    /**
     * @param bankAccoun the bankAccoun to set
     */
    public void setBankAccoun(BankAccount bankAccoun) {
        this.bankAccoun = bankAccoun;
    }
    
    
}
