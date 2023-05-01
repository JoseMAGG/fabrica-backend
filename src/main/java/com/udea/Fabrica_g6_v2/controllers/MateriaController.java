package com.udea.Fabrica_g6_v2.controllers;

import com.udea.Fabrica_g6_v2.models.Facultad;
import com.udea.Fabrica_g6_v2.models.Materia;
import com.udea.Fabrica_g6_v2.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping("/api/materias")
    public List<Materia> findAll(){
        return materiaService.findAll();

    }



    @PostMapping("/api/materias")
    public ResponseEntity<Materia> save(@RequestBody Materia materia){

        return materiaService.save(materia);
    }




    @GetMapping("/api/materias/{id}")
    public ResponseEntity<Materia> findById(@PathVariable Long id){
        return materiaService.findById(id);
    }




    @DeleteMapping("/api/materias/{id}")
    public ResponseEntity<Materia> delete(@PathVariable Long id){
        return materiaService.delete(id);

    }




    @PutMapping("/api/materias")
    public ResponseEntity<Materia> update(@RequestBody Materia materia){
        return materiaService.update(materia);

    }


}

