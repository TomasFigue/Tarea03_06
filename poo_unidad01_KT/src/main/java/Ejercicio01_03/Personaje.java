/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_03;

/**
 *
 * @author tom59
 */
public class Personaje extends Actor{

    public Personaje(String nombre, String Pelicula, int precio, int actuaciones) {
        super(nombre, Pelicula, precio, actuaciones);
    }
    
    
    
    public String mostrarinfoPersonaje(){
        
        return " El actor es: "+this.getNombre()+" La pelicula en la que actua es: "+
                this.getPelicula()+" El precio por obra del acto es: "+this.getPrecio()+
                " El numero de actuaciones es: "+this.getActuaciones();    
    }    
     
}
