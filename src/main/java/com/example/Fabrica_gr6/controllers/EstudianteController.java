package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Estudiante;
import com.example.Fabrica_gr6.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteController {
    //atributos

    @Autowired
    EstudianteService estudianteService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/estudiantes")
    public List<Estudiante> findAll(){
        return estudianteService.findAll();

    }



    @PostMapping("/api/estudiantes")
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){

        return estudianteService.save(estudiante);
    }




    @GetMapping("/api/estudiantes/{id}")
    public ResponseEntity<Estudiante> findById(@PathVariable Long id){
        return estudianteService.findById(id);
    }




    @DeleteMapping("/api/estudiantes/{id}")
    public ResponseEntity<Estudiante> delete(@PathVariable Long id){
        return estudianteService.delete(id);

    }




    @PutMapping("/api/estudiantes")
    public ResponseEntity<Estudiante> update(@RequestBody Estudiante estudiante){
        return estudianteService.update(estudiante);

    }


}

