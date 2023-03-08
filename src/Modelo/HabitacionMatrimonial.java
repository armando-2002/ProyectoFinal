/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class HabitacionMatrimonial {
    String descripccion;

    public HabitacionMatrimonial(String descripccion) {
        this.descripccion = descripccion;
    }

    public HabitacionMatrimonial() {
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    public String descripccion(){
        return "Cuenta con dos camas individuales o una cama doble"
                + "ideal para dos adultos. ";
    }

    @Override
    public String toString() {
        return "HabitacionMatrimonial{" + "descripccion=" + descripccion() + '}';
    }
    
}
