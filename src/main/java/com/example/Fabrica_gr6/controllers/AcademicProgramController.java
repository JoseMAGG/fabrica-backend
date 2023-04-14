package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.AcademicProgram;
import com.example.Fabrica_gr6.repositories.AcademicProgramRepository;
import com.example.Fabrica_gr6.services.AcademicProgramService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class AcademicProgramController {
    //atributos

    @Autowired
    AcademicProgramService academicProgramService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    //Buscar todos Programas academicos (lista de programas acaademicos) y lo redirijo a una base de datos
    @GetMapping("/api/academicprograms")
    public List<AcademicProgram> findAll(){
        //capturar y enviar los libros de la bas de datos
        return academicProgramService.findAll();

    }



    //crear un Nuevo libro
    @PostMapping("/api/academicprograms")
    public ResponseEntity<AcademicProgram> save(@RequestBody AcademicProgram academicProgram){

        return academicProgramService.save(academicProgram);
    }




    //buscar un solo programaA segun su id
    @GetMapping("/api/academicprograms/{id}")
    public ResponseEntity<AcademicProgram> findById(@PathVariable Integer id){
        return academicProgramService.findById(id);
    }




    //borrar un ProgramaA de la DB
    @DeleteMapping("/api/academicprograms/{id}")
    public ResponseEntity<AcademicProgram> delete(@PathVariable Integer id){
        return academicProgramService.delete(id);

    }




    //actualizar un PA existente
    @PutMapping("/api/academicprograms")
    public ResponseEntity<AcademicProgram> update(@RequestBody AcademicProgram academicProgram){
        return academicProgramService.update(academicProgram);

    }


}

