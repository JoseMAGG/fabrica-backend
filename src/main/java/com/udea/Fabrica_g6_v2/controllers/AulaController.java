package com.udea.Fabrica_g6_v2.controllers;

import com.udea.Fabrica_g6_v2.models.Aula;
import com.udea.Fabrica_g6_v2.models.Calendario;
import com.udea.Fabrica_g6_v2.services.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AulaController {
    @Autowired
    AulaService aulaService;

    @GetMapping("/api/aulas")
    public List<Aula> findAll(){
        return aulaService.findAll();

    }



    @PostMapping("/api/aulas")
    public ResponseEntity<Aula> save(@RequestBody Aula aula){

        return aulaService.save(aula);
    }




    @GetMapping("/api/aulas/{id}")
    public ResponseEntity<Aula> findById(@PathVariable String id){
        return aulaService.findById(id);
    }




    @DeleteMapping("/api/aulas/{id}")
    public ResponseEntity<Aula> delete(@PathVariable String id){
        return aulaService.delete(id);

    }




    @PutMapping("/api/aulas")
    public ResponseEntity<Aula> update(@RequestBody Aula aula){
        return aulaService.update(aula);

    }


}
