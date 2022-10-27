/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_03;

/**
 *
 * @author tom59
 */
public class Equipo {
    private int numeroJugadores;
    private String clasifica;
    private String popularidad;
    private int presupuesto;
    
    public String mostrarInfoEquipo(){
        return "El numero de jugadores: "+this.numeroJugadores+" El equipo clasifica: "+
                this.clasifica+" La popularidad del equipo es: "+this.popularidad+
                " El presupuesto actual del equipo es: "+this.presupuesto+" millones";
        
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getClasifica() {
        return clasifica;
    }

    public void setClasifica(String clasifica) {
        this.clasifica = clasifica;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
    
}
