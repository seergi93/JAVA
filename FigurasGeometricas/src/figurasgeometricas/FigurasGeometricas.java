/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Sergi
 */
public abstract class FigurasGeometricas {

    protected String nombre;

    public FigurasGeometricas() {
        this.nombre = "desconocido";
    }

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Clase abstracta de area
    public abstract double area();

}
