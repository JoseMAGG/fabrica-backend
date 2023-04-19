package com.example.Fabrica_gr6.repositories;

import com.example.Fabrica_gr6.models.AcademicProgram;
import com.example.Fabrica_gr6.models.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicUnitRepository extends JpaRepository<AcademicUnit,String> {
}
