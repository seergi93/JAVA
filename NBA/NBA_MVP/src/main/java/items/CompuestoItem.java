/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import items.Item;

/**
 *
 * @author Sergi
 */
public class CompuestoItem extends Item {

    public CompuestoItem(String nombre){
		super(nombre);
		this.setCompuesto(true);
	}	
}
