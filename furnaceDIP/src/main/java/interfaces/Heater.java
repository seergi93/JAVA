package interfaces;

import types.RoomTemperature;

public interface Heater {
	
	public void engage(RoomTemperature temperature);
	public void disengage(RoomTemperature temperature);

}
