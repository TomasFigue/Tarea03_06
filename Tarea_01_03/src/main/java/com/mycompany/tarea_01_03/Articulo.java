/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_01_03;

/**
 *
 * @author tom59
 */
public class Articulo {
    private String autor;
    private String fecha;
    private double vistas;
    private double unmes;
    
    
    public double vistasAlMes(){
       var retorno=1.0;
       retorno=this.unmes*this.unmes;
       return retorno;
}
    
    
    
    //constructor

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getVistas() {
        return vistas;
    }

    public void setVistas(double vistas) {
        this.vistas = vistas;
    }

    public double getUnmes() {
        return unmes;
    }

    public void setUnmes(double unmes) {
        this.unmes = unmes;
    }
    

   
    
 
    
    
}
