/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Gestion {
    private float ventasTotales;
    private float ventaDiarias;
    private ArrayList<Pedido> listaPedido= new ArrayList<>();

    public Gestion(float ventasTotales, float ventaDiarias) {
        this.ventasTotales = ventasTotales;
        this.ventaDiarias = ventaDiarias;
    }
    
    public void agregarPedido(Pedido pedido){
        listaPedido.add(pedido);
    }
    
//    public void calcularVentaDiaria() {
//        for (Pedido venta : listaPedido) {
//          //  int cantidad = venta.getCantidad();
//            float acumular;
//            for (Plato valor : venta.getListaPlato()) {
//        //        acumular = cantidad * valor.getPrecioPlato();
//                ventaDiarias += acumular;
//            }
//        }
//        System.out.println("Venta Diaria: " + ventaDiarias);
//    }

    /**
     * @return the ventasTotales
     */
    public float getVentasTotales() {
        return ventasTotales;
    }

    /**
     * @param ventasTotales the ventasTotales to set
     */
    public void setVentasTotales(float ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    /**
     * @return the ventaDiarias
     */
    public float getVentaDiarias() {
        return ventaDiarias;
    }

    /**
     * @param ventaDiarias the ventaDiarias to set
     */
    public void setVentaDiarias(float ventaDiarias) {
        this.ventaDiarias = ventaDiarias;
    }

    /**
     * @return the listaPedido
     */
    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }

    /**
     * @param listaPedido the listaPedido to set
     */
    public void setListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }
    
}
