/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Asignatura {
        int codigo;
        String nombre;
        int horas;
        String NombreDocente;
        double costoHora;
        boolean vigente;
        
        String mostrarInformacion(){
            var retorno= " la asignatura se llama: "+this.nombre+" \n El docente es:  "
                    +this.NombreDocente+" \n El codigo es: " + this.codigo+
                    " \n La asignatura cuesta: "+calcularCosto();
            return retorno;
        }
            double calcularCosto(){
                var retorno =this.costoHora*this.horas;
                return retorno;
        }          
}
        
    

