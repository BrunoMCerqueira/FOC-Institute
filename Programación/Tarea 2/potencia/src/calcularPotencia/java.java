/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularPotencia;

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
        
        // Definición de variables
        int base;
        int exponente;
        int resultado;
        
        
        exponente = 0;
        base = 1;
        resultado = 1;
        
        // operación matemática con estructuras de control
        if(exponente == 0){ // Si exponente es 0
          resultado = 1;
        }else if(base == 1){ // Si base es 1
          resultado = 1;
        }else if((base>1) &&(exponente>0)){// Si base mayor que 1 y exponente mayor que 0
          for (int i=0; i<=exponente; i++){
            resultado = resultado * base;
          }
        }
        
        
        System.out.println("El resultado es " + resultado);
    }
    
}
