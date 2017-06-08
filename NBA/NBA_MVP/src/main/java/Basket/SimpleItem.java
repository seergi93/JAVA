/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basket;

import item.Item;

/**
 *
 * @author Sergi
 */
public class SimpleItem extends Item {

    public SimpleItem(String nombre) {
        super(nombre);
        this.setCompuesto(false);
    }

}
