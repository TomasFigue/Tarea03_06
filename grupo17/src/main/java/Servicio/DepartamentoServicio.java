/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Departamento;

/**
 *
 * @author tom59
 */
public class DepartamentoServicio implements IDepartamentoServicio{
    private final List<Departamento> DepartamentoList = new ArrayList<>();

    @Override
    public Departamento crear(Departamento departamento) {
        this.DepartamentoList.add(departamento);
        return departamento;
    }

    @Override
    public List<Departamento> listar() {
        return this.DepartamentoList;
    }
    
}
