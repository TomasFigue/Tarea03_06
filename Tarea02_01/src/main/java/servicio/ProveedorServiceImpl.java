/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Proveedor;

/**
 *
 * @author tom59
 */
public class ProveedorServiceImpl implements ProveedorService{
    
    private List<Proveedor> proveedorList;
    public ProveedorServiceImpl(){
        this.proveedorList=new ArrayList<>();
    }

    @Override
    public void crear(Proveedor proveeedor) {
        this.proveedorList.add(proveeedor);
    }

    @Override
    public void modificar(int codigoProveedor, Proveedor proveeedormod) {
        var indice=0;
        this.proveedorList.set(indice, proveeedormod);
    }

    @Override
    public void eliminar(int codigoProveedor) {
        var indice=0;
        for(var proveedor:this.proveedorList){
            if(proveedor.getCodigoProveedor()==codigoProveedor){
                this.proveedorList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Proveedor> listar() {
        return this.proveedorList;
    }
    
}
