/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea02;

/**
 *
 * @author tom59
 */
public class Tarea02 {

    public static void main(String[] args) {
        System.out.println("Tarea02");
        
        var empleado = new Empleado();
        empleado.anioIngreso=2003;
        empleado.costoHoras=11.05;
        empleado.horasTrabajadas=160;
        empleado.nombre="Mario";
        empleado.bono=2;
        
        System.out.println(empleado.anioIngreso+" | "+
                           empleado.nombre+" | "+
                           empleado.costoHoras+" | "+
                           empleado.horasTrabajadas+" | ");
        
        System.out.println("porcentaje de ingresos segun la antiguedad: "+empleado.calcularIngresos(2022));
        
        System.out.println("Años trabajados: "+empleado.calcularTiempo(2022));
        
        System.out.println("Ingresos: "+empleado.ingresosNeto(0));
        
        System.out.println("Ingresospor bono: "+empleado.ingresosBono(0));
        
        
        
    }
}
