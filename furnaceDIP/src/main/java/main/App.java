package main;

import com.google.inject.*;
import hardware.*;
import hardware.*;
import interfaces.*;
import otherstuff.*;
import types.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        Injector injector = Guice.createInjector(new RegulatorModule());  
  
        /*
         * Now that we've got the injector, we can build objects.
         * El codigo equivalente es:
         * Heater heater = new GasHeater();
         * Thermometer thermometer = new RemoteCommandSensor();
         * Regulador regulator = new Regulador(Thermometer, GasHeater);
         */ 
Regulador regulador = injector.getInstance(Regulador.class);
    }
}
