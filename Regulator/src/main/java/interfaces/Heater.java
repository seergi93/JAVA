/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import regulator.AmbientTemperature;

/**
 *
 * @author Sergi
 */
public interface Heater {

    public  void engage(AmbientTemperature temperature);

    public  void disengage(AmbientTemperature temperature);

    

    
}
