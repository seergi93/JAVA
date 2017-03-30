/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Displays;

import interfaces.Heater;
import regulator.AmbientTemperature;

/**
 *
 * @author Sergi
 */
public class GasHeater implements Heater {
    
    @Override
    public void engage(AmbientTemperature temperature) {
        
        temperature.changeTemperature(+1);
        
    }
    
    @Override
    public void disengage(AmbientTemperature temperature) {
        
        temperature.changeTemperature(-1);
        
    }
    
}
