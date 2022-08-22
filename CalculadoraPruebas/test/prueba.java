/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class prueba {
    
    public prueba() {
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

    @Test
    public void testSuma(){
        System.out.println("Prueba unitaria del metodo suma");
        double num1 =2;
        double num2=3;
        Operaciones cal = new Operaciones(num1, num2);
        double esperado = 5;
        double resultado=cal.sumar();
        assertEquals(esperado, resultado, 0.0);
        
    }

    
    @Test
    public void testResta(){
        System.out.println("Prueba unitaria del metodo resta");
        double num1 =4;
        double num2=3;
        Operaciones cal = new Operaciones(num1, num2);
        double esperado = 1;
        double resultado=cal.restar();
        assertEquals(esperado, resultado, 0.0);
        
    }
    @Test 
    public void testMulti(){
        System.out.println("Prueba unitaria del metodo multiplicación");
        double num1 =4;
        double num2=3;
        Operaciones cal = new Operaciones(num1, num2);
        double esperado = 12;
        double resultado=cal.multiplicar();
        assertEquals(esperado, resultado, 0.0);
        
    }
    @Test (expected = IllegalArgumentException.class)
    public void testDiv(){
        System.out.println("Prueba unitaria del metodo multiplicación");
        double num1 =4;
        double num2=0;
        Operaciones cal = new Operaciones(num1, num2);
        double esperado = 0;
        double resultado=cal.dividir();
        assertEquals(esperado, resultado, 0.0);
        
    }
}
