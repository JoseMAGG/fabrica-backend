package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "calendario")
public class Calendario {

    @EmbeddedId
    private String id;

    @ManyToOne
    @MapsId("idFacultad")

    private Facultad facultad;

    @ManyToOne

    private Decano aprobador;


    private LocalDate publicacionOferta;


    private LocalDate inicioMatriculas;


    private LocalDate finMatriculas;


    private LocalDate inicioAjustes;


    private LocalDate finAjustes;


    private LocalDate inicioClases;


    private LocalDate finClases;


    private LocalDate inicioExamenesFinales;


    private LocalDate finExamenesFinales;


    private LocalDate inicioValidaciones;


    private LocalDate finValidaciones;


    private LocalDate inicioHabilitaciones;


    private LocalDate finHabilitaciones;


    private LocalDate terminacionOficinal;

    // Constructor, getters y setters

    public Calendario() {
    }

    public Calendario(String id, Facultad facultad, Decano aprobador, LocalDate publicacionOferta, LocalDate inicioMatriculas, LocalDate finMatriculas, LocalDate inicioAjustes, LocalDate finAjustes, LocalDate inicioClases, LocalDate finClases, LocalDate inicioExamenesFinales, LocalDate finExamenesFinales, LocalDate inicioValidaciones, LocalDate finValidaciones, LocalDate inicioHabilitaciones, LocalDate finHabilitaciones, LocalDate terminacionOficinal) {
        this.id = id;
        this.facultad = facultad;
        this.aprobador = aprobador;
        this.publicacionOferta = publicacionOferta;
        this.inicioMatriculas = inicioMatriculas;
        this.finMatriculas = finMatriculas;
        this.inicioAjustes = inicioAjustes;
        this.finAjustes = finAjustes;
        this.inicioClases = inicioClases;
        this.finClases = finClases;
        this.inicioExamenesFinales = inicioExamenesFinales;
        this.finExamenesFinales = finExamenesFinales;
        this.inicioValidaciones = inicioValidaciones;
        this.finValidaciones = finValidaciones;
        this.inicioHabilitaciones = inicioHabilitaciones;
        this.finHabilitaciones = finHabilitaciones;
        this.terminacionOficinal = terminacionOficinal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Decano getAprobador() {
        return aprobador;
    }

    public void setAprobador(Decano aprobador) {
        this.aprobador = aprobador;
    }

    public LocalDate getPublicacionOferta() {
        return publicacionOferta;
    }

    public void setPublicacionOferta(LocalDate publicacionOferta) {
        this.publicacionOferta = publicacionOferta;
    }

    public LocalDate getInicioMatriculas() {
        return inicioMatriculas;
    }

    public void setInicioMatriculas(LocalDate inicioMatriculas) {
        this.inicioMatriculas = inicioMatriculas;
    }

    public LocalDate getFinMatriculas() {
        return finMatriculas;
    }

    public void setFinMatriculas(LocalDate finMatriculas) {
        this.finMatriculas = finMatriculas;
    }

    public LocalDate getInicioAjustes() {
        return inicioAjustes;
    }

    public void setInicioAjustes(LocalDate inicioAjustes) {
        this.inicioAjustes = inicioAjustes;
    }

    public LocalDate getFinAjustes() {
        return finAjustes;
    }

    public void setFinAjustes(LocalDate finAjustes) {
        this.finAjustes = finAjustes;
    }

    public LocalDate getInicioClases() {
        return inicioClases;
    }

    public void setInicioClases(LocalDate inicioClases) {
        this.inicioClases = inicioClases;
    }

    public LocalDate getFinClases() {
        return finClases;
    }

    public void setFinClases(LocalDate finClases) {
        this.finClases = finClases;
    }

    public LocalDate getInicioExamenesFinales() {
        return inicioExamenesFinales;
    }

    public void setInicioExamenesFinales(LocalDate inicioExamenesFinales) {
        this.inicioExamenesFinales = inicioExamenesFinales;
    }

    public LocalDate getFinExamenesFinales() {
        return finExamenesFinales;
    }

    public void setFinExamenesFinales(LocalDate finExamenesFinales) {
        this.finExamenesFinales = finExamenesFinales;
    }

    public LocalDate getInicioValidaciones() {
        return inicioValidaciones;
    }

    public void setInicioValidaciones(LocalDate inicioValidaciones) {
        this.inicioValidaciones = inicioValidaciones;
    }

    public LocalDate getFinValidaciones() {
        return finValidaciones;
    }

    public void setFinValidaciones(LocalDate finValidaciones) {
        this.finValidaciones = finValidaciones;
    }

    public LocalDate getInicioHabilitaciones() {
        return inicioHabilitaciones;
    }

    public void setInicioHabilitaciones(LocalDate inicioHabilitaciones) {
        this.inicioHabilitaciones = inicioHabilitaciones;
    }

    public LocalDate getFinHabilitaciones() {
        return finHabilitaciones;
    }

    public void setFinHabilitaciones(LocalDate finHabilitaciones) {
        this.finHabilitaciones = finHabilitaciones;
    }

    public LocalDate getTerminacionOficinal() {
        return terminacionOficinal;
    }

    public void setTerminacionOficinal(LocalDate terminacionOficinal) {
        this.terminacionOficinal = terminacionOficinal;
    }
}