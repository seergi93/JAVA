/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyeartest;
import org.foobarspam.leapyear.Year;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author jonat
 */
public class YearTest {
    
    @Test
	public void test_esBisiesto_cuatro() {
	Year any = new Year(1904);
	assertEquals("test año bisiesto acabado en 4", true, any.isLeap());
	}
	
	@Test
	public void test_esBisiesto_seis(){
	Year any = new Year(2016);
	assertEquals("test año bisiesto acabado en 4", true, any.isLeap());
	}
        
        @Test
        public void test_noBisiesto_cero(){
        Year any = new Year(0);
        assertEquals("test año 0",true,any.isLeap());
        }
        
        @Test
        public void test_noBisiesto_cerocero(){
        Year any = new Year(2200);
        assertEquals(false,any.isLeap());
        }
        
        @Test
        public void test_noBisiesto_cuatrocientos(){
        Year any = new Year(1400);
        assertEquals(false,any.isLeap());
        }
}
