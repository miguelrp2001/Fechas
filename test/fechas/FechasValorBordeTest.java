/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author miguel_roman_parraga
 */
public class FechasValorBordeTest {
    
    public FechasValorBordeTest() {
    }

    private static Fechas instance;
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass()");
        instance = new Fechas();
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass()");
        instance = null;
    }
    
    
    /**
     * Prueba de la clase para comprobar el valor borde.
     * @throws java.lang.Exception
     */
    @Test
    public void test1ValorBorde() throws Exception {
        System.out.println("Prueba 1: Valor borde, día de hoy.");
        String fechaFactura = instance.Hoy();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
}
