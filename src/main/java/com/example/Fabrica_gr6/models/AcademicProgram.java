package com.example.Fabrica_gr6.models;

import jakarta.persistence.*;

@Entity
@Table(name = "academic_program")
public class AcademicProgram {

    @Id

    private Integer academicProgramNumber;

    @ManyToOne
    @JoinColumn(name = "academic_unit_id", referencedColumnName = "academic_unit_id")
    private AcademicUnit academicUnit;


    private String academicProgramName;


    private Integer academicProgramType;


    private Integer modalityNumber;

    public AcademicProgram() {
    }

    public AcademicProgram(Integer academicProgramNumber, AcademicUnit academicUnit,
                           String academicProgramName, Integer academicProgramType,
                           Integer modalityNumber) {
        this.academicProgramNumber = academicProgramNumber;
        this.academicUnit = academicUnit;
        this.academicProgramName = academicProgramName;
        this.academicProgramType = academicProgramType;
        this.modalityNumber = modalityNumber;
    }

    public Integer getAcademicProgramNumber() {
        return academicProgramNumber;
    }

    public void setAcademicProgramNumber(Integer academicProgramNumber) {
        this.academicProgramNumber = academicProgramNumber;
    }

    public AcademicUnit getAcademicUnit() {
        return academicUnit;
    }

    public void setAcademicUnit(AcademicUnit academicUnit) {
        this.academicUnit = academicUnit;
    }

    public String getAcademicProgramName() {
        return academicProgramName;
    }

    public void setAcademicProgramName(String academicProgramName) {
        this.academicProgramName = academicProgramName;
    }

    public Integer getAcademicProgramType() {
        return academicProgramType;
    }

    public void setAcademicProgramType(Integer academicProgramType) {
        this.academicProgramType = academicProgramType;
    }

    public Integer getModalityNumber() {
        return modalityNumber;
    }

    public void setModalityNumber(Integer modalityNumber) {
        this.modalityNumber = modalityNumber;
    }
}