/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

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
public class CuadradoTest {

    public CuadradoTest() {
    }

    @Test
    public void Cuadrado_Test1() {
        Cuadrado c = new Cuadrado(5);
        assertEquals(25, c.area(), 0.1);
    }

    @Test
    public void Cuadrado_Test2() {
        Cuadrado c = new Cuadrado(10);
        assertEquals(100, c.area(), 0.1);
    }

    @Test
    public void Cuadrado_Test3() {
        Cuadrado c = new Cuadrado(2);
        assertEquals(4, c.area(), 0.1);
    }
}
