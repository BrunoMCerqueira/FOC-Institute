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
public abstract class Cuenta {
    protected int numeroDeCuenta;
    protected double saldo;
    protected Cliente titular;
    // Constructor sem parámetros.
    public Cuenta() {
        this.titular = null;
        this.saldo = 0;
        this.numeroDeCuenta = 0;    
    }
    // Constructor que recibe parámetros.
    public Cuenta(int ncuenta, double s, Cliente t) {
        this.titular = t;
        this.saldo = s;
        this.numeroDeCuenta = ncuenta;   
    }
    // Método que permite obtener el número de cuenta.
    public int getNumeroDeCuenta () {
        return numeroDeCuenta;
    }
    // Método que permite obtener el saldo de la cuenta.
    public double getSaldo () {
        return saldo;
    }
    // Método getTitular, que permite obtener el titular de la cuenta
    public Cliente getTitular () {
        return titular;
    }
    /* Método setNumeroDeCuenta, que recibe un parámetro entero que representa el nuevo número de cuenta 
    *  que se desea asignar y asigna parámetro el valor de dicho al atributo numeroDeCuenta.
    */
    public void setNumeroDeCuenta(int ncuenta) {
        this.numeroDeCuenta = ncuenta;
    }
    /* Método setSaldo, que recibe un parámetro entero que representa el nuevo saldo que 
    * se desea asignar y asigna parámetro el valor de dicho al atributo saldo.
    */
    public void setSaldo(double s) {
        this.saldo = s;
    }
    /* Método setTitular, que recibe un parámetro Cliente que representa el nuevo titular que 
    *  se desea asignar y asigna parámetro el valor de dicho al atributo titular.
    */
    public void setTitular(Cliente t) {
        this.titular = t;
    }
    /* ingresar: recibe un parámetro real que representa la cantidad que se desea ingresar 
    *  en la cuenta. El método incrementará el saldo en la cantidad recibida como parámetro.
    */
    public void ingresar(double ing) {
        this.saldo = this.saldo + ing;
        System.out.println("Después de ingresar " + ing + ". El saldo ahora es de " + this.saldo);
    }   
    /* 	retirar: método abstracto que permitirá sacar una cantidad de la cuenta 
    * (si hay saldo disponible para ello), no se implementará ya que dependerá del 
    * tipo de cuenta, por tanto su implementación recaerá en las clases hijas.
    */
    public abstract double retirar (double r);
    /* actualizarSaldo: método abstracto que actualizará el saldo de la cuenta, 
    * dependiendo del tipo de interés de cada una de las cuenta, por tanto 
    * su implementación recaerá en las clases hijas.
    */
    public abstract double actualizarSaldo ();
}   
