/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.RegistroTXT;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Sergi
 */
public class LogicaInicio {

    private static Persona persona = new Persona();

    public static void obtenerNombre(String nombre) {

        persona.setNombre(nombre);

    }

    public static void obtenerApellido(String apellido) {
        persona.setApellido(apellido);

    }

    public static void obtenerDNI(String dni) {

        persona.setDni(dni);
    }

    public static void obtenerGenero(String genero) {

        persona.setSexo(genero);

    }

    public static void obtenerEstado(String selection) {

        persona.setEstado(selection);

    }

    public static void guardarTXT() {

        RegistroTXT.guardarTXT(persona);

    }

    public static void tratarCheckbox(ButtonGroup estado) {

        persona.setEstado(estado.getSelection().getActionCommand());

    }

}
