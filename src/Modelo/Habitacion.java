/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Habitacion {
    private int piso;
    private int numeroDeHabitacion;
    private String tipoDeHabitacion;
    private double precio;
    private String descripcion;
     private String [] servicios=new String [6];
     private boolean estaDisponible;
     
     //get and set

    public Habitacion(int piso, int numeroDeHabitacion, String tipoDeHabitacion, double precio,
            String descripcion) {
        this.piso = piso;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumeroDeContacto() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeContacto(int numeroDeContacto) {
        this.numeroDeHabitacion = numeroDeContacto;
    }

    public String getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getServicios() {
        return servicios;
    }

    public void setServicios(String[] servicios) {
        this.servicios = servicios;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
     
     
    
}
