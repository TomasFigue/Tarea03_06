/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Salon {
    String evento;
    int precio;
    String fecha;
    int capacidad;
    String informacionSalon(){
        var retorno="\n El evento del salon es: "+this.evento+"\n precio: "+
                this.precio+"\n La fecha del evento es: "+this.fecha+
                "\n la capacidad del salon es: "+this.capacidad;
                
        return retorno;
    }
    
}
