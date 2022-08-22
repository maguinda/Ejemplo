/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.elemento;
import Clases.libro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author laulo
 */
public class mdlElemento {
     DbData dbData;

    public mdlElemento(DbData dbData) {
        this.dbData = new DbData();
    }

   
    public boolean crearElemento (elemento e){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String QRY = "insert into elemento (cantidad_sillas, cantidad_mesas, cantidad_pc) values (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(QRY, Statement.RETURN_GENERATED_KEYS) ;
            statement.setInt(1, e.getCantidad_sillas());
            statement.setInt(2, e.getCantidad_mesas());
            statement.setInt(3, e.getCantidad_pc());
           
            int filasInsertadas = statement.executeUpdate();
            
            if (filasInsertadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean actualizarElemento(elemento e){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String QRY = "update elemento set cantidad_sillas=?, cantidad_mesas=?, cantidad_pc=? ";
            PreparedStatement statement = conn.prepareStatement(QRY) ;
            statement.setInt(1, e.getCantidad_sillas());
            statement.setInt(2, e.getCantidad_mesas());
            statement.setInt(3, e.getCantidad_pc());
            
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
   
    public boolean eliminarElemento(elemento e){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String QRY = "delete from elemento";
            PreparedStatement statement = conn.prepareStatement(QRY) ;
            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
    
    
    public  LinkedList<elemento> reporteElementos(){
        LinkedList<elemento> listaElemento = new LinkedList<>();
        
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
             String QRY = "select cantidad_sillas, cantidad_mesas, cantidad_pc from elemento";
             PreparedStatement statement = conn.prepareStatement(QRY, Statement.RETURN_GENERATED_KEYS) ;
             
             ResultSet resultado = statement.executeQuery();
             while (resultado.next()) {
               int sillas = resultado.getInt(1);
               int mesas = resultado.getInt(2);
               int pc = resultado.getInt(3);
               
               elemento e = new elemento(sillas, mesas, pc);
               listaElemento.add(e);
            }
            return listaElemento;
             
        } catch (Exception ex) {
            System.out.println("error" + ex);
            return listaElemento;
        }
    }
}
