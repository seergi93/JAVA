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
public class RectanguloTest {

    public RectanguloTest() {
    }

    @Test
    public void Rectangulo_Test1() {
        Rectangulo r = new Rectangulo(6, 5);
        assertEquals(30, r.area(), 0.1);
    }

    @Test
    public void Rectangulo_Test2() {
        Rectangulo r = new Rectangulo(2, 5);
        assertEquals(10, r.area(), 0.1);
    }

    @Test
    public void Rectangulo_Test3() {
        Rectangulo r = new Rectangulo(10, 30);
        assertEquals(300, r.area(), 0.1);
    }
}
