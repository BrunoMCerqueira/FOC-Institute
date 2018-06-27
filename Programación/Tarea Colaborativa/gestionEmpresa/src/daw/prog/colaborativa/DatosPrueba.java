/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.prog.colaborativa;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene los métodos de creación de departamentos y empleados. La
 * creación de los departamentos y empleados fue realizada inicialmente por
 * Bruno. Posteriormente, Elisabeth ha creado esta clase y ha movido aquí la
 * creación de los departamentos y empleados, de forma que este código pueda ser
 * reutilizado por la clase EliminarTrabajadoresEmpresa.java fácilmente.
 *
 * @author Elisabeth
 */
public class DatosPrueba {

    public static final String DESARROLLO = "Desarrollo";

    public static final String SISTEMAS = "Sistemas";

    public static final String CONTABILIDAD = "Contabilidad";

    public static final String VENTAS = "Ventas";

    /**
     * Genera una lista de departamentos.
     *
     * @return lista de departamentos
     */
    public static List<Departamento> generarDepartamentos() {
        // Creamos los 4 departamentos.
        Departamento d1 = new Departamento(DESARROLLO, "Departamento centrado en el desarrollo y mantenimiento de software.");
        Departamento d2 = new Departamento(SISTEMAS, "Departamento centrado en el desarrollo y mantenimiento de Sistemas.");
        Departamento d3 = new Departamento(CONTABILIDAD, "Departamento auxiliar ocupado de la gestión contable y financiera de la empresa.");
        Departamento d4 = new Departamento(VENTAS, "Departamento ocupado en marketing, ventas y relaciones institucionales.");

        // ArrayList denominado listaDepartamentos donde se añaden los 4 objetos departamentos creados.
        List<Departamento> listaDepartamentos = new ArrayList<>();

        listaDepartamentos.add(d1);
        listaDepartamentos.add(d2);
        listaDepartamentos.add(d3);
        listaDepartamentos.add(d4);

        return listaDepartamentos;
    }

    /**
     * Genera una lista de empleados, los cuales son asignados a los
     * departamentos existentes.
     *
     * @return lista de empleados
     */
    public static List<Empleado> generarListaEmpleados() {

        // Creamos los 12 empleados, 3 de cada departamento.
        Empleado e1 = new Empleado(1, "Ramón", "Martínez", "Programador", 5000.50, DESARROLLO);
        Empleado e2 = new Empleado(2, "Manuel", "Torres", "Programador", 3000, DESARROLLO);
        Empleado e3 = new Empleado(3, "Ana", "Torquemada", "Programador", 6000, DESARROLLO);

        Empleado e4 = new Empleado(4, "Sara", "Castro", "Administrador", 4000, SISTEMAS);
        Empleado e5 = new Empleado(5, "Arancha", "López", "Administrador", 1500, SISTEMAS);
        Empleado e6 = new Empleado(6, "Aitor", "Iturriaga", "Administrador", 3000.50, SISTEMAS);

        Empleado e7 = new Empleado(7, "Cleide", "Seco", "Contable", 5000, CONTABILIDAD);
        Empleado e8 = new Empleado(8, "Celia", "Ruiz", "Contable", 4000, CONTABILIDAD);
        Empleado e9 = new Empleado(9, "Juan", "Martínez", "Contable", 1000, CONTABILIDAD);

        Empleado e10 = new Empleado(10, "Sol", "López", "Comercial", 2000, VENTAS);
        Empleado e11 = new Empleado(11, "Luis", "Batugo", "Comercial", 1500, VENTAS);
        Empleado e12 = new Empleado(12, "Pedro", "Yanes", "Comercial", 30000, VENTAS);

        // ArrayList denominado listaEmpleados donde se añaden los 12 objetos empleados creados.
        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        listaEmpleados.add(e6);
        listaEmpleados.add(e7);
        listaEmpleados.add(e8);
        listaEmpleados.add(e9);
        listaEmpleados.add(e10);
        listaEmpleados.add(e11);
        listaEmpleados.add(e12);

        return listaEmpleados;
    }
}
