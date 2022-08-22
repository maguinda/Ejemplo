/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

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
public class mdlLibro {
    DbData dbData;

    public mdlLibro(DbData dbData) {
        this.dbData = new DbData();
    }
    
    
    public boolean crearLibro (libro l){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String QRY = "insert into libro (nombre, anio_publicacion, autor, tipo, prestado, serial, estantería, codigo) values (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(QRY, Statement.RETURN_GENERATED_KEYS) ;
            statement.setString(1, l.getNombre());
            statement.setString(2, l.getAnio_publicacion());
            statement.setString(3, l.getAutor());
            statement.setString(4, l.getTipo());
            statement.setString(5, l.getPrestado());
            statement.setString(6, l.getSerial());
            statement.setString(7, l.getEstantería());
            statement.setString(8, l.getCodigo());
            int filasInsertadas = statement.executeUpdate();
            
            if (filasInsertadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean actualizarLibro(libro l){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String QRY = "update libro set nombre=?, anio_publicacion=?, autor=?, tipo=?, prestado=?, serial=?, estantería=? where codigo=? ";
            PreparedStatement statement = conn.prepareStatement(QRY) ;
            statement.setString(1, l.getNombre());
            statement.setString(2, l.getAnio_publicacion());
            statement.setString(3, l.getAutor());
            statement.setString(4, l.getTipo());
            statement.setString(5, l.getPrestado());
            statement.setString(6, l.getSerial());
            statement.setString(7, l.getEstantería());
            statement.setString(8, l.getCodigo());
            
             int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
   
    public boolean eliminarLibro(libro l){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String QRY = "delete from libro where codigo=?";
            PreparedStatement statement = conn.prepareStatement(QRY) ;
            statement.setString(1, l.getCodigo());
            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                return true;                
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public  LinkedList<libro> reporteLibros(){
        LinkedList<libro> listaLibro = new LinkedList<>();
        
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
             String QRY = "select nombre, autor, tipo from libro";
             PreparedStatement statement = conn.prepareStatement(QRY, Statement.RETURN_GENERATED_KEYS) ;
             
             ResultSet resultado = statement.executeQuery();
             while (resultado.next()) {
               String nombre = resultado.getString(1);
               String autor = resultado.getString(2);
               String tipo = resultado.getString(3);
               
               libro l = new libro(nombre, "", autor, tipo, "", "", "", "");
               listaLibro.add(l);
            }
            return listaLibro;
             
        } catch (Exception e) {
            System.out.println("error" + e);
            return listaLibro;
        }
    }
}
