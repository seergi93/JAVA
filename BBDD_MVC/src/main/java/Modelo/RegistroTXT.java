package Modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sergi
 */
public class RegistroTXT {

    public static void guardarTXT(Persona persona) {

        try (FileWriter fw = new FileWriter("src/EstatSolicitants.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

            out.println("Nombre: " + persona.getNombre());
            out.println("Apellido: " + persona.getApellido());
            out.println("DNI: " + persona.getDni());
            out.println("EDAD: " + persona.getEdad());
            out.println("Sexo: " + persona.getSexo());

        } catch (IOException error) {
            System.out.println(error);
        }

    }

}
