package com.example.Fabrica_gr6.repositories;

import com.example.Fabrica_gr6.models.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad,String> {
}
