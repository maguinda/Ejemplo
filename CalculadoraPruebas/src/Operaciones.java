
import javax.swing.JOptionPane;

public class Operaciones {
    
    double num1;
    double num2;

    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double sumar(){
       return num1+num2;
    }
    
    public double restar(){
        return num1-num2;
    }
   public double multiplicar(){
        return num1*num2;
    }
   public double dividir(){
       if (num2==0){
           throw new IllegalArgumentException();
       }
        return num1/num2;
    }
   
}
