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
public interface Thermometer {   
    public double read(AmbientTemperature temperature);
}
