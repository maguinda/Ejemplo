/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankMain;

import Classes.*;

/**
 *
 * @author lenovo
 */
public class BankMain {
    public static void main(String[] args) {
        Bank ban=new Bank("Banco del sur", "800945-1", "Bogota centro", "Luiz Carlos Bermudez");      
        ban.mostarDatos();
        System.out.println("");
        ban.createBranch();
        ban.deleteBranch();
        
        Client cliente1= new Client("Carlos", "Pantoja", "1234", "carlos@gamil.com", "4567891", "Calle siempre viva");
        Client cliente2= new Client("Marcos", "Pantoja", "1234", "carlos@gamil.com", "4567891", "Calle siempre viva");
        
       // BankAccount bankaccount=new BankAccount("1020548796", 45667, 500000, cliente1);
       // BankAccount bankaccount1=new BankAccount("4567891230", 75698, 100, cliente2);
        
        CurrentAccount current1=new CurrentAccount("2345", "1020548796", 45667, 500000, cliente1);
       // SavingsAccount  savigns1=new SavingsAccount("9632", "4567891230", 75698, 100, cliente2);
        
        current1.createCodeSec();
        current1.createPin();
        System.out.println("\n");
        
       // bankaccount.mostrarDatos();
        
        BankAccount cuentas[]= new BankAccount[3];
        
        cuentas[0] = new BankAccount("1020548796", 45667, 500000, cliente1);
        cuentas[1] = new CurrentAccount("2345", "1020548796", 45667, 500000, cliente1);
        cuentas[2] = new SavingsAccount("9632", "4567891230", 75698, 100, cliente2);
        
        for (BankAccount i: cuentas) {
            System.out.println(i.mostrarDatos()+"\n");
            //System.out.println("");    
        }     
    }
    
}
