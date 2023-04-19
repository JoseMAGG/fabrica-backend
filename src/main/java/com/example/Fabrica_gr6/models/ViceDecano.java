package com.example.Fabrica_gr6.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vice_decano")
public class ViceDecano {

    @Id
    @GeneratedValue
    private Integer idPersona;


    private String nombre;

    private String email;

    private String oficina;

    private String nameFacultad;

    public ViceDecano() {
    }

    public ViceDecano(Integer idPersona, String nombre, String email, String oficina, String nameFacultad) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.email = email;
        this.oficina = oficina;
        this.nameFacultad = nameFacultad;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
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

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getNameFacultad() {
        return nameFacultad;
    }

    public void setNameFacultad(String nameFacultad) {
        this.nameFacultad = nameFacultad;
    }
}