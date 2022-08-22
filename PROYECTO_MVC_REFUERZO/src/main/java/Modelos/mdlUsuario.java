/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.usuario;
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
public class mdlUsuario {
    DbData dbData;

    public mdlUsuario(DbData dbData) {
        this.dbData = new DbData();
    }
    
  
    public boolean crearUsuario (usuario u){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String QRY = "insert into usuario (nombre, apellido, telefono, ciudad, edad, genero, ocupacion,nivel_estudio, codigo) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(QRY, Statement.RETURN_GENERATED_KEYS) ;
            statement.setString(1, u.getNombre());
            statement.setString(2, u.getApellido());
            statement.setInt(3, u.getTelefono());
            statement.setString(4, u.getCiudad());
            statement.setInt(5, u.getEdad());
            statement.setString(6, u.getGenero());
            statement.setString(7, u.getOcupacion());
            statement.setString(8, u.getNivel_estudio());
            statement.setString(9, u.getCodigo());
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
    
    public boolean actualizarUsuario(usuario u){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String QRY = "update usuario set nombre = ?, apellido=?, telefono=?, ciudad=?, edad=?, genero=?,ocupacion=?,nivel_estudio=? where codigo=? ";
            PreparedStatement statement = conn.prepareStatement(QRY) ;
            statement.setString(1, u.getNombre());
            statement.setString(2, u.getApellido());
            statement.setInt(3, u.getTelefono());
            statement.setString(4, u.getCiudad());
            statement.setInt(5, u.getEdad());
            statement.setString(6, u.getGenero());
            statement.setString(7, u.getOcupacion());
            statement.setString(8, u.getNivel_estudio());
            statement.setString(9, u.getCodigo());
            
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
   
    public boolean eliminarUsuario(usuario u){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String QRY = "delete from usuario where codigo=?";
            PreparedStatement statement = conn.prepareStatement(QRY) ;
            statement.setString(1, u.getCodigo());
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
    
    
    public  LinkedList<usuario> reporteUsuarios(){
        LinkedList<usuario> listaUsuario = new LinkedList<>();
        
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
             String QRY = "select nombre, apellido, ocupacion, nivel_estudio from usuario";
             PreparedStatement statement = conn.prepareStatement(QRY, Statement.RETURN_GENERATED_KEYS) ;
             
             ResultSet resultado = statement.executeQuery();
             while (resultado.next()) {
               String nombre = resultado.getString(1);
               String apellido = resultado.getString(2);
               String ocupacion = resultado.getString(3);
               String nivel_estudio = resultado.getString(4);
               
               usuario u = new usuario(nombre, apellido, 0, "", 0, "", ocupacion, nivel_estudio, "");
               listaUsuario.add(u);
            }
            return listaUsuario;
             
        } catch (Exception e) {
            System.out.println("error" + e);
            return listaUsuario;
        }
    }
            
            
}
