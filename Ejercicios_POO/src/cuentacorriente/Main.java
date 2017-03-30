/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

/**
 *
 * @author Sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        HE CREADO ESTE MAIN PARA COMPROVAR EL MÉTODO DE consultarCuenta
        */
        
        CuentaCorriente cuenta = new CuentaCorriente("78220113B","Sergi","Roberti","carrer bla bla","696303634",50.00);
        
        cuenta.consultarCuenta(cuenta);
    }
    
}
