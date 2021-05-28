/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author miguel_roman_parraga
 */
public class FechasEquivalenciaTest {
    
    public FechasEquivalenciaTest() {
    }

    
    private static Fechas instance;
    
    @Before
    public void beforeClass() {
        System.out.println("before()");
        instance = new Fechas();
    }
    
    @After
    public void afterClass() {
        System.out.println("after()");
        instance = null;
    }
    
    /**
     * Prueba de la clase para comprobar un valor fuera del rango.
     * @throws java.lang.Exception
     */
    @Test
    public void testEquivFuturo() throws Exception {
        System.out.println("Prueba 2: Equivalencia, fecha futura.");
        String fechaFactura = "2022-05-28";
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Prueba de la clase para comprobar un valor fuera del rango.
     * @throws java.lang.Exception
     */
    @Test
    public void testEquivPasada() throws Exception {
        System.out.println("Prueba 3: Equivalencia, fecha pasada.");
        String fechaFactura = "2020-05-28";
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
}
