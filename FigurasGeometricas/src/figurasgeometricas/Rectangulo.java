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
public class Rectangulo extends FigurasGeometricas {
    
    

	private double altura 	= 0;
	private double anchura 	= 0;

	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Rectangulo(){
		super(); /* invocamos al constructor sin parámetro de la superclase FiguraGeometrica */
	}
		
	public Rectangulo(double altura, double anchura){
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(String nombre, double altura, double anchura){
		super(nombre); // invocamos al constructor con parámetro String nombre de la superclase 
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.altura = anchura;
	}
	
	@Override
	public double area() {
		// encapsulación de la información => acceder a las propiedades mediante get
		return getAltura() * getAnchura();
	}

    
}
