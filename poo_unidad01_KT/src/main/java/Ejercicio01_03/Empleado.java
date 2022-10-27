/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_03;

/**
 *
 * @author tom59
 */
public class Empleado {
    
    private String nombre;
    private int fechaNacimiento;
    private int salario;
    
    public String mostrarInfoEmpleado(){
        return "El nombre del empleado es: "+this.nombre+" El empleado nacio en: "+
                this.fechaNacimiento+" El salario actual es: "+this.salario;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
}
