/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisiesto;

/**
 *
 * @author Sergi
 */
public class Year {

    private int year = 0;

    public Year() {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public Boolean esBisiesto(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

    }
    
}
