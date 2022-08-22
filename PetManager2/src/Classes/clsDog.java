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
public class clsDog extends clsPet {
    private String breed;
    private boolean pedigree;

    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.pedigree = pedigree;
    }

 @Override
  public void sound(){
     System.out.println("El perro "+ super.getName()+" hace guao");
 }
    
    
    
    public void walkAround(){
        System.out.println("El perro: "+super.getName() +" está caminando.");
    }
    
    public void walkAround(int Km){
        System.out.println("El perro: "+super.getName() +" está caminando "+Km+" Km");
    }
    
    public void walkAround(boolean dogLeash){
        String hasLeash= dogLeash ? " Con correa" : " sin correa";
        System.out.println("El perro: "+super.getName() +" está caminando "+hasLeash);
    }
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    
    
    
}
