/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Computadora {
    String marca;
    String modelo;
    int capacidad;
    int año;
    
    String info(){
        var retorno =" \n la compu es marca: "+this.marca+" \n el modelo es: "+
                this.modelo+" \n la capacidad de la compu es: "+this.capacidad+
                " \n el año de fabricacion: "+this.año;
        return retorno;
    }
    
}
