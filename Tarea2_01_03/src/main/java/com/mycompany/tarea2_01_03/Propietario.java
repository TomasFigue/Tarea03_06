/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2_01_03;

/**
 *
 * @author tom59
 */
public class Propietario {
    
    private String nombre;
    private int edad;
    private boolean licensia;  

public Propietario  (String color, String propietario,int añoDeFabricacion){
        this.edad=25;
        this.licensia=true;
        this.nombre="rei chiquita";
        
    }
public boolean puedeConducir(){
        var retorno = false;
        
        if(this.edad>18&&this.licensia==true){
            retorno=true;
        }
        
        return retorno;
}
    
}
