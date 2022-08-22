/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidos;

import Classes.*;

/**
 *
 * @author lenovo
 */
public class GestionPedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaNatural cliente= new PersonaNatural("789456", "carlos", "marcos", "suarez", "cruz", 1, "Calle siempre viva", "1234567", "rafa@gmail.com");
        Pedido pedido= new Pedido(1, "12 mayo 2022", true, 1000);
        
        String gestionPedido= pedido.agregarProducto(cliente);
        System.out.println("Nombre: "+cliente.getPrimerNombre()+" "+cliente.getPrimerApellido()+"\nTotal pedido: "+pedido.getTotal());
        
        
    }
    
}
