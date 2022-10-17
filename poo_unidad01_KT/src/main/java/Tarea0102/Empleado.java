/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0102;

/**
 *
 * @author tom59
 */
public class Empleado {

    String nombre;
    int horasTrabajadas;
    Double costoHora;
    int AñoIngreso;

    public String mostrarInfo() {
        var retorno = "\n El empleado se llama: " + this.nombre + "\n En el mes a trabajado: "
                + this.horasTrabajadas + " Horas" + "\n El Precio de la hora es: " + this.costoHora
                + "\n El año de ingreso del empleado es: " + this.AñoIngreso;

        return retorno;
    }

    public int calcularTiempoEmpleado(int yearActual) {
        var retorno = 0;
        retorno = yearActual - this.AñoIngreso;

        return retorno;
    }

    public double bonoAntiguedad() {
        var retorno = 0.0d;
        var ingreso = this.costoHora * this.horasTrabajadas;
        var bono = this.calcularTiempoEmpleado(2022) * 0.02 * ingreso;
        retorno = bono;
        return retorno;
    }

    public double ingresoNormal() {
        var retorno = 0.0d;
        var ingreso = this.costoHora * this.horasTrabajadas;
        retorno = ingreso;
        return retorno;
    }

    public double ingresoPrincipal() {
        var retorno = 0.0d;
        var ingreso = this.costoHora * this.horasTrabajadas;
        var total = ingreso + this.bonoAntiguedad();
        retorno = total;
        return retorno;
    }

    public double bonoHorasExtra() {
        var retorno = 0.0d;
        if (this.horasTrabajadas > 160) {
            var horasSobrantes = this.horasTrabajadas - 160;
            var ingreso = this.costoHora * 2;
            var totalExtra = horasSobrantes * ingreso;
            return totalExtra;
        }
        return retorno;
    }

    public double impuesto(int limt1, int limt2, int limt3) {
        var retorno = 0.0d;
        if (this.ingresoNormal() > limt1 && this.ingresoNormal() < limt2) {
            var ingreso1 = this.ingresoNormal() * 0.05;
            return ingreso1;
        } else {
            if (this.ingresoNormal() > limt2 && this.ingresoNormal() < limt3) {
                var impuesto2 = this.ingresoNormal() * 0.12;
                return impuesto2;
            } else {
                if (this.ingresoNormal() > limt3) {
                    var impuesto3 = this.ingresoNormal() * 0.25;
                    return impuesto3;
                }
                return retorno;
            }
        }
    }

    public double calculoTotal() {
        var retorno = 0.0d;
        var total = this.ingresoNormal() + this.bonoHorasExtra() + this.bonoAntiguedad()
                - this.impuesto(500, 1000, 1500);
        return total;
    }
}
