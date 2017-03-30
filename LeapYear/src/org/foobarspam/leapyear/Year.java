package org.foobarspam.leapyear;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Year {

	private int year = 0;
	
	public Year(int year){
		this.year = year;		
	}
	
	public int getYear(){
		return this.year;
	}
	
        
	public Boolean isLeap(){
		return getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0;
        }
        
        /**
         * Leap Year:
         * Divisible between 4, except those ending in 00, in which case it must also be divisible between 400.
         */
}
