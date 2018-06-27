/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.prog.colaborativa;

/**
 *
 * @author Elisabeth
 */
public class Departamento {

    /**
     * Nombre del departamento.
     */
    private String nombre;

    /**
     * Actividad a la que se dedica el departamento.
     */
    private String descripcion;

    /**
     * Constructor sin parámetros.
     */
    public Departamento() {
        nombre = null;
        descripcion = null;
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre del departamento.
     * @param descripcion actividad a la que se dedica el departamento.
     */
    public Departamento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
