package hardware;

import interfaces.Heater;
import types.RoomTemperature;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}
