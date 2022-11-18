/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import modelo.Proveedor;
import servicio.ProveedorServiceImpl;

/**
 *
 * @author tom59
 */
public class ProveedorControl {
    private ProveedorServiceImpl proveedorServiceImpl;
    
    public ProveedorControl(){
        this.proveedorServiceImpl=new ProveedorServiceImpl();
    }
    
    public String crear(String[] data){
        var retorno="No se pudo crear el Proveedor";
        var codigoProveedor=Integer.valueOf(data[0]).intValue();
        var nombreProveedor=data[1];
        var precioEnvio=Double.valueOf(data[2]).doubleValue();
        var direccionProveedor=data[3];
        var fechaEnvio=data[4];
        
        
        if(precioEnvio <0){
            retorno+= "Precio no valido";
        }else{
            var proveedor = new Proveedor(codigoProveedor,nombreProveedor,precioEnvio,direccionProveedor,fechaEnvio);
            this.proveedorServiceImpl.crear(proveedor);
            retorno= "Proveedor"+proveedor.getNombreProveedor()+"Creado";
        }
        return retorno;
    }
    
}
