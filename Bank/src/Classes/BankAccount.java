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
public class BankAccount {
    private String number;
    private int codeSecurity;
    private double balance;
    private Client client;

    public BankAccount(String number, int codeSecurity, double balance, Client client) {
        this.number = number;
        this.codeSecurity = codeSecurity;
        this.balance = balance;
        this.client = client;
    }

    
    
    public void createCodeSec(){
        System.out.println("Crear codigo de seguridad");
    }
    public void updateBalance(){
        System.out.println("Actualizar saldo de la cuenta");
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the codeSecurity
     */
    public int getCodeSecurity() {
        return codeSecurity;
    }

    /**
     * @param codeSecurity the codeSecurity to set
     */
    public void setCodeSecurity(int codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
    
    public String mostrarDatos() {
        Client cliente=getClient();
        return "Numero Cuenta: " + number+"\nCodigo cuenta: " + codeSecurity+ "\nSaldo cuenta: "+ balance+"\nNombre Cliente: "+ cliente.getName();
                 
    }  
    
}
