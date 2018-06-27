/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peso;

/**
 *
 * @author FOC
 */
public class Peso {
    
    private double pesoKg; //Atributo que representa los Kg del peso

   
    public Peso(double peso, String medida) {
    
        switch(medida){ // Se transforma el parámetro peso a Kg dependiendo de la medida
            case "lb":
                pesoKg = peso * 453/1000; 
                break;
            case "li":
                pesoKg = peso * 14.59;
                break;
            case "Oz":
                pesoKg = peso * 28.35 / 1000;
                break;
            case "P":
                pesoKg = peso * 1.55 / 1000;
                break;
            case "K":
                pesoKg = peso;
                break;
            case "G":
                pesoKg = peso * 1 / 1000;
                break;
            case "Q":
                pesoKg = peso * 43.3;
                break;
            default:
                pesoKg = peso;                
        }
    }
    
    public double getLibras(){
        return pesoKg * 1000 / 453;
    }
    public double getLingotes(){
        return pesoKg / 14.59;
    }
    public double getPeso(String medida){
        switch(medida){ // Se transforma el parámetro peso a Kg dependiendo de la medida
            case "lb":
                return pesoKg / 453 * 1000; 
            case "li":
                return pesoKg / 14.59;
            case "Oz":
                return pesoKg / 28.35 * 1000;
            case "P":
                return pesoKg / 1.55 * 1000;
            case "K":
                return pesoKg;
            case "G":
                return pesoKg / 1000;
            case "Q":
                return pesoKg / 43.3;
            default:
                return pesoKg;            
        }
    }
     
}
