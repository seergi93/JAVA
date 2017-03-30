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
public class ElipseTest {

    public ElipseTest() {
    }

    @Test
    public void Elipse_Test1() {
        Elipse e = new Elipse(4, 6);
        assertEquals(75.36, e.area(), 0.1);
    }

    @Test
    public void Elipse_Test2() {
        Elipse e = new Elipse(10, 20);
        assertEquals(628.3, e.area(), 0.1);
    }

    @Test
    public void Elipse_Test3() {
        Elipse e = new Elipse(1,2);
        assertEquals(6.28, e.area(), 0.1);
    }
}
