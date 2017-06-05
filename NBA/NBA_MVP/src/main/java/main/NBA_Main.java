package main;

import Basket.Division;
import Basket.Team;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sergi
 */
public class NBA_Main {

    public static void main(String[] args) {

        // crear item simple y testear su nombre
        System.out.println("\n *** crear item simple y testear su nombre *** \n");

        Team indiana_pacers = new Team("Indiana Pacers");

        System.out.println("El equipo " + indiana_pacers.getName() + " se ha creado satisfactioramente");

        // crear item compuesto y testear su nombre
        System.out.println("\n *** crear item compuesto y testear su nombre *** \n");

        Division central = new Division("Central");
        System.out.println("La división " + central.getName() + " se ha creado satisfactoriamente");

        System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");

        Team detroit_pistons = new Team("Detroit Pistons");
        central.addTeam(detroit_pistons);
        System.out.println("En la división " + central.getName() + " está el equipo "
                + central.getTeams().get(0).getName());

        
        System.out.println("\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");

        
        
        
        // metodo iterable();
        // añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1
        
        
        System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");

        // crear division "Atlantic"
        String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};

        // recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n 
        System.out.println("\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");

        // crear liga "nba" 
        // crear conferencia Este 
        // crear un elemento compuesto de simples a partir de un array de strings
        System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");

        String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};

        // Crear division Central
        // método composite()
        // crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples
        System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");

        String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};

        // crear un arraylist de equipos SouthEast
        // crear division SouthEast y añadir los equipos SouthEast
        // añadir division SouthEast
        // crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos
        System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");

        // crear un ArrayList de divisiones
        // añadirlas a la conferencia este
        // eliminar un hijo entre varios, profundidad 1
        System.out.println("\n *** eliminar un hijo a profundidad n *** \n");

        // quitar la division Atlantic
        // metodo quitar("Atlantic");	 se busca por el nombre de la división, no por el objeto.		
        // Crea la conferencia Oeste completa y añadela a la liga; muestra por pantalla la liga completa
        System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");

    }
}
