/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0102;

import clase3.Auto;

/**
 *
 * @author tom59
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("grupo 4");

        var empleado1 = new Empleado();
        empleado1.AñoIngreso=2015;
        empleado1.costoHora=10.5;
        empleado1.horasTrabajadas=100;
        empleado1.nombre="Carlos Santana";
        System.out.println(empleado1.mostrarInfo());
        System.out.println("El empleado lleva trabajando: "+empleado1.calcularTiempoEmpleado(2022)+"años");
        System.out.println("El salario normal del empleadoes: "+empleado1.ingresoNormal()); 
        System.out.println("El bono por antiguedad del empleado es: "+empleado1.bonoAntiguedad());
        System.out.println("El salario total del empleado: "+empleado1.ingresoPrincipal());
        System.out.println("El bono por exeder las 160 horas es: "+empleado1.bonoHorasExtra());
        System.out.println("impuesto al salario del empleado es: "+empleado1.impuesto(500, 1000, 1500)); 
        System.out.println("El total es: "+empleado1.calculoTotal());
        
    }   

}
