/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package vista;

import Control.PedidoControl;
import Control.ProveedorControl;
import modelo.Pedido;

/**
 *
 * @author tom59
 */
public class Tarea02_01 {

    public static void main(String[] args) {
        System.out.println("Grupo4");

        var proveedorControl = new ProveedorControl();
        var data = new String[5];
        data[0] = "10";                  //codigo
        data[1] = "  ***Envios cuenca***  ";   //nombre
        data[2] = "53";                  //precio
        data[3] = "Bnigno malo a la esquina";       //direccion
        data[4] = "12/12/12";            //fecha
        System.out.println(proveedorControl.crear(data));
        System.out.println(proveedorControl.infoProveedor(data));
        
     
        var pedidoControl = new PedidoControl();
        var info = new String[5];
        info[0] = "5";                     //codigo
        info[1] = "  Amazon lapiz  ";      //nombre
        info[2] = "10";                    //peso
        info[3] = "el valle calle3";       //direccion
        info[4] = "12/12/10";              //fecha
        System.out.println(pedidoControl.crear(info));
        System.out.println(pedidoControl.infoPedido(info));
               
    }
}
