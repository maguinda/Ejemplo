/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Promedio.Promedio;
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

    @Test(expected = IllegalArgumentException.class)
    public void textPromedio(){
        System.out.println("Prueba unitaria del metodo promedio");
        String nombre="Carlos";
        String code="001";
        double nota1=5;    
        double nota2=0;
        double notaFinal=2.5;
        Promedio cal = new Promedio(nombre, code, nota1, nota2);
        String esperado = "Nombre: "+nombre+" Codigo: " +code+" Nota: "+notaFinal;
        String resultado=cal.promedio();
        assertEquals(esperado, resultado);
        
    }
}
