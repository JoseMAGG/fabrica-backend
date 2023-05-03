package com.udea.Fabrica_g6_v2.services;

import com.udea.Fabrica_g6_v2.models.Materia;

import com.udea.Fabrica_g6_v2.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;

    public List<Materia> findAll(){
        //capturar y enviar los elementos de la bas de datos
        return materiaRepository.findAll();

    }



    //crear un Nuevo elemento

    public ResponseEntity<Materia> save(@RequestBody Materia materia){
        //guardar
        Materia result= materiaRepository.save(materia);
        return  ResponseEntity.ok(result);
    }




    //buscar segun su id

    public ResponseEntity<Materia> findById(@PathVariable Long id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<Materia> optionalMateria= materiaRepository.findById(id);
        if(optionalMateria.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalMateria.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }




    //borrar un elemento de la DB

    public ResponseEntity<Materia> delete(@PathVariable Long id){

        if (!materiaRepository.existsById(id)) { //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        materiaRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }




    //actualizar un elemento existente

    public ResponseEntity<Materia> update(@RequestBody Materia materia){
        if(materia.getIdMateria()==null){ //no le mande un id
            return ResponseEntity.badRequest().build();
        }
        if(!materiaRepository.existsById(materia.getIdMateria())){ //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        //de lo contrario
        Materia result= materiaRepository.save(materia);
        return ResponseEntity.ok(result);


    }


}
