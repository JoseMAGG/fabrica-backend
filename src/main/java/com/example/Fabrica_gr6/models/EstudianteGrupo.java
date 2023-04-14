package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante_grupo")
public class EstudianteGrupo {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id_persona")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "numero_grupo", referencedColumnName = "numero"),
            @JoinColumn(name = "c_c_grupo", referencedColumnName = "course_code")
    })
    private Grupo grupo;

    // Constructors, getters, and setters

    public EstudianteGrupo() {
    }

    public EstudianteGrupo(Long id, Estudiante estudiante, Grupo grupo) {
        this.id = id;
        this.estudiante = estudiante;
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}