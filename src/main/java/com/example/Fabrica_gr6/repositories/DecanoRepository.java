package com.example.Fabrica_gr6.repositories;

import com.example.Fabrica_gr6.models.Decano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecanoRepository extends JpaRepository<Decano,Integer> {
}
