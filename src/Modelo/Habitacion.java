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
    private int capacidad;
     
     //get and set

    public Habitacion(String tipoDeHabitacion,int piso, int numeroDeHabitacion,int capacidad,
            double precio
            ) {
        this.piso = piso;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.capacidad=capacidad;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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

    @Override
    public String toString() {
        return "Habitacion{" + "piso=" + piso + ", numeroDeHabitacion=" + 
                numeroDeHabitacion + ", tipoDeHabitacion=" + tipoDeHabitacion + 
                ", precio=" + precio + ", descripcion=" + descripcion + ", servicios="
                + servicios + ", estaDisponible=" + estaDisponible + '}';
    }
     
     
    
}
