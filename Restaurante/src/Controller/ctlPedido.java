
package Controller;

import Classes.*;
import Model.mdPedido;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class ctlPedido {
    
    mdPedido mdPedido;

    public ctlPedido() {
        this.mdPedido = new mdPedido();
    }
    
    //Crear pedido
    public boolean crearPedido(Pedido pedido) {
        try {
            return this.mdPedido.crearPedido(pedido);
        } catch (Exception e) {
            return false;
        }
    }
    
       // metodo para listar pedido
      public DefaultTableModel listarPedido() {
        DefaultTableModel tablaPlatos = null;
        try {
   //         tablaPlatos = this.mdPlato.reporteMenú();
            return tablaPlatos;
        } catch (Exception e) {
            return tablaPlatos;
        }
    }
    
    
//Se crea los métodos del controlador de pedidos para crear y listar temporalmente los platos
//que se agregaran al pedido
    //Crear los platos para el pedido
  public boolean crearPlatosParaListaPedido(Plato plato) {
        try {
            return this.mdPedido.crearPlatosParaListaPedido(plato);
        } catch (Exception e) {
            return false;
        }
    }
    //Listar los platos temporales para el pedido
    public DefaultListModel listarPlatosParaPedido() {
        DefaultListModel listaPlatos = null;
        try {
            listaPlatos = this.mdPedido.reporteListaTemporalPedido();
            return listaPlatos;
        } catch (Exception e) {
            return listaPlatos;
        }
    }
//        
//        DefaultListModel listaTemporalPlatos = null;
//        try {
//            listaTemporalPlatos = this.mdPedido.crearlistaTemporalPedido(plato);
//            return listaTemporalPlatos;
//        } catch (Exception e) {
//            return listaTemporalPlatos;
//        
//    }
//    }
    
}
