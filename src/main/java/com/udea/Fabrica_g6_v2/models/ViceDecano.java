package com.udea.Fabrica_g6_v2.models;

import jakarta.persistence.*;

@Entity
@Table(name = "vice_decano")
public class ViceDecano {

    @Id
    @Column(name =  "id_vicedecano")
    private Long idPersona;
    private String nombre;

    private String email;

    private String oficina;

    @JoinColumn(name = "name_facultad")
    private String nameFacultad;

    public ViceDecano() {
    }

    public ViceDecano(Long idPersona, String nombre, String email, String oficina, String nameFacultad) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.email = email;
        this.oficina = oficina;
        this.nameFacultad = nameFacultad;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
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