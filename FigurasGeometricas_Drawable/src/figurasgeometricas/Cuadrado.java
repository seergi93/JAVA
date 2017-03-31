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
public class Cuadrado extends Figura {

    private double lado = 0d;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado){
        super();
        this.lado = lado;
    }
    
    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double area(){
        return lado * lado;
    }
    
}