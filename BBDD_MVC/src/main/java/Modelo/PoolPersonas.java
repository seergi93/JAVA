/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.LogicaInicio;
import java.util.ArrayList;

/**
 *
 * @author Sergi
 */
public class PoolPersonas {

    ArrayList<Persona> poolPersonas = new ArrayList<Persona>();
    Persona p = null;

    public void addPersona() {

        poolPersonas.add(LogicaInicio.Persona());

    }

}
