package Modelo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


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
            out.println("Sexo: " + persona.getSexo());
            out.println("Estado: " + persona.getEstado());
        } catch (IOException error) {
            System.out.println(error);
        }
        System.exit(0);

    }

//    public static void guardatTXT(Persona persona) {
//
//        documento.println("Nombre: ");
//
//        crearDoc();
//
//    }
//
//    private static void crearDoc() {
//        try {
//            documento = new PrintWriter("EstatSolicitants.txt");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(RegistroTXT.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("Se ha creado");
//        documento.close();
//    }
//
//    public void actionPerformed() {
//       
//    }
}
