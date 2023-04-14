package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @GeneratedValue
    private Integer numero;

    @Id
    @ManyToOne
    @JoinColumn(name = "course_code", referencedColumnName = "course_code")
    private Course course;


    private Integer bloque;


    private Integer salon;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "bloque", referencedColumnName = "bloque", insertable = false, updatable = false),
            @JoinColumn(name = "salon", referencedColumnName = "salon", insertable = false, updatable = false)
    })
    private Aula aula;

    // Constructor, getters y setters

    public Grupo() {
    }

    public Grupo(Integer numero, Course course, Integer bloque, Integer salon, Aula aula) {//new Aula(id, bloque, salon)
        this.numero = numero;
        this.course = course;
        this.bloque = bloque;
        this.salon = salon;
        this.aula = aula;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getBloque() {
        return bloque;
    }

    public void setBloque(Integer bloque) {
        this.bloque = bloque;
    }

    public Integer getSalon() {
        return salon;
    }

    public void setSalon(Integer salon) {
        this.salon = salon;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
}