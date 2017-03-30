/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetaPrepago;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class TarjetaPrepagoTest {

    public TarjetaPrepagoTest() {
    }

    @Test
    public void TestIngresarSaldo() {

        TarjetaPrepago tarjeta = new TarjetaPrepago("696303634", "78220113B", 145);

        tarjeta.ingresarSaldo(55);

        assertEquals(200, tarjeta.getSaldo(), 0.1);

    }

    @Test
    public void TestEnviarMensaje() {

        TarjetaPrepago tarjeta = new TarjetaPrepago("696303634", "78220113B", 145);

        tarjeta.enviarMensaje(45);

        assertEquals(140.95, tarjeta.getSaldo(), 0.1);

    }

    @Test
    public void TestRealizarLlamada() {

        TarjetaPrepago tarjeta = new TarjetaPrepago("696303634", "78220113B", 145);

        tarjeta.realizarLlamda(80);

        assertEquals(144.05, tarjeta.getSaldo(), 0.1);

    }

}
