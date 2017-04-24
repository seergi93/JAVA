/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.util.ArrayList;

/**
 * Lógica de las consultas
 *
 * @author Sergi
 */
public class LogicaConsultas {

    public static ArrayList<Persona> hombres = new ArrayList<Persona>();
    public static ArrayList<Persona> mujeres = new ArrayList<Persona>();
    public static ArrayList<Persona> menores = new ArrayList<Persona>();
    public static ArrayList<Persona> juvilados = new ArrayList<Persona>();
    public static ArrayList<Persona> mujeresMenores = new ArrayList<Persona>();
    public static ArrayList<Persona> hombresMenores = new ArrayList<Persona>();
    /**
     * Clasifico a las personas por su sexo
     */
    private static void clasificarPorSexo() {
        hombres.clear();
        mujeres.clear();

        LogicaInicio.getPoolPersonas().forEach((p) -> {
            if ("hombre".equals(p.getSexo().toLowerCase())) {
                hombres.add(p);
            } else if ("mujer".equals(p.getSexo().toLowerCase())) {
                mujeres.add(p);
            }
        });
    }
    /**
     * Metodo para devolver el mensaje con el nombre de mujeres y hombres
     *
     * @return
     */
    public static String genero() {

        LogicaConsultas.clasificarPorSexo();
        String mensaje = "Hombres: " + hombres.size() + "\nMujeres: " + mujeres.size();
        return mensaje;
    }
    /**
     * Clasifico las personas por si son menores o juvilados
     */
    private static void clasificarMenoresJuvilados() {
        menores.clear();
        juvilados.clear();
        LogicaInicio.getPoolPersonas().forEach((p) -> {
            if (p.getEdad() < 18) {
                menores.add(p);
            } else if (p.getEdad() > 67) {
                juvilados.add(p);
            }
        });
    }

    /**
     * Método para mostrar la cantidad de menores
     *
     * @return
     */
    public static String menores() {
        menores.clear();
        LogicaConsultas.clasificarMenoresJuvilados();
        String mensaje = "Menores: " + menores.size();
        return mensaje;
    }

    /**
     * Método para mostrar la cantidad de menores con información
     *
     * @return
     */
    public static String infoMenores() {
        LogicaConsultas.clasificarMenoresJuvilados();
        String mensaje = "Menores:\n";
        for (int i = 0; i < menores.size(); i++) {
            mensaje = mensaje.concat("Menor " + (i + 1) + " : " + menores.get(i).getNombre()
                    + " , Apellido: " + menores.get(i).getApellido() + "\n");
        }
        return mensaje;
    }

    /**
     * Cantidad de menores por sexo que hay
     *
     * @return
     */
    public static String infoMenoresSexo() {
        hombresMenores.clear();
        mujeresMenores.clear();
        menores.forEach((p) -> {
            if ("hombre".equals(p.getSexo().toLowerCase())) {
                hombresMenores.add(p);
            } else if ("mujer".equals(p.getSexo().toLowerCase())) {
                mujeresMenores.add(p);
            }
        });
        String mensaje = "Hombres: " + hombresMenores.size() + "\nMujeres: " + mujeresMenores.size();
        return mensaje;
    }

    /**
     * Información de juvilados que hay.
     *
     * @return
     */
    public static String infoJuvilados() {
        LogicaConsultas.clasificarMenoresJuvilados();
        String mensaje = "Juvilados:\n";
        for (int i = 0; i < juvilados.size(); i++) {
            mensaje = mensaje.concat("Juvilado" + (i + 1) + " : " + juvilados.get(i).getNombre()
                    + " , Sexo: " + juvilados.get(i).getSexo() + "\n");
        }
        return mensaje;
    }
}
