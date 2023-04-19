package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Aula;
import com.example.Fabrica_gr6.services.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AulaController {
    //atributos

    @Autowired
    AulaService aulaService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/aulas")
    public List<Aula> findAll(){
        return aulaService.findAll();

    }



    @PostMapping("/api/aulas")
    public ResponseEntity<Aula> save(@RequestBody Aula aula){

        return aulaService.save(aula);
    }




    @GetMapping("/api/aulas/{id}")
    public ResponseEntity<Aula> findById(@PathVariable Long id){
        return aulaService.findById(id);
    }




    @DeleteMapping("/api/aulas/{id}")
    public ResponseEntity<Aula> delete(@PathVariable Long id){
        return aulaService.delete(id);

    }




    @PutMapping("/api/aulas")
    public ResponseEntity<Aula> update(@RequestBody Aula aula){
        return aulaService.update(aula);

    }


}

