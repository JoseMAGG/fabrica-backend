package com.example.Fabrica_gr6.services;


import com.example.Fabrica_gr6.models.Estudiante;
import com.example.Fabrica_gr6.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public List<Estudiante> findAll(){
        //capturar y enviar los elementos de la bas de datos
        return estudianteRepository.findAll();

    }



    //crear un Nuevo elemento

    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){

        //guardar
        Estudiante result=estudianteRepository.save(estudiante);

        return  ResponseEntity.ok(result);
    }




    //buscar segun su id

    public ResponseEntity<Estudiante> findById(@PathVariable Long id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<Estudiante> optionalEstudiante=estudianteRepository.findById(id);
        if(optionalEstudiante.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalEstudiante.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }




    //borrar un elemento de la DB

    public ResponseEntity<Estudiante> delete(@PathVariable Long id){

        if (!estudianteRepository.existsById(id)) { //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        estudianteRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }




    //actualizar un elemento existente

    public ResponseEntity<Estudiante> update(@RequestBody Estudiante estudiante){
        if(estudiante.getIdPersona()==null){ //no le mande un id
            return ResponseEntity.badRequest().build();
        }
        if(!estudianteRepository.existsById(estudiante.getIdPersona())){ //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        //de lo contrario
        Estudiante result=estudianteRepository.save(estudiante);
        return ResponseEntity.ok(result);


    }


}
