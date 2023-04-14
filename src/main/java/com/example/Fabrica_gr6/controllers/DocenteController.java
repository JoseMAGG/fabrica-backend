package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Docente;
import com.example.Fabrica_gr6.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocenteController {
    //atributos

    @Autowired
    DocenteService docenteService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/docentes")
    public List<Docente> findAll(){
        return docenteService.findAll();

    }



    @PostMapping("/api/docentes")
    public ResponseEntity<Docente> save(@RequestBody Docente docente){

        return docenteService.save(docente);
    }




    @GetMapping("/api/docentes/{id}")
    public ResponseEntity<Docente> findById(@PathVariable Long id){
        return docenteService.findById(id);
    }




    @DeleteMapping("/api/docentes/{id}")
    public ResponseEntity<Docente> delete(@PathVariable Long id){
        return docenteService.delete(id);

    }




    @PutMapping("/api/docentes")
    public ResponseEntity<Docente> update(@RequestBody Docente docente){
        return docenteService.update(docente);

    }


}

