package com.example.Fabrica_gr6.models;
import jakarta.persistence.*;



@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id

    private Long idPersona;

    private String nombre;

    private String email;

    private Integer idPrograma;

    private Integer semestre;

    private Integer nivel;

    @ManyToOne
    @JoinColumn(name = "id_programa", insertable = false, updatable = false)
    private AcademicProgram academicProgram;

    // Constructors, getters and setters

    public Estudiante() {
    }

    public Estudiante(Long idPersona, String nombre, String email, Integer idPrograma, Integer semestre, Integer nivel, AcademicProgram academicProgram) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.email = email;
        this.idPrograma = idPrograma;
        this.semestre = semestre;
        this.nivel = nivel;
        this.academicProgram = academicProgram;
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

    public Integer getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public AcademicProgram getAcademicProgram() {
        return academicProgram;
    }

    public void setAcademicProgram(AcademicProgram academicProgram) {
        this.academicProgram = academicProgram;
    }
}