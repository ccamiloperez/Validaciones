/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.validacionesjsf.controlador;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.*;

/**
 *
 * @author ASUS
 */
@Named(value = "validar")
@RequestScoped
public class Validar implements Serializable{
    
    @NotNull(message="Campo Requerido*: Error de validación: se necesita un valor")
    private String vacio;
    @Size (min = 1, max =10)
    private String tamano;
    @Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
            message="Correo*: Error de validación: se necesita un valor.")
    private String correo;
    @Min(0)
    private int numerico;
    @Past
    private Date fecha;
    @NotNull(message="Campo Requerido*: Error de validación: se necesita un valor")
    private int moneda;
    
    public Validar() {
    }

    public String getVacio() {
        return vacio;
    }

    public void setVacio(String vacio) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }
    
}
