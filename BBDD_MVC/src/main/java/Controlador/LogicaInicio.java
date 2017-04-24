/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.util.ArrayList;

/**
 * Esta Clase domina la lógica de la ventana principal, también se crea un pool 
 * personas para ir guardando las personas.
 * @author Sergi
 */

public class LogicaInicio {

    private static Persona persona = null;
    private static ArrayList<Persona> poolPersonas = new ArrayList<Persona>();
/**
 * Método para dar de alta al usuario
 * @param nombre
 * @param apellido
 * @param edad
 * @param dni
 * @param genero 
 */
    public static void altaUsuario(String nombre, String apellido, int edad, String dni, String genero) {

        
        persona = new Persona(nombre, apellido, edad, dni, genero);
        poolPersonas.add(persona);

    }

    public static Persona getPersona() {
        return persona;
    }

    public static void setPersona(Persona persona) {
        LogicaInicio.persona = persona;
    }

    public static ArrayList<Persona> getPoolPersonas() {
        return poolPersonas;
    }

    public static void setPoolPersonas(ArrayList<Persona> poolPersonas) {
        LogicaInicio.poolPersonas = poolPersonas;
    }

}
