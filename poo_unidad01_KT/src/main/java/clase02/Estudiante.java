/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Estudiante {
    String nombre;
    int cedula;
    String calificacion;
    String carrera;
    
    String informacionEstudiante(){
        var retorno=" \n Nombre del estudiante: "+this.nombre+" \n Numero de cedula: "+
                this.cedula+" \n El promedio general es: "+this.calificacion+
                " \n En la carrera de:"+this.carrera;
        return retorno;
    }
}
