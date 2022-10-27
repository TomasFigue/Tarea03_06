/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_03;

/**
 *
 * @author tom59
 */
public class Jugador {
    private String nombre;
    private String posicion;
    private String equipo;
    
    public String mostrarInfoJugador(){
        return "El nombre del jugador: "+this.nombre+" La posicion del jugador: "+
                this.posicion+" El equipo en el que juga: "+this.equipo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
}
