/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masasplanetas;

import Gravity.Gravity;

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
public class PlanetasTest {

    public PlanetasTest() {
    }

    @Test
    public void calcularGravedad() {
        assertEquals(9.8, Gravity.calculateGravity(Planetas.EARTH), 0.1);

    }

    @Test
    public void weights() {

        for (Planetas p : Planetas.values()) {
            Gravity.calculateGravity(p);
            System.out.println("On the planet " + p.name() + " weights "
                    + Math.rint(Gravity.calculateYouWeight(175)) + "kg.");

        }
    }

}
