/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 *
 * @author FOC
 * Clase hija, CuentaCorriente que hereda de clase padre Cuenta.
 */
public class CuentaCorriente extends Cuenta {
    protected double interesFijo = 0.15;
    // Constructor haciendo uso constructor Cuenta.
    public CuentaCorriente (int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }
    // Método retirar, devuelve el saldo depués de sacar un valor si hay saldo suficiente.
    public double retirar (double r) {
        if(r <= saldo) {
            saldo = saldo - r;
            System.out.println("Depuès de sacar " + r + ". Su saldo disponible es " + saldo);
            return saldo;
        } else {
            System.out.println("No tiene suficiente saldo para retirar " + r + ", operación cancelada. Su saldo disponible es " + saldo);
            return saldo;
        }
    }
    // Actualiza el saldo añadiendo el tipo de interés fijo.
    public double actualizarSaldo () {
        saldo = saldo * (1 + interesFijo);
        System.out.println("Debido al interés fijo, después de un año la cuenta tendría un saldo de " + saldo);
        return saldo;
    }
    
}
