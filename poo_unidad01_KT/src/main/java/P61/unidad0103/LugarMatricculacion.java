/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P61.unidad0103;

/**
 *
 * @author tom59
 */
public class LugarMatricculacion {

    String descripcion;
    int telefono;
    String provincia;
    String ciudad;
    
    public String mostrarInfo() {
        var retorno = " El auto es: " + this.descripcion + " el telefono es : "
                + this.telefono + ". la provincia es : " + this.provincia
                + " la cidad es : " + this.ciudad;
                
        return retorno;
    }

}
