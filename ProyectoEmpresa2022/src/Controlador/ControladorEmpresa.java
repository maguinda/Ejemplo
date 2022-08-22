package Controlador;

import Clases.Empresa;
import Modelo.ModeloEmpresa;
import java.util.ArrayList;


public class ControladorEmpresa {
    ModeloEmpresa modeloEmpresa;

    public ControladorEmpresa() {
        modeloEmpresa = new ModeloEmpresa();
    }
    
    // Métodos o acciones
    // Buscar 
    public Empresa buscarEmpresa(String NIT){
        return modeloEmpresa.buscarEmpresa(NIT);
    }
    // Crear
    public void crearEmpresa(Empresa empresa){
        modeloEmpresa.crearEmpresa(empresa);
    }
    // Leer
    public ArrayList<Empresa> leerEmpresas(){
        return modeloEmpresa.leerEmpresas();
    }
}
