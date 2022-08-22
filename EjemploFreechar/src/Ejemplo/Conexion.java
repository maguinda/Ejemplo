
package Ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static Conexion instancia;

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    public String bd = "bd_ejemplo";
    public String url = "jdbc:mysql://localhost:3306/" + bd;
    public String user = "root";
    public String password = "";
    
    
    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            if(con !=null){
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }

    public Connection conectar() {    
        return con;
    }
}
