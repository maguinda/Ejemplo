/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import PruebasUnitarias.*;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author lenovo
 */
public class EmpleadoBRTest {
    
    public EmpleadoBRTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //
    
    @Test 
    public void testCalculaSalarioBruto0() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Vendedor,2000 euros, 8h.  Salida esperada:1360");
        TipoEmpleado vendedor= new TipoEmpleado();
        int empleadoVendedor= vendedor.getVendedor();
        float resultadoReal= (float) EmpleadoBR.calculaSalarioBruto(empleadoVendedor, 2000, 8);
        float esperado=1360.0f;
        assertEquals(esperado, resultadoReal,0.0);
        
         //float ventasMes=2000;
         //float horasExtras=8;      
        
         //EmpleadoBR calcular= new EmpleadoBR(empleadoVendedor, ventasMes, horasExtras);
         //double esperado =1360;
         //double resultado=calcular.llamarcalculaSalarioBruto(empleadoVendedor, ventasMes, horasExtras);
         //assertEquals(esperado, resultado,0.0);
    }
    @Test 
    public void testCalculaSalarioBruto1() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Vendedor, 1500 euros, 3h.  Salida esperada:1260");
        float ventasMes=1500;
        float horasExtras=3;      
        TipoEmpleado vendedor= new TipoEmpleado();
        int empleadoVendedor= vendedor.getVendedor();
        EmpleadoBR calcular= new EmpleadoBR(empleadoVendedor, ventasMes, horasExtras);
        double esperado =1260;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoVendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    @Test 
    public void testCalculaSalarioBruto2() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Vendedor, 1499.99 euros, 0h.  Salida esperada:1100");
        float ventasMes=1499.99f;
        float horasExtras=0;      
        TipoEmpleado vendedor= new TipoEmpleado();
        int empleadoVendedor= vendedor.getVendedor();
        EmpleadoBR calcular= new EmpleadoBR(empleadoVendedor, ventasMes, horasExtras);
        double esperado =1100;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoVendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    
    @Test 
    public void testCalculaSalarioBruto3() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Encargado, 1250 euros, 8h.  Salida esperada:1760");
        float ventasMes=1250;
        float horasExtras=8;      
        TipoEmpleado encargado= new TipoEmpleado();
        int empleadoEncargado= encargado.getEncargado();
        EmpleadoBR calcular= new EmpleadoBR(empleadoEncargado, ventasMes, horasExtras);
        double esperado =1760;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoEncargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    
    @Test 
    public void testCalculaSalarioBruto4() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Encargado, 1000 euros, 0h.  Salida esperada:1600");
        float ventasMes=1000;
        float horasExtras=0;      
        TipoEmpleado encargado= new TipoEmpleado();
        int empleadoEncargado= encargado.getEncargado();
        EmpleadoBR calcular= new EmpleadoBR(empleadoEncargado, ventasMes, horasExtras);
        double esperado =1600;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoEncargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    @Test 
    public void testCalculaSalarioBruto5() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Encargado, 999.99 euros, 3h.  Salida esperada:1560");
        float ventasMes=999.99f;
        float horasExtras=3;      
        TipoEmpleado encargado= new TipoEmpleado();
        int empleadoEncargado= encargado.getEncargado();
        EmpleadoBR calcular= new EmpleadoBR(empleadoEncargado, ventasMes, horasExtras);
        double esperado =1560;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoEncargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    @Test 
    public void testCalculaSalarioBruto6() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Encargado, 500 euros, 0h.  Salida esperada:1500");
        float ventasMes=500;
        float horasExtras=0;      
        TipoEmpleado encargado= new TipoEmpleado();
        int empleadoEncargado= encargado.getEncargado();
        EmpleadoBR calcular= new EmpleadoBR(empleadoEncargado, ventasMes, horasExtras);
        double esperado =1500;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoEncargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    
    @Test 
    public void testCalculaSalarioBruto7() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Encargado, 0 euros, 8h.  Salida esperada:1660");
        float ventasMes=0;
        float horasExtras=8;      
        TipoEmpleado encargado= new TipoEmpleado();
        int empleadoEncargado= encargado.getEncargado();
        EmpleadoBR calcular= new EmpleadoBR(empleadoEncargado, ventasMes, horasExtras);
        double esperado =1660;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoEncargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    @Test (expected = BRException.class)
    public void testCalculaSalarioBruto8() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Vendedor, -1 euros, 8h.  Salida esperada: BRException");
        float ventasMes=-1;
        float horasExtras=8;      
        TipoEmpleado vendedor= new TipoEmpleado();
        int empleadoVendedor= vendedor.getVendedor();
        EmpleadoBR calcular= new EmpleadoBR(empleadoVendedor, ventasMes, horasExtras);
        double esperado =1100;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoVendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    
    @Test (expected = BRException.class)
    public void testCalculaSalarioBruto9() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: Vendedor, 1500 euros, -1h.  Salida esperada: BRException");
        float ventasMes=1500;
        float horasExtras=-1    ;      
        TipoEmpleado vendedor= new TipoEmpleado();
        int empleadoVendedor= vendedor.getVendedor();
        EmpleadoBR calcular= new EmpleadoBR(empleadoVendedor, ventasMes, horasExtras);
        double esperado =1100;
        double resultado=calcular.llamarcalculaSalarioBruto(empleadoVendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    
    @Test (expected = BRException.class)
    public void testCalculaSalarioBruto10() throws BRException{
        System.out.println("Método calculaSalarioBruto. Entrada: null, 1500 euros, 8h.  Salida esperada: BRException");
        float ventasMes=1500;
        float horasExtras=8;      
        TipoEmpleado vendedor= new TipoEmpleado();
        int empleadoVendedor= vendedor.getVendedor();
        EmpleadoBR calcular= new EmpleadoBR(0, ventasMes, horasExtras);
        double esperado =1100;
        double resultado=calcular.llamarcalculaSalarioBruto(0, ventasMes, horasExtras);
        assertEquals(esperado, resultado,0.0);
    }
    
    
    @Test 
    public void testcalculaSalarioNeto1() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 2000.  Salida esperada:1640");       
        float resultadoReal= (float) EmpleadoBR.calculaSalarioNeto(2000.0f);
        float esperado=1640.0f;
        assertEquals(esperado, resultadoReal,0.0);
        /*
        float salarioBruto=2000f;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 1640;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0); 
*/
    }
    @Test 
    public void testcalculaSalarioNeto2() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 1500.  Salida esperada:1230");
        float salarioBruto=1500;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 1230;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0);       
    }
    @Test 
    public void testcalculaSalarioNeto3() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 1499.99.  Salida esperada:1259.9916");
        float salarioBruto=1499.99f;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 1259.9916;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        resultado=Math.round(resultado*10000.0)/10000.0;  
        assertEquals(esperado, resultado,0.0);       
    }
    
    @Test 
    public void testcalculaSalarioNeto4() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 1250.  Salida esperada:1050");
        float salarioBruto=1250;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 1050;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0);       
    }
    @Test 
    public void testcalculaSalarioNeto5() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 1000.  Salida esperada:840");
        float salarioBruto=1000;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 840;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0);       
    }
    @Test 
    public void testcalculaSalarioNeto6() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 999.99.  Salida esperada:999.99");
        float salarioBruto=999.99f;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 999.99;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        resultado=(Math.round(resultado*100.0)/100.0);
        assertEquals(esperado, resultado,0.0);       
    }
    @Test 
    public void testcalculaSalarioNeto7() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 500.  Salida esperada:500");
        float salarioBruto=500f;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 500;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0);       
    }
    @Test 
    public void testcalculaSalarioNeto8() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: 0.  Salida esperada:0");
        float salarioBruto=0;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = 0;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0);       
    }
    @Test (expected = BRException.class)
    public void testcalculaSalarioNeto9() throws BRException {
        System.out.println("Método calculaSalaroNeto. Entrada: -1.  Salida esperada:BRException");
        float salarioBruto=-1;           
        EmpleadoBR calcular= new EmpleadoBR(0, 0, 0);        
        double esperado = -1;
        double resultado=calcular.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado,0.0);       
    }

}
