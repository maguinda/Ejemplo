
package Ejemplo;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class Dibujar {

    private static Dibujar instancia;

    public static Dibujar getInstancia() {
        if (instancia == null) {
            instancia = new Dibujar();
        }
        return instancia;
    }
    
    private Conexion c = new Conexion();
    public Connection cn = c.conectar();
   
    
    public String consulta="";
    
    public void mostrarProducto() throws SQLException, IOException{
        consulta="Select * from producto";
        
        
    Statement  st=cn.createStatement();
    ResultSet rs=st.executeQuery(consulta);
     
        DefaultPieDataset dataset= new DefaultPieDataset();
        while (rs.next()) {
            dataset.setValue(rs.getString("nombre"), Integer.parseInt(rs.getString("stock")));
            
        }
        
        JFreeChart chart= ChartFactory.createPieChart("Grafico de stock de producto", dataset, true, true, false);
        
        int ancho= 560;
        int alto =380;
        File f= new File("Gráfico.png");
        
        ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
    }
            
}
