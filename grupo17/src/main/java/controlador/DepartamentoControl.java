/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.List;
import modelo.Departamento;

/**
 *
 * @author tom59
 */
public class DepartamentoControl {
    private final DepartamentoControl departamentoServicio = new DepartamentoControl();
    
    public Departamento crear (String [] params){
        var departamento = new Departamento (Integer.valueOf(params[0]),params[1],params[2]);
        this.departamentoServicio.crear(departamento);
        return departamento;
    }
    public List<Departamento> listar()
    {
        return this.departamentoServicio.listar();
    }

    private void crear(Departamento departamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
