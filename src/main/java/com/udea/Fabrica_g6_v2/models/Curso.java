package com.udea.Fabrica_g6_v2.models;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name="codigo_curso")
    private Long codigoCurso;

    @OneToOne
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    private Materia idMateria;

    @Column(name="credits_number")
    private Long creditos;

    @Column(name="prerequisito")
    private String prerequisito;

    @Column(name="correquisito")
    private String correquisito;

    public Curso(){}

    public Curso(Long codigoCurso, Materia idMateria, Long creditos, String prerequisito, String correquisito) {
        this.codigoCurso = codigoCurso;
        this.idMateria = idMateria;
        this.creditos = creditos;
        this.prerequisito = prerequisito;
        this.correquisito = correquisito;
    }

    public Long getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Long codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    public Long getCreditos() {
        return creditos;
    }

    public void setCreditos(Long creditos) {
        this.creditos = creditos;
    }

    public String getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(String prerequisito) {
        this.prerequisito = prerequisito;
    }

    public String getCorrequisito() {
        return correquisito;
    }

    public void setCorrequisito(String correquisito) {
        this.correquisito = correquisito;
    }
}
