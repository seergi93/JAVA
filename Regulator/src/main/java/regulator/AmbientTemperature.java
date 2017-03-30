/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regulator;


/**
 *
 * @author Sergi
 */
public class AmbientTemperature {

    private double temperature = 0;

    public AmbientTemperature(double temperature) {
        this.temperature = temperature;

    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;

    }

    public void changeTemperature(double change) {

        this.temperature += change;

    }


}
