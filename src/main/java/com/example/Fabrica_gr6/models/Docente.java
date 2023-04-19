package com.example.Fabrica_gr6.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue
    private Long idPersona;


    private String tipoContrato;


    private String nombre;


    private String email;

    // Constructor, getters y setters

    public Docente() {
    }

    public Docente(Long idPersona, String tipoContrato, String nombre, String email) {
        this.idPersona = idPersona;
        this.tipoContrato = tipoContrato;
        this.nombre = nombre;
        this.email = email;
    }


    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}