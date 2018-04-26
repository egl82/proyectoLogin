/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Emmanuel
 */
public class StockProd {
    
    private Set<Producto> productos;  

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

   
    
    
}
