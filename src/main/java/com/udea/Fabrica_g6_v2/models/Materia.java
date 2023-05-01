package com.udea.Fabrica_g6_v2.models;


import javax.persistence.*;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @Column(name = "id_materia",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "linea_enfasis")
    private String lineaEnfasis;

    public Materia() {
    }

    public Materia(Long id, String nombre, String lineaEnfasis) {
        this.id = id;
        this.nombre = nombre;
        this.lineaEnfasis = lineaEnfasis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLineaEnfasis() {
        return lineaEnfasis;
    }

    public void setLineaEnfasis(String lineaEnfasis) {
        this.lineaEnfasis = lineaEnfasis;
    }
}

