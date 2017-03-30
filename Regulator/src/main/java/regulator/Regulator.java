/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regulator;

import interfaces.Heater;
import interfaces.Thermometer;

/**
 *
 * @author Sergi
 */
public class Regulator {

    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    private void message(RegulatorDisplayCodes code, AmbientTemperature temperature) {

        switch (code) {
            case HEATING:
                System.out.println("Calentando... " + temperature.getTemperature());
                break;

            case WAITING:
                System.out.println("Calentador apagado, la temperatura esta bajando " + temperature.getTemperature());
                break;

            default:
                System.out.println("....");
                break;
        }

    }

}
