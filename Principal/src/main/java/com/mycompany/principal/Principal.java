/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

/**
 *
 * @author tom59
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        var autoJuan = new Auto();
        autoJuan.color="amarillo";
        autoJuan.marca="chevrolet";
        autoJuan.year= 2000;
        autoJuan.placa="UBB 0102";
        autoJuan.precio= 5000;
        
        System.out.println(autoJuan.color+" | "+
                           autoJuan.marca+" | "+
                           autoJuan.year+" | "+
                           autoJuan.precio+" | "+
                           autoJuan.precio+" | ");
        
        ////System.out.println("Es taxi;"+autoJuan.esTaxi());
        var esTaxi=false;
        esTaxi= autoJuan.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa "+autoJuan.placa+ " es un taxi");
        }else{
            System.out.println("El auto de placa "+autoJuan.placa+ " NO es un taxi");
        }
       
        System.out.println(" El auto de precio "+ autoJuan.precio+ " Debe pagar de tasa solidaria "+ autoJuan.calcularTasaSolidaria());
        
        var costoMatricula=10000d;
        costoMatricula=autoJuan.calcularMatricula(2010, 10000);
        System.out.println("Debe pagar "+costoMatricula+" USD por concepto de matrícula");
        
        System.out.println("El auto es de la provincia de: "+autoJuan.obtenerProvincia());
        
        System.out.println("A;os del vehiculo "+autoJuan.calcularYears(2022) ); 
        
        System.out.println("El auto se puede asegurar:"+autoJuan.sePuedeAsegurar(2022, 10) );
        
    }
        
}
