/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gravity;

import masasplanetas.Planetas;

/**
 *
 * @author Sergi
 */
public class Gravity {

    public static final double G = 6.67300E-11;

    private static double planetGravity = 0;

    public static double calculateGravity(Planetas planeta) {

        //return G * mass / (radius * radius);
        double gravity = G * planeta.getMass() / (planeta.getRadius() * planeta.getRadius());
        Gravity.planetGravity = gravity;
        return gravity;
    }

    public static double calculateYouWeight(double personWeight) {

        return (Gravity.planetGravity * personWeight)/calculateGravity(Planetas.EARTH);
    }

 

}
