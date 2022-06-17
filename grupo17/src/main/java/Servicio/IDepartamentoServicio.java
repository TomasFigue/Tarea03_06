/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

/**
 *
 * @author tom59
 */
import java.util.List;
import modelo.Departamento;

interface IDepartamentoServicio {
    public Departamento crear(Departamento departamento);
    public List <Departamento> listar();
}