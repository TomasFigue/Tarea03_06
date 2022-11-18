/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import Control.ProveedorControl;

/**
 *
 * @author tom59
 */
public class Tarea02_01 {
    
    public static void main(String[] args) {
        System.out.println("Grupo4");
        
       var proveedorControl = new ProveedorControl();
       var data= new String[5];
       data[0]="10";                //codigo
       data[1]="ENVIOS CUENCA";   //nombre
       data[2]="53";                 //precio
       data[3]="UPS OFICINA 2";                //direccion
       data[4]="12/12/12";                //fecha
       
       
       System.out.println(proveedorControl.crear(data));
        
        
    }

    
}
