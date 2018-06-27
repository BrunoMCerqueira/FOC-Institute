/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraClaseJava;

/**
 *
 * @author FOC
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaración de las variables a utilizar.
        double expre;
        int a = 4;
        int b = 6;
        int c = 2;
        boolean variableBooleanada = true;
        
        // Mostrar el contenido de las variables inicializadas.
        System.out.println("El valor de a es " + a);
        System.out.println("El valor de b es " + b);
        System.out.println("El valor de c es " + c);
        System.out.println("El valor de variableBooleanada es " + variableBooleanada);

        // Cálculo de la expresión en expre.
        expre = a + b / c + 1;
        
        // Mostrar el resultado del cálculo en pantalla.
        System.out.println("El valor de expre es " + expre);
        
        // Recálculo de la expresión en expre.
        expre = a + b / ( c + 1 );
        
        // Mostrar el resultado del cálculo en pantalla.
        System.out.println("El valor de expre modificado es " + expre);
        
    }
    
}
