/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numerosromanos;

import regEx.RegEx;

/**
 *
 * @author
 */
public class Conversor {

    private static RegEx regex = null;

    static private int value = 0;
    private static String romansNumber = null;

    public static void romansToDecimals(String romanNumber) {
//asdsa dsa ds 


        regex.objetive("IV|IX|CD|CM|XL|XC", romanNumber);

        while (regex.getMatcher().find()) {
            for (Character c : regex.getMatcher().group().toCharArray()) {
                value = RomanNumbers.valueOf(c.toString()).getValor() - value;

            }
            romansNumber = romanNumber.replace(regex.getMatcher().group(), "");

        }

        Conversor.summatives();

    }

    private static void summatives() {

        regex.objetive("[IXCM]{0,3}[VLD]{0,1}", romansNumber);

        while (regex.getMatcher().find()) {
            for (Character c : regex.getMatcher().group().toCharArray()) {
                value += RomanNumbers.valueOf(c.toString()).getValor();

            }
            romansNumber = romansNumber.replace(regex.getMatcher().group(), "");

        }

    }

    public static int getValue() {
        return value;
    }

}
