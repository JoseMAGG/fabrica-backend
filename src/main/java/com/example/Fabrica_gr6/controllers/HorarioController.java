package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Horario;
import com.example.Fabrica_gr6.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HorarioController {
    //atributos

    @Autowired
    HorarioService horarioService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/horarios")
    public List<Horario> findAll(){
        return horarioService.findAll();

    }



    @PostMapping("/api/horarios")
    public ResponseEntity<Horario> save(@RequestBody Horario horario){

        return horarioService.save(horario);
    }




    @GetMapping("/api/horarios/{id}")
    public ResponseEntity<Horario> findById(@PathVariable Integer id){
        return horarioService.findById(id);
    }




    @DeleteMapping("/api/horarios/{id}")
    public ResponseEntity<Horario> delete(@PathVariable Integer id){
        return horarioService.delete(id);

    }




    @PutMapping("/api/horarios")
    public ResponseEntity<Horario> update(@RequestBody Horario horario){
        return horarioService.update(horario);

    }


}

