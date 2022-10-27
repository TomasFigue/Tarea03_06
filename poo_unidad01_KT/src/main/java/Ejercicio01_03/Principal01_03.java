/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_03;

/**
 *
 * @author tom59
 */
public class Principal01_03 {
   
    public static void main(String[] args) {
        
        var adolf=new Empleado();
        adolf.setNombre("Adolf Hitler");
        adolf.setSalario(500);
        adolf.setFechaNacimiento(1889);
        System.out.println("Informacion del empleado"+"\n"+adolf.mostrarInfoEmpleado());
        
        var depa=new Departamento();
        depa.setDireccion("Catar");
        depa.setOwner("Abdala Bucaram");
        depa.setPrecio(250000);
        System.out.println("Informacion departamento"+"\n"+depa.mostrarInfoDepartamento());
        
        var helado=new Empresa();
        helado.setIngresos(2500);
        helado.setNombre("Helados de la tiemda");
        helado.setNumeroEmpleados(25);
        helado.setOwner("Juan Eljuri");
        System.out.println("Informacion empresa"+"\n"+helado.mostrarInfoEmpresa());
        
        var pais=new Pais();
        pais.setArea("1200000000 KM");
        pais.setContinente("Europa");
        pais.setNombre("Rusia");
        pais.setPoblacion("185555555");
        System.out.println("Informacion del pais"+"\n"+pais.mostrarInfoPais());
        
        var latri=new Equipo();
        latri.setClasifica("Clasifica al mundial");
        latri.setNumeroJugadores(11);
        latri.setPopularidad("Muy alta dentro del pais xd");
        latri.setPresupuesto(11);
        System.out.println("Informacion del Equipo"+"\n"+latri.mostrarInfoEquipo());
        
        var enner = new Jugador();
        enner.setNombre("Enner Valencia");
        enner.setPosicion("Goleador");
        enner.setEquipo("Ecuador");       
        System.out.println("Informacion del juagdor"+"\n"+enner.mostrarInfoJugador());
        
        var actor=new Actor("Dwayne Johnson","Black Adam",12000000,54);
        System.out.println("INformacion de Actor"+"\n"+actor.mostrarinfoActor());
       
        var peli=new Pelicula(25, "Black Adam",12,"La roca");
        System.out.println("Informacon de la pelicula"+"\n"+peli.mostrarInfoPelicula());
        
        var black=new Personaje("T adam", "Black adam", 12, 52);
        System.out.println("Informacion personaje"+"\n"+black.mostrarinfoPersonaje());
    }
    
}
