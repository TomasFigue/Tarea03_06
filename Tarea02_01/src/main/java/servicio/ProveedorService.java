/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Proveedor;

/**
 *
 * @author tom59
 */
public interface ProveedorService {
    
    public abstract void crear (Proveedor proveeedor);
    public abstract void modificar (int codigoProveedor ,Proveedor proveeedormod);
    public abstract void eliminar (int codigoProveedor);
    public abstract List<Proveedor> listar();
    
}
