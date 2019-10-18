/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.validacionesjsf.controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.*;

/**
 * Esta clase se encarga de las validaciones de los campos de texto desde el
 * controlador
 *
 * @author Cristian Perez, Angie Manrique
 */
@Named(value = "validar")
@RequestScoped
public class Validar {

    /**
     * La variable vacio guarda el código de la persona y hace uso de la
     * anotación @NotNull para que no permita vacio, es decir sea un campo
     * requerido
     */
    @NotNull(message = "Campo Requerido*: Error de validación: se necesita un valor")
    private int vacio;
    /**
     * Esta variable contiene el telefono de la persona, y valida que su
     * longitud sea entre 7 y 10 digitos
     */
    @Size(min = 7, max = 10)
    private String tamano;
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
            message = "Correo*: Error de validación: se necesita un valor.")
    /**
     * Esta variable valida que cumpla el formato de correo
     */
    private String correo;
    /**
     * Esta variable guarda la edad, siendo la minima de 18 y la máxima de 90, y
     * campo numérico
     */
    @Min(value = 18, message = "El campo debe ser numerico mayor a 18")
    @Max(value = 90, message = "El campo debe ser numerico menor a 90")
    private int numerico;
    /**
     * Guarda fechas pasadas y futuras y valida que no esté vacio el campo
     */
    @NotNull
    @Pattern(regexp = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$",
            message = "Formato de fecha no valido")
    private String fecha;
    /**
     * Guarda el sueldo de una persona y valida que sea numeros de 1 a 9 digitos
     * con el simbolo $
     */
    @Pattern(regexp = "\\$\\d+(?:\\.\\d+)?", message = "Formato de moneda no válido, debe ser usar el signo $")
    private String moneda;
    
    public Validar() {
    }
    /**
     * Obtiene el campo donde se valida que no sea vacio
     * @return 
     */
    public int getVacio() {
        return vacio;
    }
    /**
     * Método que le da valor al campo donde se valida  que no sea vacio
     * @param vacio 
     */
    public void setVacio(int vacio) {
        this.vacio = vacio;
    }
    /**
     * Obtiene el telefono con un determinado tamaño
     * @return 
     */
    public String getTamano() {
        return tamano;
    }
    /**
     * Método que le da valor al telefono segun su cantidad de cifras
     * @param tamano 
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    /**
     * Método que obtiene el correo
     * @return 
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Método que le da valor al correo
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Método que obtiene la edad siendo de tipo numérico
     * @return 
     */
    public int getNumerico() {
        return numerico;
    }
    /**
     * Método que le da valor a la edad
     * @param numerico 
     */
    public void setNumerico(int numerico) {
        this.numerico = numerico;
    }
    /**
     * Método que obtiene la fecha
     * @return 
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Método que le da valor a la fecha
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Método que obtiene el salario
     * @return 
     */
    public String getMoneda() {
        return moneda;
    }
    /**
     * Método que le da valor al salario
     * @param moneda 
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

}
