package com.example.Fabrica_gr6.services;


import com.example.Fabrica_gr6.models.AcademicUnit;
import com.example.Fabrica_gr6.repositories.AcademicUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicUnitService {
    @Autowired
    AcademicUnitRepository academicUnitRepository;

    public List<AcademicUnit> findAll(){
        return academicUnitRepository.findAll();
    }

    //crear un Nuevo elemento

    public ResponseEntity<AcademicUnit> save(@RequestBody AcademicUnit academicUnit){

        //guardar
        AcademicUnit result=academicUnitRepository.save(academicUnit);

        return  ResponseEntity.ok(result);
    }




    //buscar segun su id

    public ResponseEntity<AcademicUnit> findById(@PathVariable String id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<AcademicUnit> optionalAcademicUnit=academicUnitRepository.findById(id);
        if(optionalAcademicUnit.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalAcademicUnit.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }




    //borrar un elemento de la DB

    public ResponseEntity<AcademicUnit> delete(@PathVariable String id){

        if (!academicUnitRepository.existsById(id)) { //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        academicUnitRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }




    //actualizar un objeto existente

    public ResponseEntity<AcademicUnit> update(@RequestBody AcademicUnit academicUnit){
        if(academicUnit.getAcademicUnitId()==null){ //no le mande un id
            return ResponseEntity.badRequest().build();
        }
        if(!academicUnitRepository.existsById(academicUnit.getAcademicUnitId())){ //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        //de lo contrario
        AcademicUnit result=academicUnitRepository.save(academicUnit);
        return ResponseEntity.ok(result);


    }





}
