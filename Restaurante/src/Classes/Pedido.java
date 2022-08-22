/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Pedido {
   private int  mesa;
   private boolean pagarPedido;
   private ArrayList<Plato> listaPlato;

    public Pedido(int mesa, boolean pagarPedido, ArrayList<Plato> listaPlato) {
        this.mesa = mesa;
        this.pagarPedido = pagarPedido;
        this.listaPlato = listaPlato;
    }

    public Pedido() {
    }

    
    public static float calcularPago(Pedido ped) {
        float venta = 0;
        float acumular;
        for (Plato valor : ped.getListaPlato()) {
            acumular = valor.getPrecioPlato();
            venta += acumular;
        }
        return venta;
    }

    /**
     * @return the mesa
     */
    public int getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    /**
     * @return the listaPlato
     */
    public ArrayList<Plato> getListaPlato() {
        return listaPlato;
    }

    /**
     * @param listaPlato the listaPlato to set
     */
    public void setListaPlato(ArrayList<Plato> listaPlato) {
        this.listaPlato = listaPlato;
    }

    /**
     * @return the pagarPedido
     */
    public boolean isPagarPedido() {
        return pagarPedido;
    }

    /**
     * @param pagarPedido the pagarPedido to set
     */
    public void setPagarPedido(boolean pagarPedido) {
        this.pagarPedido = pagarPedido;
    }
}
