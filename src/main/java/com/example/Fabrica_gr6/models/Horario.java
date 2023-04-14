package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "horario")
public class Horario {
    @Id
    private Integer bloque;
    @Id
    private Integer salon;
    private Integer numero_grupo;
    private String c_c_grupo;
    private String dia;
    private Time hora_inicio;
    private Time hora_fin;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "bloque", referencedColumnName = "bloque"),
            @JoinColumn(name = "salon", referencedColumnName = "salon")
    })
    private Aula aula;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "numero_grupo", referencedColumnName = "numero"),
            @JoinColumn(name = "c_c_grupo", referencedColumnName = "course_code")
    })
    private Grupo grupo;

    public Horario() {
    }

    public Horario(Integer bloque, Integer salon, Integer numero_grupo, String c_c_grupo, String dia, Time hora_inicio, Time hora_fin, Aula aula, Grupo grupo) {
        this.bloque = bloque;
        this.salon = salon;
        this.numero_grupo = numero_grupo;
        this.c_c_grupo = c_c_grupo;
        this.dia = dia;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.aula = aula;
        this.grupo = grupo;
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

    public Integer getNumero_grupo() {
        return numero_grupo;
    }

    public void setNumero_grupo(Integer numero_grupo) {
        this.numero_grupo = numero_grupo;
    }

    public String getC_c_grupo() {
        return c_c_grupo;
    }

    public void setC_c_grupo(String c_c_grupo) {
        this.c_c_grupo = c_c_grupo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}