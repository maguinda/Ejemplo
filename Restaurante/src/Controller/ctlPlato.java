
package Controller;

import Model.mdPlato;
import Classes.Plato;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class ctlPlato {
    //Creo variable tipo modelo de platos
    mdPlato mdPlato;
    
    //Inicializo mi variable con la clase mdPlato
    public ctlPlato() {
        this.mdPlato = new mdPlato();
    }
    
    //Creo mis metodos CRUD para crear la lista de platos que serán mi menú
    //los métodos son boleanos ya que me devuelve un true o un false segun sea mi método
    //confirmando que se hizo o no la operación
    public boolean crearPlato(Plato plato) {
        try {
            return this.mdPlato.crearPlato(plato);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean eliminarPlato (int id){
        try {
            return this.mdPlato.eliminarPlato(id);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean actualizarPlato(int id, Plato plato) {
        try {
            return this.mdPlato.actualizarPlato(id, plato);
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public DefaultTableModel listarMenu() {
        DefaultTableModel tablaPlatos = null;
        try {
            tablaPlatos = this.mdPlato.reporteMenú();
            return tablaPlatos;
        } catch (Exception e) {
            return tablaPlatos;
        }
    }
}
