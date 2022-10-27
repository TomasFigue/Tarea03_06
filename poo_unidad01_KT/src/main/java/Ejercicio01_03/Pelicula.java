/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_03;

/**
 *
 * @author tom59
 */
public class Pelicula {
    private int precio;
    private String nombre;
    private int presupuesto;
    private String actorPrincipal;

    public Pelicula(int precio, String nombre, int presupuesto, String actorPrincipal) {
        this.precio = precio;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.actorPrincipal = actorPrincipal;
    }
    
    public String mostrarInfoPelicula(){
        return "El nombre de la pelicula: "+this.nombre+" El precio de la pelicula: "+
                this.precio+" Millones "+" El presuspuesto de la pelicula es : "+
                +this.presupuesto+"Millones"+" El actor principal es: "+this.actorPrincipal;
        
    }
    
    
    
}
