package com.udea.Fabrica_g6_v2.controllers;

import com.udea.Fabrica_g6_v2.models.Curso;
import com.udea.Fabrica_g6_v2.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping("/find-all")
    public List<Curso> findAll(){
        return cursoService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Curso> save(@RequestBody Curso curso){
        return cursoService.save(curso);
    }

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<Curso> findById(@PathVariable Long id){
        return cursoService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Curso> delete(@PathVariable Long id){
        return cursoService.delete(id);
    }

    @PutMapping("/update")
    public ResponseEntity<Curso> update(@RequestBody Curso curso){
        return cursoService.update(curso);
    }
}
