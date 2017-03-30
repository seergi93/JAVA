/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodesilla;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class MatrizTest {
    
    public MatrizTest() {
    }
    
    
    @Test
    public void recorrerMatriz_Test(){
        
        int[][] matriz = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        
        Matriz m = new Matriz();
        m.recorrerMatriz(matriz);
        
            assertEquals(9,m.getNumeroDePosiciones());
            
    }
    
    @Test
    public void minFilas_Test(){
        int[][] matriz = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        int [] minimosFilas = new int []{1,4,7};
        Matriz m = new Matriz();
        
        m.minFilas(matriz);
        
        assertEquals(minimosFilas,m.getMinimosFilas());
        
        
        
    }
    
    
    
    
}
