/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerProducto;

import ClsProducto.Producto;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Producto producto1 =new Producto();
        
        producto1.catidadProducto();
        producto1.pedidosProducto();
        producto1.ventas();
    }
    
}
