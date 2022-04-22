/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2_01_03;

/**
 *
 * @author tom59
 */
public class Auto {
    private String color;
    private String propietario;
    private int añoDeFabricaion;  

public Auto(String color, String propietario,int añoDeFabricacion){
        this.añoDeFabricaion=1950;
        this.color="Verde";
        this.propietario="tu vieja";
        
    }
public boolean esTaxi(){
        var retorno = false;
        
        if(this.color=="Amarillo"){
            retorno=true;
            
            return retorno;
        }
        
        
}

