/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2_01_03;

/**
 *
 * @author tom59
 */
public class Matricula {
    
    
    
    private Double precio;
    private String modelo;
    private boolean rtv;  

public Matricula(String modelo, String rtv, double precio){
        this.modelo="sedan";
        this.precio=2500.00;
        this.rtv=true;
        
    }
public boolean Matriculado(){
        var retorno = false;
        
        if(this.rtv==true){
            retorno=true;
        }
        
        return retorno;
}
    
}
