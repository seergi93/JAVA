/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author jonat
 */
abstract public class Figura implements Drawable {
    
    private String nombre;
    
    public Figura(){
        this.nombre = "vacio";
    }
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
  
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    
    public void draw(){
        System.out.println(getNombre() + " ha sido dibujado.");
    }
    
    public abstract double area();
    
}
