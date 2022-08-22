
package Model;

import Classes.Pedido;
import Classes.Plato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class mdPlato {
    DbData dbData;
    String consulta = "";
    Statement st;
    ResultSet rs;

    public mdPlato() {
        this.dbData = new DbData();
    }

    public boolean crearPlato(Plato plato) {
        //abrir canales de comuniación y se cierran automáticamente try catch
        //ya que puede generar problemas al abrir canales de conexion y no cerrarlas
        //puede generar que el servidor se colapse con muchos canales abiertos
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            //Generamos una inserción  donde a la tabal plato, le enviamos los datos que se adquieren
            //mediante una cadena de textos, los Valores al principio se lo enviamos atributos  anonimos
            //Luego se los agrega.
            consulta = "INSERT INTO plato (nombrePlato, precioPlato)  VALUES (?,?)";
            //Statement definicion de las racateristicas propias y conexión y  de la consulta que vamos a generar
            //insertamos la consulta, le indicamos al statemen que nos retorne las llaves generadas para usar el id
            PreparedStatement statementPlato = conn.prepareStatement(consulta, st.RETURN_GENERATED_KEYS);
            //asignamos los datos que estan en anonimo ? es decir seteamos todos los parametros
            statementPlato.setString(1, plato.getNombrePlato());
            statementPlato.setFloat(2, plato.getPrecioPlato());
            
            //ejecutamos la sentencia de insert, con lo cual optenemos una respuesta
            //Cuantas filas se insertan minimo una o exaptamente una
            int filasInsertadas = statementPlato.executeUpdate();
            //verificamos si hubo filas insertadas
            if (filasInsertadas > 0) {               
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean eliminarPlato(int id) {

        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            consulta = "delete from plato where id=?";
            PreparedStatement statementPlato = conn.prepareStatement(consulta) ;
            statementPlato.setInt(1, id);
         
            
            int filasEliminadas = statementPlato.executeUpdate();
            if (filasEliminadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }        
    }
    
    public boolean actualizarPlato(int id, Plato plato) {

        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            consulta = "update plato set id=?, nombrePlato = ?, precioPlato=? where id=? ";
            PreparedStatement statementPlato = conn.prepareStatement(consulta);
            statementPlato.setInt(1, id);
            statementPlato.setString(2, plato.getNombrePlato());
            statementPlato.setFloat(3, plato.getPrecioPlato());
            statementPlato.setInt(4, id);

            int filasActualizadas = statementPlato.executeUpdate();
            if (filasActualizadas > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    //Se crea un modelo tabla para agregar mis platos y poderllos mostrar en java
    public DefaultTableModel reporteMenú() {
        DefaultTableModel modelo = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            consulta = "select id, nombrePlato, precioPlato from plato";
            PreparedStatement statementPlato = conn.prepareStatement(consulta, st.RETURN_GENERATED_KEYS);
            
            //Creo mi objeto para realizar el reporte o visualizar en mi tabla los registros hechos
            String Titulo[] = {"ID", "NOMBRE PLATO", "PRECIO PLATO"};            
            //Se crea el objeto con la cantidad de columnas que va a llevar la tabla
            Object[] menu = new Object[3];
            modelo = new DefaultTableModel(null, Titulo);
            
            //Guado la consulta en la variable ResultSet
            rs = statementPlato.executeQuery();
            while (rs.next()) {
                menu[0] = rs.getString(1);
                menu[1] = rs.getString(2);
                menu[2] = rs.getString(3);
                //agrego mis datos al modelo
                modelo.addRow(menu);
            }
            //retorno el modelo
            return modelo;
        } catch (Exception e) {
            System.out.println("Error reporte menú" +e.getMessage() );
            return modelo;
        }
    }

}
