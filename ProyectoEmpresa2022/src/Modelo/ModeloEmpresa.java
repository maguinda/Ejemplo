/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clases.Empresa;
import java.util.ArrayList;


/**
 *
 * @author GOMEZ
 */
public class ModeloEmpresa {
    // Lista de Empresas
    ArrayList<Empresa> listaEmpresas = new ArrayList<>();

    public ModeloEmpresa() {
    }
    
    // Métodos o acciones
    // Buscar 
    public Empresa buscarEmpresa(String NIT){
        // Buscar el empresa por el NIT
        for (Empresa empresa : listaEmpresas) {
            if (empresa.getNit().equals(NIT)){
                // Encontró la empresa
                // Muestro la información de la empresa
                return empresa;
            }
        }
        return null;
    }
    // Crear
    public void crearEmpresa(Empresa empresa){
       //Agregar la empresa a la lista
       listaEmpresas.add(empresa);
    }
    // Leer
    public ArrayList<Empresa> leerEmpresas(){
        return listaEmpresas;
    }
}
