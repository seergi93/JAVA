package Controlador;

import Modelo.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sergi
 */
public class LogicaEliminar {

    private static Persona personaEncontrada;

    public static boolean comprovarDNI(String dni) {

        String objetivo = dni;
        String patron = "(^\\d{8}[A-Z&&[^IÑOU]])|(^[XYZ]\\d{7}[A-Z&&[^IÑOU]])";
        RegEx objetoRegEx = new RegEx(patron, objetivo);
        if (objetoRegEx.matching()) {

            return true;
        } else {
            return false;
        }

    }

    public static boolean buscarPersona(String dni) {

        boolean isFind = false;
        for (Persona p : LogicaInicio.getPoolPersonas()) {
            if (p.getDni().contentEquals(dni)) {
                personaEncontrada = p;
                isFind = true;
            }

        }
        return isFind;
    }

    public static Persona getPersonaEncontrada() {
        return personaEncontrada;
    }

    public static void setPersonaEncontrada(Persona personaEncontrada) {
        LogicaEliminar.personaEncontrada = personaEncontrada;
    }

    public static void eliminarPersona() {
    
        LogicaInicio.getPoolPersonas().remove(personaEncontrada);
        
        
    }
    
    
    

}
