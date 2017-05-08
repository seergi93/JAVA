package Main;

import Hardware.GasHeater;
import Hardware.Regulator;
import Hardware.RemoteCommandSensor;
import interfaces.Heater;
import interfaces.Thermometer;
import otherstuff.Jedi;
import types.RoomTemperature;

/**
 * Hello world!
 *
 */
public class App 
{
    //sadafafaf
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}
