
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionBd {
        private static ConexionBd instancia;

    public static ConexionBd getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBd();
        }
        return instancia;
    }
    private String bd = "restaurante";
    private String url = "jdbc:mysql://localhost:3306/" + bd;
    private String user = "root";
    private String password = "";
    
    
    private  Connection con;

    public ConexionBd() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }

    public final Connection conectar() {    
        return getCon();
    }

    /**
     * @return the bd
     */
    public String getBd() {
        return bd;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }
    
}
