/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seleccion;

/**
 *
 * @author tom59
 */
public class Jugador extends Persona{

   
    private String posicion;
    private Seleccion equipo;
    public String mostrarInfoJugador(){
        return this.mostrarInfo()+"Juega en la posicion de "+this.posicion+
                "pertence al equipo de "+this.equipo.getNombre();
        
    }

 
    

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    

 

}
