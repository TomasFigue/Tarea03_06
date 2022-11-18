/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author tom59
 */
public class Pedido {
    
    private int codigo;
    private String nombrePedido;
    private double peso;
    private String direccionEnvio;
    private String fechaEntrega;

    public Pedido(int codigo, String nombrePedido, double peso, String direccionEnvio, String FechaEntrega) {
        this.codigo = codigo;
        this.nombrePedido = nombrePedido;
        this.peso = peso;
        this.direccionEnvio = direccionEnvio;
        this.fechaEntrega = FechaEntrega;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.fechaEntrega = FechaEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", nombrePedido=" + 
                nombrePedido + ", peso=" + peso + ", direccionEnvio=" + 
                direccionEnvio + ", FechaEntrega=" + fechaEntrega + '}';
    }
    
    
    
    
}
