/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_unidad01_kt;

/**
 *
 * @author tom59
 */
public class Poo_unidad01_KT {

    public static void main(String[] args) {
        System.out.println("clase 01-01-02");
        
        var perro1 = new perro();
        var perro2 = new perro();
        var perro3 = new perro();
        
        perro1.nombre="gufi";
        perro2.edad=5;
        perro3.raza="aha";
        
        var auto1= new Auto();
        var auto2= new Auto();
        var auto3= new Auto();
        
        auto1.año=2020;
        auto2.llanta="4";
        auto3.marca="ahss";
        System.out.println("Mi perro se llama: " +perro1.nombre+" tiene: "+perro1.edad+"años"+"y es un"+perro1.raza);
        
        perro2.nombre="galleta";
        perro2.edad=50;
        perro2.raza="jaja";   
                System.out.println("Mi perro se llama:" +perro2.nombre+"tiene"+perro2.edad+"años"+"y es un"+perro2.raza);

                
    }
}
