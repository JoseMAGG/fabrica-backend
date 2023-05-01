package com.udea.Fabrica_g6_v2.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="aula")
public class Aula {

    @Column(name = "id_aula", nullable=false )
    @Id
    private String id;

    private Long bloque;
    private Long  salon;
    private Long capacidad;

    public Aula() {
    }

    public Aula( Long bloque, Long salon, Long capacidad) {
        this.id = (bloque+"-"+salon);
        this.bloque = bloque;
        this.salon = salon;
        this.capacidad = capacidad;
    }

    public String getId() {
        return (bloque+"-"+salon);
    }

    public void setIdAula() {
        this.id = (bloque+"-"+salon);
    }

    public Long getBloque() {
        return bloque;
    }

    public void setBloque(Long bloque) {
        this.bloque = bloque;
        setIdAula();
    }

    public Long getSalon() {
        return salon;
    }

    public void setSalon(Long salon) {
        this.salon = salon;
        setIdAula();
    }

    public Long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Long capacidad) {
        this.capacidad = capacidad;
    }
}
