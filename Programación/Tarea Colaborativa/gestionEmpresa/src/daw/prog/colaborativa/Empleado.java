/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.prog.colaborativa;

/**
 *
 * @author Bruno
 */
public class Empleado {
    //Declaramos los atributosprivados idEmpleado, nombre, apellidos, trabajo, salario, nombreDepartamento

    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String trabajo;
    private double salario;
    private String nombreDepartamento;

    // Creamos constructor sin parámetros con Strings como null y integers 0.
    public Empleado() {
        idEmpleado = 0;
        nombre = null;
        apellidos = null;
        trabajo = null;
        salario = 0;
        nombreDepartamento = null;
    }

    // Creamos constructor con parámetros, inicializando cada atributo por el valor de los parámetros.
    public Empleado(int id, String nom, String apel, String trab, double sal, String nombreDep) {
        idEmpleado = id;
        nombre = nom;
        apellidos = apel;
        trabajo = trab;
        salario = sal;
        nombreDepartamento = nombreDep;
    }

    // Definimos los métodos get y set de cada atributo.
    public int getId() {
        return idEmpleado;
    }

    public void setId(int id) {
        idEmpleado = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apel) {
        apellidos = apel;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trab) {
        trabajo = trab;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double sal) {
        salario = sal;
    }

    public String getNombreDep() {
        return nombreDepartamento;
    }

    public void setNombreDep(String nombreDep) {
        nombreDepartamento = nombreDep;
    }
}
