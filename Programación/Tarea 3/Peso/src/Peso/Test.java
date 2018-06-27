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
public class Test {
    public static void main (String[] args){
        Peso a = new Peso(25.4, "Q");
        System.out.println("El peso del objeto incialmente es de 25.4 Quintales.");
        System.out.println("Peso del objeto en libras es " + a.getLibras() + " libras.");
        System.out.println("Peso del objeto en lingotes es " + a.getLingotes() + " lingotes.");
        System.out.println("Peso del objeto en Kg es " + a.getPeso("K") + " Kg.");
        
    }   
}
