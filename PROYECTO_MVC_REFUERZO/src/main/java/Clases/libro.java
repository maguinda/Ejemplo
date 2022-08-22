/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author laulo
 */
public class libro {
    private String nombre;
    private String anio_publicacion;
    private String autor;
    private String tipo;
    private String prestado;
    private String serial;
    private String estantería;
    private String codigo;

    public libro() {
    }

    public libro(String nombre, String anio_publicacion, String autor, String tipo, String prestado, String serial, String estantería, String codigo) {
        this.nombre = nombre;
        this.anio_publicacion = anio_publicacion;
        this.autor = autor;
        this.tipo = tipo;
        this.prestado = prestado;
        this.serial = serial;
        this.estantería = estantería;
        this.codigo = codigo;
    }

    

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the anio_publicacion
     */
    public String getAnio_publicacion() {
        return anio_publicacion;
    }

    /**
     * @param anio_publicacion the anio_publicacion to set
     */
    public void setAnio_publicacion(String anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the prestado
     */
    public String getPrestado() {
        return prestado;
    }

    /**
     * @param prestado the prestado to set
     */
    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the estantería
     */
    public String getEstantería() {
        return estantería;
    }

    /**
     * @param estantería the estantería to set
     */
    public void setEstantería(String estantería) {
        this.estantería = estantería;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
