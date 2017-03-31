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

public class Circulo extends Figura{
    
    private double radio = 0d;
    
    public Circulo() {
        super();
    }

    public Circulo(double radio){
        super();
        this.radio = radio;
    }
    
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    @Override
    public double area(){
        
        return Math.round((Math.PI * Math.pow(radio , 2))*Math.pow(10,2))/Math.pow(10,2); 
        //Math.round permite redondear decimales, la siguiente linea especifica el código para que redondee a 2 en concreto.
        //return Math.PI * Math.pow(radio , 2);
        //Si no se quisiera redondear, descomentar la línea 44 y comentar la 42.
    }
    
    
}
