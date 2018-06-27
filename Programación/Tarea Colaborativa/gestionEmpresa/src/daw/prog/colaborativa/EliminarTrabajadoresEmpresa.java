/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.prog.colaborativa;

import static daw.prog.colaborativa.DatosPrueba.CONTABILIDAD;
import static daw.prog.colaborativa.DatosPrueba.DESARROLLO;
import static daw.prog.colaborativa.DatosPrueba.SISTEMAS;
import static daw.prog.colaborativa.DatosPrueba.VENTAS;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase cuya funcionalidad es eliminar empleados con sueldo mayor a uno dado y
 * realizar el conteo de los empleados disponibles de cada departamento.
 *
 * @author Elisabeth
 */
public class EliminarTrabajadoresEmpresa {

    /**
     * Recorre todos los empleados y elimina aquellos que tengan un sueldo
     * superior al recibido por parámetro.
     *
     * @param listaEmpleados lista de empleados.
     * @param sueldo sueldo a partir del cual un empleado debe ser eliminado de
     * la lista recibida como parámetro.
     */
    public static void eliminarTrabajadoresSegunSueldo(List<Empleado> listaEmpleados, double sueldo) {
        System.out.println("*** Eliminando los trabajadores cuyo sueldo es mayor de " + sueldo + " euros ***");
        ListIterator<Empleado> empleadosIterator = listaEmpleados.listIterator();
        while (empleadosIterator.hasNext()) {
            Empleado e = empleadosIterator.next();
            if (e.getSalario() > sueldo) {
                System.out.println("Eliminando el empleado: " + e.getNombre()
                        + " " + e.getApellidos() + " (sueldo = " + e.getSalario() + " €)");
                empleadosIterator.remove();
            }
        }
        System.out.println("********** Fin del proceso de eliminación **********");
    }

    /**
     * Realiza un conteo de todos los trabajadores mostrando el número total de
     * empleados por cada departamento.
     *
     * @param listaEmpleados lista de empleados.
     */
    public static void contarTrabajadores(List<Empleado> listaEmpleados) {
        System.out.println("*** Calculando cuántos trabajadores hay disponibles en cada departamento: ***");
        int numEmpDepDesarrollo = 0;
        int numEmpDepSistemas = 0;
        int numEmpDepContabilidad = 0;
        int numEmpDepVentas = 0;

        for (Empleado e : listaEmpleados) {
            switch (e.getNombreDep()) {
                case DESARROLLO:
                    numEmpDepDesarrollo++;
                    break;
                case SISTEMAS:
                    numEmpDepSistemas++;
                    break;
                case CONTABILIDAD:
                    numEmpDepContabilidad++;
                    break;
                case VENTAS:
                    numEmpDepVentas++;
                    break;
                default:
                    System.out.println("Departamento inválido: " + e.getNombreDep());
            }
        }
        System.out.println("****************************************************");
        System.out.println("**** NÚMERO TOTAL DE EMPLEADOS POR DEPARTAMENTO ****");
        System.out.println("****************************************************");
        System.out.println("** " + DESARROLLO + ": " + numEmpDepDesarrollo);
        System.out.println("** " + SISTEMAS + ": " + numEmpDepSistemas);
        System.out.println("** " + CONTABILIDAD + ": " + numEmpDepContabilidad);
        System.out.println("** " + VENTAS + ": " + numEmpDepVentas);
        System.out.println("****************************************************");
        System.out.println("********** Fin del proceso **********");
    }
}
