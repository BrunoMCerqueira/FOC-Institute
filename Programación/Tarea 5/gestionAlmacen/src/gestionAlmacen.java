/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importamos el Arraylist.
import java.util.ArrayList;
/**
 *
 * @author Bruno
 */
public class gestionAlmacen {
    
    // Creamos un método main que contendrá todas las acciones del ejercicio.
    public static void main(String[] args) {
        
        //Creamos 4 objetos de tipo produto.
        Producto p1 = new Producto(1, "Tornillo", 700, "Tornillo pequeño");
        Producto p2 = new Producto(2, "Tuerca", 600, "Tuerca para tornillo pequeño");
        Producto p3 = new Producto(3, "Clavo", 1000, "Clavo de cabeza plana");
        Producto p4 = new Producto(4, "Alambre", 300, "Rollo de alambre robusto");
        Producto productoBorrar = new Producto();
        //Creamos una colección ArrayList almacén.
        ArrayList<Producto> almacen = new ArrayList<Producto> ();
        
        //Añadimos los productos a la colección almacén.
        almacen.add(p1);
        almacen.add(p2);
        almacen.add(p3);
        almacen.add(p4);
        
        // Consultamos el tamaño del almacén.
        System.out.println("El tamaño del almacen es: " + almacen.size());
        
        
        
        // Crear bucle para listar productos y mostrar atributos por pantalla.
        
        for (Producto pp : almacen ) {
            System.out.println("El producto " + pp.getCodigo() + " es " + pp.getNombre() + 
            "; Cantidad: " + pp.getCantidad() + "; Descripción: " + pp.getDescripcion() + ".");
                       
        }
        
        // Verificar si existe objeto con nombre Tuerca.
        for (Producto pp : almacen ) {
            if(pp.getNombre() == "Tuerca") {
                System.out.println("Existe el producto tuerca");
            }
        }
        
        // Borrar el objeto cuyo nombre es alambre de almacén.
        for (Producto pp : almacen ) {
            if(pp.getNombre() == "Alambre") {
                productoBorrar = pp;
                System.out.println("Se elimina el producto Alambre.");
            }
        }
        almacen.remove(productoBorrar);
            
        for (Producto pp : almacen ) {
            System.out.println("El producto " + pp.getCodigo() + " es " + pp.getNombre() + 
            "; Cantidad: " + pp.getCantidad() + "; Descripción: " + pp.getDescripcion() + ".");
                       
        }
        
    }
    
    
}
