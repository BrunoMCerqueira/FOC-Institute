/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.prog.colaborativa;

import java.util.List;

/**
 * Esta clase representa el punto de entrada de ejecución de la práctica. A
 * través del método main definido en esta clase se generan los departamentos y
 * empleados, así como las diferentes acciones que deben realizarse sobre éstos:
 * <p>
 * <ul>
 * <li>Generación de departamentos y empleados</li>
 * <li>Listado de empleados por departamento</li>
 * <li>Eliminación de ciertos empleados</li>
 * <li>Recuento de los empleados de cada departamento</li>
 * </ul>
 * </p>
 *
 * @author Elisabeth / Bruno
 */
public class PracticaColaborativa {

    public static void main(String[] args) {
        List<Departamento> listaDepartamentos = DatosPrueba.generarDepartamentos();
        List<Empleado> listaEmpleados = DatosPrueba.generarListaEmpleados();

        ListarTrabajadoresEmpresa.listarEmpleadosPorDepartamentos(listaDepartamentos, listaEmpleados);
        EliminarTrabajadoresEmpresa.eliminarTrabajadoresSegunSueldo(listaEmpleados, 2000);
        EliminarTrabajadoresEmpresa.contarTrabajadores(listaEmpleados);
    }
}
