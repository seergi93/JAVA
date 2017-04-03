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
    
    private static Persona persona = new Persona();
    private static PoolPersonas poolPersona = null;
    
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
    
    public static Persona getPersona() {
        return persona;
    }
    
    public static void setPersona(Persona persona) {
        LogicaInicio.persona = persona;
    }
    
    public static void tratarCheckbox(String estado) {
        
        persona.setEstado(estado);
        
    }
    
    public static void obtenerEdad(String text) {
        
        persona.setEdad(Integer.parseInt(text));
        
    }
    
    public static void guardarPoolPersonas() {
        poolPersona.addPersona(persona);
        
    }
    
}
