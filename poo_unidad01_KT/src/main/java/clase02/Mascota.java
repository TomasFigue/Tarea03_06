/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

/**
 *
 * @author tom59
 */
public class Mascota {
    String nombre;
    int edad;
    String tipo;
    double peso;
    String informacionMascota(){
        var retorno="\n La mascota se llama: "+this.nombre+"\n La edad: "+
                this.edad+"\n El tipo de mascota es: "+this.tipo+
                "\n la mascota pesa: "+this.peso;
                
        return retorno;
    }
}
