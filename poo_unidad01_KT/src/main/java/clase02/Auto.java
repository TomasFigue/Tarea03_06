/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Auto {
     String marca;
     String año;
     String llantas;
     int precio;
     
     String mostrarInformacion(){
            var retorno= " \n El auto es marca: "+this.marca+
                    " \n El numero de llantas del auto es: "+this.llantas+
                    " \n El precio del auto es: "+this.precio+
                    " \n Año: "+this.año;
            return retorno;
        }
    
}
