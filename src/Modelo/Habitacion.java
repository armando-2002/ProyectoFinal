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
    private String nombre;
    private int numeroDeHabitacion;
    private String tipoDeHabitacion;
    private double precio;
    private String descripcion;
    private String [] servicios=new String [6];
    private boolean estaDisponible;
    private int capacidad;
     
     //get and set

    public Habitacion(String tipoDeHabitacion,int piso, int numeroDeHabitacion,int capacidad,
            double precio) {
        this.piso = piso;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.capacidad=capacidad;
    }

    public Habitacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    public String habitacionSimple(){
        this.descripcion = "SERVICIOS DE LA HABITACIÓN\n"
                +" \n"
                + "-Cuenta con una cama individual de plaza y media\n"
                + "-Dispone de un baño con agua caliente\n"
                + "-No cuenta con servicio a la habitación(desayuno/almuerzo/cena)\n";
        return this.descripcion;
    }
    
    public String habitacionDoble(){
         this.descripcion = "SERVICIOS DE LA HABITACIÓN\n"
                 +" \n"
                 + "-Cuenta con dos camas indoviduales o una cama doble\n"
                 + "-Dispone de dos baños con agua fria y caliente\n"
                 + "-Servicio a la habitación (desayuno/almuerzo/merienda)";
        return this.descripcion;
    }
    
    public String habitacionTriple(){
        this.descripcion = "SERVICIOS DE LA HABITACIÓN\n"
                +" \n"
                + "-Cuenta con tres camas individuales\n"
                + "-Servicio a la habitación\n"
                + "-Dispone de tres baños con agua fría y caliente\n"
                + "-Velador\n"
                + "-Aire acondicionado\n"
                + "-TV por cable\n";
        return this.descripcion;
    }
    
    public String habitacionCuadruple(){
        this.descripcion = "SERVICIOS DE LA HABITACIÓN\n"
           +"\n "
           +"-Las habitaciones cuádruples tienen cuatro camas \n"
           + "-Servicio a la habitación (desayuno/almuerzo/cena)\n"
           + "-Una litera\n"
           + "-TV por cable\n"
           + "-Aire Acondicionado\n";
        return this.descripcion;
    }
    
    public String habitacionConnectingRooms(){
        this.descripcion = "SERVICIOS DE LA HABITACIÓN\n"
                +" \n"
                +"-Cuenta con habitaciones conectadas entre sí\n"
                + "-Servicio a la habitación (desayuno/almuerzo/cena)\n"
                + "-Cuenta con jacuzzi\n"
                + "-Dos baños indivuduales\n"
                + "-TV por cable\n"
                + "-Aire Acondicionado\n"
                + "-Tiene balcón";
        return this.descripcion;
    }
    
    public String Suite(){
       this.descripcion = "SERVICIOS DE LA HABITACIÓN\n"
               +"\n "
               +"-Cuenta con dos camas king\n"
               + "-Servicio a la habitación las 24 horas\n"
               + "-Dispone de un baño\n"
               + "-Cuenta con jacuzzi\n"
               + "-Salida a la terraza\n"
               + "-TV por cable\n"
               + "-Aire Acondicionado\n"
               + "-Tiene balcón\n"
               + "-Velador\n"
               + "-Sala\n"
               + "-Mesa de ping pong\n"
               + "-Cuarto de minicine\n";
        return this.descripcion;
    }
    
    @Override
    public String toString() {
        return "Habitacion\n" + "piso: " + piso + "\nnumeroDeHabitacion: " + 
                numeroDeHabitacion + "\ntipoDeHabitacion: " + tipoDeHabitacion + 
                ", precio=" + precio + "\ndescripcion: " + descripcion + "\nservicios: "
                + servicios + "\ncestaDisponible: " + estaDisponible ;
    }
     
     
    
}
