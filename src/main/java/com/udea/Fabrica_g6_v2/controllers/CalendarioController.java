package com.udea.Fabrica_g6_v2.controllers;

import com.udea.Fabrica_g6_v2.models.Calendario;
import com.udea.Fabrica_g6_v2.services.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalendarioController {
    //atributos

    @Autowired
    CalendarioService calendarioService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/calendarios")
    public List<Calendario> findAll(){
        return calendarioService.findAll();

    }



    @PostMapping("/api/calendarios")
    public ResponseEntity<Calendario> save(@RequestBody Calendario calendario){

        return calendarioService.save(calendario);
    }




    @GetMapping("/api/calendarios/{id}")
    public ResponseEntity<Calendario> findById(@PathVariable String id){
        return calendarioService.findById(id);
    }




    @DeleteMapping("/api/calendarios/{id}")
    public ResponseEntity<Calendario> delete(@PathVariable String id){
        return calendarioService.delete(id);

    }




    @PutMapping("/api/calendarios")
    public ResponseEntity<Calendario> update(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);

    }


}

