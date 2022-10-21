/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P61.unidad0103;

/**
 *
 * @author tom59
 */
public class Auto {

    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;
    LugarMatricculacion matricula;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + ". El propietario es: " + this.owner.nombre
                + " la dirección del propietario es: " + this.owner.direccion
                + " . El auto cuesta " + this.precio + " USD y es modelo: " + this.year
                +"El auto se matriculo: "+this.matricula.descripcion+"EL telefono es : "
                +this.matricula.telefono+"fue matriculado en la provincia: "+
                this.matricula.provincia+"ciudad: "+this.matricula.ciudad;
                
        
        return retorno;
    }
}
