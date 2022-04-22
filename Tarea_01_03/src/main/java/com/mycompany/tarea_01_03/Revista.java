/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_01_03;

/**
 *
 * @author tom59
 */
public class Revista {

    
    private double ventasMensuales;
    private int añoDeEmision;
    private double costoProduccion;
    
    //constructor
    
    
    public boolean rentabilidad()
    {
        var rent = false;
        if (this.costoProduccion<=this.ventasMensuales){
            rent = true;
        }
        return rent;
        
        
    }
    
    

    //getter y seller
    
    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public int getAñoDeEmision() {
        return añoDeEmision;
    }

    public void setAñoDeEmision(int añoDeEmision) {
        this.añoDeEmision = añoDeEmision;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }
    
    
    
    
}