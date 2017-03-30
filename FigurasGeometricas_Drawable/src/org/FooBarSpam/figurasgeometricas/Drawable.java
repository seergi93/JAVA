/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FooBarSpam.figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author jonathan
 */
public interface Drawable {
   
    public void draw();
    
    default public void applyTheme(ArrayList<Drawable> figuras) {
        try{
            
            for(Drawable drawable : figuras){
                System.out.println( " Se le ha aplicado un tema super guay");
            }
            
        } catch(Exception e){
            System.out.println("No se le ha podido aplicar un tema");
        }
        
        
    }
    
}
