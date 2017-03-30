/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Displays;

import interfaces.Thermometer;
import regulator.AmbientTemperature;

/**
 *
 * @author Sergi
 */
public class RemoteCommandSensor implements Thermometer {
    
    

    @Override
    public double read(AmbientTemperature temperature) {

        return temperature.getTemperature();

    }

}
