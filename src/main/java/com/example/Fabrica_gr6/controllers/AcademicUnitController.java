package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.AcademicUnit;
import com.example.Fabrica_gr6.services.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AcademicUnitController {
    //atributos

    @Autowired
    AcademicUnitService academicUnitService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    //Buscar todos Programas academicos (lista de programas acaademicos) y lo redirijo a una base de datos
    @GetMapping("/api/academicUnits")
    public List<AcademicUnit> findAll(){
        //capturar y enviar los libros de la bas de datos
        return academicUnitService.findAll();

    }



    //crear un Nuevo libro
    @PostMapping("/api/academicUnits")
    public ResponseEntity<AcademicUnit> save(@RequestBody AcademicUnit academicUnit){

        return academicUnitService.save(academicUnit);
    }




    //buscar un solo programaA segun su id
    @GetMapping("/api/academicUnits/{id}")
    public ResponseEntity<AcademicUnit> findById(@PathVariable String id){
        return academicUnitService.findById(id);
    }




    //borrar un ProgramaA de la DB
    @DeleteMapping("/api/academicUnits/{id}")
    public ResponseEntity<AcademicUnit> delete(@PathVariable String id){
        return academicUnitService.delete(id);

    }




    //actualizar un PA existente
    @PutMapping("/api/academicUnits")
    public ResponseEntity<AcademicUnit> update(@RequestBody AcademicUnit academicUnit){
        return academicUnitService.update(academicUnit);

    }


}

