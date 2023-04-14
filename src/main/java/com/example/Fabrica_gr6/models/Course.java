package com.example.Fabrica_gr6.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
    @Id
    private String courseCode;
    private String courseName;
    private String emphasisLine;
    private Integer creditsNumber;
    private String prerequisite;
    private String correquisite;


    public Course() {
    }

    public Course(String courseName, String courseCode, String emphasisLine, Integer creditsNumber, String prerequisite, String correquisite) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.emphasisLine = emphasisLine;
        this.creditsNumber = creditsNumber;
        this.prerequisite = prerequisite;
        this.correquisite = correquisite;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getEmphasisLine() {
        return emphasisLine;
    }

    public void setEmphasisLine(String emphasisLine) {
        this.emphasisLine = emphasisLine;
    }

    public int getCreditsNumber() {
        return creditsNumber;
    }

    public void setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public String getCorrequisite() {
        return correquisite;
    }

    public void setCorrequisite(String correquisite) {
        this.correquisite = correquisite;
    }


}