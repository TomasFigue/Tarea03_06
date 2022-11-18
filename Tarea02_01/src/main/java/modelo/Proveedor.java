/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author tom59
 */
public class Proveedor {
    
    private int codigoProveedor;
    private String nombreProveedor;
    private double precioEnvio;
    private String direccionProveedor;
    private String fechaEnvio;

    public Proveedor(int codigoProveedor, String nombreProveedor, double precioEnvio, String direccionProveedor, String fechaEnvio) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.precioEnvio = precioEnvio;
        this.direccionProveedor = direccionProveedor;
        this.fechaEnvio = fechaEnvio;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigoProveedor=" + codigoProveedor + 
                ", nombreProveedor=" + nombreProveedor + ", precioEnvio=" + 
                precioEnvio + ", direccionProveedor=" + direccionProveedor + 
                ", fechaEnvio=" + fechaEnvio + '}';
    }   
}
