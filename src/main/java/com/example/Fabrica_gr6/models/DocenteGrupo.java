package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

@Entity
@Table(name = "docente_grupo")

public class DocenteGrupo {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_docente", referencedColumnName = "id_persona")
    private Docente docente;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "numero", referencedColumnName = "numero"),
            @JoinColumn(name = "course_code", referencedColumnName = "course_code")
    })
    private Grupo grupo;

    // Constructor, getters y setters


    public DocenteGrupo() {
    }

    public DocenteGrupo(Docente docente, Grupo grupo) {
        this.docente = docente;
        this.grupo = grupo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}


