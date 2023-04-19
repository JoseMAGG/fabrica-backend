package com.example.Fabrica_gr6.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "academic_unit")
public class AcademicUnit {

    @Id
    private String academicUnitId;

    public AcademicUnit() {}

    public AcademicUnit(String academicUnitId) {
        this.academicUnitId = academicUnitId;
    }

    public String getAcademicUnitId() {
        return academicUnitId;
    }

    public void setAcademicUnitId(String academicUnitId) {
        this.academicUnitId = academicUnitId;
    }
}