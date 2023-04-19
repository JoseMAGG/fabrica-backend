package com.example.Fabrica_gr6.services;

import com.example.Fabrica_gr6.models.AcademicProgram;
import com.example.Fabrica_gr6.repositories.AcademicProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicProgramService {
    @Autowired
    AcademicProgramRepository academicProgramRepository;

    public List<AcademicProgram> findAll(){
        //capturar y enviar los libros de la bas de datos
        return academicProgramRepository.findAll();

    }



    //crear un Nuevo libro

    public ResponseEntity<AcademicProgram> save(@RequestBody AcademicProgram academicProgram){

        //guardar
        AcademicProgram result=academicProgramRepository.save(academicProgram);

        return  ResponseEntity.ok(result);
    }




    //buscar un solo programaA segun su id

    public ResponseEntity<AcademicProgram> findById(@PathVariable Integer id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<AcademicProgram> optionalAcademicProgram=academicProgramRepository.findById(id);
        if(optionalAcademicProgram.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalAcademicProgram.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }




    //borrar un ProgramaA de la DB

    public ResponseEntity<AcademicProgram> delete(@PathVariable Integer id){

        if (!academicProgramRepository.existsById(id)) { //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        academicProgramRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }




    //actualizar un PA existente

    public ResponseEntity<AcademicProgram> update(@RequestBody AcademicProgram academicProgram){
        if(academicProgram.getAcademicProgramNumber()==null){ //no le mande un id
            return ResponseEntity.badRequest().build();
        }
        if(!academicProgramRepository.existsById(academicProgram.getAcademicProgramNumber())){ //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        //de lo contrario
        AcademicProgram result=academicProgramRepository.save(academicProgram);
        return ResponseEntity.ok(result);


    }


}
