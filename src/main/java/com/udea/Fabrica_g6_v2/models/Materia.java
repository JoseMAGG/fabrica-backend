package com.udea.Fabrica_g6_v2.models;


import javax.persistence.*;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @Column(name = "id_materia")
    private Long idMateria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "linea_enfasis")
    private String lineaEnfasis;

    public Materia(){}
    public Materia(Long idMateria, String nombre, String lineaEnfasis) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.lineaEnfasis = lineaEnfasis;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
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

