/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.prog.colaborativa;

import java.util.List;

/**
 *
 * @author Bruno
 */
public class ListarTrabajadoresEmpresa {

    /**
     * Lista los departamentos y empleados recibidos por parámetro. Para cada
     * departamento se muestran los empleados que trabajan en él.
     *
     * @param listaDepartamentos lista de departamentos.
     * @param listaEmpleados lista de empleados.
     */
    public static void listarEmpleadosPorDepartamentos(List<Departamento> listaDepartamentos, List<Empleado> listaEmpleados) {
        for (Departamento dep : listaDepartamentos) {
            System.out.println("El departamento " + dep.getNombre() + " se define como: " + dep.getDescripcion());
            System.out.println("Aquí trabajan:");
            for (Empleado emp : listaEmpleados) {
                if (emp.getNombreDep().equals(dep.getNombre())) {
                    System.out.println(emp.getNombre() + " " + emp.getApellidos() + ", trabaja como " + emp.getTrabajo() + " y gana " + emp.getSalario() + " euros.");
                }
            }
        }
    }
}
