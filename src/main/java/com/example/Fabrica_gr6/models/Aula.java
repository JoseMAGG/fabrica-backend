package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

import java.time.LocalDate;

//creo la entidad libro y luego le aplico laas anotaciones

@Entity
@Table(name = "aula")
public class Aula {
    //atributos
   // private para que esten encapsulados
    @Id
    private Long bloque;

    private Integer salon;
    private Integer capacidad;


    //constructores

    public Aula() {
    }

    public Aula(Long bloque, Integer salon, Integer capacidad) {
        this.bloque = bloque;
        this.salon = salon;
        this.capacidad = capacidad;
    }
//gets y sets


    public Long getBloque() {
        return bloque;
    }

    public void setBloque(Long bloque) {
        this.bloque = bloque;
    }

    public Integer getSalon() {
        return salon;
    }

    public void setSalon(Integer salon) {
        this.salon = salon;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
