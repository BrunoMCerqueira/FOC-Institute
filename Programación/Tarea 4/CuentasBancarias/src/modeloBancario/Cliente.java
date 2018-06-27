/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 *
 * @author FOC
 */
public class Cliente {
    
    // Definimos los atributos del Cliente.
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    
    // Creamos el constructor para cuando no se mandan parámetro.
    public Cliente () {
        this.idCliente = 0;
        this.nombre = null;
        this.direccion = null;
        this.telefono = null;
    }
    
    // Creamos el constructor para recibir parámetros.
    public Cliente (int id, String n, String d, String t) {
        this.idCliente = id;
        this.nombre = n;
        this.direccion = d;
        this.telefono = t;
    }
}
