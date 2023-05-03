package com.udea.Fabrica_g6_v2.services;

import com.udea.Fabrica_g6_v2.models.Curso;
import com.udea.Fabrica_g6_v2.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

    public ResponseEntity<Curso> save(@RequestBody Curso curso){
        //Guardar
        Curso result = cursoRepository.save(curso);
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Curso> findById(@PathVariable Long id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<Curso> optionalCurso = cursoRepository.findById(id);
        if(optionalCurso.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalCurso.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }

    //borrar un elemento de la DB
    public ResponseEntity<Curso> delete(@PathVariable Long id){
        //si el Id NO existe (NUMEO MUY GRANDE)
        if (!cursoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        cursoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //actualizar un elemento existente
    public ResponseEntity<Curso> update(@RequestBody Curso curso){
        //Si no contiene un id
        if(curso.getCodigoCurso()==null){
            return ResponseEntity.badRequest().build();
        }
        //si el Id NO existe (NUMERO MUY GRANDE)
        if(!cursoRepository.existsById(curso.getCodigoCurso())){
            return ResponseEntity.notFound().build();
        }

        Curso result = cursoRepository.save(curso);
        return ResponseEntity.ok(result);
    }
}
