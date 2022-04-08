/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea02;

/**
 *
 * @author tom59
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHoras;
    int anioIngreso;
    int bono;
    
    public double calcularTiempo(int currentYear){
         var retorno = (currentYear - this.anioIngreso);
         return retorno;
         
    }
   
    public double ingresosNeto(double calcularIngresos){
        var retorno = (this.costoHoras*this.horasTrabajadas);
        return retorno;
    }
    
    public double ingresosAntiguedad(double calcularAntiguedad){
        var retorno = (this.ingresosNeto(calcularAntiguedad)+this.calcularTiempo(anioIngreso)*0.02*this.ingresosNeto(calcularAntiguedad));
        return retorno;
    }
    
    
   
    public double ingresosBono(double ingresosNeto){
        var retorno = (this.costoHoras*this.horasTrabajadas);
        if(this.horasTrabajadas > 150){
                retorno=this.costoHoras*this.bono;
        }
        return retorno;
    }
    
    
    
}
