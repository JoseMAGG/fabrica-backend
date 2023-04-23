package com.udea.Fabrica_g6_v2.controllers;


import com.udea.Fabrica_g6_v2.models.Facultad;
import com.udea.Fabrica_g6_v2.services.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultadController {
    //atributos

    @Autowired
    FacultadService facultadService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/facultades")
    public List<Facultad> findAll(){
        return facultadService.findAll();

    }



    @PostMapping("/api/facultades")
    public ResponseEntity<Facultad> save(@RequestBody Facultad facultad){

        return facultadService.save(facultad);
    }




    @GetMapping("/api/facultades/{id}")
    public ResponseEntity<Facultad> findById(@PathVariable Long id){
        return facultadService.findById(id);
    }




    @DeleteMapping("/api/facultades/{id}")
    public ResponseEntity<Facultad> delete(@PathVariable Long id){
        return facultadService.delete(id);

    }




    @PutMapping("/api/facultades")
    public ResponseEntity<Facultad> update(@RequestBody Facultad facultad){
        return facultadService.update(facultad);

    }


}

