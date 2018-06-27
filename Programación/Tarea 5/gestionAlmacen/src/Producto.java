/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class Producto {
    
    /*
    *   Declaramos los atributos privados codProducto, nombre, cantidad y descripcion.
    */
    private int codProduto;
    private String nombre;
    private int cantidad;
    private String descripcion;
    
    /*
    *   Creamos los dos constructores, uno sin parámetros con los String incializados en null y los integer en 0.
    *   Y otro constructor con parámetros , inicializando cada atributo por el valor de los parámetros.
    */
    public Producto () {
        codProduto = 0;
        nombre = null;
        cantidad = 0;
        descripcion = null;
    }
    
    public Producto (int cod, String nom, int cant, String des) {
        codProduto = cod;
        nombre = nom;
        cantidad = cant;
        descripcion = des;
    }
    
    
    /*
    *   Definimos los métodos get y set de cada atributo.
    */
    public int getCodigo () {
        return codProduto;
    } 
    
    public void setCodigo (int cod) {
        codProduto = cod;
    }
    
    public String getNombre () {
        return nombre;
    } 
    
    public void setNombre (String nom) {
        nombre = nom;
    }
    
    public int getCantidad () {
        return cantidad;
    } 
    
    public void setCantidad (int can) {
        cantidad = can;
    }
    
    public String getDescripcion () {
        return descripcion;
    } 
    
    public void setDescripcion (String des) {
        descripcion = des;
    }
    
}
