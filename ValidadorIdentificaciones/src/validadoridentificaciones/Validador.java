/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadoridentificaciones;

import Documentos.*;
import java.util.ArrayList;
import java.util.regex.*;

/**
 *
 * @author Sergi
 */
public class Validador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DNI dni1 = new DNI("78220113B");
        if (validadorDNI(dni1)) {
            System.out.println("Ok");

        } else {
            System.out.println("Fail");
        }
        DNI dni2 = new DNI("78220113O");
        if (validadorDNI(dni2)) {
            System.out.println("Ok");

        } else {
            System.out.println("Fail");
        }

        // TODO code application logic here
    }

    public static boolean validadorDNI(DNI dni) {

        String regex = "\\d{8}[A-Z&&[^IÑOU]]";
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(dni.getDni());

        if (matcher.find()) {
            return true;

        } else {
            return false;
        }

    }

    public boolean validadorNIE(NIE nie) {

        String regex = "^[XYZ]\\\\d{7}[A-Z&&[^IÑOU]]";
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(nie.getNie());

        if (matcher.find()) {
            return true;

        } else {
            return false;
        }

    }

}
