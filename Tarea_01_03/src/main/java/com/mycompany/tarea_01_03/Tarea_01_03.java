/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_01_03;

/**
 *
 * @author tom59
 */
public class Tarea_01_03 {

    public static void main(String[] args) {
        
        
        
        var autoP=new AutorPrincipal();
        autoP.nombre="Pedro";
        autoP.ingresosDiarios=500;
        autoP.yearNacimiento=1945;
        
        
        System.out.println("El pana se llama "+autoP.nombre);
        System.out.println("El pana gana "+autoP.ingresosDiarios);
        System.out.println("El pana nacio en: "+autoP.yearNacimiento);
        
        var edad=500;
        edad=autoP.obtieneEdad(2022);
        System.out.println("El pana tiene"+edad);
      
        
        var revistaP=new Revista();
        revistaP.setVentasMensuales(2500);
        revistaP.setAñoDeEmision(2010);
        revistaP.setCostoProduccion(10000);
        
        var renta=false;
        renta=revistaP.rentabilidad();
        
        System.out.println("Es rentable "+renta);
      
        System.out.println("Ventas "+revistaP.getVentasMensuales());
        System.out.println("Emision "+revistaP.getAñoDeEmision());
        System.out.println("Costo "+revistaP.getCostoProduccion());
        
        var artP=new Articulo();
        artP.setAutor("Juanito");
        artP.setFecha("20/02/2055");
        artP.setVistas(100);
        artP.setUnmes(30);
        
        var vistP=1.0;
        vistP=artP.vistasAlMes();
        System.out.println("vistas al mes : "+vistP);
       
        
        
       
    }
    
    
}
