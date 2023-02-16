/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validar;

/**
 *
 * @author usuario
 */
public class Validador {
    public static boolean esNombreValido(String nombre){
     
        return nombre.matches("^([A-ZÑ]{1}+[a-zñáéíóúÁÉÍÓÚ'°]+[ ]?){1,2}$");
 
}
    public static boolean esApellidoValido(String apellido){
        return apellido.matches("^([A-ZÑ]{1}+[a-zñáéíóúÁÉÍÓÚ'°]+[ ]?){1,2}$");
    }
    public static boolean esCedulaValida(String numeroCedula){
        return numeroCedula.matches("^\\d{10}$");
    }
    public static boolean esNumeroValido(String numero){
        
    return numero.matches("^[09]{2}+[0-9]{8}$");
    }
    public static boolean esFechaCorrecta(String fecha){
       
       return fecha.matches("^([0-2][0-9]||3[0-1])-(0[0-9]||1[0-2])-([0-9][0-9])?[0-9][0-9]$");
   }
}
