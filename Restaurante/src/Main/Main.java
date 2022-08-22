/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.Gestion;
import Classes.Pedido;
import Classes.Plato;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Plato miMenu[]= new Plato[4];
        
        //miMenu[0] = new Plato("lengua", 18000, 1);
        Gestion pedidos= new Gestion(0, 0);
        
        Plato plato=new Plato(1,"lengua", 18000);
        
        ArrayList<Plato> plato1=new ArrayList<Plato>();
        plato1.add(plato);
        
        
//        Pedido ped1=new Pedido(5, 2, plato1, 1);
//        Pedido ped2=new Pedido(5, 2, plato1, 1);
//        
//        //ped.calcularPago(ped);
//        pedidos.agregarPedido(ped1); 
//        pedidos.agregarPedido(ped2); 
//        pedidos.calcularVentaDiaria();
        
 
        //float resultado=ped.calcularPago(ped);
        
       // float resultado=ped.calcularPago(platouno.getPrecioPlato(), ped.getCantidad());
//        for (int i = 0; i < plato1.size(); i++) {
//            ArrayList<Plato> plato2 = plato1;
//            System.out.println("55"+plato2);
//            
//        }

    }
    
}
