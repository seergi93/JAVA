package Hardware;

import interfaces.Thermometer;
import types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}
