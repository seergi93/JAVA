/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regulator;

import Displays.GasHeater;
import Displays.RemoteCommandSensor;
import interfaces.Heater;
import interfaces.Thermometer;

/**
 *
 * @author Sergi
 */
public class Main {
    
	public static void main(String[] args){	
            
		System.out.println("Arrancando\n");
		
		final double minTemp = 15.0;
		final double maxTemp = 21.0;
		
		AmbientTemperature temperature = new AmbientTemperature(15.2);
		
		Heater gasHeater = new GasHeater();
		Thermometer remoteComandSensor = new RemoteCommandSensor();
		
		Regulator regulator = new Regulator();
		regulator.regulate(remoteComandSensor, gasHeater, minTemp, maxTemp, temperature);
	}
}
