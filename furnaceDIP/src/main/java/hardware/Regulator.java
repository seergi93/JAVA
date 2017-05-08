package hardware;

import interfaces.Heater;
import interfaces.Regulate;
import interfaces.Thermometer;
import types.RegulatorDisplayCodes;
import types.RoomTemperature;

public class Regulator implements Regulate {
    
    private  double temperature;
    private double maxTemp;
   
    
	public void regulate(){
			RegulatorDisplayCodes code;
			while(t.read(temperature) < maxTemp){
				code = RegulatorDisplayCodes.HEATING;				
				h.engage(temperature);
				message(code, temperature);
			}
			while (t.read(temperature) > minTemp){
				code = RegulatorDisplayCodes.WAITING;
				h.disengage(temperature);			
				message(code, temperature);
			}
	}

	private void message(){
		switch(code){
			case HEATING:
				System.out.println("Calentando => temperatura "+ temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => temperatura " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}
        
        
        

}
