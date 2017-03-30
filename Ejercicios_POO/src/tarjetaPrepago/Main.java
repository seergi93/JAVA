/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetaPrepago;

/**
 *
 * @author Sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TarjetaPrepago tarjeta = new TarjetaPrepago("696303634","78220113B",150);
        tarjeta.enviarMensaje(5);
        tarjeta.realizarLlamda(856);
        
        tarjeta.consultarTarjeta(tarjeta);
        
    }
    
}
