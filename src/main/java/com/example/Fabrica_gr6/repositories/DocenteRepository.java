package com.example.Fabrica_gr6.repositories;

import com.example.Fabrica_gr6.models.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Long> {
}
