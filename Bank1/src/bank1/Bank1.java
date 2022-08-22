/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank1;

import Classes.*;

/**
 *
 * @author lenovo
 */
public class Bank1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee empleado= new Employee("Carlos", "Hurtado", "1234", "carlos@gmail.com", 1, "Asesor", 500);
        Client cliente1=new Client("marcos", "garcia", "7531", "marcos@gmail.com", "310852741", "calle siempre viva");
        CurrentAccount cuenta1=new CurrentAccount("5678", "9632", 4688, 1000, cliente1);
        
        empleado.createAccount(cuenta1);
        System.out.println("Cuenta numero: "+ cuenta1.getNumber() );
    }
    
}
