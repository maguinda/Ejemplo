/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import java.math.MathContext;

/**
 *
 * @author lenovo
 */
public class EmpleadoBR {
    private int tipo;
    private float ventasMes;
    private float horasExtras;

    public EmpleadoBR(int tipo, float ventasMes, float horasExtras) {
        this.tipo = tipo;
        this.ventasMes = ventasMes;
        this.horasExtras = horasExtras;
    }

    
     public double llamarcalculaSalarioBruto(int tipo, float ventasMes, float horasExtras)throws BRException{
        double salarioBruto=calculaSalarioBruto(tipo, ventasMes, horasExtras);
        return salarioBruto;
    } 
  
    
    public static double calculaSalarioBruto(int tipo, float ventasMes, float horasExtras) throws BRException{      
        if (tipo !=0 && ventasMes>=0.0 && horasExtras>=0.0){
            double valorHoraExtra=20.0*horasExtras;
            double prima=0.0, Total=0.0;
            if (ventasMes>=1500){
                prima=200;
            }
            if(ventasMes>=1000.0 && ventasMes<1500.0){
                prima=100;
            }
            switch(tipo){
                case 1000:
                    Total=tipo+valorHoraExtra+prima;
                    break;
                case 1500:
                    Total= tipo+valorHoraExtra+prima;
                    break;
                default:
                    throw new BRException();
            }
            return Total; //En caso de que no haya ninguna excepción nos retorna Total
        }else {
            throw new BRException();
        }
    }
    
    public static float calculaSalarioNeto(float salarioBruto)throws BRException{
        
        if(salarioBruto !=0 && salarioBruto>0){
            double salarioNeto = 0;
            if(salarioBruto<1000){
               salarioNeto=salarioBruto;
            }
            if(salarioBruto>=1000.0 && salarioBruto<1500.0){
                salarioNeto=(float)(salarioBruto*(1-0.16));
                }
            if(salarioBruto>=1500.0){
                  salarioNeto=(float)(salarioBruto*(1-0.18));  
                }               
                return (float)(salarioNeto);
        } if(salarioBruto==0){
            return salarioBruto;
        }
        else{
            throw new BRException();
        }   
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ventasMes
     */
    public float getVentasMes() {
        return ventasMes;
    }

    /**
     * @param ventasMes the ventasMes to set
     */
    public void setVentasMes(float ventasMes) {
        this.ventasMes = ventasMes;
    }

    /**
     * @return the horasExtras
     */
    public float getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

}
