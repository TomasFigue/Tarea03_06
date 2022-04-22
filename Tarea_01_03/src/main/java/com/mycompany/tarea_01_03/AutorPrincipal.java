/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_01_03;

import java.time.LocalDate;

/**
 *
 * @author tom59
 */
public class AutorPrincipal {
    
    String nombre;
    double ingresosDiarios;
    int yearNacimiento;
    
    //constructor
    
    
    
    public int obtieneEdad(int yearActual){
       var retorno= yearActual - this.yearNacimiento;
        return retorno;
}

    
}



