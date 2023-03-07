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
    
    public Habitacion habitacionesDisponibles(){
        Habitacion h1 = new Habitacion();
        if (this.capacidad == 0){
        this.nombre = "No se puede mostrar una habitación con esta capacidad";
        } else {
        if(this.capacidad == 1){
           this.nombre = "Habitación Simple";
           this.precio = 350;
           this.descripcion = "Cuenta con una cama individual y una superficie que "
                   + "puede variar entre los 8 y 14 metros";
           this.piso = 1;
           this.numeroDeHabitacion = 1;
           h1.setNombre(this.nombre);
           h1.setPiso(this.piso);
           h1.setPrecio(this.precio);
           h1.setDescripcion(this.descripcion);
           h1.setNumeroDeHabitacion(this.numeroDeHabitacion);
        }
        if(this.capacidad == 2){
           this.nombre = "Habitación Doble";
           this.precio = 350;
           this.descripcion = "Cuenta con dos camas individuales o una cama doble"
                   + "ideal para dos adultos. ";
           this.piso = 2;
           this.numeroDeHabitacion = 2;
           h1.setNombre(this.nombre);
           h1.setPiso(this.piso);
           h1.setPrecio(this.precio);
           h1.setDescripcion(this.descripcion);
           h1.setNumeroDeHabitacion(this.numeroDeHabitacion);
       }
       if(this.capacidad == 3){
           this.nombre = "Habitación Triple";
           this.precio = 350;
           this.descripcion = "Cuenta con tres camas individuales o 1 cama de matrimonio"
                   + "y una cama individual. Son lo suficientemente grandes para alojar"
                   + "a tres personas.";
           this.piso = 3;
           this.numeroDeHabitacion = 3;
           h1.setNombre(this.nombre);
           h1.setPiso(this.piso);
           h1.setPrecio(this.precio);
           h1.setDescripcion(this.descripcion);
           h1.setNumeroDeHabitacion(this.numeroDeHabitacion);
        }
        if(this.capacidad == 4){
           this.nombre = "Habitación Cuadruple";
           this.precio = 350;
           this.descripcion = "Las habitaciones cuádruples tienen cuatro camas "
                   + "individuales o una cama grande con literas, son luminosas"
                   + "y tranquilas para garantizar el descanso de nuestros visitantes. ";
           this.piso = 4;
           this.numeroDeHabitacion = 4;
           h1.setNombre(this.nombre);
           h1.setPiso(this.piso);
           h1.setPrecio(this.precio);
           h1.setDescripcion(this.descripcion);
           h1.setNumeroDeHabitacion(this.numeroDeHabitacion);
        }
        if(this.capacidad == 4){
           this.nombre = "Connecting rooms";
           this.precio = 350;
           this.descripcion = "Se trata de habitaciones dobles conectadas entre sí"
                   + "a través de una puerta. Tiene su propio pasillo con acceso al"
                   + "pasillo";
           this.piso = 5;
           this.numeroDeHabitacion = 5;
           h1.setNombre(this.nombre);
           h1.setPiso(this.piso);
           h1.setPrecio(this.precio);
           h1.setDescripcion(this.descripcion);
           h1.setNumeroDeHabitacion(this.numeroDeHabitacion);
       }
        if(this.capacidad == 4){
           this.nombre = "Suite";
           this.precio = 350;
           this.descripcion = "Son las mejores y más lujosas habitaciones,"
                   + " cuentan con dos habitaciones dobles,"
                   + " 2 baños, salón y estancia. ";
           this.piso = 6;
           this.numeroDeHabitacion = 6;
           h1.setNombre(this.nombre);
           h1.setPiso(this.piso);
           h1.setPrecio(this.precio);
           h1.setDescripcion(this.descripcion);
           h1.setNumeroDeHabitacion(this.numeroDeHabitacion);
       }
    }
        return h1;
   
    }     

    @Override
    public String toString() {
        return "Habitacion{" + "piso=" + piso + ", numeroDeHabitacion=" + 
                numeroDeHabitacion + ", tipoDeHabitacion=" + tipoDeHabitacion + 
                ", precio=" + precio + ", descripcion=" + descripcion + ", servicios="
                + servicios + ", estaDisponible=" + estaDisponible + '}';
    }
     
     
    
}
