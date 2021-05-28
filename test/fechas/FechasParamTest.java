/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author miguel_roman_parraga
 */
@RunWith(Parameterized.class)
public class FechasParamTest {

    static Fechas instance = new Fechas();
    static int resp;
    static String fecha;

    public FechasParamTest(int resp, String fecha) {

        this.resp = resp;
        this.fecha = fecha;
        
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {0,instance.Hoy()},{1,"2022-05-28"},{-1,"2020-05-28"}
        });
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
