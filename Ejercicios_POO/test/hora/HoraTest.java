/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class HoraTest {

    public HoraTest() {
    }

    @Test
    public void TestGet_and_SetHora() {
        /*
        Hago dos instancias y las comparo. Uso 2 constructores y setHora & getHora
        
        Caso Test todo en uno..
         */

        Hora hora = new Hora();
        Hora expected = new Hora(13, 16, 15);
        hora.setHora(13, 16, 15);
        assertArrayEquals(expected.getHora(), hora.getHora());

    }

    @Test
    public void TestGet_and_SetHora_ERROR() {
        /*
        Aquí cometo un error de formato de hora para ver que me devuelve 0 
         */

        Hora hora = new Hora();
        Hora expected = new Hora(0, 0, 0);
        hora.setHora(30, 99, 99);
        assertArrayEquals(expected.getHora(), hora.getHora());

    }

}
