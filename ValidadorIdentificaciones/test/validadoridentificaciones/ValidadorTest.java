/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadoridentificaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Documentos.*;
import java.util.ArrayList;

/**
 *
 * @author Sergi
 */
public class ValidadorTest {

    public ValidadorTest() {
    }

    @Test
    public void validarDNICorrecto() {
        DNI dni = new DNI("45842892M");
        assertTrue(Validador.validadorDNI(dni));
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

}
