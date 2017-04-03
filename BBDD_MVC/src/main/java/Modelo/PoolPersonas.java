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

    private ArrayList<Persona> poolPersonas = new ArrayList<Persona>();
    private Persona p = null;

    public void addPersona(Persona persona) {

        this.poolPersonas.add(persona);

    }

}
