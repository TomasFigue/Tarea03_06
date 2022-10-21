/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P61.unidad0103;

/**
 *
 * @author tom59
 */
public class PrincipalUnidad0103 {
    public static void main (String[]args){
        
        var propietario1 = new Propietario();
        propietario1.nombre="Juan Pérez";
        propietario1.direccion="París y Oslo";
        propietario1.telefono="0984357604";
        propietario1.yearNacimiento=1981;

        var propietario2 = new Propietario();
        propietario2.nombre="Carlos López";
        propietario2.direccion="Gran Colombia y Lamar";
        propietario2.telefono="09843578596";
        propietario2.yearNacimiento=1980;
        
        var matricula1=new LugarMatricculacion();
        matricula1.ciudad="cuenca";
        matricula1.descripcion="nmayancela";
        matricula1.provincia="azuay";
        matricula1.telefono=8556987;
        
        var matricula2=new LugarMatricculacion();
        matricula2.ciudad="Guayakill";
        matricula2.descripcion="Caplispamba";
        matricula2.provincia="Guayas";
        matricula2.telefono=855698744;
        

        var auto1 = new Auto();
        auto1.color="Amarillo";
        auto1.cilindrajeMotor=1600;
        auto1.marca="Toyota";
        auto1.placa="AGF0526";
        auto1.precio=18000;
        auto1.year=2018;
        auto1.owner=propietario2;
        auto1.matricula=matricula1;
        

        var auto2 = new Auto();
        auto2.color="Azul";
        auto2.cilindrajeMotor=2500;
        auto2.marca="Chevrolet";
        auto2.placa="UAF0526";
        auto2.precio=18000;
        auto2.year=2010;
        auto2.owner=propietario1;
        auto2.matricula=matricula2;

        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
        
    }
    
}



