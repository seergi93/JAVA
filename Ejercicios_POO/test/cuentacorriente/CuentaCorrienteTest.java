/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

import cuentacorriente.CuentaCorriente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class CuentaCorrienteTest {

    @Test
    public void testRestarSaldo() {
        CuentaCorriente cuenta = new CuentaCorriente("78220113B", "Sergi", "Roberti", "carrer bla bla", "696303634", 58.36);
        cuenta.retirarDinero(0.36);
        assertEquals(58.00, cuenta.getSaldo(), 0.1);
    }

    @Test
    public void testIngresarDinero() {
        CuentaCorriente cuenta = new CuentaCorriente("78220113B", "Sergi", "Roberti", "carrer bla bla", "696303634", 58.60);
        cuenta.ingresarDinero(0.40);
        assertEquals(59.00, cuenta.getSaldo(), 0.1);
    }

    @Test
    public void testSaldoNegativo() {
        CuentaCorriente cuenta = new CuentaCorriente("78220113B", "Sergi", "Roberti", "carrer bla bla", "696303634", 58.60);
        assertFalse(cuenta.saldoNegativo(cuenta));
    }

}
