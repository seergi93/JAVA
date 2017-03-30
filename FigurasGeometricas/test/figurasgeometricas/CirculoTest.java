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
public class CirculoTest {

    @Test
    public void Circulo_Test1() {
        Circulo c = new Circulo(5);
        assertEquals(78.5, c.area(), 0.1);
    }

    @Test
    public void Circulo_Test2() {
        Circulo c = new Circulo(2.5);
        assertEquals(19.625, c.area(), 0.1);
    }

    @Test
    public void Circulo_Test3() {
        Circulo c = new Circulo(1);
        assertEquals(3.14, c.area(), 0.1);
    }

}
