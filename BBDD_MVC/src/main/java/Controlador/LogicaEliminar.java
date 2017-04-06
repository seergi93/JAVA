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

    public boolean comprovarDNI(String dni) {

        String objetivo = "12345678P";
        String patron = "(^\\d{8}[A-Z&&[^IÑOU]])|(^[XYZ]\\d{7}[A-Z&&[^IÑOU]])";
        RegEx objetoRegEx = new RegEx(patron, objetivo);
        if (objetoRegEx.matching()) {
            return true;
        } else {
            return false;
        }

    }
    
    public static Persona buscarPoolPersonas(String dni){
        
        Persona p = new Persona();
        //LogicaInicio.getPoolPersonas().getPoolPersonas().indexOf(DNI)
        
        
        return p;
    }
    
    

}
