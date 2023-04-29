package com.udea.Fabrica_g6_v2.controllers;

import com.udea.Fabrica_g6_v2.models.Curso;
import com.udea.Fabrica_g6_v2.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping("/api/cursos")
    public List<Curso> findAll(){
        return cursoService.findAll();
    }

    @PostMapping("/api/cursos")
    public ResponseEntity<Curso> save(@RequestBody Curso curso){
        return cursoService.save(curso);
    }

    @GetMapping("/api/cursos/{id}")
    public ResponseEntity<Curso> findById(@PathVariable Long id){
        return cursoService.findById(id);
    }

    @DeleteMapping("/api/cursos/{id}")
    public ResponseEntity<Curso> delete(@PathVariable Long id){
        return cursoService.delete(id);
    }

    @PutMapping("/api/cursos")
    public ResponseEntity<Curso> update(@RequestBody Curso curso){
        return cursoService.update(curso);
    }
}
