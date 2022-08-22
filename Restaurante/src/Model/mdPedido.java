/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class mdPedido {
    ArrayList<Plato> listaPlato= new ArrayList<>();
    
    DbData dbData;
    String consulta = "";
    Statement st;
    ResultSet rs;

    public mdPedido() {
        this.dbData = new DbData();
    }
    
  
    
   public boolean crearPedido(Pedido pedido) {
        //abrir canales de comuniación y se cierran automáticamente try catch
        //ya que puede generar problemas al abrir canales de conexion y no cerrarlas
        //puede generar que el servidor se colapse con muchos canales abiertos
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            //Generamos una inserción  donde a la tabal plato, le enviamos los datos que se adquieren
            //mediante una cadena de textos, los Valores al principio se lo enviamos atributos  anonimos
            //Luego se los agrega.
            consulta = "INSERT INTO pedido (mesa, Estado)  VALUES (?,?)";
            //Statement definicion de las racateristicas propias y conexión y  de la consulta que vamos a generar
            //insertamos la consulta, le indicamos al statemen que nos retorne las llaves generadas para usar el id
            PreparedStatement statementPedido = conn.prepareStatement(consulta, st.RETURN_GENERATED_KEYS);
            //asignamos los datos que estan en anonimo ? es decir seteamos todos los parametros
            statementPedido.setInt(1, pedido.getMesa());
            statementPedido.setBoolean(2, pedido.isPagarPedido());
                   
            //ejecutamos la sentencia de insert, con lo cual optenemos una respuesta
            //Cuantas filas se insertan minimo una o exaptamente una
            int filasInsertadas = statementPedido.executeUpdate();
            //verificamos si hubo filas insertadas
            if (filasInsertadas > 0) {
                rs =statementPedido.getGeneratedKeys();
                if (rs.next()) {
                    int idPedido = rs.getInt(1);
                    consulta="INSERT INTO platopedido ( idPlato ,  idPedido ,  fecha ) VALUES (?,?,?)";
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
 //Aqui se crea lista temporal de platos para el pedido, además el método para listar 
 //temporalmente los platospara el pedido
    //Crear platos temporales para la lista de pedidos
    public boolean crearPlatosParaListaPedido(Plato plato) {

        try {
            //Agrego los platos a la lista
            listaPlato.add(plato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Retornar modelo de lista para listar platos temporales del pedido
    public DefaultListModel reporteListaTemporalPedido() {
        DefaultListModel model = new DefaultListModel();
        try {
            int index = 0;
            for (Plato plato : listaPlato) {
                String data = plato.getNombrePlato() + " - " + plato.getPrecioPlato();
                model.add(index, data);
                index++;
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error reporte platos para pedido" + e.getMessage());
            return model;
        }
    }
}
    
    

