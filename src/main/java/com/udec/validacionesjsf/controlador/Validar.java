/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.validacionesjsf.controlador;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.Convert;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.*;

/**
 *
 * @author ASUS
 */
@Named(value = "validar")
@Dependent
public class Validar{
    
    @NotNull(message="Campo Requerido*: Error de validación: se necesita un valor")
    private int vacio;
    @Size (min = 1, max =10)
    private String tamano;
    @Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
            message="Correo*: Error de validación: se necesita un valor.")
    private String correo;
    @Min(value=18,message="El campo debe ser numerico mayor a 18")
    @Max(value=90,message="El campo debe ser numerico menor a 90")
    private int numerico;
    @NotNull
    @Pattern(regexp="^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$", 
            message="Formato de fecha no valido")
    private String fecha;
    @Pattern(regexp="[$]?[-+]?\\d{3,5}(\\.\\d{1,2})?", message="Formato moneda no valido")
    private String moneda;
    
    public Validar() {
    }

    public int getVacio() {
        return vacio;
    }

    public void setVacio(int vacio) {
        this.vacio = vacio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumerico() {
        return numerico;
    }

    public void setNumerico(int numerico) {
        this.numerico = numerico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
}
