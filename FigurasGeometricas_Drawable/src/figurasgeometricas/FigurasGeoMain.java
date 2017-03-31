/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class FigurasGeoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Figura> figuras = new ArrayList<>();

        Rectangulo figuraRectangulo = new Rectangulo("Rectangulo",3, 4);

        Cuadrado figuraCuadrado = new Cuadrado("Cuadrado",4);
        
        Circulo figuraCirculo = new Circulo("Circulo", 4);

        Triangulo figuraTriangulo = new Triangulo("Triangulo",2,2);
        
        Elipse figuraElipse = new Elipse ("Elipse", 3,4);
    
    figuras.add(figuraRectangulo);
    figuras.add(figuraCuadrado);
    figuras.add(figuraCirculo);
    figuras.add(figuraTriangulo);
    figuras.add(figuraElipse);
    
        for (Figura figura : figuras){
			System.out.println("Area del " + figura.getNombre() + " = " + figura.area());
		}
    }

}
