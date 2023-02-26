/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mafer
 */
public class Reserva {
    private String fechaIngreso;
    private String fechaSalida;
    private String formaDePago;
    private double totalAPagar;
    private double valorPorHabitacion;
Habitacion habitacion;
    public Reserva() {
    }

    public Reserva(String fechaInicio, String fechaFin, String formaDePago, double totalAPagar) {
        this.fechaIngreso = fechaInicio;
        this.fechaSalida = fechaFin;
        this.formaDePago = formaDePago;
        this.totalAPagar = totalAPagar;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getValorPorHabitacion() {
        return valorPorHabitacion;
    }

    public void setValorPorHabitacion(double valorPorHabitacion) {
        this.valorPorHabitacion = valorPorHabitacion;
    }
    

    public String getFechaInicio() {
        return fechaIngreso;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaIngreso = fechaInicio;
    }

    public String getFechaFin() {
        return fechaSalida;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaSalida = fechaFin;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
        
    }
    
    
}
