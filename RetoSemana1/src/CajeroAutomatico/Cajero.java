/*
1. ingresa el dinero a la cuenta
2. Retirar dinero a la cuenta
3. Mostrar dinero en la cuenta
4. Salir
 */
package CajeroAutomatico;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Cajero {
    int opc;
    int saldo;
    int extra;
    int retirar;
    
    public void dinero(){
        saldo=Integer.parseInt(JOptionPane.showInputDialog("Digite tu saldo"));
        opc = Integer.parseInt(JOptionPane.showInputDialog(" 1. ingresa saldo a la cuenta.\n 2. Retira saldo de la cuenta. \n 3. Mostar dinero en la cuenta. \n 4. saldo \n Qué quieres hacer "));
        
        if (opc ==1) {
            extra = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero vas a ingresar"));
            saldo = saldo + extra;
            System.out.println("Su nuevo saldo es: "+ saldo);
        } else if(opc ==2) {
            retirar= Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero vas a retirar"));
            if (retirar>saldo){
                System.out.println("Saldo insuficiente");                
            }else{
                saldo -=retirar;
                System.out.println("Su nuevo saldo es: ");
            }
        }else if (opc==3){
            System.out.println("Su saldo es: "+saldo);
        }else if (opc ==4){
            System.out.println("Un gusto atenderlo, hasta pronto");
        }
        else{
            System.out.println("Opcion no valida");
        }
           
         }  
}
