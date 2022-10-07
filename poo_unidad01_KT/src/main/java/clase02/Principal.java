/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Principal {
    public static void main (String[]args){
        System.out.println("nyaaaaaa yamete");
        
        var progra = new Asignatura();
        progra.codigo=1;
        progra.costoHora=4.5;
        progra.horas=220;
        progra.nombre="Programcion orientada a objetos";
        progra.NombreDocente="mauricio uwu";
        progra.vigente=true;       
        System.out.println(progra.mostrarInformacion());
        
        var electrotecnia=new Asignatura();
        electrotecnia.NombreDocente="carlos";
        electrotecnia.codigo=21;
        electrotecnia.costoHora=2.5;
        electrotecnia.horas=100;
        electrotecnia.nombre="electrotecnia";
        electrotecnia.vigente=false;       
        System.out.println(electrotecnia.mostrarInformacion());
        
        var auto=new Auto();
        auto.año="01/02/2022";
        auto.llantas="4";
        auto.marca="samsung";
        auto.precio=25025 ;
        System.out.println(auto.mostrarInformacion());
        
        var compu=new Computadora();
        compu.año=2020;
        compu.capacidad=512;
        compu.marca="asus ";
        compu.modelo="ROG ";
        System.out.println(compu.info());
        
        var alumno=new Estudiante();
        alumno.calificacion="69.99";
        alumno.carrera="asambleista";
        alumno.cedula=0102555555;
        alumno.nombre="Elsa Pito";
        System.out.println(alumno.informacionEstudiante());
        
        var animal=new Mascota();
        animal.edad=21;
        animal.nombre="andres";
        animal.peso=25;
        animal.tipo="perra >v";
        System.out.println(animal.informacionMascota());
        
        var salon=new Salon();
        salon.capacidad=200;
        salon.evento="fistesta de grado";
        salon.fecha="02/02/2022";
        salon.precio=2500;
        System.out.println(salon.informacionSalon());
       
        
            
        
        
        
                
        
        
    }
    
}
