/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;
import modeloBancario.*;

/**
 *
 * @author FOC
 */
public class test {
    // Creamos un cliente, abrimos cuentas y probamos los métodos de CuentaCorriente y CuentaAhorro, incluidos los mètodos de Cuenta.
    public static void main(String[] args) {
        //Declaramos variables que usaremos en el test, como Cliente y valores de saque e ingreso.
        Cliente a = new Cliente (2, "Gustavo Sanchez", "Calle Amara 4", "917595432");
        double ingreso = 1000;
        double saque = 100000;
        // Se crea una cuenta corriente b para el Cliente a y se extraen los datos.
        CuentaCorriente b = new CuentaCorriente(216560, 500000.00, a);
        System.out.println("El nuevo cliente ha abierto la cuenta corriente " + b.getNumeroDeCuenta());
        System.out.println("La cuenta " + b.getNumeroDeCuenta() + " tiene un saldo de " + b.getSaldo());
        // Se comprueba el saldo que se tendría después de un año. Y se ingresa y saca diversas cantidades.
        b.actualizarSaldo();
        b.ingresar(ingreso);
        b.retirar(saque);
        b.ingresar(ingreso);
        
        // Se crea una cuenta ahorro c para el Cliente a y se extraen los datos.
        CuentaAhorro c = new CuentaAhorro(1515640, 3000.00, a, 2000.00, 0.10);
        System.out.println("El nuevo cliente ha abierto la cuenta ahorro " + c.getNumeroDeCuenta());
        System.out.println("La cuenta " + c.getNumeroDeCuenta() + " tiene un saldo de " + c.getSaldo());
        // Se comprueba el saldo que se tendría después de un año aplicado, con el interés variable.
        c.actualizarSaldo();
        //Se realiza un ingreso 
        c.ingresar(ingreso);
        // Se intenta realizar un saque de una cantidad superior a la permitida.
        c.retirar(saque);
        //Se realiza otro ingreso.
        c.ingresar(ingreso);
    }
    
}
