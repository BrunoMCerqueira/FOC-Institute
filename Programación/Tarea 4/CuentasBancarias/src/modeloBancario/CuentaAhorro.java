/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 *
 * @author FOC
 * Clase hija, CuentaAhorro que hereda de clase padre Cuenta.
 */
public class CuentaAhorro extends Cuenta {
    
    protected double interesVariable;
    protected double saldoMinimo;
    // Constructor haciendo uso constructor Cuenta e informaciones adicionales.
    public CuentaAhorro(int numeroDeCuenta, double saldo, Cliente titular, 
    double saldoMinimo, double interesVariable) {
        super(numeroDeCuenta, saldo, titular);
        this.saldoMinimo = saldoMinimo;
        this.interesVariable = interesVariable;
    }
    // Método retirar, devuelve el saldo depués de sacar un valor si el saldo restante es superior al mínimo exigido.
    public double retirar (double r) {
        if(saldo - r >= saldoMinimo) {
            saldo = saldo - r;
            System.out.println("Depuès de sacar " + r + ". Su saldo disponible es " + saldo);
            return saldo;
        } else {
            System.out.println("No tiene suficiente saldo mínimo para retirar " + r + ", operación cancelada. Su saldo disponible es " + saldo);
            return saldo;
        }
    }
    // Actualiza el saldo añadiendo el tipo de interés variable.
    public double actualizarSaldo () {
        saldo = saldo * (1 + interesVariable);
        System.out.println("Debido al interés variable de " + interesVariable + ", después de un año la cuenta tendría un saldo de " + saldo);
        return saldo;
    }
}
