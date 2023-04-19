package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Decano;
import com.example.Fabrica_gr6.services.DecanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DecanoController {
    //atributos

    @Autowired
    DecanoService decanoService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/decanos")
    public List<Decano> findAll(){
        return decanoService.findAll();

    }



    @PostMapping("/api/decanos")
    public ResponseEntity<Decano> save(@RequestBody Decano decano){

        return decanoService.save(decano);
    }




    @GetMapping("/api/decanos/{id}")
    public ResponseEntity<Decano> findById(@PathVariable Integer id){
        return decanoService.findById(id);
    }




    @DeleteMapping("/api/decanos/{id}")
    public ResponseEntity<Decano> delete(@PathVariable Integer id){
        return decanoService.delete(id);

    }




    @PutMapping("/api/decanos")
    public ResponseEntity<Decano> update(@RequestBody Decano decano){
        return decanoService.update(decano);

    }


}

