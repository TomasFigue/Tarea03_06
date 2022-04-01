/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea1;

/**
 *
 * @author tom59
 */
public class Tarea1 {

    public static void main(String[] args) {
        
        var dias = new Dias();
        dias.lunes = "12:30";
        dias.miercoles = "2:45";
        
        var computadora = new Computadoras();
        computadora.msi ="Gaming";
        computadora.lenovo="trabajo";
        
        var enfermedades=new Enfermedades();
        enfermedades.cancer="mortal";
        enfermedades.gripe="leve";
        
        var climas=new Climas();
        climas.lluvia= ("llevar sombrilla");
        climas.calor = ("Ropa lijera");
        
        var biblioteca= new Bilioteca();
        biblioteca.autor=("BATMANNNNN");
        biblioteca.peso=(20);
        
        System.out.println("ingreso registrado a las:"+dias.lunes);
        System.out.println("ingreso registrado a las:"+dias.miercoles);
        
        System.out.println("la marca tiene reputacion de:"+computadora.msi);
        System.out.println("la marca tiene reputacion de:"+computadora.lenovo);
        
        System.out.println("la enfermedad esta catalogada como:"+enfermedades.cancer);
        System.out.println("la enfermedad esta catalogada como:"+enfermedades.gripe);
        
        System.out.println("para el clima se recomienda:"+climas.lluvia);
        System.out.println("para el clima se recomienda:"+climas.calor);
        
        System.out.println("el autor del libro es:"+biblioteca.autor);
        System.out.println("el peso del libro en kg es:"+biblioteca.peso);
        
    }
}
