/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisiesto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class YearTest {

    Year any = new Year();

    @Test
    public void test_esBisiesto() {

        assertEquals(true, any.esBisiesto(1544));
        assertEquals(true, any.esBisiesto(400));
        assertEquals(false, any.esBisiesto(100));
        assertEquals(false, any.esBisiesto(600));
        assertEquals(true, any.esBisiesto(1200));
        assertEquals(false, any.esBisiesto(2134));
        assertEquals(false, any.esBisiesto(4653));
    }

}
