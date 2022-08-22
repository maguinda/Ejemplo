/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import PruebasUnitarias.BRException;
import PruebasUnitarias.EmpleadoBR;

/**
 *
 * @author lenovo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BRException {
        EmpleadoBR cal= new EmpleadoBR(0, 0, 0);
        
        
        //System.out.println(" "+cal.llamarcalculaSalarioBruto(1000, -1, 8));
        System.out.println(" "+ cal.calculaSalarioNeto(-1));
    }
    
}
