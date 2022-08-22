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
public class Bank {
    private String name;
    private String nit;
    private String mainOffice;
    private String legalRepresentative;
    private Branch branch;

    public Bank(String name, String nit, String mainOffice, String legalRepresentative) {
        this.name = name;
        this.nit = nit;
        this.mainOffice = mainOffice;
        this.legalRepresentative = legalRepresentative;
    }
    
    public void createBranch(){
        System.out.println("Crear sucursal");
    }
    
    public void deleteBranch(){
        System.out.println("Eliminar sucursal");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the mainOffice
     */
    public String getMainOffice() {
        return mainOffice;
    }

    /**
     * @param mainOffice the mainOffice to set
     */
    public void setMainOffice(String mainOffice) {
        this.mainOffice = mainOffice;
    }

    /**
     * @return the legalRepresentative
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * @param legalRepresentative the legalRepresentative to set
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    /**
     * @return the branch
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    
    
}
