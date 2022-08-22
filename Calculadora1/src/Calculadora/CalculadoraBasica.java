
package Calculadora;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Operacion cal = new Operacion();
        
        cal.leerNumeros();
        cal.sumar();
        cal.restar();
        cal.multiplicar();
        cal.division();
        cal.mostarResultados();
    }
    
}
