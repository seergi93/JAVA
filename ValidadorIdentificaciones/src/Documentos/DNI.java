/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;



/**
 *
 * @author Sergi
 */
public class DNI {

    public String dni = null;

    public DNI() {
    }

    public DNI(String dni) {

        this.dni = dni;

    }

    public ArrayList<String> generadorDNIincorrectos(int numeroCasos) {

        char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};

        String caso;

        ArrayList<String> casosTestFail = new ArrayList<>();

        for (int i = 1; i <= numeroCasos; i++) {
            // Generamos un String de 8 dígitos entre el 0 y el 9
            caso = "";
            for (int j = 1; j < 9; j++) {
                Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 58); // 58 excluido
                caso = caso + String.valueOf(Character.toChars(caracterAscii));
            }
            // y agregamos una de las letras no permitidas en la ultima posicion
            caso = caso + letrasNoPermitidas[ThreadLocalRandom.current().nextInt(0, 4)];
            // una vez formado el caso test incorrecto, lo metemos en el ArrayList
            casosTestFail.add(caso);
        }
        return casosTestFail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
