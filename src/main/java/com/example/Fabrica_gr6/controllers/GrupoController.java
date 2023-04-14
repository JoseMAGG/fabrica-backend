package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Grupo;
import com.example.Fabrica_gr6.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GrupoController {
    //atributos

    @Autowired
    GrupoService grupoService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/grupos")
    public List<Grupo> findAll(){
        return grupoService.findAll();

    }



    @PostMapping("/api/grupos")
    public ResponseEntity<Grupo> save(@RequestBody Grupo grupo){

        return grupoService.save(grupo);
    }




    @GetMapping("/api/grupos/{id}")
    public ResponseEntity<Grupo> findById(@PathVariable Integer id){
        return grupoService.findById(id);
    }




    @DeleteMapping("/api/grupos/{id}")
    public ResponseEntity<Grupo> delete(@PathVariable Integer id){
        return grupoService.delete(id);

    }




    @PutMapping("/api/grupos")
    public ResponseEntity<Grupo> update(@RequestBody Grupo grupo){
        return grupoService.update(grupo);

    }


}

