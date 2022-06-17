/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package modelo;

/**
 *
 * @author tom59
 */

public class Departamento {

    private String Dueño;
    private String Direccion;
    private String Estado; 
    private String Mensual;

    public Departamento(String Dueño, String Direccion, String Estado, String Mensual) {
        this.Dueño = Dueño;
        this.Direccion = Direccion;
        this.Estado = Estado;
        this.Mensual = Mensual;
    }

    public Departamento(Integer valueOf, String param, String param0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMensual() {
        return Mensual;
    }

    public void setMensual(String Mensual) {
        this.Mensual = Mensual;
    }
    
    
}
