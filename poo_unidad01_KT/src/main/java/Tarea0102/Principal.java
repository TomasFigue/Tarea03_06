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
        System.out.println("Impuesto al salario del empleado es: "+empleado1.calcularImpuesto(500, 1000, 1500)); 
        System.out.println("El total es: "+empleado1.calculoTotal(500,1000,1500));
        
        var empleado2 = new Empleado();
        empleado2.AñoIngreso=2020;
        empleado2.costoHora=5.25;
        empleado2.horasTrabajadas=150;
        empleado2.nombre="Elon musk";
        System.out.println(empleado1.mostrarInfo());
        System.out.println("El empleado lleva trabajando: "+empleado2.calcularTiempoEmpleado(2022)+"años");
        System.out.println("El salario normal del empleadoes: "+empleado2.ingresoNormal()); 
        System.out.println("El bono por antiguedad del empleado es: "+empleado2.bonoAntiguedad());
        System.out.println("El salario total del empleado: "+empleado2.ingresoPrincipal());
        System.out.println("El bono por exeder las 160 horas es: "+empleado2.bonoHorasExtra());
        System.out.println("Impuesto al salario del empleado es: "+empleado2.calcularImpuesto(500, 1000, 1500)); 
        System.out.println("El total es: "+empleado2.calculoTotal(500, 1000, 1500));
        
        var empleado3 = new Empleado();
        empleado3.AñoIngreso=2010;
        empleado3.costoHora=12.50;
        empleado3.horasTrabajadas=170;
        empleado3.nombre="Juan Pulgoso";
        System.out.println(empleado3.mostrarInfo());
        System.out.println("El empleado lleva trabajando: "+empleado3.calcularTiempoEmpleado(2022)+"años");
        System.out.println("El salario normal del empleadoes: "+empleado3.ingresoNormal()); 
        System.out.println("El bono por antiguedad del empleado es: "+empleado3.bonoAntiguedad());
        System.out.println("El salario total del empleado: "+empleado3.ingresoPrincipal());
        System.out.println("El bono por exeder las 160 horas es: "+empleado3.bonoHorasExtra());
        System.out.println("Impuesto al salario del empleado es: "+empleado3.calcularImpuesto(500, 1000, 1500)); 
        System.out.println("El total es: "+empleado3.calculoTotal(500, 1000, 1500));
        
    }   

}
