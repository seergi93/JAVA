/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.PoolPersonas;
import Modelo.RegistroTXT;

/**
 *
 * @author Sergi
 */
public class LogicaInicio {

    private static Persona persona = null;
    private static PoolPersonas poolPersona = null;

    public static void altaUsuario(String nombre, String apellido, int edad, String dni, String genero, String estado) {

        persona = new Persona(nombre, apellido, edad, dni, genero, estado);
        RegistroTXT.guardarTXT(persona);
        poolPersona.addPersona(persona);

    }

}
