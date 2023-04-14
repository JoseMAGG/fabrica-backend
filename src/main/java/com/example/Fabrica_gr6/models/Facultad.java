package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

@Entity
@Table(name = "facultad")
public class Facultad {

    @Id

    private String id;


    private String nombre;

    @ManyToOne

    private Decano decano;

    @ManyToOne

    private ViceDecano viceDecano;

    public Facultad() {
    }

    public Facultad(String id, String nombre, Decano decano, ViceDecano viceDecano) {
        this.id = id;
        this.nombre = nombre;
        this.decano = decano;
        this.viceDecano = viceDecano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Decano getDecano() {
        return decano;
    }

    public void setDecano(Decano decano) {
        this.decano = decano;
    }

    public ViceDecano getViceDecano() {
        return viceDecano;
    }

    public void setViceDecano(ViceDecano viceDecano) {
        this.viceDecano = viceDecano;
    }
}